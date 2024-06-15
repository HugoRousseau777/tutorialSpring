package org.hyperskill.demo.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final ProductRepository productRepository;
    @Autowired
    public Controller(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @PostMapping("/product") // with body
    public void addNewProduct(@RequestBody Product product) {
    /*     Optional<Product> productOptional = productRepository
                .findById(product.getId());
        if(productOptional.isPresent()) {
            throw new IllegalStateException("Product already there !");
        }*/
        productRepository.save(product);
    }

    @GetMapping("/product") 
    public List<Product> getTheProducts(){
        return productRepository.findAll();
    }
    
}
