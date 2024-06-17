package org.hyperskill.demo.test;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{


    public List<Product> findByPMCaloBetween
    (Integer minCalo, Integer maxCalo);

    // Double PM Ok
    //7
    public List<Product> findByPMCaloBetweenAndPMCarbBetween
    (Integer minCalo, Integer maxCalo, Integer minCarb, Integer maxCarb);
    public List<Product> findByPMCaloBetweenAndPMSugBetween
    (Integer minCalo, Integer maxCalo, Integer minSug, Integer maxSug);
    public List<Product> findByPMCaloBetweenAndPMProtBetween
    (Integer minCalo, Integer maxCalo, Integer minProt, Integer maxProt);
    public List<Product> findByPMCaloBetweenAndPMFatBetween
    (Integer minCalo, Integer maxCalo, Integer minFat, Integer maxFat);
    public List<Product> findByPMCaloBetweenAndPMSatuBetween
    (Integer minCalo, Integer maxCalo, Integer minSatu, Integer maxSatu);
    public List<Product> findByPMCaloBetweenAndPMFibBetween
    (Integer minCalo, Integer maxCalo, BigDecimal minFib, BigDecimal maxFib);
    public List<Product> findByPMCaloBetweenAndPMSodBetween
    (Integer minCalo, Integer maxCalo, BigDecimal minSod, BigDecimal maxSod);

    //6
    public List<Product> findByPMCarbBetweenAndPMSugBetween
    (Integer minCarb, Integer maxCarb, Integer minSug, Integer maxSug);
    public List<Product> findByPMCarbBetweenAndPMProtBetween
    (Integer minCarb, Integer maxCarb, Integer minProt, Integer maxProt);
    public List<Product> findByPMCarbBetweenAndPMFatBetween
    (Integer minCarb, Integer maxCarb, Integer minFat, Integer maxFat);
    public List<Product> findByPMCarbBetweenAndPMSatuBetween
    (Integer minCarb, Integer maxCarb, Integer minSatu, Integer maxSatu);
    public List<Product> findByPMCarbBetweenAndPMFibBetween
    (Integer minCarb, Integer maxCarb, BigDecimal minFib, BigDecimal maxFib);
    public List<Product> findByPMCarbBetweenAndPMSodBetween
    (Integer minCarb, Integer maxCarb, BigDecimal minSod, BigDecimal maxSod);

    //5
    public List<Product> findByPMSugBetweenAndPMProtBetween
    (Integer minSug, Integer maxSug, Integer minProt, Integer maxProt);
    public List<Product> findByPMSugBetweenAndPMFatBetween
    (Integer minSug, Integer maxSug, Integer minFat, Integer maxFat);
    public List<Product> findByPMSugBetweenAndPMSatuBetween
    (Integer minSug, Integer maxSug, Integer minSatu, Integer maxSatu);
    public List<Product> findByPMSugBetweenAndPMFibBetween
    (Integer minSug, Integer maxSug, BigDecimal minFib, BigDecimal maxFib);
    public List<Product> findByPMSugBetweenAndPMSodBetween
    (Integer minSug, Integer maxSug, BigDecimal minSod, BigDecimal maxSod);

    //4
    public List<Product> findByPMProtBetweenAndPMFatBetween
    (Integer minProt, Integer maxProt, Integer minFat, Integer maxFat);
    public List<Product> findByPMProtBetweenAndPMSatuBetween
    (Integer minProt, Integer maxProt, Integer minSatu, Integer maxSatu);
    public List<Product> findByPMProtBetweenAndPMFibBetween
    (Integer minProt, Integer maxProt, BigDecimal minFib, BigDecimal maxFib);
    public List<Product> findByPMProtBetweenAndPMSodBetween
    (Integer minProt, Integer maxProt, BigDecimal minSod, BigDecimal maxSod);

    //3
    public List<Product> findByPMFatBetweenAndPMSatuBetween
    (Integer minFat, Integer maxFat, Integer minSatu, Integer maxSatu);
    public List<Product> findByPMFatBetweenAndPMFibBetween
    (Integer minFat, Integer maxFat, BigDecimal minFib, BigDecimal maxFib);
    public List<Product> findByPMFatBetweenAndPMSodBetween
    (Integer minFat, Integer maxFat, BigDecimal minSod, BigDecimal maxSod);

    //2
    public List<Product> findByPMSatuBetweenAndPMFibBetween
    (Integer minSatu, Integer maxSatu, BigDecimal minFib, BigDecimal maxFib);
    public List<Product> findByPMSatuBetweenAndPMSodBetween
    (Integer minSatu, Integer maxSatu, BigDecimal minSod, BigDecimal maxSod);

    //1
    public List<Product> findByPMFibBetweenAndPMSodBetween
    (Integer minFib, Integer maxFib, BigDecimal minSod, BigDecimal maxSod);

}
