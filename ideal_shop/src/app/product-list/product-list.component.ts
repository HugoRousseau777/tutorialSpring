import { AfterViewInit, Component, OnInit, Renderer2, ViewChild } from '@angular/core';
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
export class ProductListComponent implements OnInit, AfterViewInit {

  @ViewChild('trial') trial: any;
  constructor(private productService: ProductService,
    private router: Router,
    private renderer: Renderer2
  ) {  }

  ngOnInit(): void {
    this.getProducts("");
    
  }

  ngAfterViewInit(): void {
      this.trial.nativeElement.style.color = "green";
  }


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
  minimalCalo!: number;
  maximalProt!: number;
  minimalProt!: number;
  maximalCarb!: number;
  minimalCarb!: number;
  maximalFib!: number;
  minimalFib!: number;

  getProductsList(params: string){
    return this.productService.getProductsList(params);
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

  getProductsPm(catPlat: string){
    this.getProductsListPM(catPlat, this.minCalo, this.maxCalo, this.minCarb, this.maxCarb, this.minProt, this.maxProt, this.minFib, this.maxFib).subscribe(data => {
      this.products = data;
      console.log(data);
      this.getMinMax("plat");
    })
  }

  getProductsListPM(catPlat: string, minCalo: number, maxCalo: number,
    minCarb: number, maxCarb: number, minProt: number, maxProt: number,
    minFib: number, maxFib: number
  ){
    return this.productService.getProductsListPM(catPlat, minCalo, maxCalo,
      minCarb, maxCarb, minProt, maxProt,
      minFib, maxFib);
  }

 getMinMax(catPlat: string){
  this.getProductsListPM(catPlat, this.minCalo, this.maxCalo, this.minCarb, this.maxCarb, this.minProt, this.maxProt, this.minFib, this.maxFib).subscribe(data => {
    let maxCalo = 0;
    let minCalo = 10000;
    let maxCarb = 0;
    let minCarb = 10000; 
    let maxProt = 0;
    let minProt = 10000; 
    let maxFib = 0;
    let minFib = 10000; 
    
    for (let i=0; i<data.length; i++){
      if(data[i].pm.calo > maxCalo) {
        maxCalo = data[i].pm.calo
      }
      if(data[i].pm.calo < minCalo) {
        minCalo = data[i].pm.calo
      }
      if(data[i].pm.carb > maxCarb) {
        maxCarb = data[i].pm.carb
      }
      if(data[i].pm.carb < minCarb) {
        minCarb = data[i].pm.carb
      }
      if(data[i].pm.prot > maxProt) {
        maxProt = data[i].pm.prot
      }
      if(data[i].pm.prot < minProt) {
        minProt = data[i].pm.prot
      }
      if(data[i].pm.fib > maxFib) {
        maxFib = data[i].pm.fib
      }
      if(data[i].pm.fib < minFib) {
        minFib = data[i].pm.fib
      }

    }
    this.maximalCalo = maxCalo;
    this.minimalCalo = minCalo;
    this.maximalCarb = maxCarb;
    this.minimalCarb = minCarb;
    this.maximalProt = maxProt;
    this.minimalProt = minProt;
    this.maximalFib = maxFib;
    this.minimalFib = minFib;
  })
 }
  
  getProductsSugar(catPlat: string){
    this.productService.getProductsSugar(catPlat).subscribe(data => {
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
