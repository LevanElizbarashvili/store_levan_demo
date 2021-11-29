package ge.softlab.homework.store_levan_demo.controller;

import ge.softlab.homework.store_levan_demo.model.Product;
import ge.softlab.homework.store_levan_demo.model.Purchase;
import ge.softlab.homework.store_levan_demo.model.Receipt;
import ge.softlab.homework.store_levan_demo.model.Sale;
import ge.softlab.homework.store_levan_demo.model.SaleDTO;
import ge.softlab.homework.store_levan_demo.service.StoreService;
import io.swagger.v3.oas.annotations.Operation;
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
    @Operation(tags = {"Products"}, summary = "პროდუცქტის სია")
    public List<Product> getProducts(String Product) {
        return storeService.getProducts(Product);

    }

    @PutMapping("/products")
    @Operation(tags = {"Products"}, summary = "ახალ პროდუქტის დამატება")
    public ResponseEntity<Product> addNewProduct(@RequestBody Product product) {
        Product newProduct = storeService.addProducts(product);
        return ResponseEntity.status(201).body(newProduct);
    }


    @PostMapping("products/{id}/sales")
    @Operation(tags = {"Sales"}, summary = "პროდუქტის გაყიდვა ცალობით")
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
    @Operation(tags = {"Purchase"}, summary = "პროდუქტის ყიდვა")
    public Object purchaseProduct(@PathVariable String id) {
        try {
            Purchase newPurchase = storeService.purchaseProduct(id);
            return newPurchase;
        } catch (NoSuchElementException ignore) {
            return ResponseEntity.notFound().build();
        }

    }

    @GetMapping("/sales")
    @Operation(tags = {"Sales Report"}, summary = "გაყიდვები თარიღის მიხედვით")
    public List<Sale> getSales(Integer Sale) {
        return storeService.getSales(Sale);

    }

    @PostMapping("/sales")
    @Operation(tags = {"Sales"}, summary = "პროდუქტების ნაკრების გაყიდვა")
    public ResponseEntity<Receipt> sellProducts(@RequestBody List<SaleDTO> saleDTOs) {
        try {
            Receipt newReceipt = storeService.sellProducts(saleDTOs);
            return ResponseEntity.status(201).body(newReceipt);
        } catch (NoSuchElementException ignore) {
            return ResponseEntity.notFound().build();
        }
    }
}