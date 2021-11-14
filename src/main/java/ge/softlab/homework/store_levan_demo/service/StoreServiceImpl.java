package ge.softlab.homework.store_levan_demo.service;

import ge.softlab.homework.store_levan_demo.model.Product;
import ge.softlab.homework.store_levan_demo.model.Sale;
import ge.softlab.homework.store_levan_demo.repository.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreServiceImpl implements StoreService {

    private final ProductRepository productsRepository;
    private final MakerRepository makersRepository;
    private final PurchaseRepository purchasesRepository;
    private final SaleRepository salesRepository;
    private final CategoryRepository categoriesRepository;

    public StoreServiceImpl(ProductRepository productRepository, MakerRepository makersRepository, PurchaseRepository purchasesRepository, SaleRepository salesRepository, CategoryRepository categoryRepository) {
        this.productsRepository = productRepository;
        this.makersRepository = makersRepository;
        this.purchasesRepository = purchasesRepository;
        this.salesRepository = salesRepository;
        this.categoriesRepository = categoryRepository;
    }

    public List<Product> getProducts(String Product){
        return productsRepository.findAll();
    }

    public Product addProducts(Product product){
        return productsRepository.save(product);
    }

}



