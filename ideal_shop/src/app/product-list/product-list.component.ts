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
  @ViewChild('prod') prod: any;
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



  SatuClicked: Boolean = false;
  FatClicked: Boolean = false;
  SugarClicked: Boolean = false;
  SodiumClicked: Boolean = false;

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
    this.productService.getProductsList(params).subscribe((data : Product[])=> {
      this.products = data;
    })
    this.getMinMax("plat");
  }

  details(id: number){
    this.router.navigate(['', id]);
  }

  getProductsPm(catPlat: string){
      this.getProductsListPM(catPlat, this.minCalo, this.maxCalo, this.minCarb, this.maxCarb, this.minProt, this.maxProt, this.minFib, this.maxFib).subscribe(data => {
        if(this.SugarClicked == true) {
          this.products = data.sort(this.compareSugar);
        } else if(this.FatClicked == true) {
          this.products = data.sort(this.compareFat);
        } else if(this.SatuClicked == true) {
          this.products = data.sort(this.compareSatu);
        } else if(this.SodiumClicked == true) {
          this.products = data.sort(this.compareFat);
        } else {
        this.products = data;
      }
      this.getMinMax("plat");
    })
  }

  buttonSug(){
    this.SugarClicked = !this.SugarClicked;
  }
  buttonFat(){
    this.FatClicked = !this.FatClicked;
  }
  buttonSatu(){
    this.SatuClicked = !this.SatuClicked;
  }
  buttonSod(){
    this.SodiumClicked = !this.SodiumClicked;
  }


  compareSugar( a:Product, b:Product ) {
    if ( a.pm.sug < b.pm.sug ){
      return -1;
    }
    if ( a.pm.sug > b.pm.sug ){
      return 1;
    }
    return 0;
  }


  compareFat( a:Product, b:Product ) {
    if ( a.pm.fat < b.pm.fat ){
      return -1;
    }
    if ( a.pm.fat > b.pm.fat ){
      return 1;
    }
    return 0;
  }

  compareSatu( a:Product, b:Product ) {
    if ( a.pm.satu < b.pm.satu ){
      return -1;
    }
    if ( a.pm.satu > b.pm.satu ){
      return 1;
    }
    return 0;
  }

  compareSod( a:Product, b:Product ) {
    if ( a.pm.sod < b.pm.sod ){
      return -1;
    }
    if ( a.pm.sod > b.pm.sod ){
      return 1;
    }
    return 0;
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

  changeButtonsCat(x: number){
      let array = Array.from(document.getElementsByClassName("cat"));

      if (array[x].className == "cat btn-default") {
          this.getProducts(array[x].id);
          
          array[x].className = "cat btn-change";
      } else {
          array[x].className = "cat btn-default";
          this.getProducts("");
      }

      array.splice(x, 1);
      array.forEach(element => {
          element.className = "cat btn-default";
      })
      
 }
   

}
