import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Pm } from '../pm';
import { Product } from "../product";
import { ProductService } from '../product.service';
import { Pv } from '../pv';


@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrl: './product-list.component.css'
})
export class ProductListComponent implements OnInit {
  products!: Product[];

  pm: Pm = new Pm;
  pv: Pv = new Pv;


  junkClicked: Boolean = false;
  entreeClicked: Boolean = false;
  legumeClicked: Boolean = false;
  platClicked: Boolean = false;
  laitageClicked: Boolean = false;
  fruitClicked: Boolean = false;
  dessertClicked: Boolean = false;

  minCalo: number;
  maxCalo: number;
  minCarb: number;
  maxCarb: number;
  minProt: number;
  maxProt: number;
  minFib: number;
  maxFib: number;

  maximalCalo!: number;

  constructor(private productService: ProductService,
    private router: Router
  ) {  }

  ngOnInit(): void {
    this.getProducts("");
    this.getMaxCalo("plat");
  }


 getMaxCalo(params: string){
  this.productService.getProductsList(params).subscribe(data => {
    let maxValue = 0;
    for (let i=0; i<data.length; i++){
      if(data[i].pm.calo > maxValue) {
        maxValue = data[i].pm.calo
      }
    }
    this.maximalCalo = maxValue;
  })
 }
  

  getProducts(params: string){
    this.productService.getProductsList(params).subscribe(data => {
      this.products = data;
      console.log(data);
    })
  }
    details(id: number){
    this.router.navigate(['', id]);
  }

  getProductsListPM(catPlat: string, minCalo: number, maxCalo: number, minCarb: number, maxCarb: number, minProt: number, maxProt: number, minFib: number, maxFib: number){
    this.productService.getProductsListPM(catPlat, this.minCalo, this.maxCalo, this.minCarb, this.maxCarb, this.minProt, this.maxProt, this.minFib, this.maxFib).subscribe(data => {
      this.products = data;
    })
  }

  getProductsSugar(catPlat: string){
    this.productService.getProductsSugar(catPlat).subscribe(data => {
      this.products = data;
    })
  }

  getProductsFat(catPlat: string){
    this.productService.getProductsFat(catPlat).subscribe(data => {
      this.products = data;
    })
  }

  getProductsSatu(catPlat: string){
    this.productService.getProductsSatu(catPlat).subscribe(data => {
      this.products = data;
    })
  }

  getProductsSodium(catPlat: string){
    this.productService.getProductsSodium(catPlat).subscribe(data => {
      this.products = data;
    })
  }

changeButtons(){
  this.entreeClicked = false;
  this.legumeClicked = false;
  this.platClicked = false;
  this.laitageClicked = false;
  this.fruitClicked = false;
  this.dessertClicked = false;
  this.junkClicked = false;
}

changeButtonEntree(){
  this.entreeClicked = !this.entreeClicked;
  this.legumeClicked = false;
  this.platClicked = false;
  this.laitageClicked = false;
  this.fruitClicked = false;
  this.dessertClicked = false;
  this.junkClicked = false;
}

changeButtonLegume(){
  this.legumeClicked = !this.legumeClicked;
  this.entreeClicked = false;
  this.platClicked = false;
  this.laitageClicked = false;
  this.fruitClicked = false;
  this.dessertClicked = false;
  this.junkClicked = false;
}

changeButtonPlat(){
  this.platClicked = !this.platClicked;
  this.legumeClicked = false;
  this.entreeClicked = false;
  this.laitageClicked = false;
  this.fruitClicked = false;
  this.dessertClicked = false;
  this.junkClicked = false;
}

changeButtonLaitage(){
  this.laitageClicked = !this.laitageClicked;
  this.legumeClicked = false;
  this.platClicked = false;
  this.entreeClicked = false;
  this.fruitClicked = false;
  this.dessertClicked = false;
  this.junkClicked = false;
}

changeButtonFruit(){
  this.fruitClicked = !this.fruitClicked;
  this.legumeClicked = false;
  this.platClicked = false;
  this.laitageClicked = false;
  this.entreeClicked = false;
  this.dessertClicked = false;
  this.junkClicked = false;
}

changeButtonDessert(){
  this.dessertClicked = !this.dessertClicked;
  this.legumeClicked = false;
  this.platClicked = false;
  this.laitageClicked = false;
  this.fruitClicked = false;
  this.entreeClicked = false;
  this.junkClicked = false;
}

changeButtonJunk(){
  this.junkClicked = !this.junkClicked;
  this.legumeClicked = false;
  this.platClicked = false;
  this.laitageClicked = false;
  this.fruitClicked = false;
  this.entreeClicked = false;
  this.dessertClicked = false;
}
}
