package org.hyperskill.demo.test;

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
@Table(name="pmin")
public class PMin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(mappedBy = "pmin", cascade = CascadeType.ALL) 
    @JoinColumn(name = "prod_id", referencedColumnName = "id")
    private Product product;

    @Column(name= "calcium")
    private Float cal;

    @Column(name= "cuivre")
    private Float cui;

    @Column(name= "fer")
    private Float fer;

    @Column(name= "mag")
    private Float mag;
    
    @Column(name= "phos")
    private Float pho;

    @Column(name= "pot")
    private Float pot;
    
    @Column(name= "zinc")
    private Float zin;
    
    public PMin(Long id, Float cal, Float cui,
    Float fer, Float mag, Float pho, Float pot, Float zin, Product product) {
        this.id = id;
        this.cal = cal;
        this.cui = cui;
        this.fer = fer;
        this.mag = mag;
        this.pho = pho;
        this.pot = pot;
        this.zin = zin;
        this.product = product;
    }

    public PMin(Float cal, Float cui,
    Float fer, Float mag, Float pho, Float pot, Float zin, Product product) {
        this.cal = cal;
        this.cui = cui;
        this.fer = fer;
        this.mag = mag;
        this.pho = pho;
        this.pot = pot;
        this.zin = zin;
        this.product = product;
    }

    public PMin(){ // Pour éviter une erreur

    }

    public Float getCal() {
        return this.cal;
    }
    public void setCal(Float cal) {
        this.cal = cal;
    }
    public Float getCui() {
        return this.cui;
    }
    public void setCui(Float cui) {
        this.cui = cui;
    }
    public Float getFer() {
        return this.fer;
    }
    public void setFer(Float fer) {
        this.fer = fer;
    }
    public Float getMag() {
        return this.mag;
    }
    public void setMag(Float mag) {
        this.mag = mag;
    }

    public Float getPho() {
        return this.pho;
    }
    public void setPho(Float pho) {
        this.pho = pho;
    }

    public Float getPot() {
        return this.pot;
    }
    public void setPot(Float pot) {
        this.pot = pot;
    }

    public Float getZin() {
        return this.zin;
    }
    public void setZinc(Float zin) {
        this.zin = zin;
    }
    public Product getProduct() {
        return this.product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
}
