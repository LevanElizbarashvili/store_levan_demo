package ge.softlab.homework.store_levan_demo.controller;

import ge.softlab.homework.store_levan_demo.model.Product;
import ge.softlab.homework.store_levan_demo.model.Purchase;
import ge.softlab.homework.store_levan_demo.model.Sale;
import ge.softlab.homework.store_levan_demo.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;


@RestController
@RequestMapping
public class StoreController {

    private final StoreService storeService;

    @Autowired
    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping("/products")
    public List<Product> getProducts(String Product) {
        return storeService.getProducts(Product);

    }

    @PutMapping("/products")
    public ResponseEntity<Product> addNewProduct(@RequestBody Product product) {
        Product newProduct = storeService.addProducts(product);
        return ResponseEntity.status(201).body(newProduct);
    }


    @PostMapping("products/{id}/sales")
    public Object sellProduct(@PathVariable String id) {
        try {
            Sale newSale = storeService.sellProduct(id);
            return newSale;
        } catch (NoSuchElementException ignore) {
            return ResponseEntity.notFound().build();
        } catch (RuntimeException ignore) {
            return ResponseEntity.badRequest().build();
        }

    }

    @PostMapping("products/{id}/purchases")
    public Object purchaseProduct(@PathVariable String id) {
        try {
            Purchase newPurchase = storeService.purchaseProduct(id);
            return newPurchase;
        } catch (NoSuchElementException ignore) {
            return ResponseEntity.notFound().build();
        }

    }

    @GetMapping("/sales")
    public List<Sale> getSales(Integer Sale) {
        return storeService.getSales(Sale);

    }
}