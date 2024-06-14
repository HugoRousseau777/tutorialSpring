package org.hyperskill.demo.test;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="macros")
public class ProductMacro {

    @Id
    @Column(name = "macro_id", unique = true)
    private Long id;



    @JsonBackReference
    @OneToOne(mappedBy = "productMacro")
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
