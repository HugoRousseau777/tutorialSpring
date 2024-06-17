package org.hyperskill.demo.test;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final ProductRepository productRepository;
    @Autowired
    public Controller(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @PostMapping("/product") 
    public void addNewProduct(@RequestBody Product product) {
    /*     Optional<Product> productOptional = productRepository
                .findById(product.getId());
        if(productOptional.isPresent()) {
            throw new IllegalStateException("Product already there !");
        }*/
        productRepository.save(product);
    }
    /* 
    @PostMapping("/products") 
    public void addProductList(@RequestBody List<Product> productList) {
    /*     Optional<Product> productOptional = productRepository
                .findById(product.getId());
        if(productOptional.isPresent()) {
            throw new IllegalStateException("Product already there !");
        }*//* 
        productRepository.saveAll(productList);
    }*/

    @GetMapping("/product") 
    public List<Product> getTheProducts(){
        return productRepository.findAll();
    }

    @GetMapping("/product/PM") 
    public List<Product> getByPM(@RequestParam(name="minCalo", required = false) Integer minCalo,
			@RequestParam(name="maxCalo",required = false) Integer maxCalo,
            @RequestParam(name= "minCarb",required = false) Integer minCarb,
            @RequestParam(name = "maxCarb",required = false) Integer maxCarb){
                if(Objects.nonNull(minCalo) && Objects.nonNull(maxCalo)){
                    if(Objects.nonNull(minCarb) && Objects.nonNull(maxCarb)) {
                        return productRepository.findByPMCaloBetweenAndPMCarbBetween(minCalo, maxCalo, minCarb, maxCarb);
                    }
                    return productRepository.findByPMCaloBetween(minCalo, maxCalo);
                }
            return productRepository.findAll();
        
        
    }
    
}
