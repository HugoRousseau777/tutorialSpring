package org.hyperskill.demo.test;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/test")
    public int returnOne() {
        return 1;
    }

       private final List<Product> productList = List.of(
            new Product(1, "burger", 2),
            new Product(2, "fires", 1)
    );

    @GetMapping("/products")
    public List<Product> getProducts() {
        return productList;
    }
    
    @GetMapping("/product/{id}")
    public Product getProductById(@PathVariable("id") int id) {
        return productList.get(id - 1); // list indices start from 0
    }

    @GetMapping("/productEnt/{id}")
public ResponseEntity<Product> getProductByEntity(@PathVariable("id") int id) {
    return new ResponseEntity<>(productList.get(id - 1), HttpStatus.ACCEPTED);
}


private ConcurrentMap<String, Integer> productMenu = new ConcurrentHashMap<>();

@PostMapping("/product")
public void postProduct(@RequestParam("name") String name, @RequestParam("price") int price) {
    productMenu.put(name, price);
}

@GetMapping("/productMenu") // Bug quand /product/{name} pe à cause de /product/{id} ?
public ConcurrentMap<String, Integer> getMenu() {
    return productMenu; 
}	

    @GetMapping("/productMenu/{name}") // Bug quand /product/{name} pe à cause de /product/{id} ?
    public Integer getProduct(@PathVariable("name") String name) {
        return productMenu.get(name); // We get the price
    }	


    @DeleteMapping("/productMenu")
    public String removeProduct(@RequestParam("name") String name) {
        productMenu.remove(name);
        return name + " removed from address book!";
    }
    
}
