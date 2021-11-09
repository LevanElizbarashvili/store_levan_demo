package ge.softlab.homework.store_levan_demo.service;

import ge.softlab.homework.store_levan_demo.model.Products;

import java.util.List;

public interface StoreService {

   Products add(Products products);
   List<Products> getProducts(String Products);


}
