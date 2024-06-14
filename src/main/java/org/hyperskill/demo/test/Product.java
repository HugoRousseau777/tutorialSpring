package org.hyperskill.demo.test;


import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private int price;
    @JsonManagedReference
    @OneToOne(mappedBy = "product", cascade = CascadeType.ALL)
   @PrimaryKeyJoinColumn
    private ProductMacro productMacro;

    public Product(){}

    public Product(Long id, String name, int price, ProductMacro productMacro) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.productMacro = productMacro;
    }

    public Long getId(){
        return this.id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getPrice(){
        return this.price;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public ProductMacro getProductMacro(){
        return this.productMacro;
    }

    public void setProductMacro(ProductMacro productMacro){
        this.productMacro = productMacro;
    }

}


