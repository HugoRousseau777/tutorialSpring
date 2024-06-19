package org.hyperskill.demo.test;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@JsonIdentityInfo(generator= ObjectIdGenerators.IntSequenceGenerator.class, property="@id")
@Table(name="pm")
public class PM {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(mappedBy = "pm", cascade = CascadeType.ALL) 
    @JoinColumn(name = "productId", referencedColumnName = "id")
    private Product product;

    @Column(name="mass")
    private int mass;

    @Column(name = "calories")
    private int calo;

    @Column(name="Carb")
    private int carb;

    @Column(name="sugars")
    private int sug;

    @Column(name = "proteins")
    private int prot;

    @Column(name="Fat")
    private int fat;

    @Column(name="satu")
    private int satu;

    @Column(name="dietaryFibre", precision = 4, scale = 1)
    private BigDecimal fib;

    @Column(name="sodium", precision = 4, scale = 1)
    private BigDecimal sod;

    public PM(){}

    public PM(Long id, int mass, int calo, int carb, int sug, int prot, int fat, int satu, BigDecimal fib, BigDecimal sod, Product product) {
        this.mass = mass;
        this.id = id;
        this.calo = calo;
        this.carb = carb;
        this.sug = sug;
        this.prot = prot;
        this.fat = fat;
        this.satu = satu;
        this.fib = fib;
        this.sod = sod;
        this.product = product;
    }

    public PM(int mass, int calo, int carb, int sug, int prot, int fat, int satu, BigDecimal fib, BigDecimal sod, Product product) {
        this.mass = mass;
        this.calo = calo;
        this.carb = carb;
        this.sug = sug;
        this.prot = prot;
        this.fat = fat;
        this.satu = satu;
        this.fib = fib;
        this.sod = sod;
        this.product = product;
    }

    public Long getId(){
        return this.id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public Integer getMass(){
        return this.mass;
    }
    public void setMass(int mass){
        this.mass = mass;
    }

    public Integer getCalo(){
        return this.calo;
    }
    public void setCalo(int calo){
        this.calo = calo;
    }

    public Integer getCarb(){
        return this.carb;
    }
    public void setCarb(int carb){
        this.carb = carb;
    }

    public Integer getSug(){
        return this.sug;
    }
    public void setSug(int sug){
        this.sug = sug;
    }

    public Integer getProt(){
        return this.prot;
    }
    public void setProt(int prot){
        this.prot = prot;
    }

    public Integer getFat(){
        return this.fat;
    }
    public void setFat(int fat){
        this.fat = fat;
    }

    public Integer getSatu(){
        return this.satu;
    }
    public void setSatu(int satu){
        this.satu = satu;
    }

    public BigDecimal getFib(){
        return this.fib;
    }
    public void setFib(BigDecimal fib){
        this.fib = fib;
    }

    public BigDecimal getSod(){
        return this.sod;
    }
    public void setSod(BigDecimal sod){
        this.sod = sod;
    }

    public Product getProduct(){
        return this.product;
    }
    public void setProduct(Product product){
        this.product = product;
    }  

}
