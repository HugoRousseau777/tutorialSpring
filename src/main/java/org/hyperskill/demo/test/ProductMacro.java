package org.hyperskill.demo.test;

import com.fasterxml.jackson.annotation.JsonBackReference;

public class ProductMacro {
    @JsonBackReference
    private Product product;

    private int calories;
    private int proteins;

    public ProductMacro(){}

    public ProductMacro(int calories, int proteins, Product product) {
        this.calories = calories;
        this.proteins = proteins;
        this.product = product;
    }

    public Integer getCalories(){
        return this.calories;
    }

    public void setCalories(int calories){
        this.calories = calories;
    }
    public Integer getProteins(){
        return this.proteins;
    }

    public void setProteins(int proteins){
        this.proteins = proteins;
    }   
    public Product getProduct(){
        return this.product;
    }

    public void setProduct(Product product){
        this.product = product;
    }    
}
