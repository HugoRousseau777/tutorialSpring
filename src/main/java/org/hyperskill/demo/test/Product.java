package org.hyperskill.demo.test;

import com.fasterxml.jackson.annotation.JsonManagedReference;

public class Product {
    private int id;
    private String name;
    private int price;
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


