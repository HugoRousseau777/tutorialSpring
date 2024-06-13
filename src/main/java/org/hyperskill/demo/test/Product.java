package org.hyperskill.demo.test;


import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @Column(name = "product_id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private int price;
    @Column(name = "productMacro")
    @JsonManagedReference
    private ProductMacro productMacro;

    public Product(){}

    public Product(int id, String name, int price, ProductMacro productMacro) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.productMacro = productMacro;
    }

    public int getId(){
        return this.id;
    }

    public void setId(int id){
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


