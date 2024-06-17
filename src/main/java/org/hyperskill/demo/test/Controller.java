package org.hyperskill.demo.test;

import java.math.BigDecimal;
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
    public List<Product> getByPM(
            @RequestParam(name = "minCalo", required = false) Integer minCalo,
			@RequestParam(name = "maxCalo", required = false) Integer maxCalo,
            @RequestParam(name = "minCarb", required = false) Integer minCarb,
            @RequestParam(name = "maxCarb", required = false) Integer maxCarb,
            @RequestParam(name = "minSug", required = false) Integer minSug,
            @RequestParam(name = "maxSug", required = false) Integer maxSug,
            @RequestParam(name = "minProt", required = false) Integer minProt,
            @RequestParam(name = "maxProt", required = false) Integer maxProt,
            @RequestParam(name = "minFat", required = false) Integer minFat,
            @RequestParam(name = "maxFat", required = false) Integer maxFat,
            @RequestParam(name = "minSatu",required = false) Integer minSatu,
            @RequestParam(name = "maxSatu",required = false) Integer maxSatu,
            @RequestParam(name = "minFib",required = false) BigDecimal minFib,
            @RequestParam(name = "maxFib",required = false) BigDecimal maxFib,
            @RequestParam(name = "minSod",required = false) BigDecimal minSod,
            @RequestParam(name = "maxSod",required = false) BigDecimal maxSod){
                if(Objects.nonNull(minCalo) && Objects.nonNull(maxCalo)){
                    if(Objects.nonNull(minCarb) && Objects.nonNull(maxCarb)) {
                        return productRepository.findByPmCaloBetweenAndPmCarbBetween(minCalo, maxCalo, minCarb, maxCarb);
                    }
                    if(Objects.nonNull(minSug) && Objects.nonNull(maxSug)) {
                        return productRepository.findByPmCaloBetweenAndPmProtBetween(minCalo, maxCalo, minSug, maxSug);
                    }
                    if(Objects.nonNull(minProt) && Objects.nonNull(maxProt)) {
                        return productRepository.findByPmCaloBetweenAndPmProtBetween(minCalo, maxCalo, minProt, maxProt);
                    }
                    if(Objects.nonNull(minFat) && Objects.nonNull(maxFat)) {
                        return productRepository.findByPmCaloBetweenAndPmFatBetween(minCalo, maxCalo, minFat, maxFat);
                    }
                    if(Objects.nonNull(minSatu) && Objects.nonNull(maxSatu)) {
                        return productRepository.findByPmCaloBetweenAndPmProtBetween(minCalo, maxCalo, minSatu, maxSatu);
                    }
                    if(Objects.nonNull(minSod) && Objects.nonNull(maxSod)) {
                        return productRepository.findByPmCaloBetweenAndPmSodBetween(minCalo, maxCalo, minSod, maxSod);
                    }
                    if(Objects.nonNull(minFib) && Objects.nonNull(maxFib)) {
                        return productRepository.findByPmCaloBetweenAndPmFibBetween(minCalo, maxCalo, minFib, maxFib);
                    }
                    return productRepository.findByPmCaloBetween(minCalo, maxCalo);
                }
            return productRepository.findAll();
        
        
    }
    
}
