package org.hyperskill.demo.test;

import java.math.BigDecimal;
import java.util.List;

import org.hyperskill.demo.test.domain.CategoriePlat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{



    List<Product> findAllByOrderByPriceAsc();
    List<Product> findAllByOrderByPmFatDesc();
    List<Product> findAllByOrderByPmSugDesc();

    List<Product> findAllByOrderByPmSugAscPmFatAsc(); // Trie en priorité sucre  
    List<Product> findAllByOrderByPmFatAscPmSugAsc(); // Trie en priorité gras 

    public List<Product> findByCategoriePlat
    (CategoriePlat categoriePlat);
    // 1 PM // Controller
    public List<Product> findByCategoriePlatAndPmCaloBetween
    (CategoriePlat catPlat, Integer minCalo, Integer maxCalo);
    public List<Product> findByCategoriePlatAndPmCarbBetween
    (CategoriePlat catPlat, Integer minCarb, Integer maxCarb);
    public List<Product> findByCategoriePlatAndPmProtBetween
    (CategoriePlat catPlat, Integer minProt, Integer maxProt);
    public List<Product> findByCategoriePlatAndPmFibBetween
    (CategoriePlat catPlat, BigDecimal minFib, BigDecimal maxFib);


    public List<Product> findByCategoriePlatOrderByPmFatAsc
    (CategoriePlat catPlat);
    public List<Product> findByCategoriePlatOrderByPmSatuAsc
    (CategoriePlat catPlat);
    public List<Product> findByCategoriePlatOrderByPmSugAsc
    (CategoriePlat catPlat);
    public List<Product> findByCategoriePlatOrderByPmSodAsc
    (CategoriePlat catPlat);


    //4 PM ALL Done

    public List<Product> findByCategoriePlatAndPmCaloBetweenAndPmCarbBetweenAndPmProtBetweenAndPmFibBetween 
    (CategoriePlat catPlat, Integer minCalo, Integer maxCalo, Integer minCarb, Integer maxCarb,
    Integer minProt, Integer maxProt, BigDecimal minFib, BigDecimal maxFib);



 
    //Triple PM ALL good 
    
    public List<Product> findByCategoriePlatAndPmCaloBetweenAndPmCarbBetweenAndPmProtBetween //
    (CategoriePlat categoriePlat, Integer minCalo, Integer maxCalo, Integer minCarb, Integer maxCarb, Integer minProt, Integer maxProt);
    public List<Product> findByCategoriePlatAndPmCaloBetweenAndPmCarbBetweenAndPmFibBetween //
    (CategoriePlat categoriePlat, Integer minCalo, Integer maxCalo, Integer minCarb, Integer maxCarb, BigDecimal minFib, BigDecimal maxFib);
    public List<Product> findByCategoriePlatAndPmCaloBetweenAndPmProtBetweenAndPmFibBetween //
    (CategoriePlat categoriePlat, Integer minCalo, Integer maxCalo, Integer minProt, Integer maxProt, BigDecimal minFib, BigDecimal maxFib);
    public List<Product> findByCategoriePlatAndPmCarbBetweenAndPmProtBetweenAndPmFibBetween //
    (CategoriePlat categoriePlat, Integer minCarb, Integer maxCarb, Integer minProt, Integer maxProt, BigDecimal minFib, BigDecimal maxFib);

    // Double PM 
    public List<Product> findByCategoriePlatAndPmCaloBetweenAndPmCarbBetween //
    (CategoriePlat categoriePlat, Integer minCalo, Integer maxCalo, Integer minCarb, Integer maxCarb);
    public List<Product> findByCategoriePlatAndPmCaloBetweenAndPmProtBetween //
    (CategoriePlat categoriePlat, Integer minCalo, Integer maxCalo, Integer minProt, Integer maxProt);
    public List<Product> findByCategoriePlatAndPmCaloBetweenAndPmFibBetween //
    (CategoriePlat categoriePlat, Integer minCalo, Integer maxCalo, BigDecimal minFib, BigDecimal maxFib);

    public List<Product> findByCategoriePlatAndPmCarbBetweenAndPmProtBetween //
    (CategoriePlat categoriePlat, Integer minCarb, Integer maxCarb, Integer minProt, Integer maxProt);
    public List<Product> findByCategoriePlatAndPmCarbBetweenAndPmFibBetween //
    (CategoriePlat categoriePlat, Integer minCarb, Integer maxCarb, BigDecimal minFib, BigDecimal maxFib);

    public List<Product> findByCategoriePlatAndPmProtBetweenAndPmFibBetween //
    (CategoriePlat categoriePlat, Integer minProt, Integer maxProt, BigDecimal minFib, BigDecimal maxFib);






}
