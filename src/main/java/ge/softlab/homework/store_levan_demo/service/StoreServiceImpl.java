package ge.softlab.homework.store_levan_demo.service;

import ge.softlab.homework.store_levan_demo.model.Product;
import ge.softlab.homework.store_levan_demo.model.Purchase;
import ge.softlab.homework.store_levan_demo.model.Sale;
import ge.softlab.homework.store_levan_demo.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StoreServiceImpl implements StoreService {

    private final ProductRepository productsRepository;
    private final MakerRepository makersRepository;
    private final PurchaseRepository purchasesRepository;
    private final SaleRepository salesRepository;
    private final CategoryRepository categoriesRepository;

    public List<Product> getProducts(String Product) {
        return productsRepository.findAll();
    }

    public Product addProducts(Product product) {
        return productsRepository.save(product);
    }

    @Override
    @Transactional
    public Sale sellProduct(String id) {
        Product product = productsRepository.findById(String.valueOf(id)).orElseThrow();
        if (product.getRemaining() <= 0) {
            throw new RuntimeException("No Stock");
        }
        Sale sale = new Sale();
        sale.setProductId(id);
        sale.setSellPrice(product.getSellPrice());
        sale.setSellDate(LocalDateTime.now());
        salesRepository.save(sale);

        product.setRemaining(product.getRemaining() - 1);
        productsRepository.save(product);
        return sale;

    }


    @Override
    @Transactional
    public Purchase purchaseProduct(String id) {
        Product product = productsRepository.findById(String.valueOf(id)).orElseThrow();

        Purchase purchase = new Purchase();
        purchase.setProductId(id);
        purchase.setPurchasePrice(product.getPurchasePrice());
        purchase.setPurchaseDate(LocalDateTime.now());
        purchasesRepository.save(purchase);

        product.setRemaining(product.getRemaining() + 1);
        productsRepository.save(product);
        return purchase;

    }


    @Override
    public List<Sale> getSales(Integer Sale) {
        return salesRepository.findAll(Sort.by(Sort.Direction.DESC,"sellDate"));
    }


}



