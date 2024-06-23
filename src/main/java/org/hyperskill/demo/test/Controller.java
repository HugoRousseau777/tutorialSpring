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
                        if(Objects.nonNull(minSug) && Objects.nonNull(maxSug)) {
                            if(Objects.nonNull(minProt) && Objects.nonNull(maxProt)) {
                                if(Objects.nonNull(minFat) && Objects.nonNull(maxFat)) {
                                    if (Objects.nonNull(minSatu) && Objects.nonNull(maxSatu)) {
                                        if (Objects.nonNull(minFib) && Objects.nonNull(maxFib)) {
                                           if (Objects.nonNull(minSod) && Objects.nonNull(maxSod)) {
                                                return productRepository.findByPmCaloBetweenAndPmCarbBetweenAndPmSugBetweenAndPmProtBetweenAndPmFatBetweenAndPmSatuBetweenAndPmFibBetweenAndPmSodBetween(
                                                    minCalo, maxCalo, minCarb, maxCarb, minSug, maxSug, minProt, maxProt, minFat, maxFat, minSatu, maxSatu, minFib, maxFib, minSod, maxSod
                                                );
                                            }
                                            return productRepository.findByPmCaloBetweenAndPmCarbBetweenAndPmSugBetweenAndPmProtBetweenAndPmFatBetweenAndPmSatuBetweenAndPmFibBetween(
                                                minCalo, maxCalo, minCarb, maxCarb, minSug, maxSug, minProt, maxProt, minFat, maxFat, minSatu, maxSatu, minFib, maxFib
                                            );
                                        }
                                        return productRepository.findByPmCaloBetweenAndPmCarbBetweenAndPmSugBetweenAndPmProtBetweenAndPmFatBetweenAndPmSatuBetween(
                                            minCalo, maxCalo, minCarb, maxCarb, minSug, maxSug, minProt, maxProt, minFat, maxFat, minSatu, maxSatu
                                        );
                                    }
                                    return productRepository.findByPmCaloBetweenAndPmCarbBetweenAndPmSugBetweenAndPmProtBetweenAndPmFatBetween(
                                        minCalo, maxCalo, minCarb, maxCarb, minSug, maxSug, minProt, maxProt, minFat, maxFat
                                    );
                                }
                                return productRepository.findByPmCaloBetweenAndPmCarbBetweenAndPmSugBetweenAndPmProtBetween(
                                    minCalo, maxCalo, minCarb, maxCarb, minSug, maxSug, minProt, maxProt
                                );
                            }
                            return productRepository.findByPmCaloBetweenAndPmCarbBetweenAndPmSugBetween
                            (minCalo, maxCalo, minCarb, maxCarb, minSug, maxSug);
                        }
                        if (Objects.nonNull(minSug) && Objects.nonNull(maxSug)) {
                            return productRepository.findByPmCaloBetweenAndPmCarbBetweenAndPmSugBetween
                            (minCalo, maxCalo, minCarb, maxCarb, minSug, maxSug);
                        }
                        if (Objects.nonNull(minProt) && Objects.nonNull(maxProt)) {
                            return productRepository.findByPmCaloBetweenAndPmCarbBetweenAndPmProtBetween
                            (minCalo, maxCalo, minCarb, maxCarb, minProt, maxProt);
                        }
                        if (Objects.nonNull(minFat) && Objects.nonNull(maxFat)) {
                            return productRepository.findByPmCaloBetweenAndPmCarbBetweenAndPmFatBetween
                            (minCalo, maxCalo, minCarb, maxCarb, minFat, maxFat);
                        }
                        if (Objects.nonNull(minSatu) && Objects.nonNull(maxSatu)) {
                            return productRepository.findByPmCaloBetweenAndPmCarbBetweenAndPmSatuBetween
                            (minCalo, maxCalo, minCarb, maxCarb, minSatu, maxSatu);
                        }
                        if (Objects.nonNull(minFib) && Objects.nonNull(maxFib)) {
                            return productRepository.findByPmCaloBetweenAndPmCarbBetweenAndPmFibBetween
                            (minCalo, maxCalo, minCarb, maxCarb, minFib, maxFib);
                        }
                        if (Objects.nonNull(minSod) && Objects.nonNull(maxSod)) {
                            return productRepository.findByPmCaloBetweenAndPmCarbBetweenAndPmSodBetween
                            (minCalo, maxCalo, minCarb, maxCarb, minSod, maxSod);
                        }
                        return productRepository.findByPmCaloBetweenAndPmCarbBetween(minCalo, maxCalo, minCarb, maxCarb);
                    } else if (Objects.nonNull(minSug) && Objects.nonNull(maxSug)) {
                        if (Objects.nonNull(minProt) && Objects.nonNull(maxProt)) {
                            return productRepository.findByPmCaloBetweenAndPmSugBetweenAndPmProtBetween(
                                minCalo, maxCalo, minSug, maxSug, minProt, maxProt
                            );
                        }
                        if (Objects.nonNull(minFat) && Objects.nonNull(maxFat)) {
                            return productRepository.findByPmCaloBetweenAndPmSugBetweenAndPmFatBetween(
                                minCalo, maxCalo, minSug, maxSug, minFat, maxFat
                            );
                        }
                        if (Objects.nonNull(minSatu) && Objects.nonNull(maxSatu)) {
                            return productRepository.findByPmCaloBetweenAndPmSugBetweenAndPmSatuBetween(
                                minCalo, maxCalo, minSug, maxSug, minSatu, maxSatu
                            );
                        }
                        if (Objects.nonNull(minFib) && Objects.nonNull(maxFib)) {
                            return productRepository.findByPmCaloBetweenAndPmSugBetweenAndPmFibBetween(
                                minCalo, maxCalo, minSug, maxSug, minFib, maxFib
                            );
                        }
                        if (Objects.nonNull(minSod) && Objects.nonNull(maxSod)) {
                            return productRepository.findByPmCaloBetweenAndPmSugBetweenAndPmSodBetween(
                                minCalo, maxCalo, minSug, maxSug, minSod, maxSod
                            );
                        }
                        return productRepository.findByPmCaloBetweenAndPmSugBetween
                        (minCalo, maxCalo, minSug, maxSug);
                    } else if (Objects.nonNull(minProt) && Objects.nonNull(maxProt)) {
                        if (Objects.nonNull(minFat) && Objects.nonNull(maxFat)) {
                            return productRepository.findByPmCaloBetweenAndPmProtBetweenAndPmFatBetween(
                                minCalo, maxCalo, minProt, maxProt, minFat, maxFat
                            );
                        }
                        if (Objects.nonNull(minSatu) && Objects.nonNull(maxSatu)) {
                            return productRepository.findByPmCaloBetweenAndPmProtBetweenAndPmSatuBetween(
                                minCalo, maxCalo, minProt, maxProt, minSatu, maxSatu
                            );
                        }
                        if (Objects.nonNull(minFib) && Objects.nonNull(maxFib)) {
                            return productRepository.findByPmCaloBetweenAndPmProtBetweenAndPmFibBetween(
                                minCalo, maxCalo, minProt, maxProt, minFib, maxFib
                            );
                        }
                        if (Objects.nonNull(minSod) && Objects.nonNull(maxSod)) {
                            return productRepository.findByPmCaloBetweenAndPmProtBetweenAndPmSodBetween(
                                minCalo, maxCalo, minProt, maxProt, minSod, maxSod
                            );
                        }
                        return productRepository.findByPmCaloBetweenAndPmProtBetween(minCalo, maxCalo, minProt, maxProt);
                    } else if (Objects.nonNull(minFat) && Objects.nonNull(maxFat)) {
                        if (Objects.nonNull(minSatu) && Objects.nonNull(maxSatu)) {
                            return productRepository.findByPmCaloBetweenAndPmFatBetweenAndPmSatuBetween(
                                minCalo, maxCalo, minFat, maxFat, minSatu, maxSatu
                            );
                        }
                        if (Objects.nonNull(minFib) && Objects.nonNull(maxFib)) {
                            return productRepository.findByPmCaloBetweenAndPmFatBetweenAndPmFibBetween(
                                minCalo, maxCalo, minFat, maxFat, minFib, maxFib
                            );
                        }
                        if (Objects.nonNull(minSod) && Objects.nonNull(maxSod)) {
                            return productRepository.findByPmCaloBetweenAndPmFatBetweenAndPmSodBetween(
                                minCalo, maxCalo, minFat, maxFat, minSod, maxSod
                            );
                        }
                        return productRepository.findByPmCaloBetweenAndPmFatBetween(minCalo, maxCalo, minFat, maxFat);
                    } else if (Objects.nonNull(minSatu) && Objects.nonNull(maxSatu)) {
                        if (Objects.nonNull(minFib) && Objects.nonNull(maxFib)) {
                            return productRepository.findByPmCaloBetweenAndPmSatuBetweenAndPmFibBetween(
                                minCalo, maxCalo, minSatu, maxSatu, minFib, maxFib
                            );
                        }
                        if (Objects.nonNull(minSod) && Objects.nonNull(maxSod)) {
                            return productRepository.findByPmCaloBetweenAndPmSatuBetweenAndPmSodBetween(
                                minCalo, maxCalo, minSatu, maxSatu, minSod, maxSod
                            );
                        }
                        return productRepository.findByPmCaloBetweenAndPmSatuBetween(
                            minCalo, maxCalo, minSatu, maxSatu
                        );
                    } else if (Objects.nonNull(minFib) && Objects.nonNull(maxFib)) {
                        if (Objects.nonNull(minSod) && Objects.nonNull(maxSod)) {
                            return productRepository.findByPmCaloBetweenAndPmFibBetweenAndPmSodBetween(
                                minCalo, maxCalo, minFib, maxFib, minSod, maxSod
                            );
                        }
                        return productRepository.findByPmCaloBetweenAndPmFibBetween(
                            minCalo, maxCalo, minFib, maxFib
                        );
                    } else if (Objects.nonNull(minSod) && Objects.nonNull(maxSod)) {
                        return productRepository.findByPmCaloBetweenAndPmSodBetween(
                            minCalo, maxCalo, minSod, maxSod
                        );
                    } else if ((Objects.nonNull(minCarb) && Objects.nonNull(maxCarb))) {
                        if ((Objects.nonNull(minSug) && Objects.nonNull(maxSug))) {
                            if ((Objects.nonNull(minProt) && Objects.nonNull(maxProt))) {
                                return productRepository.findByPmCarbBetweenAndPmSugBetweenAndPmProtBetween(
                                    minCarb, maxCarb, minSug, maxSug, minProt, maxProt
                                );
                            }
                            if ((Objects.nonNull(minFat) && Objects.nonNull(maxFat))) {
                                return productRepository.findByPmCarbBetweenAndPmSugBetweenAndPmFatBetween(
                                    minCarb, maxCarb, minSug, maxSug, minFat, maxFat
                                );
                            }
                            if ((Objects.nonNull(minSatu) && Objects.nonNull(maxSatu))) {
                                return productRepository.findByPmCarbBetweenAndPmSugBetweenAndPmSatuBetween(
                                    minCarb, maxCarb, minSug, maxSug, minSatu, maxSatu
                                );
                            }
                            if ((Objects.nonNull(minFib) && Objects.nonNull(maxFib))) {
                                return productRepository.findByPmCarbBetweenAndPmSugBetweenAndPmFibBetween(
                                    minCarb, maxCarb, minSug, maxSug, minFib, maxFib
                                );
                            }
                            if ((Objects.nonNull(minSod) && Objects.nonNull(maxSod))) {
                                return productRepository.findByPmCarbBetweenAndPmSugBetweenAndPmSodBetween(
                                    minCarb, maxCarb, minSug, maxSug, minSod, maxSod
                                );
                            }
                            return productRepository.findByPmCarbBetweenAndPmSugBetween(
                                minCarb, maxCarb, minSug, maxSug
                            );
                        }
                        if ((Objects.nonNull(minProt) && Objects.nonNull(maxProt))) {
                            if ((Objects.nonNull(minFat) && Objects.nonNull(maxFat))) {
                                return productRepository.findByPmCarbBetweenAndPmProtBetweenAndPmFatBetween(
                                    minCarb, maxCarb, minProt, maxProt, minFat, maxFat
                            );
                        }
                        if ((Objects.nonNull(minSatu) && Objects.nonNull(maxSatu))) {
                            return productRepository.findByPmCarbBetweenAndPmProtBetweenAndPmSatuBetween(
                                minCarb, maxCarb, minProt, maxProt, minSatu, maxSatu
                            );
                        }
                        if ((Objects.nonNull(minFib) && Objects.nonNull(maxFib))) {
                            return productRepository.findByPmCarbBetweenAndPmProtBetweenAndPmFibBetween(
                                minCarb, maxCarb, minProt, maxProt, minFib, maxFib
                            );
                        }
                        if ((Objects.nonNull(minSod) && Objects.nonNull(maxSod))) {
                            return productRepository.findByPmCarbBetweenAndPmProtBetweenAndPmSodBetween(
                                minCarb, maxCarb, minProt, maxProt, minSod, maxSod
                            );
                        }
                        return productRepository.findByPmCarbBetweenAndPmProtBetween(
                            minCarb, maxCarb, minProt, maxProt
                        );
                    }
                    if ((Objects.nonNull(minFat) && Objects.nonNull(maxFat))) {
                        if ((Objects.nonNull(minSatu) && Objects.nonNull(maxSatu))) {
                            return productRepository.findByPmCarbBetweenAndPmFatBetweenAndPmSatuBetween(
                                minCarb, maxCarb, minFat, maxFat, minSatu, maxSatu
                            );
                        }
                        if ((Objects.nonNull(minFib) && Objects.nonNull(maxFib))) {
                            return productRepository.findByPmCarbBetweenAndPmFatBetweenAndPmFibBetween(
                                minCarb, maxCarb, minFat, maxFat, minFib, maxFib
                            );
                        }
                        if ((Objects.nonNull(minSod) && Objects.nonNull(maxSod))) {
                            return productRepository.findByPmCarbBetweenAndPmFatBetweenAndPmSodBetween(
                                minCarb, maxCarb, minFat, maxFat, minSod, maxSod
                            );
                        }
                        return productRepository.findByPmCarbBetweenAndPmFatBetween(
                            minCarb, maxCarb, minFat, maxFat
                        );
                    }
                    if ((Objects.nonNull(minSatu) && Objects.nonNull(maxSatu))) {
                        if ((Objects.nonNull(minFib) && Objects.nonNull(maxFib))) {
                            return productRepository.findByPmCarbBetweenAndPmSatuBetweenAndPmFibBetween(
                                minCarb, maxCarb, minSatu, maxSatu, minFib, maxFib
                            );
                        }
                        if ((Objects.nonNull(minSod) && Objects.nonNull(maxSod))) {
                            return productRepository.findByPmCarbBetweenAndPmSatuBetweenAndPmSodBetween(
                                minCarb, maxCarb, minSatu, maxSatu, minSod, maxSod
                            );
                        }
                        return productRepository.findByPmCarbBetweenAndPmSatuBetween(
                            minCarb, maxCarb, minSatu, maxSatu
                        );
                    }
                    if ((Objects.nonNull(minFib) && Objects.nonNull(maxFib))) {
                        if ((Objects.nonNull(minSod) && Objects.nonNull(maxSod))) {
                            return productRepository.findByPmCarbBetweenAndPmFibBetweenAndPmSodBetween(
                                minCarb, maxCarb, minFib, maxFib, minSod, maxSod
                            );
                        }
                        return productRepository.findByPmCarbBetweenAndPmFibBetween(
                            minCarb, maxCarb, minFib, maxFib
                        );
                    }
                    if ((Objects.nonNull(minSod) && Objects.nonNull(maxSod))) {
                        return productRepository.findByPmCarbBetweenAndPmSodBetween(
                            minCarb, maxCarb, minSod, maxSod
                        );
                    }
                    return productRepository.findByPmCarbBetween(minCarb, maxCarb);
                }  else if ((Objects.nonNull(minSug) && Objects.nonNull(maxSug))) {
                        if ((Objects.nonNull(minSod) && Objects.nonNull(maxSod))) {
                            return productRepository.findByPmSugBetweenAndPmSodBetween(
                            minSug, maxSug, minSod, maxSod
                            );
                        }
                        if ((Objects.nonNull(minFib) && Objects.nonNull(maxFib))) {
                            if ((Objects.nonNull(minSod) && Objects.nonNull(maxSod))) {
                                return productRepository.findByPmSugBetweenAndPmFibBetweenAndPmSodBetween(
                                    minSug, maxSug, minFib, maxFib, minSod, maxSod
                                );
                            }
                            return productRepository.findByPmSugBetweenAndPmFibBetween(
                            minSug, maxSug, minFib, maxFib
                            );
                        }
                        if ((Objects.nonNull(minSatu) && Objects.nonNull(maxSatu))) {
                            if ((Objects.nonNull(minFib) && Objects.nonNull(maxFib))) {
                                return productRepository.findByPmSugBetweenAndPmSatuBetweenAndPmFibBetween(
                                    minSug, maxSug, minSatu, maxSatu, minFib, maxFib
                                );
                            }
                            if ((Objects.nonNull(minSod) && Objects.nonNull(maxSod))) {
                                return productRepository.findByPmSugBetweenAndPmSatuBetweenAndPmSodBetween(
                                    minSug, maxSug, minSatu, maxSatu, minSod, maxSod
                                );
                            }
                            return productRepository.findByPmSugBetweenAndPmSatuBetween(
                            minSug, maxSug, minSatu, maxSatu
                            );
                        }
                        if ((Objects.nonNull(minFat) && Objects.nonNull(maxFat))) {
                            if ((Objects.nonNull(minSatu) && Objects.nonNull(maxSatu))) {
                                return productRepository.findByPmSugBetweenAndPmFatBetweenAndPmSatuBetween(
                                    minSug, maxSug, minFat, maxFat, minSatu, maxSatu
                                );
                            }
                            if ((Objects.nonNull(minFib) && Objects.nonNull(maxFib))) {
                                return productRepository.findByPmSugBetweenAndPmFatBetweenAndPmFibBetween(
                                    minSug, maxSug, minFat, maxFat, minFib, maxFib
                                );
                            }
                            if ((Objects.nonNull(minSod) && Objects.nonNull(maxSod))) {
                                return productRepository.findByPmSugBetweenAndPmFatBetweenAndPmSodBetween(
                                    minSug, maxSug, minFat, maxFat, minSod, maxSod
                                );
                            }
                            return productRepository.findByPmSugBetweenAndPmFatBetween(
                            minSug, maxSug, minFat, maxFat
                            );
                        }
                        if ((Objects.nonNull(minProt) && Objects.nonNull(maxProt))) {
                            if ((Objects.nonNull(minFat) && Objects.nonNull(maxFat))) {
                                return productRepository.findByPmSugBetweenAndPmProtBetweenAndPmFatBetween(
                                    minSug, maxSug, minProt, maxProt, minFat, maxFat
                                );
                            }
                            if ((Objects.nonNull(minSatu) && Objects.nonNull(maxSatu))) {
                                return productRepository.findByPmSugBetweenAndPmProtBetweenAndPmSatuBetween(
                                    minSug, maxSug, minProt, maxProt, minSatu, maxSatu
                                );
                            }
                            if ((Objects.nonNull(minFib) && Objects.nonNull(maxFib))) {
                                return productRepository.findByPmSugBetweenAndPmProtBetweenAndPmFibBetween(
                                    minSug, maxSug, minProt, maxProt, minFib, maxFib
                                );
                            }
                            if ((Objects.nonNull(minSod) && Objects.nonNull(maxSod))) {
                                return productRepository.findByPmSugBetweenAndPmProtBetweenAndPmSodBetween(
                                    minSug, maxSug, minProt, maxProt, minSod, maxSod
                                );
                            }
                            return productRepository.findByPmSugBetweenAndPmProtBetween(
                            minSug, maxSug, minProt, maxProt
                            );
                        }
                    return productRepository.findByPmSugBetween(minSug, maxSug);
                } else if ((Objects.nonNull(minFat) && Objects.nonNull(maxFat))) {
                    if ((Objects.nonNull(minSatu) && Objects.nonNull(maxSatu))) {
                        if ((Objects.nonNull(minFib) && Objects.nonNull(maxFib))) {
                            return productRepository.findByPmFatBetweenAndPmSatuBetweenAndPmFibBetween(
                                minFat, maxFat, minSatu, maxSatu, minFib, maxFib
                            );
                        }
                        if ((Objects.nonNull(minSod) && Objects.nonNull(maxSod))) {
                            return productRepository.findByPmFatBetweenAndPmSatuBetweenAndPmSodBetween(
                                minFat, maxFat, minSatu, maxSatu, minSod, maxSod
                            );
                        }
                        return productRepository.findByPmFatBetweenAndPmSatuBetween(
                            minFat, maxFat, minSatu, maxSatu
                        );
                    }
                    if ((Objects.nonNull(minFib) && Objects.nonNull(maxFib))) {
                        if ((Objects.nonNull(minSod) && Objects.nonNull(maxSod))) {
                            return productRepository.findByPmFatBetweenAndPmFibBetweenAndPmSodBetween(
                                minFat, maxFat, minFib, maxFib, minSod, maxSod
                            );
                        }
                        return productRepository.findByPmFatBetweenAndPmFibBetween(
                            minFat, maxFat, minFib, maxFib
                        );
                    }
                    if ((Objects.nonNull(minSod) && Objects.nonNull(maxSod))) {
                        return productRepository.findByPmFatBetweenAndPmSodBetween(
                            minFat, maxFat, minSod, maxSod
                        );
                    }
                    return productRepository.findByPmFatBetween(minFat, maxFat);
                } else if ((Objects.nonNull(minSatu) && Objects.nonNull(maxSatu))) {
                    if ((Objects.nonNull(minFib) && Objects.nonNull(maxFib))) {
                        if ((Objects.nonNull(minSod) && Objects.nonNull(maxSod))) {
                            return productRepository.findByPmSatuBetweenAndPmFibBetweenAndPmSodBetween(
                                minSatu, maxSatu, minFib, maxFib, minSod, maxSod
                            );
                        }
                        return productRepository.findByPmSatuBetweenAndPmFibBetween(
                            minSatu, maxSatu, minFib, maxFib
                        );
                    }
                    if ((Objects.nonNull(minSod) && Objects.nonNull(maxSod))) {
                        return productRepository.findByPmSatuBetweenAndPmSodBetween(
                            minSatu, maxSatu, minSod, maxSod
                        );
                    }
                    return productRepository.findByPmSatuBetween(minSatu, maxSatu);
                }  else if ((Objects.nonNull(minProt) && Objects.nonNull(maxProt))) {
                    if ((Objects.nonNull(minFat) && Objects.nonNull(maxFat))) {
                        if ((Objects.nonNull(minSatu) && Objects.nonNull(maxSatu))) {
                            return productRepository.findByPmProtBetweenAndPmFatBetweenAndPmSatuBetween(
                                minProt, maxProt, minFat, maxFat, minSatu, maxSatu
                            );
                        }
                        if ((Objects.nonNull(minFib) && Objects.nonNull(maxFib))) {
                            return productRepository.findByPmProtBetweenAndPmFatBetweenAndPmFibBetween(
                                minProt, maxProt, minFat, maxFat, minFib, maxFib
                            );
                        }
                        if ((Objects.nonNull(minSod) && Objects.nonNull(maxSod))) {
                            return productRepository.findByPmProtBetweenAndPmFatBetweenAndPmSodBetween(
                                minProt, maxProt, minFat, maxFat, minSod, maxSod
                            );
                        }
                        return productRepository.findByPmProtBetweenAndPmFatBetween(
                            minProt, maxProt, minFat, maxFat
                        );
                    }
                    if ((Objects.nonNull(minSatu) && Objects.nonNull(maxSatu))) {
                        if ((Objects.nonNull(minFib) && Objects.nonNull(maxFib))) {
                            return productRepository.findByPmProtBetweenAndPmSatuBetweenAndPmFibBetween(
                                minProt, maxProt, minSatu, maxSatu, minFib, maxFib
                            );
                        }
                        if ((Objects.nonNull(minSod) && Objects.nonNull(maxSod))) {
                            return productRepository.findByPmProtBetweenAndPmSatuBetweenAndPmSodBetween(
                                minProt, maxProt, minSatu, maxSatu, minSod, maxSod
                            );
                        }
                        return productRepository.findByPmProtBetweenAndPmSatuBetween(
                            minProt, maxProt, minSatu, maxSatu
                        );
                    }
                    if ((Objects.nonNull(minFib) && Objects.nonNull(maxFib))) {
                        if ((Objects.nonNull(minSod) && Objects.nonNull(maxSod))) {
                            return productRepository.findByPmProtBetweenAndPmFibBetweenAndPmSodBetween(
                                minProt, maxProt, minFib, maxFib, minSod, maxSod
                            );
                        }
                        return productRepository.findByPmProtBetweenAndPmFibBetween(
                            minProt, maxProt, minFib, maxFib
                        );
                    }
                    if ((Objects.nonNull(minSod) && Objects.nonNull(maxSod))) {
                        return productRepository.findByPmProtBetweenAndPmSodBetween(
                            minProt, maxProt, minSod, maxSod
                        );
                    }
                    return productRepository.findByPmProtBetween(minProt, maxProt);
                }  else if ((Objects.nonNull(minFib) && Objects.nonNull(maxFib))) {
                    if ((Objects.nonNull(minSod) && Objects.nonNull(maxSod))) {
                        return productRepository.findByPmFibBetweenAndPmSodBetween(
                            minFib, maxFib, minSod, maxSod
                        );
                    }
                    return productRepository.findByPmFibBetween(minFib, maxFib);
                }  else if ((Objects.nonNull(minSod) && Objects.nonNull(maxSod))) {
                    return productRepository.findByPmSodBetween(minSod, maxSod);
                }
            return productRepository.findByPmCaloBetween(minCalo, maxCalo);
            
    }
    return productRepository.findAll();
}
}