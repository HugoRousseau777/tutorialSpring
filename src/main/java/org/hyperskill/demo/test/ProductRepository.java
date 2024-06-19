package org.hyperskill.demo.test;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{


    public List<Product> findByPmCaloBetween
    (Integer minCalo, Integer maxCalo);


    //8 PM
    public List<Product> findByPmCaloBetweenAndPmCarbBetweenAndPmSugBetweenAndPmProtBetweenAndPmFatBetweenAndPmSatuBetweenAndPmFibBetweenAndPmSodBetween
    (Integer minCalo, Integer maxCalo, Integer minCarb, Integer maxCarb, Integer minSug, Integer maxSug,
    Integer minProt, Integer maxProt, Integer minFat, Integer maxFat, Integer minSatu, Integer maxSatu, BigDecimal minFib, BigDecimal maxFib, BigDecimal minSod, BigDecimal maxSod);

    //7 PM Ok

    public List<Product> findByPmCaloBetweenAndPmCarbBetweenAndPmSugBetweenAndPmProtBetweenAndPmFatBetweenAndPmSatuBetweenAndPmFibBetween
    (Integer minCalo, Integer maxCalo, Integer minCarb, Integer maxCarb, Integer minSug, Integer maxSug,
    Integer minProt, Integer maxProt, Integer minFat, Integer maxFat, Integer minSatu, Integer maxSatu, BigDecimal minFib, BigDecimal maxFib);
    public List<Product> findByPmCaloBetweenAndPmCarbBetweenAndPmSugBetweenAndPmProtBetweenAndPmFatBetweenAndPmSatuBetweenAndPmSodBetween
    (Integer minCalo, Integer maxCalo, Integer minCarb, Integer maxCarb, Integer minSug, Integer maxSug,
    Integer minProt, Integer maxProt, Integer minFat, Integer maxFat, Integer minSatu, Integer maxSatu, BigDecimal minSod, BigDecimal maxSod);

    public List<Product> findByPmCaloBetweenAndPmCarbBetweenAndPmSugBetweenAndPmProtBetweenAndPmFatBetweenAndPmFibBetweenAndPmSodBetween
    (Integer minCalo, Integer maxCalo, Integer minCarb, Integer maxCarb, Integer minSug, Integer maxSug,
    Integer minProt, Integer maxProt, Integer minFat, Integer maxFat, BigDecimal minFib, BigDecimal maxFib, BigDecimal minSod, BigDecimal maxSod);
    public List<Product> findByPmCaloBetweenAndPmCarbBetweenAndPmSugBetweenAndPmProtBetweenAndPmSatuBetweenAndPmFibBetweenAndPmSodBetween
    (Integer minCalo, Integer maxCalo, Integer minCarb, Integer maxCarb, Integer minSug, Integer maxSug,
    Integer minProt, Integer maxProt, Integer minSatu, Integer maxSatu, BigDecimal minFib, BigDecimal maxFib, BigDecimal minSod, BigDecimal maxSod);

    public List<Product> findByPmCaloBetweenAndPmCarbBetweenAndPmSugBetweenAndPmFatBetweenAndPmSatuBetweenAndPmFibBetweenAndPmSodBetween
    (Integer minCalo, Integer maxCalo, Integer minCarb, Integer maxCarb, Integer minSug, Integer maxSug,
    Integer minFat, Integer maxFat, Integer minSatu, Integer maxSatu, BigDecimal minFib, BigDecimal maxFib, BigDecimal minSod, BigDecimal maxSod);
    public List<Product> findByPmCaloBetweenAndPmCarbBetweenAndPmProtBetweenAndPmFatBetweenAndPmSatuBetweenAndPmFibBetweenAndPmSodBetween
    (Integer minCalo, Integer maxCalo, Integer minCarb, Integer maxCarb, Integer minProt, Integer maxProt,
    Integer minFat, Integer maxFat, Integer minSatu, Integer maxSatu, BigDecimal minFib, BigDecimal maxFib, BigDecimal minSod, BigDecimal maxSod);

    public List<Product> findByPmCaloBetweenAndPmSugBetweenAndPmProtBetweenAndPmFatBetweenAndPmSatuBetweenAndPmFibBetweenAndPmSodBetween
    (Integer minCalo, Integer maxCalo, Integer minSug, Integer maxSug, Integer minProt, Integer maxProt,
    Integer minFat, Integer maxFat, Integer minSatu, Integer maxSatu, BigDecimal minFib, BigDecimal maxFib, BigDecimal minSod, BigDecimal maxSod);
    public List<Product> findByPmCarbBetweenAndPmSugBetweenAndPmProtBetweenAndPmFatBetweenAndPmSatuBetweenAndPmFibBetweenAndPmSodBetween
    (Integer minCarb, Integer maxCarb, Integer minSug, Integer maxSug, Integer minProt, Integer maxProt,
    Integer minFat, Integer maxFat, Integer minSatu, Integer maxSatu, BigDecimal minFib, BigDecimal maxFib, BigDecimal minSod, BigDecimal maxSod);









    //6 PM OK

    //3
    public List<Product> findByPmCaloBetweenAndPmCarbBetweenAndPmSugBetweenAndPmProtBetweenAndPmFatBetweenAndPmSatuBetween
    (Integer minCalo, Integer maxCalo, Integer minCarb, Integer maxCarb,
    Integer minSug, Integer maxSug, Integer minProt, Integer maxProt, Integer minFat, Integer maxFat, Integer minSatu, Integer maxSatu);
    public List<Product> findByPmCaloBetweenAndPmCarbBetweenAndPmSugBetweenAndPmProtBetweenAndPmFatBetweenAndPmFibBetween
    (Integer minCalo, Integer maxCalo, Integer minCarb, Integer maxCarb,
    Integer minSug, Integer maxSug, Integer minProt, Integer maxProt, Integer minFat, Integer maxFat, BigDecimal minFib, BigDecimal maxFib);
    public List<Product> findByPmCaloBetweenAndPmCarbBetweenAndPmSugBetweenAndPmProtBetweenAndPmFatBetweenAndPmSodBetween
    (Integer minCalo, Integer maxCalo, Integer minCarb, Integer maxCarb,
    Integer minSug, Integer maxSug, Integer minProt, Integer maxProt, Integer minFat, Integer maxFat, BigDecimal minSod, BigDecimal maxSod);

    //2
    public List<Product> findByPmCaloBetweenAndPmCarbBetweenAndPmSugBetweenAndPmProtBetweenAndPmSatuBetweenAndPmFibBetween
    (Integer minCalo, Integer maxCalo, Integer minCarb, Integer maxCarb,
    Integer minSug, Integer maxSug, Integer minProt, Integer maxProt, Integer minSatu, Integer maxSatu, BigDecimal minFib, BigDecimal maxFib);
    public List<Product> findByPmCaloBetweenAndPmCarbBetweenAndPmSugBetweenAndPmProtBetweenAndPmSatuBetweenAndPmSodBetween
    (Integer minCalo, Integer maxCalo, Integer minCarb, Integer maxCarb,
    Integer minSug, Integer maxSug, Integer minProt, Integer maxProt, Integer minSatu, Integer maxSatu, BigDecimal minSod, BigDecimal maxSod);

    public List<Product> findByPmCaloBetweenAndPmCarbBetweenAndPmSugBetweenAndPmProtBetweenAndPmFibBetweenAndPmSodBetween
    (Integer minCalo, Integer maxCalo, Integer minCarb, Integer maxCarb,
    Integer minSug, Integer maxSug, Integer minProt, Integer maxProt, BigDecimal minFib, BigDecimal maxFib, BigDecimal minSod, BigDecimal maxSod);

    //2
    public List<Product> findByPmCaloBetweenAndPmCarbBetweenAndPmSugBetweenAndPmFatBetweenAndPmSatuBetweenAndPmFibBetween
    (Integer minCalo, Integer maxCalo, Integer minCarb, Integer maxCarb,
    Integer minSug, Integer maxSug, Integer minFat, Integer maxFat, Integer minSatu, Integer maxSatu, BigDecimal minFib, BigDecimal maxFib);
    public List<Product> findByPmCaloBetweenAndPmCarbBetweenAndPmSugBetweenAndPmFatBetweenAndPmSatuBetweenAndPmSodBetween
    (Integer minCalo, Integer maxCalo, Integer minCarb, Integer maxCarb,
    Integer minSug, Integer maxSug, Integer minFat, Integer maxFat, Integer minSatu, Integer maxSatu, BigDecimal minSod, BigDecimal maxSod);

    //2
    public List<Product> findByPmCaloBetweenAndPmCarbBetweenAndPmSugBetweenAndPmFatBetweenAndPmFibBetweenAndPmSodBetween
    (Integer minCalo, Integer maxCalo, Integer minCarb, Integer maxCarb,
    Integer minSug, Integer maxSug, Integer minFat, Integer maxFat, BigDecimal minFib, BigDecimal maxFib, BigDecimal minSod, BigDecimal maxSod);
    public List<Product> findByPmCaloBetweenAndPmCarbBetweenAndPmSugBetweenAndPmSatuBetweenAndPmFibBetweenAndPmSodBetween
    (Integer minCalo, Integer maxCalo, Integer minCarb, Integer maxCarb,
    Integer minSug, Integer maxSug, Integer minSatu, Integer maxSatu, BigDecimal minFib, BigDecimal maxFib, BigDecimal minSod, BigDecimal maxSod);

    //2
    public List<Product> findByPmCaloBetweenAndPmCarbBetweenAndPmProtBetweenAndPmFatBetweenAndPmSatuBetweenAndPmFibBetween
    (Integer minCalo, Integer maxCalo, Integer minCarb, Integer maxCarb,
    Integer minProt, Integer maxProt, Integer minFat, Integer maxFat, Integer minSatu, Integer maxSatu, BigDecimal minFib, BigDecimal maxFib);
    public List<Product> findByPmCaloBetweenAndPmCarbBetweenAndPmProtBetweenAndPmFatBetweenAndPmSatuBetweenAndPmSodBetween
    (Integer minCalo, Integer maxCalo, Integer minCarb, Integer maxCarb,
    Integer minProt, Integer maxProt, Integer minFat, Integer maxFat, Integer minSatu, Integer maxSatu, BigDecimal minSod, BigDecimal maxSod);

    //2
    public List<Product> findByPmCaloBetweenAndPmCarbBetweenAndPmProtBetweenAndPmFatBetweenAndPmFibBetweenAndPmSodBetween
    (Integer minCalo, Integer maxCalo, Integer minCarb, Integer maxCarb,
    Integer minProt, Integer maxProt, Integer minFat, Integer maxFat, BigDecimal minFib, BigDecimal maxFib, BigDecimal minSod, BigDecimal maxSod);
    public List<Product> findByPmCaloBetweenAndPmCarbBetweenAndPmProtBetweenAndPmSatuBetweenAndPmFibBetweenAndPmSodBetween
    (Integer minCalo, Integer maxCalo, Integer minCarb, Integer maxCarb,
    Integer minProt, Integer maxProt, Integer minSatu, Integer maxSatu, BigDecimal minFib, BigDecimal maxFib, BigDecimal minSod, BigDecimal maxSod);

    public List<Product> findByPmCaloBetweenAndPmCarbBetweenAndPmFatBetweenAndPmSatuBetweenAndPmFibBetweenAndPmSodBetween
    (Integer minCalo, Integer maxCalo, Integer minCarb, Integer maxCarb,
    Integer minFat, Integer maxFat, Integer minSatu, Integer maxSatu, BigDecimal minFib, BigDecimal maxFib, BigDecimal minSod, BigDecimal maxSod);

    //2
    public List<Product> findByPmCaloBetweenAndPmSugBetweenAndPmProtBetweenAndPmFatBetweenAndPmSatuBetweenAndPmFibBetween
    (Integer minCalo, Integer maxCalo, Integer minSug, Integer maxSug,
    Integer minProt, Integer maxProt, Integer minFat, Integer maxFat, Integer minSatu, Integer maxSatu, BigDecimal minFib, BigDecimal maxFib);
    public List<Product> findByPmCaloBetweenAndPmSugBetweenAndPmProtBetweenAndPmFatBetweenAndPmSatuBetweenAndPmSodBetween
    (Integer minCalo, Integer maxCalo, Integer minSug, Integer maxSug,
    Integer minProt, Integer maxProt, Integer minFat, Integer maxFat, Integer minSatu, Integer maxSatu, BigDecimal minSod, BigDecimal maxSod);

    public List<Product> findByPmCaloBetweenAndPmSugBetweenAndPmProtBetweenAndPmFatBetweenAndPmFibBetweenAndPmSodBetween
    (Integer minCalo, Integer maxCalo, Integer minSug, Integer maxSug,
    Integer minProt, Integer maxProt, Integer minFat, Integer maxFat, BigDecimal minFib, BigDecimal maxFib, BigDecimal minSod, BigDecimal maxSod);
    public List<Product> findByPmCaloBetweenAndPmSugBetweenAndPmProtBetweenAndPmSatuBetweenAndPmFibBetweenAndPmSodBetween
    (Integer minCalo, Integer maxCalo, Integer minSug, Integer maxSug,
    Integer minProt, Integer maxProt, Integer minSatu, Integer maxSatu, BigDecimal minFib, BigDecimal maxFib, BigDecimal minSod, BigDecimal maxSod);
    public List<Product> findByPmCaloBetweenAndPmSugBetweenAndPmFatBetweenAndPmSatuBetweenAndPmFibBetweenAndPmSodBetween
    (Integer minCalo, Integer maxCalo, Integer minSug, Integer maxSug,
    Integer minFat, Integer maxFat, Integer minSatu, Integer maxSatu, BigDecimal minFib, BigDecimal maxFib, BigDecimal minSod, BigDecimal maxSod);
    public List<Product> findByPmCaloBetweenAndPmProtBetweenAndPmFatBetweenAndPmSatuBetweenAndPmFibBetweenAndPmSodBetween
    (Integer minCalo, Integer maxCalo, Integer minProt, Integer maxProt,
    Integer minFat, Integer maxFat, Integer minSatu, Integer maxSatu, BigDecimal minFib, BigDecimal maxFib, BigDecimal minSod, BigDecimal maxSod);

    public List<Product> findByPmCarbBetweenAndPmSugBetweenAndPmProtBetweenAndPmFatBetweenAndPmSatuBetweenAndPmFibBetween
    (Integer minCarb, Integer maxCarb, Integer minSug, Integer maxSug,
    Integer minProt, Integer maxProt, Integer minFat, Integer maxFat, Integer minSatu, Integer maxSatu, BigDecimal minFib, BigDecimal maxFib);
    public List<Product> findByPmCarbBetweenAndPmSugBetweenAndPmProtBetweenAndPmFatBetweenAndPmSatuBetweenAndPmSodBetween
    (Integer minCarb, Integer maxCarb, Integer minSug, Integer maxSug,
    Integer minProt, Integer maxProt, Integer minFat, Integer maxFat, Integer minSatu, Integer maxSatu, BigDecimal minSod, BigDecimal maxSod);
    public List<Product> findByPmCarbBetweenAndPmSugBetweenAndPmProtBetweenAndPmFatBetweenAndPmFibBetweenAndPmSodBetween
    (Integer minCarb, Integer maxCarb, Integer minSug, Integer maxSug,
    Integer minProt, Integer maxProt, Integer minFat, Integer maxFat, BigDecimal minFib, BigDecimal maxFib, BigDecimal minSod, BigDecimal maxSod);
    public List<Product> findByPmCarbBetweenAndPmSugBetweenAndPmProtBetweenAndPmSatuBetweenAndPmFibBetweenAndPmSodBetween
    (Integer minCarb, Integer maxCarb, Integer minSug, Integer maxSug,
    Integer minProt, Integer maxProt, Integer minSatu, Integer maxSatu, BigDecimal minFib, BigDecimal maxFib, BigDecimal minSod, BigDecimal maxSod);
    public List<Product> findByPmCarbBetweenAndPmSugBetweenAndPmFatBetweenAndPmSatuBetweenAndPmFibBetweenAndPmSodBetween
    (Integer minCarb, Integer maxCarb, Integer minSug, Integer maxSug,
    Integer minFat, Integer maxFat, Integer minSatu, Integer maxSatu, BigDecimal minFib, BigDecimal maxFib, BigDecimal minSod, BigDecimal maxSod);
    public List<Product> findByPmCarbBetweenAndPmProtBetweenAndPmFatBetweenAndPmSatuBetweenAndPmFibBetweenAndPmSodBetween
    (Integer minCarb, Integer maxCarb, Integer minProt, Integer maxProt,
    Integer minFat, Integer maxFat, Integer minSatu, Integer maxSatu, BigDecimal minFib, BigDecimal maxFib, BigDecimal minSod, BigDecimal maxSod);
    public List<Product> findByPmSugBetweenAndPmProtBetweenAndPmFatBetweenAndPmSatuBetweenAndPmFibBetweenAndPmSodBetween
    (Integer minSug, Integer maxSug, Integer minProt, Integer maxProt,
    Integer minFat, Integer maxFat, Integer minSatu, Integer maxSatu, BigDecimal minFib, BigDecimal maxFib, BigDecimal minSod, BigDecimal maxSod);


    //5 PM All Done !
    //4
    public List<Product> findByPmCaloBetweenAndPmCarbBetweenAndPmSugBetweenAndPmProtBetweenAndPmFatBetween
    (Integer minCalo, Integer maxCalo, Integer minCarb, Integer maxCarb,
    Integer minSug, Integer maxSug, Integer minProt, Integer maxProt, Integer minFat, Integer maxFat);
    public List<Product> findByPmCaloBetweenAndPmCarbBetweenAndPmSugBetweenAndPmProtBetweenAndPmSatuBetween
    (Integer minCalo, Integer maxCalo, Integer minCarb, Integer maxCarb,
    Integer minSug, Integer maxSug, Integer minProt, Integer maxProt, Integer minSatu, Integer maxSatu);
    public List<Product> findByPmCaloBetweenAndPmCarbBetweenAndPmSugBetweenAndPmProtBetweenAndPmFibBetween
    (Integer minCalo, Integer maxCalo, Integer minCarb, Integer maxCarb,
    Integer minSug, Integer maxSug, Integer minProt, Integer maxProt, BigDecimal minFib, BigDecimal maxFib);
    public List<Product> findByPmCaloBetweenAndPmCarbBetweenAndPmSugBetweenAndPmProtBetweenAndPmSodBetween
    (Integer minCalo, Integer maxCalo, Integer minCarb, Integer maxCarb,
    Integer minSug, Integer maxSug, Integer minProt, Integer maxProt, BigDecimal minSod, BigDecimal maxSod);


    //3
    public List<Product> findByPmCaloBetweenAndPmCarbBetweenAndPmSugBetweenAndPmFatBetweenAndPmSatuBetween
    (Integer minCalo, Integer maxCalo, Integer minCarb, Integer maxCarb,
    Integer minSug, Integer maxSug, Integer minFat, Integer maxFat, Integer minSatu, Integer maxSatu);
    public List<Product> findByPmCaloBetweenAndPmCarbBetweenAndPmSugBetweenAndPmFatBetweenAndPmFibBetween
    (Integer minCalo, Integer maxCalo, Integer minCarb, Integer maxCarb,
    Integer minSug, Integer maxSug, Integer minFat, Integer maxFat, BigDecimal minFib, BigDecimal maxFib);
    public List<Product> findByPmCaloBetweenAndPmCarbBetweenAndPmSugBetweenAndPmFatBetweenAndPmSodBetween
    (Integer minCalo, Integer maxCalo, Integer minCarb, Integer maxCarb,
    Integer minSug, Integer maxSug, Integer minFat, Integer maxFat, BigDecimal minSod, BigDecimal maxSod);

    //2
    public List<Product> findByPmCaloBetweenAndPmCarbBetweenAndPmSugBetweenAndPmSatuBetweenAndPmFibBetween
    (Integer minCalo, Integer maxCalo, Integer minCarb, Integer maxCarb,
    Integer minSug, Integer maxSug, Integer minSatu, Integer maxSatu, BigDecimal minFib, BigDecimal maxFib);
    public List<Product> findByPmCaloBetweenAndPmCarbBetweenAndPmSugBetweenAndPmSatuBetweenAndPmSodBetween
    (Integer minCalo, Integer maxCalo, Integer minCarb, Integer maxCarb,
    Integer minSug, Integer maxSug, Integer minSatu, Integer maxSatu, BigDecimal minSod, BigDecimal maxSod);

    //1
    public List<Product> findByPmCaloBetweenAndPmCarbBetweenAndPmSugBetweenAndPmFibBetweenAndPmSodBetween
    (Integer minCalo, Integer maxCalo, Integer minCarb, Integer maxCarb,
    Integer minSug, Integer maxSug, BigDecimal minFib, BigDecimal maxFib, BigDecimal minSod, BigDecimal maxSod);

    //3
    public List<Product> findByPmCaloBetweenAndPmCarbBetweenAndPmProtBetweenAndPmFatBetweenAndPmSatuBetween
    (Integer minCalo, Integer maxCalo, Integer minCarb, Integer maxCarb,
    Integer minProt, Integer maxProt, Integer minFat, Integer maxFat, Integer minSatu, Integer maxSatu);
    public List<Product> findByPmCaloBetweenAndPmCarbBetweenAndPmProtBetweenAndPmFatBetweenAndPmFibBetween
    (Integer minCalo, Integer maxCalo, Integer minCarb, Integer maxCarb,
    Integer minProt, Integer maxProt, Integer minFat, Integer maxFat, BigDecimal minFib, BigDecimal maxFib);
    public List<Product> findByPmCaloBetweenAndPmCarbBetweenAndPmProtBetweenAndPmFatBetweenAndPmSodBetween
    (Integer minCalo, Integer maxCalo, Integer minCarb, Integer maxCarb,
    Integer minProt, Integer maxProt, Integer minFat, Integer maxFat, BigDecimal minSod, BigDecimal maxSod);

    
    //2
    public List<Product> findByPmCaloBetweenAndPmCarbBetweenAndPmProtBetweenAndPmSatuBetweenAndPmFibBetween
    (Integer minCalo, Integer maxCalo, Integer minCarb, Integer maxCarb,
    Integer minProt, Integer maxProt, Integer minSatu, Integer maxSatu, BigDecimal minFib, BigDecimal maxFib);
    public List<Product> findByPmCaloBetweenAndPmCarbBetweenAndPmProtBetweenAndPmSatuBetweenAndPmSodBetween
    (Integer minCalo, Integer maxCalo, Integer minCarb, Integer maxCarb,
    Integer minProt, Integer maxProt, Integer minSatu, Integer maxSatu, BigDecimal minSod, BigDecimal maxSod);

    //1 
    public List<Product> findByPmCaloBetweenAndPmCarbBetweenAndPmProtBetweenAndPmFibBetweenAndPmSodBetween
    (Integer minCalo, Integer maxCalo, Integer minCarb, Integer maxCarb,
    Integer minProt, Integer maxProt, BigDecimal minFib, BigDecimal maxFib, BigDecimal minSod, BigDecimal maxSod);

    //2
    public List<Product> findByPmCaloBetweenAndPmCarbBetweenAndPmFatBetweenAndPmSatuBetweenAndPmFibBetween
    (Integer minCalo, Integer maxCalo, Integer minCarb, Integer maxCarb,
    Integer minFat, Integer maxFat, Integer minSatu, Integer maxSatu, BigDecimal minFib, BigDecimal maxFib);
    public List<Product> findByPmCaloBetweenAndPmCarbBetweenAndPmFatBetweenAndPmSatuBetweenAndPmSodBetween
    (Integer minCalo, Integer maxCalo, Integer minCarb, Integer maxCarb,
    Integer minFat, Integer maFat, Integer minSatu, Integer maxSatu, BigDecimal minSod, BigDecimal maxSod);

    //1
    public List<Product> findByPmCaloBetweenAndPmCarbBetweenAndPmFatBetweenAndPmFibBetweenAndPmSodBetween
    (Integer minCalo, Integer maxCalo, Integer minCarb, Integer maxCarb,
    Integer minFat, Integer maxFat, BigDecimal minFib, BigDecimal maxFib, BigDecimal minSod, BigDecimal maxSod);
    //1
    public List<Product> findByPmCaloBetweenAndPmCarbBetweenAndPmSatuBetweenAndPmFibBetweenAndPmSodBetween
    (Integer minCalo, Integer maxCalo, Integer minCarb, Integer maxCarb,
    Integer minSatu, Integer maxSatu, BigDecimal minFib, BigDecimal maxFib, BigDecimal minSod, BigDecimal maxSod);

    //3
    public List<Product> findByPmCaloBetweenAndPmSugBetweenAndPmProtBetweenAndPmFatBetweenAndPmSatuBetween
    (Integer minCalo, Integer maxCalo, Integer minSug, Integer maxSug,
    Integer minProt, Integer maxProt, Integer minFat, Integer maxFat, Integer minSatu, Integer maxSatu);
    public List<Product> findByPmCaloBetweenAndPmSugBetweenAndPmProtBetweenAndPmFatBetweenAndPmFibBetween
    (Integer minCalo, Integer maxCalo, Integer minSug, Integer maxSug,
    Integer minProt, Integer maxProt, Integer minFat, Integer maxFat, BigDecimal minFib, BigDecimal maxFib);
    public List<Product> findByPmCaloBetweenAndPmSugBetweenAndPmProtBetweenAndPmFatBetweenAndPmSodBetween
    (Integer minCalo, Integer maxCalo, Integer minSug, Integer maxSug,
    Integer minProt, Integer maxProt, Integer minFat, Integer maxFat, BigDecimal minSod, BigDecimal maxSod);

    //2
    public List<Product> findByPmCaloBetweenAndPmSugBetweenAndPmProtBetweenAndPmSatuBetweenAndPmFibBetween
    (Integer minCalo, Integer maxCalo, Integer minSug, Integer maxSug,
    Integer minProt, Integer maxProt, Integer minSatu, Integer maxSatu, BigDecimal minFib, BigDecimal maxFib);
    public List<Product> findByPmCaloBetweenAndPmSugBetweenAndPmProtBetweenAndPmSatuBetweenAndPmSodBetween
    (Integer minCalo, Integer maxCalo, Integer minSug, Integer maxSug,
    Integer minProt, Integer maxProt, Integer minSatu, Integer maxSatu, BigDecimal minSod, BigDecimal maxSod);

    //1
    public List<Product> findByPmCaloBetweenAndPmSugBetweenAndPmProtBetweenAndPmFibBetweenAndPmSodBetween
    (Integer minCalo, Integer maxCalo, Integer minSug, Integer maxSug,
    Integer minProt, Integer maxProt, BigDecimal minFib, BigDecimal maxFib, BigDecimal minSod, BigDecimal maxSod);

    //2
    public List<Product> findByPmCaloBetweenAndPmSugBetweenAndPmFatBetweenAndPmSatuBetweenAndPmFibBetween
    (Integer minCalo, Integer maxCalo, Integer minSug, Integer maxSug,
    Integer minFat, Integer maxFat, Integer minSatu, Integer maxSatu, BigDecimal minFib, BigDecimal maxFib);
    public List<Product> findByPmCaloBetweenAndPmSugBetweenAndPmFatBetweenAndPmSatuBetweenAndPmSodBetween
    (Integer minCalo, Integer maxCalo, Integer minSug, Integer maxSug,
    Integer minFat, Integer maxFat, Integer minSatu, Integer maxSatu, BigDecimal minSod, BigDecimal maxSod);

    //1 
    public List<Product> findByPmCaloBetweenAndPmSugBetweenAndPmFatBetweenAndPmFibBetweenAndPmSodBetween
    (Integer minCalo, Integer maxCalo, Integer minSug, Integer maxSug,
    Integer minFat, Integer maxFat, BigDecimal minFib, BigDecimal maxFib, BigDecimal minSod, BigDecimal maxSod);
    //1
    public List<Product> findByPmCaloBetweenAndPmSugBetweenAndPmSatuBetweenAndPmFibBetweenAndPmSodBetween
    (Integer minCalo, Integer maxCalo, Integer minSug, Integer maxSug,
    Integer minSatu, Integer maxSatu, BigDecimal minFib, BigDecimal maxFib, BigDecimal minSod, BigDecimal maxSod);

    //1
    public List<Product> findByPmCaloBetweenAndPmProtBetweenAndPmFatBetweenAndPmSatuBetweenAndPmFibBetween
    (Integer minCalo, Integer maxCalo, Integer minProt, Integer maxProt,
    Integer minFat, Integer maxFat, Integer minSatu, Integer maxSatu, BigDecimal minFib, BigDecimal maxFib);
    //1    
    public List<Product> findByPmCaloBetweenAndPmProtBetweenAndPmFatBetweenAndPmSatuBetweenAndPmSodBetween
    (Integer minCalo, Integer maxCalo, Integer minProt, Integer maxProt,
    Integer minFat, Integer maxFat, Integer minSatu, Integer maxSatu, BigDecimal minSod, BigDecimal maxSod);

    //1
    public List<Product> findByPmCaloBetweenAndPmProtBetweenAndPmFatBetweenAndPmFibBetweenAndPmSodBetween
    (Integer minCalo, Integer maxCalo, Integer minProt, Integer maxProt,
    Integer minFat, Integer maxFat, BigDecimal minFib, BigDecimal maxFib, BigDecimal minSod, BigDecimal maxSod);


    //1
    public List<Product> findByPmCaloBetweenAndPmProtBetweenAndPmSatuBetweenAndPmFibBetweenAndPmSodBetween
    (Integer minCalo, Integer maxCalo, Integer minProt, Integer maxProt,
    Integer minSatu, Integer maxSatu, BigDecimal minFib, BigDecimal maxFib, BigDecimal minSod, BigDecimal maxSod);
    //1
    public List<Product> findByPmCaloBetweenAndPmFatBetweenAndPmSatuBetweenAndPmFibBetweenAndPmSodBetween
    (Integer minCalo, Integer maxCalo, Integer minFat, Integer maxFat,
    Integer minSatu, Integer maxSatu, BigDecimal minFib, BigDecimal maxFib, BigDecimal minSod, BigDecimal maxSod);

    //3
    public List<Product> findByPmCarbBetweenAndPmSugBetweenAndPmProtBetweenAndPmFatBetweenAndPmSatuBetween
    (Integer minCarb, Integer maxCarb, Integer minSug, Integer maxSug,
    Integer minProt, Integer maxProt, Integer minFat, Integer maxFat, Integer minSatu, Integer maxSatu);
    public List<Product> findByPmCarbBetweenAndPmSugBetweenAndPmProtBetweenAndPmFatBetweenAndPmFibBetween
    (Integer minCarb, Integer maxCarb, Integer minSug, Integer maxSug,
    Integer minProt, Integer maxProt, Integer minFat, Integer maxFat, BigDecimal minFib, BigDecimal maxFib);
    public List<Product> findByPmCarbBetweenAndPmSugBetweenAndPmProtBetweenAndPmFatBetweenAndPmSodBetween
    (Integer minCarb, Integer maxCarb, Integer minSug, Integer maxSug,
    Integer minProt, Integer maxProt, Integer minFat, Integer maxFat, BigDecimal minSod, BigDecimal maxSod);

    //2
    public List<Product> findByPmCarbBetweenAndPmSugBetweenAndPmProtBetweenAndPmSatuBetweenAndPmFibBetween
    (Integer minCarb, Integer maxCarb, Integer minSug, Integer maxSug,
    Integer minProt, Integer maxProt, Integer minSatu, Integer maxSatu, BigDecimal minFib, BigDecimal maxFib);
    public List<Product> findByPmCarbBetweenAndPmSugBetweenAndPmProtBetweenAndPmSatuBetweenAndPmSodBetween
    (Integer minCarb, Integer maxCarb, Integer minSug, Integer maxSug,
    Integer minProt, Integer maxProt, Integer minSatu, Integer maxSatu, BigDecimal minSod, BigDecimal maxSod);

    //1
    public List<Product> findByPmCarbBetweenAndPmSugBetweenAndPmProtBetweenAndPmFibBetweenAndPmSodBetween
    (Integer minCarb, Integer maxCarb, Integer minSug, Integer maxSug,
    Integer minProt, Integer maxProt, BigDecimal minFib, BigDecimal maxFib, BigDecimal minSod, BigDecimal maxSod);

    //2
    public List<Product> findByPmCarbBetweenAndPmSugBetweenAndPmFatBetweenAndPmSatuBetweenAndPmFibBetween
    (Integer minCarb, Integer maxCarb, Integer minSug, Integer maxSug,
    Integer minFat, Integer maxFat, Integer minSatu, Integer maxSatu, BigDecimal minFib, BigDecimal maxFib);
    public List<Product> findByPmCarbBetweenAndPmSugBetweenAndPmFatBetweenAndPmSatuBetweenAndPmSodBetween
    (Integer minCarb, Integer maxCarb, Integer minSug, Integer maxSug,
    Integer minFat, Integer maxFat, Integer minSatu, Integer maxSatu, BigDecimal minSod, BigDecimal maxSod);
    
    //1
    public List<Product> findByPmCarbBetweenAndPmSugBetweenAndPmFatBetweenAndPmFibBetweenAndPmSodBetween
    (Integer minCarb, Integer maxCarb, Integer minSug, Integer maxSug,
    Integer minFat, Integer maxFat, BigDecimal minFib, BigDecimal maxFib, BigDecimal minSod, BigDecimal maxSod);
    //1
    public List<Product> findByPmCarbBetweenAndPmSugBetweenAndPmSatuBetweenAndPmFibBetweenAndPmSodBetween
    (Integer minCarb, Integer maxCarb, Integer minSug, Integer maxSug,
    Integer minSatu, Integer maxSatu, BigDecimal minFib, BigDecimal maxFib, BigDecimal minSod, BigDecimal maxSod);

    //2
    public List<Product> findByPmCarbBetweenAndPmProtBetweenAndPmFatBetweenAndPmSatuBetweenAndPmFibBetween
    (Integer minCarb, Integer maxCarb, Integer minProt, Integer maxProt,
    Integer minFat, Integer maxFat, Integer minSatu, Integer maxSatu, BigDecimal minFib, BigDecimal maxFib);
    public List<Product> findByPmCarbBetweenAndPmProtBetweenAndPmFatBetweenAndPmSatuBetweenAndPmSodBetween
    (Integer minCarb, Integer maxCarb, Integer minProt, Integer maxProt,
    Integer minFat, Integer maxFat, Integer minSatu, Integer maxSatu, BigDecimal minSod, BigDecimal maxSod);

    //2
    public List<Product> findByPmCarbBetweenAndPmProtBetweenAndPmFatBetweenAndPmFibBetweenAndPmSodBetween
    (Integer minCarb, Integer maxCarb, Integer minProt, Integer maxProt,
    Integer minFat, Integer maxFat, BigDecimal minFib, BigDecimal maxFib, BigDecimal minSod, BigDecimal maxSod);
    public List<Product> findByPmCarbBetweenAndPmProtBetweenAndPmSatuBetweenAndPmFibBetweenAndPmSodBetween
    (Integer minCarb, Integer maxCarb, Integer minProt, Integer maxProt,
    Integer minSatu, Integer maxSatu, BigDecimal minFib, BigDecimal maxFib, BigDecimal minSod, BigDecimal maxSod);

//



    public List<Product> findByPmCarbBetweenAndPmFatBetweenAndPmSatuBetweenAndPmFibBetweenAndPmSodBetween
    (Integer minCarb, Integer maxCarb, Integer minFat, Integer maxFat,
    Integer minSatu, Integer maxSatu, BigDecimal minFib, BigDecimal maxFib, BigDecimal minSod, BigDecimal maxSod);

    //2
    public List<Product> findByPmSugBetweenAndPmProtBetweenAndPmFatBetweenAndPmSatuBetweenAndPmFibBetween
    (Integer minSug, Integer maxSug, Integer minProt, Integer maxProt,
    Integer minFat, Integer maxFat, Integer minSatu, Integer maxSatu, BigDecimal minFib, BigDecimal maxFib);
    public List<Product> findByPmSugBetweenAndPmProtBetweenAndPmFatBetweenAndPmSatuBetweenAndPmSodBetween
    (Integer minSug, Integer maxSug, Integer minProt, Integer maxProt,
    Integer minFat, Integer maxFat, Integer minSatu, Integer maxSatu, BigDecimal minSod, BigDecimal maxSod);

    public List<Product> findByPmSugBetweenAndPmProtBetweenAndPmFatBetweenAndPmFibBetweenAndPmSodBetween
    (Integer minSug, Integer maxSug, Integer minProt, Integer maxProt,
    Integer minFat, Integer maxFat, BigDecimal minFib, BigDecimal maxFib, BigDecimal minSod, BigDecimal maxSod);

    public List<Product> findByPmSugBetweenAndPmProtBetweenAndPmSatuBetweenAndPmFibBetweenAndPmSodBetween
    (Integer minSug, Integer maxSug, Integer minProt, Integer maxProt,
    Integer minSatu, Integer maxSatu, BigDecimal minFib, BigDecimal maxFib, BigDecimal minSod, BigDecimal maxSod);

    public List<Product> findByPmSugBetweenAndPmFatBetweenAndPmSatuBetweenAndPmFibBetweenAndPmSodBetween
    (Integer minSug, Integer maxSug, Integer minFat, Integer maxFat,
    Integer minSatu, Integer maxSatu, BigDecimal minFib, BigDecimal maxFib, BigDecimal minSod, BigDecimal maxSod);
    public List<Product> findByPmProtBetweenAndPmFatBetweenAndPmSatuBetweenAndPmFibBetweenAndPmSodBetween
    (Integer minProt, Integer maxProt, Integer minFat, Integer maxFat,
    Integer minSatu, Integer maxSatu, BigDecimal minFib, BigDecimal maxFib, BigDecimal minSod, BigDecimal maxSod);


    //4 PM ALL Done
    
    //5
    public List<Product> findByPmCaloBetweenAndPmCarbBetweenAndPmSugBetweenAndPmProtBetween
    (Integer minCalo, Integer maxCalo, Integer minCarb, Integer maxCarb,
    Integer minSug, Integer maxSug, Integer minProt, Integer maxProt);
    public List<Product> findByPmCaloBetweenAndPmCarbBetweenAndPmSugBetweenAndPmFatBetween
    (Integer minCalo, Integer maxCalo, Integer minCarb, Integer maxCarb,
    Integer minSug, Integer maxSug, Integer minFat, Integer maxFat);
    public List<Product> findByPmCaloBetweenAndPmCarbBetweenAndPmSugBetweenAndPmSatuBetween
    (Integer minCalo, Integer maxCalo, Integer minCarb, Integer maxCarb,
    Integer minSug, Integer maxSug, Integer minSatu, Integer maxSatu);
    public List<Product> findByPmCaloBetweenAndPmCarbBetweenAndPmSugBetweenAndPmFibBetween
    (Integer minCalo, Integer maxCalo, Integer minCarb, Integer maxCarb,
    Integer minSug, Integer maxSug, BigDecimal minFib, BigDecimal maxFib);
    public List<Product> findByPmCaloBetweenAndPmCarbBetweenAndPmSugBetweenAndPmSodBetween
    (Integer minCalo, Integer maxCalo, Integer minCarb, Integer maxCarb,
    Integer minSug, Integer maxSug, BigDecimal minSod, BigDecimal maxSod);


    //4
    public List<Product> findByPmCaloBetweenAndPmCarbBetweenAndPmProtBetweenAndPmFatBetween
    (Integer minCalo, Integer maxCalo, Integer minCarb, Integer maxCarb,
    Integer minProt, Integer maxProt, Integer minFat, Integer maxFat);
    public List<Product> findByPmCaloBetweenAndPmCarbBetweenAndPmProtBetweenAndPmSatuBetween
    (Integer minCalo, Integer maxCalo, Integer minCarb, Integer maxCarb,
    Integer minProt, Integer maxProt, Integer minSatu, Integer maxSatu);
    public List<Product> findByPmCaloBetweenAndPmCarbBetweenAndPmProtBetweenAndPmFibBetween
    (Integer minCalo, Integer maxCalo, Integer minCarb, Integer maxCarb,
    Integer minProt, Integer maxProt, BigDecimal minFib, BigDecimal maxFib);
    public List<Product> findByPmCaloBetweenAndPmCarbBetweenAndPmProtBetweenAndPmSodBetween
    (Integer minCalo, Integer maxCalo, Integer minCarb, Integer maxCarb,
    Integer minProt, Integer maxProt, BigDecimal minSod, BigDecimal maxSod);


    //3
    public List<Product> findByPmCaloBetweenAndPmCarbBetweenAndPmFatBetweenAndPmSatuBetween
    (Integer minCalo, Integer maxCalo, Integer minCarb, Integer maxCarb,
    Integer minFat, Integer maxFat, Integer minSatu, Integer maxSatu);
    public List<Product> findByPmCaloBetweenAndPmCarbBetweenAndPmFatBetweenAndPmFibBetween
    (Integer minCalo, Integer maxCalo, Integer minCarb, Integer maxCarb,
    Integer minFat, Integer maxFat, BigDecimal minFib, BigDecimal maxFib);
    public List<Product> findByPmCaloBetweenAndPmCarbBetweenAndPmFatBetweenAndPmSodBetween
    (Integer minCalo, Integer maxCalo, Integer minCarb, Integer maxCarb,
    Integer minFat, Integer maxFat, BigDecimal minSod, BigDecimal maxSod);

    //2
    public List<Product> findByPmCaloBetweenAndPmCarbBetweenAndPmSatuBetweenAndPmFibBetween
    (Integer minCalo, Integer maxCalo, Integer minCarb, Integer maxCarb,
    Integer minSatu, Integer maxSatu, BigDecimal minFib, BigDecimal maxFib);
    public List<Product> findByPmCaloBetweenAndPmCarbBetweenAndPmSatuBetweenAndPmSodBetween
    (Integer minCalo, Integer maxCalo, Integer minCarb, Integer maxCarb,
    Integer minFat, Integer maxFat, BigDecimal minSod, BigDecimal maxSod);

    //1
    public List<Product> findByPmCaloBetweenAndPmCarbBetweenAndPmFibBetweenAndPmSodBetween
    (Integer minCalo, Integer maxCalo, Integer minCarb, Integer maxCarb,
    BigDecimal minFib, BigDecimal maxFib, BigDecimal minSod, BigDecimal maxSod);

    //4
    public List<Product> findByPmCaloBetweenAndPmSugBetweenAndPmProtBetweenAndPmFatBetween
    (Integer minCalo, Integer maxCalo, Integer minSug, Integer maxSug,
    Integer minProt, Integer maxProt, Integer minFat, Integer maxFat);
    public List<Product> findByPmCaloBetweenAndPmSugBetweenAndPmProtBetweenAndPmSatuBetween
    (Integer minCalo, Integer maxCalo, Integer minSug, Integer maxSug,
    Integer minProt, Integer maxProt, Integer minSatu, Integer maxSatu);
    public List<Product> findByPmCaloBetweenAndPmSugBetweenAndPmProtBetweenAndPmFibBetween
    (Integer minCalo, Integer maxCalo, Integer minSug, Integer maxSug,
    Integer minProt, Integer maxProt, BigDecimal minFib, BigDecimal maxFib);
    public List<Product> findByPmCaloBetweenAndPmSugBetweenAndPmProtBetweenAndPmSodBetween
    (Integer minCalo, Integer maxCalo, Integer minSug, Integer maxSug,
    Integer minProt, Integer maxProt, BigDecimal minSod, BigDecimal maxSod);

    //3
    public List<Product> findByPmCaloBetweenAndPmSugBetweenAndPmFatBetweenAndPmSatuBetween
    (Integer minCalo, Integer maxCalo, Integer minSug, Integer maxSug,
    Integer minFat, Integer maxFat, Integer minSatu, Integer maxSatu);
    public List<Product> findByPmCaloBetweenAndPmSugBetweenAndPmFatBetweenAndPmFibBetween
    (Integer minCalo, Integer maxCalo, Integer minSug, Integer maxSug,
    Integer minFat, Integer maxFat, BigDecimal minFib, BigDecimal maxFib);
    public List<Product> findByPmCaloBetweenAndPmSugBetweenAndPmFatBetweenAndPmSodBetween
    (Integer minCalo, Integer maxCalo, Integer minSug, Integer maxSug,
    Integer minFat, Integer maxFat, BigDecimal minSod, BigDecimal maxSod);

    //2
    public List<Product> findByPmCaloBetweenAndPmSugBetweenAndPmSatuBetweenAndPmFibBetween
    (Integer minCalo, Integer maxCalo, Integer minSug, Integer maxSug,
    Integer minSatu, Integer maxSatu, BigDecimal minFib, BigDecimal maxFib);
    public List<Product> findByPmCaloBetweenAndPmSugBetweenAndPmSatuBetweenAndPmSodBetween
    (Integer minCalo, Integer maxCalo, Integer minSug, Integer maxSug,
    Integer minSatu, Integer maxSatu, BigDecimal minSod, BigDecimal maxSod);

    //1
    public List<Product> findByPmCaloBetweenAndPmSugBetweenAndPmFibBetweenAndPmSodBetween
    (Integer minCalo, Integer maxCalo, Integer minSug, Integer maxSug,
    BigDecimal minFib, BigDecimal maxFib, BigDecimal minSod, BigDecimal maxSod);

    //3
    public List<Product> findByPmCaloBetweenAndPmProtBetweenAndPmFatBetweenAndPmSatuBetween
    (Integer minCalo, Integer maxCalo, Integer minProt, Integer maxProt,
    Integer minFat, Integer maxFat, Integer minSatu, Integer maxSatu);
    public List<Product> findByPmCaloBetweenAndPmProtBetweenAndPmFatBetweenAndPmFibBetween
    (Integer minCalo, Integer maxCalo, Integer minProt, Integer maxProt,
    Integer minFat, Integer maxFat, BigDecimal minFib, BigDecimal maxFib);
    public List<Product> findByPmCaloBetweenAndPmProtBetweenAndPmFatBetweenAndPmSodBetween
    (Integer minCalo, Integer maxCalo, Integer minProt, Integer maxProt,
    Integer minFat, Integer maxFat, BigDecimal minSod, BigDecimal maxSod);

    //2
    public List<Product> findByPmCaloBetweenAndPmProtBetweenAndPmSatuBetweenAndPmFibBetween
    (Integer minCalo, Integer maxCalo, Integer minProt, Integer maxProt,
    Integer minSatu, Integer maxSatu, BigDecimal minFib, BigDecimal maxFib);
    public List<Product> findByPmCaloBetweenAndPmProtBetweenAndPmSatuBetweenAndPmSodBetween
    (Integer minCalo, Integer maxCalo, Integer minProt, Integer maxProt,
    Integer minSatu, Integer maxSatu, BigDecimal minSod, BigDecimal maxSod);


    //1
    public List<Product> findByPmCaloBetweenAndPmProtBetweenAndPmFibBetweenAndPmSodBetween
    (Integer minCalo, Integer maxCalo, Integer minProt, Integer maxProt,
    BigDecimal minFib, BigDecimal maxFib, BigDecimal minSod, BigDecimal maxSod);


    //2
    public List<Product> findByPmCaloBetweenAndPmFatBetweenAndPmSatuBetweenAndPmFibBetween
    (Integer minCalo, Integer maxCalo, Integer minFat, Integer maxFat,
    Integer minSatu, Integer maxSatu, BigDecimal minFib, BigDecimal maxFib);
    public List<Product> findByPmCaloBetweenAndPmFatBetweenAndPmSatuBetweenAndPmSodBetween
    (Integer minCalo, Integer maxCalo, Integer minFat, Integer maxFat,
    Integer minSatu, Integer maxSatu, BigDecimal minSod, BigDecimal maxSod);

    //1
    public List<Product> findByPmCaloBetweenAndPmFatBetweenAndPmFibBetweenAndPmSodBetween
    (Integer minCalo, Integer maxCalo, Integer minFat, Integer maxFat,
    BigDecimal minFib, BigDecimal maxFib, BigDecimal minSod, BigDecimal maxSod);

    //1
    public List<Product> findByPmCaloBetweenAndPmSatuBetweenAndPmFibBetweenAndPmSodBetween
    (Integer minCalo, Integer maxCalo, Integer minSatu, Integer maxSatu,
    BigDecimal minFib, BigDecimal maxFib, BigDecimal minSod, BigDecimal maxSod);

    //4
    public List<Product> findByPmCarbBetweenAndPmSugBetweenAndPmProtBetweenAndPmFatBetween
    (Integer minCarb, Integer maxCarb, Integer minSug, Integer maxSug,
    Integer minProt, Integer maxProt, Integer minFat, Integer maxFat);
    public List<Product> findByPmCarbBetweenAndPmSugBetweenAndPmProtBetweenAndPmSatuBetween
    (Integer minCarb, Integer maxCarb, Integer minSug, Integer maxSug,
    Integer minProt, Integer maxProt, Integer minSatu, Integer maxSatu);
    public List<Product> findByPmCarbBetweenAndPmSugBetweenAndPmProtBetweenAndPmFibBetween
    (Integer minCarb, Integer maxCarb, Integer minSug, Integer maxSug,
    Integer minProt, Integer maxProt, BigDecimal minFib, BigDecimal maxFib);
    public List<Product> findByPmCarbBetweenAndPmSugBetweenAndPmProtBetweenAndPmSodBetween
    (Integer minCarb, Integer maxCarb, Integer minSug, Integer maxSug,
    Integer minProt, Integer maxProt, BigDecimal minSod, BigDecimal maxSod);

    //3
    public List<Product> findByPmCarbBetweenAndPmSugBetweenAndPmFatBetweenAndPmSatuBetween
    (Integer minCarb, Integer maxCarb, Integer minSug, Integer maxSug,
    Integer minFat, Integer maxFat, Integer minSatu, Integer maxSatu);
    public List<Product> findByPmCarbBetweenAndPmSugBetweenAndPmFatBetweenAndPmFibBetween
    (Integer minCarb, Integer maxCarb, Integer minSug, Integer maxSug,
    Integer minFat, Integer maxFat, BigDecimal minFib, BigDecimal maxFib);
    public List<Product> findByPmCarbBetweenAndPmSugBetweenAndPmFatBetweenAndPmSodBetween
    (Integer minCarb, Integer maxCarb, Integer minSug, Integer maxSug,
    Integer minFat, Integer maxFat, BigDecimal minSod, BigDecimal maxSod);

    //2
    public List<Product> findByPmCarbBetweenAndPmSugBetweenAndPmSatuBetweenAndPmFibBetween
    (Integer minCarb, Integer maxCarb, Integer minSug, Integer maxSug,
    Integer minSatu, Integer maxSatu, BigDecimal minFib, BigDecimal maxFib);
    public List<Product> findByPmCarbBetweenAndPmSugBetweenAndPmSatuBetweenAndPmSodBetween
    (Integer minCarb, Integer maxCarb, Integer minSug, Integer maxSug,
    Integer minSatu, Integer maxSatu, BigDecimal minSod, BigDecimal maxSod);

    //1
    public List<Product> findByPmCarbBetweenAndPmSugBetweenAndPmFibBetweenAndPmSodBetween
    (Integer minCarb, Integer maxCarb, Integer minSug, Integer maxSug,
    BigDecimal minFib, BigDecimal maxFib, BigDecimal minSod, BigDecimal maxSod);

    //3
    public List<Product> findByPmCarbBetweenAndPmProtBetweenAndPmFatBetweenAndPmSatuBetween
    (Integer minCarb, Integer maxCarb, Integer minProt, Integer maxProt,
    Integer minFat, Integer maxFat, Integer minSatu, Integer maxSatu);
    public List<Product> findByPmCarbBetweenAndPmProtBetweenAndPmFatBetweenAndPmFibBetween
    (Integer minCarb, Integer maxCarb, Integer minprot, Integer maxprot,
    Integer minFat, Integer maxFat, BigDecimal minFib, BigDecimal maxFib);
    public List<Product> findByPmCarbBetweenAndPmProtBetweenAndPmFatBetweenAndPmSodBetween
    (Integer minCarb, Integer maxCarb, Integer minProt, Integer maxProt,
    Integer minFat, Integer maxFat, BigDecimal minSod, BigDecimal maxSod);

    //2
    public List<Product> findByPmCarbBetweenAndPmProtBetweenAndPmSatuBetweenAndPmFibBetween
    (Integer minCarb, Integer maxCarb, Integer minprot, Integer maxprot,
    Integer minSatu, Integer maxSatu, BigDecimal minFib, BigDecimal maxFib);
    public List<Product> findByPmCarbBetweenAndPmProtBetweenAndPmSatuBetweenAndPmSodBetween
    (Integer minCarb, Integer maxCarb, Integer minProt, Integer maxProt,
    Integer minSatu, Integer maxSatu, BigDecimal minSod, BigDecimal maxSod);

    //1
    public List<Product> findByPmCarbBetweenAndPmProtBetweenAndPmFibBetweenAndPmSodBetween
    (Integer minCarb, Integer maxCarb, Integer minProt, Integer maxProt,
    BigDecimal minFib, BigDecimal maxFib, BigDecimal minSod, BigDecimal maxSod);

    //2
    public List<Product> findByPmCarbBetweenAndPmFatBetweenAndPmSatuBetweenAndPmFibBetween
    (Integer minCarb, Integer maxCarb, Integer minFat, Integer maxFat,
    Integer minSatu, Integer maxSatu, BigDecimal minFib, BigDecimal maxFib);
    public List<Product> findByPmCarbBetweenAndPmFatBetweenAndPmSatuBetweenAndPmSodBetween
    (Integer minCarb, Integer maxCarb, Integer minFat, Integer maxFat,
    Integer minSatu, Integer maxSatu, BigDecimal minSod, BigDecimal maxSod);

    //2
    public List<Product> findByPmCarbBetweenAndPmFatBetweenAndPmFibBetweenAndPmSodBetween
    (Integer minCarb, Integer maxCarb, Integer minFat, Integer maxFat,
    BigDecimal minFib, BigDecimal maxFib, BigDecimal minSod, BigDecimal maxSod);
    public List<Product> findByPmCarbBetweenAndPmSatuBetweenAndPmFibBetweenAndPmSodBetween
    (Integer minCarb, Integer maxCarb, Integer minSatu, Integer maxSatu,
    BigDecimal minFib, BigDecimal maxFib, BigDecimal minSod, BigDecimal maxSod);

    //3
    public List<Product> findByPmSugBetweenAndPmProtBetweenAndPmFatBetweenAndPmSatuBetween
    (Integer minSug, Integer maxSug, Integer minProt, Integer maxProt,
    Integer minFat, Integer maxFat, Integer minSatu, Integer maxSatu);
    public List<Product> findByPmSugBetweenAndPmProtBetweenAndPmFatBetweenAndPmFibBetween
    (Integer minSug, Integer maxSug, Integer minprot, Integer maxprot,
    Integer minFat, Integer maxFat, BigDecimal minFib, BigDecimal maxFib);
    public List<Product> findByPmSugBetweenAndPmProtBetweenAndPmFatBetweenAndPmSodBetween
    (Integer minSug, Integer maxSug, Integer minProt, Integer maxProt,
    Integer minFat, Integer maxFat, BigDecimal minSod, BigDecimal maxSod);

    //2
    public List<Product> findByPmSugBetweenAndPmProtBetweenAndPmSatuBetweenAndPmFibBetween
    (Integer minSug, Integer maxSug, Integer minprot, Integer maxprot,
    Integer minSatu, Integer maxSatu, BigDecimal minFib, BigDecimal maxFib);
    public List<Product> findByPmSugBetweenAndPmProtBetweenAndPmSatuBetweenAndPmSodBetween
    (Integer minSug, Integer maxSug, Integer minProt, Integer maxProt,
    Integer minSatu, Integer maxSatu, BigDecimal minSod, BigDecimal maxSod);

    //1
    public List<Product> findByPmSugBetweenAndPmProtBetweenAndPmFibBetweenAndPmSodBetween
    (Integer minSug, Integer maxSug, Integer minProt, Integer maxProt,
    BigDecimal minFib, BigDecimal maxFib, BigDecimal minSod, BigDecimal maxSod);

    //2
    public List<Product> findByPmSugBetweenAndPmFatBetweenAndPmSatuBetweenAndPmFibBetween
    (Integer minSug, Integer maxSug, Integer minFat, Integer maxFat,
    Integer minSatu, Integer maxSatu, BigDecimal minFib, BigDecimal maxFib);
    public List<Product> findByPmSugBetweenAndPmFatBetweenAndPmSatuBetweenAndPmSodBetween
    (Integer minSug, Integer maxSug, Integer minFat, Integer maxFat,
    Integer minSatu, Integer maxSatu, BigDecimal minSod, BigDecimal maxSod);

    //1
    public List<Product> findByPmSugBetweenAndPmFatBetweenAndPmFibBetweenAndPmSodBetween
    (Integer minSug, Integer maxSug, Integer minFat, Integer maxFat,
    BigDecimal minFib, BigDecimal maxFib, BigDecimal minSod, BigDecimal maxSod);
   
    //1
    public List<Product> findByPmSugBetweenAndPmSatuBetweenAndPmFibBetweenAndPmSodBetween
    (Integer minSug, Integer maxSug, Integer minSatu, Integer maxSatu,
    BigDecimal minFib, BigDecimal maxFib, BigDecimal minSod, BigDecimal maxSod);

    //2
    public List<Product> findByPmProtBetweenAndPmFatBetweenAndPmSatuBetweenAndPmFibBetween
    (Integer minProt, Integer maxProt, Integer minFat, Integer maxFat,
    Integer minSatu, Integer maxSatu, BigDecimal minFib, BigDecimal maxFib);
    public List<Product> findByPmProtBetweenAndPmFatBetweenAndPmSatuBetweenAndPmSodBetween
    (Integer minProt, Integer maxProt, Integer minFat, Integer maxFat,
    Integer minSatu, Integer maxSatu, BigDecimal minSod, BigDecimal maxSod);

    //1
    public List<Product> findByPmProtBetweenAndPmFatBetweenAndPmFibBetweenAndPmSodBetween
    (Integer minProt, Integer maxProt, Integer minFat, Integer maxFat,
    BigDecimal minFib, BigDecimal maxFib, BigDecimal minSod, BigDecimal maxSod);
    //1
    public List<Product> findByPmProtBetweenAndPmSatuBetweenAndPmFibBetweenAndPmSodBetween
    (Integer minProt, Integer maxProt, Integer minSatu, Integer maxSatu,
    BigDecimal minFib, BigDecimal maxFib, BigDecimal minSod, BigDecimal maxSod);
    //1
    public List<Product> findByPmFatBetweenAndPmSatuBetweenAndPmFibBetweenAndPmSodBetween
    (Integer minFat, Integer maxFat, Integer minSatu, Integer maxSatu,
    BigDecimal minFib, BigDecimal maxFib, BigDecimal minSod, BigDecimal maxSod);




    //Triple PM ALL good
    // 6
    public List<Product> findByPmCaloBetweenAndPmCarbBetweenAndPmSugBetween
    (Integer minCalo, Integer maxCalo, Integer minCarb, Integer maxCarb, Integer minSug, Integer maxSug);
    public List<Product> findByPmCaloBetweenAndPmCarbBetweenAndPmProtBetween
    (Integer minCalo, Integer maxCalo, Integer minCarb, Integer maxCarb, Integer minProt, Integer maxProt);
    public List<Product> findByPmCaloBetweenAndPmCarbBetweenAndPmFatBetween
    (Integer minCalo, Integer maxCalo, Integer minCarb, Integer maxCarb, Integer minFat, Integer maxFat);
    public List<Product> findByPmCaloBetweenAndPmCarbBetweenAndPmSatuBetween
    (Integer minCalo, Integer maxCalo, Integer minCarb, Integer maxCarb, Integer minSatu, Integer maxSatu);
    public List<Product> findByPmCaloBetweenAndPmCarbBetweenAndPmFibBetween
    (Integer minCalo, Integer maxCalo, Integer minCarb, Integer maxCarb, BigDecimal minFib, BigDecimal maxFib);
    public List<Product> findByPmCaloBetweenAndPmCarbBetweenAndPmSodBetween
    (Integer minCalo, Integer maxCalo, Integer minCarb, Integer maxCarb, BigDecimal minSod, BigDecimal maxSod);

    //5
    public List<Product> findByPmCaloBetweenAndPmSugBetweenAndPmProtBetween
    (Integer minCalo, Integer maxCalo, Integer minSug, Integer maxSug, Integer minProt, Integer maxProt);
    public List<Product> findByPmCaloBetweenAndPmSugBetweenAndPmFatBetween
    (Integer minCalo, Integer maxCalo, Integer minSug, Integer maxSug, Integer minFat, Integer maxFat);
    public List<Product> findByPmCaloBetweenAndPmSugBetweenAndPmSatuBetween
    (Integer minCalo, Integer maxCalo, Integer minSug, Integer maxSug, Integer minSatu, Integer maxSatu);
    public List<Product> findByPmCaloBetweenAndPmSugBetweenAndPmFibBetween
    (Integer minCalo, Integer maxCalo, Integer minSug, Integer maxSug, BigDecimal minFib, BigDecimal maxFib);
    public List<Product> findByPmCaloBetweenAndPmSugBetweenAndPmSodBetween
    (Integer minCalo, Integer maxCalo, Integer minSug, Integer maxSug, BigDecimal minSod, BigDecimal maxSod);

    //4
    public List<Product> findByPmCaloBetweenAndPmProtBetweenAndPmFatBetween
    (Integer minCalo, Integer maxCalo, Integer minProt, Integer maxProt, Integer minFat, Integer maxFat);
    public List<Product> findByPmCaloBetweenAndPmProtBetweenAndPmSatuBetween
    (Integer minCalo, Integer maxCalo, Integer minProt, Integer maxProt, Integer minSatu, Integer maxSatu);
    public List<Product> findByPmCaloBetweenAndPmProtBetweenAndPmFibBetween
    (Integer minCalo, Integer maxCalo, Integer minProt, Integer maxProt, BigDecimal minFib, BigDecimal maxFib);
    public List<Product> findByPmCaloBetweenAndPmProtBetweenAndPmSodBetween
    (Integer minCalo, Integer maxCalo, Integer minProt, Integer maxProt, BigDecimal minSod, BigDecimal maxSod);

    //3
    public List<Product> findByPmCaloBetweenAndPmFatBetweenAndPmSatuBetween
    (Integer minCalo, Integer maxCalo, Integer minFat, Integer maxFat, Integer minSatu, Integer maxSatu);
    public List<Product> findByPmCaloBetweenAndPmFatBetweenAndPmFibBetween
    (Integer minCalo, Integer maxCalo, Integer minFat, Integer maxFat, BigDecimal minFib, BigDecimal maxFib);
    public List<Product> findByPmCaloBetweenAndPmFatBetweenAndPmSodBetween
    (Integer minCalo, Integer maxCalo, Integer minFat, Integer maxFat, BigDecimal minSod, BigDecimal maxSod);

    //2
    public List<Product> findByPmCaloBetweenAndPmSatuBetweenAndPmFibBetween
    (Integer minCalo, Integer maxCalo, Integer minSatu, Integer maxSatu, BigDecimal minFib, BigDecimal maxFib);
    public List<Product> findByPmCaloBetweenAndPmSatuBetweenAndPmSodBetween
    (Integer minCalo, Integer maxCalo, Integer minSatu, Integer maxSatu, BigDecimal minSod, BigDecimal maxSod);

    //1
    public List<Product> findByPmCaloBetweenAndPmFibBetweenAndPmSodBetween
    (Integer minCalo, Integer maxCalo, BigDecimal minFib, BigDecimal maxFib, BigDecimal minSod, BigDecimal maxSod);
    
    

    //5
    public List<Product> findByPmCarbBetweenAndPmSugBetweenAndPmProtBetween
    (Integer minCarb, Integer maxCarb, Integer minSug, Integer maxSug, Integer minProt, Integer maxProt);
    public List<Product> findByPmCarbBetweenAndPmSugBetweenAndPmFatBetween
    (Integer minCarb, Integer maxCarb, Integer minSug, Integer maxSug, Integer minFat, Integer maxFat);
    public List<Product> findByPmCarbBetweenAndPmSugBetweenAndPmSatuBetween
    (Integer minCarb, Integer maxCarb, Integer minSug, Integer maxSug, Integer minSatu, Integer maxSatu);
    public List<Product> findByPmCarbBetweenAndPmSugBetweenAndPmFibBetween
    (Integer minCarb, Integer maxCarb, Integer minSug, Integer maxSug, BigDecimal minFib, BigDecimal maxFib);
    public List<Product> findByPmCarbBetweenAndPmSugBetweenAndPmSodBetween
    (Integer minCarb, Integer maxCarb, Integer minSug, Integer maxSug, BigDecimal minSod, BigDecimal maxSod);


    //4
    public List<Product> findByPmCarbBetweenAndPmProtBetweenAndPmFatBetween
    (Integer minCarb, Integer maxCarb, Integer minProt, Integer maxProt, Integer minFat, Integer maxFat);
    public List<Product> findByPmCarbBetweenAndPmProtBetweenAndPmSatuBetween
    (Integer minCarb, Integer maxCarb, Integer minProt, Integer maxProt, Integer minSatu, Integer maxSatu);
    public List<Product> findByPmCarbBetweenAndPmProtBetweenAndPmFibBetween
    (Integer minCarb, Integer maxCarb, Integer minProt, Integer maxProt, BigDecimal minFib, BigDecimal maxFib);
    public List<Product> findByPmCarbBetweenAndPmProtBetweenAndPmSodBetween
    (Integer minCarb, Integer maxCarb, Integer minProt, Integer maxProt, BigDecimal minSod, BigDecimal maxSod);

    //3
    public List<Product> findByPmCarbBetweenAndPmFatBetweenAndPmSatuBetween
    (Integer minCarb, Integer maxCarb, Integer minFat, Integer maxFat, Integer minSatu, Integer maxSatu);
    public List<Product> findByPmCarbBetweenAndPmFatBetweenAndPmFibBetween
    (Integer minCarb, Integer maxCarb, Integer minFat, Integer maxFat, BigDecimal minFib, BigDecimal maxFib);
    public List<Product> findByPmCarbBetweenAndPmFatBetweenAndPmSodBetween
    (Integer minCarb, Integer maxCarb, Integer minFat, Integer maxFat, BigDecimal minSod, BigDecimal maxSod);

    //2
    public List<Product> findByPmCarbBetweenAndPmSatuBetweenAndPmFibBetween
    (Integer minCarb, Integer maxCarb, Integer minSatu, Integer maxSatu, BigDecimal minFib, BigDecimal maxFib);
    public List<Product> findByPmCarbBetweenAndPmSatuBetweenAndPmSodBetween
    (Integer minCarb, Integer maxCarb, Integer minSatu, Integer maxSatu, BigDecimal minSod, BigDecimal maxSod);

    //1
    public List<Product> findByPmCarbBetweenAndPmFibBetweenAndPmSodBetween
    (Integer minCarb, Integer maxCarb, BigDecimal minFib, BigDecimal maxFib, BigDecimal minSod, BigDecimal maxSod);

    //4
    public List<Product> findByPmSugBetweenAndPmProtBetweenAndPmFatBetween
    (Integer minSug, Integer maxSug, Integer minProt, Integer maxProt, Integer minFat, Integer maxFat);
    public List<Product> findByPmSugBetweenAndPmProtBetweenAndPmSatuBetween
    (Integer minSug, Integer maxSug, Integer minProt, Integer maxProt, Integer minSatu, Integer maxSatu);
    public List<Product> findByPmSugBetweenAndPmProtBetweenAndPmFibBetween
    (Integer minSug, Integer maxSug, Integer minProt, Integer maxProt, BigDecimal minFib, BigDecimal maxFib);
    public List<Product> findByPmSugBetweenAndPmProtBetweenAndPmSodBetween
    (Integer minSug, Integer maxSug, Integer minProt, Integer maxProt, BigDecimal minSod, BigDecimal maxSod);


    //3
    public List<Product> findByPmSugBetweenAndPmFatBetweenAndPmSatuBetween
    (Integer minSug, Integer maxSug, Integer minFat, Integer maxFat, Integer minSatu, Integer maxSatu);
    public List<Product> findByPmSugBetweenAndPmFatBetweenAndPmFibBetween
    (Integer minSug, Integer maxSug, Integer minFat, Integer maxFat, BigDecimal minFib, BigDecimal maxFib);
    public List<Product> findByPmSugBetweenAndPmFatBetweenAndPmSodBetween
    (Integer minSug, Integer maxSug, Integer minFat, Integer maxFat, BigDecimal minSod, BigDecimal maxSod);


    //2
    public List<Product> findByPmSugBetweenAndPmSatuBetweenAndPmFibBetween
    (Integer minSug, Integer maxSug, Integer minSatu, Integer maxSatu, BigDecimal minFib, BigDecimal maxFib);
    public List<Product> findByPmSugBetweenAndPmSatuBetweenAndPmSodBetween
    (Integer minSug, Integer maxSug, Integer minSatu, Integer maxSatu, BigDecimal minSod, BigDecimal maxSod);


    //1
    public List<Product> findByPmSugBetweenAndPmFibBetweenAndPmSodBetween
    (Integer minSug, Integer maxSug, BigDecimal minFib, BigDecimal maxFib, BigDecimal minSod, BigDecimal maxSod);

    //3
    public List<Product> findByPmProtBetweenAndPmFatBetweenAndPmSatuBetween
    (Integer minProt, Integer maxProt, Integer minFat, Integer maxFat, Integer minSatu, Integer maxSatu);
    public List<Product> findByPmProtBetweenAndPmFatBetweenAndPmFibBetween
    (Integer minProt, Integer maxProt, Integer minFat, Integer maxFat, BigDecimal minFib, BigDecimal maxFib);
    public List<Product> findByPmProtBetweenAndPmFatBetweenAndPmSodBetween
    (Integer minProt, Integer maxProt, Integer minFat, Integer maxFat, BigDecimal minSod, BigDecimal maxSod);

    //2
    public List<Product> findByPmProtBetweenAndPmSatuBetweenAndPmFibBetween
    (Integer minProt, Integer maxProt, Integer minSatu, Integer maxSatu, BigDecimal minFib, BigDecimal maxFib);
    public List<Product> findByPmProtBetweenAndPmSatuBetweenAndPmSodBetween
    (Integer minProt, Integer maxProt, Integer minSatu, Integer maxSatu, BigDecimal minSod, BigDecimal maxSod);

    //1
    public List<Product> findByPmProtBetweenAndPmFibBetweenAndPmSodBetween
    (Integer minProt, Integer maxProt, BigDecimal minFib, BigDecimal maxFib, BigDecimal minSod, BigDecimal maxSod);

    //2
    public List<Product> findByPmFatBetweenAndPmSatuBetweenAndPmFibBetween
    (Integer minFat, Integer maxFat, Integer minSatu, Integer maxSatu, BigDecimal minFib, BigDecimal maxFib);
    public List<Product> findByPmFatBetweenAndPmSatuBetweenAndPmSodBetween
    (Integer minFat, Integer maxFat, Integer minSatu, Integer maxSatu, BigDecimal minSod, BigDecimal maxSod);


    //1
    public List<Product> findByPmFatBetweenAndPmFibBetweenAndPmSodBetween
    (Integer minFat, Integer maxFat, BigDecimal minFib, BigDecimal maxFib, BigDecimal minSod, BigDecimal maxSod);
    //1
    public List<Product> findByPmSatuBetweenAndPmFibBetweenAndPmSodBetween
    (Integer minSatu, Integer maxSatu, BigDecimal minFib, BigDecimal maxFib, BigDecimal minSod, BigDecimal maxSod);






    // Double PM Ok
    //7 Dans Controller
    public List<Product> findByPmCaloBetweenAndPmCarbBetween
    (Integer minCalo, Integer maxCalo, Integer minCarb, Integer maxCarb);
    public List<Product> findByPmCaloBetweenAndPmSugBetween
    (Integer minCalo, Integer maxCalo, Integer minSug, Integer maxSug);
    public List<Product> findByPmCaloBetweenAndPmProtBetween
    (Integer minCalo, Integer maxCalo, Integer minProt, Integer maxProt);
    public List<Product> findByPmCaloBetweenAndPmFatBetween
    (Integer minCalo, Integer maxCalo, Integer minFat, Integer maxFat);
    public List<Product> findByPmCaloBetweenAndPmSatuBetween
    (Integer minCalo, Integer maxCalo, Integer minSatu, Integer maxSatu);
    public List<Product> findByPmCaloBetweenAndPmFibBetween
    (Integer minCalo, Integer maxCalo, BigDecimal minFib, BigDecimal maxFib);
    public List<Product> findByPmCaloBetweenAndPmSodBetween
    (Integer minCalo, Integer maxCalo, BigDecimal minSod, BigDecimal maxSod);

    //6
    public List<Product> findByPmCarbBetweenAndPmSugBetween
    (Integer minCarb, Integer maxCarb, Integer minSug, Integer maxSug);
    public List<Product> findByPmCarbBetweenAndPmProtBetween
    (Integer minCarb, Integer maxCarb, Integer minProt, Integer maxProt);
    public List<Product> findByPmCarbBetweenAndPmFatBetween
    (Integer minCarb, Integer maxCarb, Integer minFat, Integer maxFat);
    public List<Product> findByPmCarbBetweenAndPmSatuBetween
    (Integer minCarb, Integer maxCarb, Integer minSatu, Integer maxSatu);
    public List<Product> findByPmCarbBetweenAndPmFibBetween
    (Integer minCarb, Integer maxCarb, BigDecimal minFib, BigDecimal maxFib);
    public List<Product> findByPmCarbBetweenAndPmSodBetween
    (Integer minCarb, Integer maxCarb, BigDecimal minSod, BigDecimal maxSod);

    //5
    public List<Product> findByPmSugBetweenAndPmProtBetween
    (Integer minSug, Integer maxSug, Integer minProt, Integer maxProt);
    public List<Product> findByPmSugBetweenAndPmFatBetween
    (Integer minSug, Integer maxSug, Integer minFat, Integer maxFat);
    public List<Product> findByPmSugBetweenAndPmSatuBetween
    (Integer minSug, Integer maxSug, Integer minSatu, Integer maxSatu);
    public List<Product> findByPmSugBetweenAndPmFibBetween
    (Integer minSug, Integer maxSug, BigDecimal minFib, BigDecimal maxFib);
    public List<Product> findByPmSugBetweenAndPmSodBetween
    (Integer minSug, Integer maxSug, BigDecimal minSod, BigDecimal maxSod);

    //4
    public List<Product> findByPmProtBetweenAndPmFatBetween
    (Integer minProt, Integer maxProt, Integer minFat, Integer maxFat);
    public List<Product> findByPmProtBetweenAndPmSatuBetween
    (Integer minProt, Integer maxProt, Integer minSatu, Integer maxSatu);
    public List<Product> findByPmProtBetweenAndPmFibBetween
    (Integer minProt, Integer maxProt, BigDecimal minFib, BigDecimal maxFib);
    public List<Product> findByPmProtBetweenAndPmSodBetween
    (Integer minProt, Integer maxProt, BigDecimal minSod, BigDecimal maxSod);

    //3
    public List<Product> findByPmFatBetweenAndPmSatuBetween
    (Integer minFat, Integer maxFat, Integer minSatu, Integer maxSatu);
    public List<Product> findByPmFatBetweenAndPmFibBetween
    (Integer minFat, Integer maxFat, BigDecimal minFib, BigDecimal maxFib);
    public List<Product> findByPmFatBetweenAndPmSodBetween
    (Integer minFat, Integer maxFat, BigDecimal minSod, BigDecimal maxSod);

    //2
    public List<Product> findByPmSatuBetweenAndPmFibBetween
    (Integer minSatu, Integer maxSatu, BigDecimal minFib, BigDecimal maxFib);
    public List<Product> findByPmSatuBetweenAndPmSodBetween
    (Integer minSatu, Integer maxSatu, BigDecimal minSod, BigDecimal maxSod);

    //1
    public List<Product> findByPmFibBetweenAndPmSodBetween
    (Integer minFib, Integer maxFib, BigDecimal minSod, BigDecimal maxSod);





}
