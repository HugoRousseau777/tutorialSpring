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
    private PM PM;

    @JsonManagedReference
    @OneToOne(mappedBy = "product", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private PV PV;

    @JsonManagedReference
    @OneToOne(mappedBy = "product", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private PMin PMin;

    public Product(){}

    public Product(Long id, String name, int price, PM PM, PV PV, PMin PMin) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.PM = PM;
        this.PV = PV;
        this.PMin = PMin;
    }

    public Product(String name, int price, PM PM, PV PV, PMin PMin) {
        this.name = name;
        this.price = price;
        this.PM = PM;
        this.PV = PV;
        this.PMin = PMin;
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

    public PM getPM(){
        return this.PM;
    }
    public void setPM(PM PM){
        this.PM = PM;
    }

    public PV getPV(){
        return this.PV;
    }
    public void setPV(PV PV){
        this.PV = PV;
    }

    public PMin getPMin(){
        return this.PMin;
    }
    public void setPMin(PMin PMin){
        this.PMin = PMin;
    }

}


