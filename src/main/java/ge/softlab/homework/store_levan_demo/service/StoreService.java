package ge.softlab.homework.store_levan_demo.service;

import ge.softlab.homework.store_levan_demo.model.*;

import java.util.List;

public interface StoreService {

   Product addProducts(Product product);
   List<Product> getProducts(String Product);
   Sale sellProduct(String id);
   Purchase purchaseProduct(String id);

    List<Sale> getSales(Integer Sale);

    Receipt sellProducts(List<SaleDTO> saleDTOs);

}
