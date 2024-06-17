package org.hyperskill.demo.test;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{


    public List<Product> findByPmCaloBetween
    (Integer minCalo, Integer maxCalo);

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
