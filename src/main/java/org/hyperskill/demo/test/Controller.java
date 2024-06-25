package org.hyperskill.demo.test;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.hyperskill.demo.test.domain.CategoriePlat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    
    @PostMapping("/products") 
    public void addProductList(@RequestBody List<Product> productList) {
        productRepository.saveAll(productList);
    }

    @CrossOrigin
    @GetMapping("/product") 
    public List<Product> getTheProducts(){
        return productRepository.findAll();
    }

    @CrossOrigin
    @GetMapping("/productCat") 
    public List<Product> searchProductsByCat(@RequestParam(name="categoriePlat", required = false) CategoriePlat categoriePlat) {
        if(Objects.nonNull(categoriePlat)){
            return productRepository.findByCategoriePlat(categoriePlat);
        } else {
            return productRepository.findAll();
        }
    }

    @CrossOrigin
    @GetMapping("/product/{id}") 
    public Optional<Product> getProductById(@PathVariable(name="id") Long id){
        return productRepository.findById(id);
    }

    @DeleteMapping("/product/{id}")
    public void deleteProduct(@PathVariable(name = "id")Long id) {
        boolean exists = productRepository.existsById(id);
        if (!exists) {
            throw new IllegalStateException("student with id " + id + "doesn't exist");
        }
        productRepository.deleteById(id);
    }


    @CrossOrigin
    @GetMapping("/PM")
    public List<Product> getByPMTest(
        @RequestParam(name = "catPlat", required = false) CategoriePlat catPlat,
        @RequestParam(name = "minCalo", required = false) Integer minCalo,
        @RequestParam(name = "maxCalo", required = false) Integer maxCalo,
        @RequestParam(name = "minCarb", required = false) Integer minCarb,
        @RequestParam(name = "maxCarb", required = false) Integer maxCarb,
        @RequestParam(name = "minProt", required = false) Integer minProt,
        @RequestParam(name = "maxProt", required = false) Integer maxProt,
        @RequestParam(name = "minFib",required = false) BigDecimal minFib,
        @RequestParam(name = "maxFib",required = false) BigDecimal maxFib){

        if(Objects.nonNull(minCalo) && Objects.nonNull(maxCalo)){
            if(Objects.nonNull(minCarb) && Objects.nonNull(maxCarb)) {
                if (Objects.nonNull(minProt) && Objects.nonNull(maxProt)) {
                    if (Objects.nonNull(minFib) && Objects.nonNull(maxFib)) {
                        return productRepository.findByCategoriePlatAndPmCaloBetweenAndPmCarbBetweenAndPmProtBetweenAndPmFibBetween(
                            catPlat, minCalo, maxCalo, minCarb, maxCarb, minProt, maxProt, minFib, maxFib
                        );
                    }
                    return productRepository.findByCategoriePlatAndPmCaloBetweenAndPmCarbBetweenAndPmProtBetween(
                        catPlat, minCalo, maxCalo, minCarb, maxCarb, minProt, maxProt // T
                    );
                } else if (Objects.nonNull(minFib) && Objects.nonNull(maxFib)) {
                    return productRepository.findByCategoriePlatAndPmCaloBetweenAndPmCarbBetweenAndPmFibBetween(
                        catPlat, minCalo, maxCalo, minCarb, maxCarb, minFib, maxFib // T
                    );
                }
                return productRepository.findByCategoriePlatAndPmCaloBetweenAndPmCarbBetween(
                    catPlat, minCalo, maxCalo, minCarb, maxCarb // D
                );
            } else if (Objects.nonNull(minProt) && Objects.nonNull(maxProt)) {
                if (Objects.nonNull(minFib) && Objects.nonNull(maxFib)) {
                    return productRepository.findByCategoriePlatAndPmCaloBetweenAndPmProtBetweenAndPmFibBetween(
                        catPlat, minCalo, maxCalo, minProt, maxProt, minFib, maxFib // T
                    );
                }
                return productRepository.findByCategoriePlatAndPmCaloBetweenAndPmProtBetween(
                    catPlat, minCalo, maxCalo, minProt, maxProt // D
                );
            } else if (Objects.nonNull(minFib) && Objects.nonNull(maxFib)) {
                return productRepository.findByCategoriePlatAndPmCaloBetweenAndPmFibBetween(
                    catPlat, minCalo, maxCalo, minFib, maxFib // D
                );
            }

            return productRepository.findByCategoriePlatAndPmCaloBetween(catPlat, minCalo, maxCalo); // S
        } else if (Objects.nonNull(minCarb) && Objects.nonNull(maxCarb)){
            if (Objects.nonNull(minProt) && Objects.nonNull(maxProt)) {
                if (Objects.nonNull(minFib) && Objects.nonNull(maxFib)) {
                    return productRepository.findByCategoriePlatAndPmCarbBetweenAndPmProtBetweenAndPmFibBetween(
                        catPlat, minCarb, maxCarb, minProt, maxProt, minFib, maxFib // T
                    );
                }
                return productRepository.findByCategoriePlatAndPmCarbBetweenAndPmProtBetween(
                    catPlat, minCarb, maxCarb, minProt, maxProt // D
                );
            } else if (Objects.nonNull(minFib) && Objects.nonNull(maxFib)) {
                return productRepository.findByCategoriePlatAndPmCarbBetweenAndPmFibBetween(
                    catPlat, minCarb, maxCarb, minFib, maxFib // D
                );
            }

            return productRepository.findByCategoriePlatAndPmCarbBetween(catPlat, minCarb, maxCarb); // S
        } else if (Objects.nonNull(minProt) && Objects.nonNull(maxProt)){
            if (Objects.nonNull(minFib) && Objects.nonNull(maxFib)) {
                return productRepository.findByCategoriePlatAndPmProtBetweenAndPmFibBetween(
                    catPlat, minProt, maxProt, minFib, maxFib // D
                );
            }

            return productRepository.findByCategoriePlatAndPmProtBetween(catPlat, minProt, maxProt); // S
        } else if (Objects.nonNull(minFib) && Objects.nonNull(maxFib)){
            return productRepository.findByCategoriePlatAndPmFibBetween(catPlat, minFib, maxFib); // S
        } else {
            return productRepository.findAll();
        }
            
    }

    @GetMapping("/product/fatD") 
    public List<Product> getFatD(){
    return productRepository.findAllByOrderByPmFatDesc();
    }

    @GetMapping("/product/sugD") 
    public List<Product> getSugD(){
    return productRepository.findAllByOrderByPmSugDesc();
    }

    @GetMapping("/product/sugfatA") 
    public List<Product> getSugFatA(){
    return productRepository.findAllByOrderByPmSugAscPmFatAsc();
    }

    @GetMapping("/product/fatsugA") 
    public List<Product> getFatSugA(){
    return productRepository.findAllByOrderByPmFatAscPmSugAsc();
    }

    

}