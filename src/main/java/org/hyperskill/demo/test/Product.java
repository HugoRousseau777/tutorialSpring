package org.hyperskill.demo.test;


import org.hyperskill.demo.test.domain.CategoriePlat;
import org.hyperskill.demo.test.labels.Labels;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
    private Float price;
    @Column(name = "img")
    private String img;

    @Enumerated(EnumType.STRING)
    private CategoriePlat categoriePlat;

    public CategoriePlat getCategoriePlat() {
        return categoriePlat;
    }
    public void setCategoriePlat(CategoriePlat categoriePlat) {
        this.categoriePlat = categoriePlat;
    }
    

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name= "pm_id", referencedColumnName = "id", nullable=true)
    private PM pm;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name= "pv_id", referencedColumnName = "id", nullable=true)
    private PV pv;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name= "pmin_id", referencedColumnName = "id", nullable=true)
    private PMin pmin;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name= "label_id", referencedColumnName = "id", nullable=true)
    private Labels labels;

    public Product(){}

    public Product(Long id, String name, Float price, PM pm,
    PV pv, PMin pmin, String img, Labels labels, CategoriePlat categoriePlat) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.pm = pm;
        this.pv = pv;
        this.pmin = pmin;
        this.img = img;
        this.labels = labels;
        this.categoriePlat = categoriePlat;
    }

    public Product(String name, Float price, PM pm, PV pv, PMin pmin, String img, Labels labels) {
        this.name = name;
        this.price = price;
        this.pm = pm;
        this.pv = pv;
        this.pmin = pmin;
        this.img = img;
        this.labels = labels;
        this.categoriePlat = categoriePlat;
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

    public Float getPrice(){
        return this.price;
    }

    public void setPrice(Float price){
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
    public Labels getLabels(){
        return this.labels;
    }
    public void setLabels(Labels labels){
        this.labels = labels;
    }

}


