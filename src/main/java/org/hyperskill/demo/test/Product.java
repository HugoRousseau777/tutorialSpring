package org.hyperskill.demo.test;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@JsonIdentityInfo(generator= ObjectIdGenerators.IntSequenceGenerator.class, property="@id")
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private int price;
    @Column(name = "img")
    private String img;
    

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name= "pm_id", referencedColumnName = "id", nullable=true)
    private PM pm;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name= "pv_id", referencedColumnName = "id", nullable=true)
    private PV pv;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name= "pmin_id", referencedColumnName = "id", nullable=true)
    private PMin pmin;

    public Product(){}

    public Product(Long id, String name, int price, PM pm, PV pv, PMin pmin, String img) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.pm = pm;
        this.pv = pv;
        this.pmin = pmin;
        this.img = img;
    }

    public Product(String name, int price, PM pm, PV pv, PMin pmin, String img) {
        this.name = name;
        this.price = price;
        this.pm = pm;
        this.pv = pv;
        this.pmin = pmin;
        this.img = img;
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
        return this.pm;
    }
    public void setPM(PM pm){
        this.pm = pm;
    }

    public PV getPV(){
        return this.pv;
    }
    public void setPV(PV pv){
        this.pv = pv;
    }

    public PMin getPMin(){
        return this.pmin;
    }
    public void setPMin(PMin pmin){
        this.pmin = pmin;
    }

    public String getImg(){
        return this.img;
    }
    public void setImg(String img){
        this.img = img;
    }

}


