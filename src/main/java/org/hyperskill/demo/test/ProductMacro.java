package org.hyperskill.demo.test;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="macros")
public class ProductMacro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @OneToOne
    @MapsId
    @JsonBackReference
    @JoinColumn(name ="prod_id")
    private Product product;

    @Column(name = "calories")
    private int calories;
    @Column(name = "proteins")
    private int proteins;

    public ProductMacro(){}

    public ProductMacro(Long id, int calories, int proteins, Product product) {
        this.id = id;
        this.calories = calories;
        this.proteins = proteins;
        this.product = product;
    }

    public Long getId(){
        return this.id;
    }

    public void setId(Long id){
        this.id = id;
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
