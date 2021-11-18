package ge.softlab.homework.store_levan_demo.service;

import ge.softlab.homework.store_levan_demo.model.Product;
import ge.softlab.homework.store_levan_demo.model.Sale;

import java.util.List;

public interface StoreService {

   Product addProducts(Product product);
   List<Product> getProducts(String Product);
   Sale sellProduct(String id);
}
