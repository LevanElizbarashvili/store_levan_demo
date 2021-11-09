package ge.softlab.homework.store_levan_demo.controller;

import ge.softlab.homework.store_levan_demo.model.Products;
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
    public List<Products> getProducts(String product_name){
        return storeService.getProducts(product_name);

    }

    @PostMapping
    public  ResponseEntity<Products> addNewProduct(@RequestBody Products product){
        Products newProduct = storeService.add(product);
        return ResponseEntity.status(201).body(newProduct);
    }

}





