package ge.softlab.homework.store_levan_demo.service;

import ge.softlab.homework.store_levan_demo.model.Products;
import ge.softlab.homework.store_levan_demo.repository.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreServiceImpl implements StoreService {

    private final ProductsRepository productsRepository;
    private final MakersRepository makersRepository;
    private final PurchasesRepository purchasesRepository;
    private final SalesRepository salesRepository;
    private final CategoriesRepository categoriesRepository;

    public StoreServiceImpl(ProductsRepository productsRepository, MakersRepository makersRepository, PurchasesRepository purchasesRepository, SalesRepository salesRepository, CategoriesRepository categoriesRepository) {
        this.productsRepository = productsRepository;
        this.makersRepository = makersRepository;
        this.purchasesRepository = purchasesRepository;
        this.salesRepository = salesRepository;
        this.categoriesRepository = categoriesRepository;
    }

    public List<Products> getProducts(String products){
        return productsRepository.findAll();
    }

    public Products add(Products products){
        return productsRepository.save(products);
    }


}



