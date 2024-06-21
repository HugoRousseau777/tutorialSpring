package org.hyperskill.demo.test.labels;

import org.hyperskill.demo.test.Product;

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
@Table(name="labels")
public class Labels {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="animal_respect")
    private Boolean animal_respect;

    @Column(name="national")
    private Boolean national;

    @Column(name="sport_good")
    private Boolean sport_good;

    @Column(name="useless_sugar")
    private Boolean useless_sugar;

    @Column(name="useless_fat")
    private Boolean useless_fat;

    @Column(name="bio")
    private Boolean bio;

    @OneToOne(mappedBy = "labels", cascade = CascadeType.ALL) 
    @JoinColumn(name = "productId", referencedColumnName = "id")
    private Product product;

    public Labels (Long id, Boolean animal_respect, Boolean national, Boolean sport_good,
                   Boolean useless_sugar, Boolean useless_fat, Boolean bio, Product product) {
        this.id = id;
        this.animal_respect = animal_respect;
        this.national = national;
        this.sport_good = sport_good;
        this.useless_sugar = useless_sugar;
        this.useless_fat = useless_fat;
        this.bio = bio;
        this.product = product;
    }

    public Labels (Boolean animal_respect, Boolean national, Boolean sport_good,
                   Boolean useless_sugar, Boolean useless_fat, Boolean bio, Product product) {
        this.animal_respect = animal_respect;
        this.national = national;
        this.sport_good = sport_good;
        this.useless_sugar = useless_sugar;
        this.useless_fat = useless_fat;
        this.product = product;
        this.bio = bio;
    }

    public Labels () {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getNational() {
        return national;
    }

    public void setNational(Boolean national) {
        this.national = national;
    }

    public Boolean getAnimal_respect() {
        return animal_respect;
    }

    public void setAnimal_respect(Boolean animal_respect) {
        this.animal_respect = animal_respect;
    }

    public Boolean getSport_good() {
        return sport_good;
    }

    public void setSport_good(Boolean sport_good) {
        this.sport_good = sport_good;
    }

    public Boolean getUseless_fat() {
        return useless_fat;
    }

    public void setUseless_fat(Boolean useless_fat) {
        this.useless_fat = useless_fat;
    }

    public Boolean getUseless_sugar() {
        return useless_sugar;
    }

    public void setUseless_sugar(Boolean useless_sugar) {
        this.useless_sugar = useless_sugar;
    }
    public Boolean getBio() {
        return bio;
    }

    public void setBio(Boolean bio) {
        this.bio = bio;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}