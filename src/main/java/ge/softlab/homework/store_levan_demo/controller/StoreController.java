package ge.softlab.homework.store_levan_demo.controller;

import ge.softlab.homework.store_levan_demo.model.Product;
import ge.softlab.homework.store_levan_demo.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping ("/products")
public class StoreController {

    private final StoreService storeService;

    @Autowired
    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping
    public List<Product> getProducts(String Product){
        return storeService.getProducts(Product);

    }

    @PutMapping
    public  ResponseEntity<Product> addNewProduct(@RequestBody Product product){
        Product newProduct = storeService.addProducts(product);
        return ResponseEntity.status(201).body(newProduct);
    }

}





