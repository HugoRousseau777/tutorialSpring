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

  recMinCalo: number = 1000;
  recMaxCalo: number = 0;
  recMinCarb: number = 1000;
  recMaxCarb: number = 0;
  recMinProt: number = 1000;
  recMaxProt: number = 0;
  recMinFib: number = 1000;
  recMaxFib: number = 0;

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

  onChangeminCal(value: any) { 
    this.recMinCalo = value.target.value;
    if (this.minCalo >= 0 && this.maxCalo > 0){
      console.log("coucou");
      console.log(this.minCalo);
      console.log(this.maxCalo);
      this.getProductsPm("plat");
    } 
} 

  onChangemaxCal(value: any) { 
  this.recMaxCalo = value.target.value;
  if (this.minCalo >= 0 && this.maxCalo > 0){
    this.getProductsPm("plat");
  }  
} 

onChangeminCarb(value: any) { 
  this.recMinCarb = value.target.value;
  if (this.recMinCarb >= 0 && this.recMaxCarb > 0){
    this.getProductsPm("plat");
  } 
} 

onChangemaxCarb(value: any) { 
this.recMaxCarb = value.target.value;
if (this.recMinCarb >= 0 && this.recMaxCarb > 0){
  this.getProductsPm("plat");
}  
} 

onChangeminProt(value: any) { 
  this.recMinProt = value.target.value;
  if (this.recMinProt >= 0 && this.recMaxProt > 0){
    this.getProductsPm("plat");
  } 
} 

onChangemaxProt(value: any) { 
this.recMaxProt = value.target.value;
if (this.recMinProt >= 0 && this.recMaxProt > 0){
  this.getProductsPm("plat");
}  
} 

onChangeminFib(value: any) { 
  this.recMinFib = value.target.value;
  if (this.recMinFib >= 0 && this.recMaxFib > 0){
    this.getProductsPm("plat");
  } 
} 

onChangemaxFib(value: any) { 
this.recMaxFib = value.target.value;
if (this.recMinFib >= 0 && this.recMaxFib > 0){
  this.getProductsPm("plat");
}  
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
    
    for (let i=0; i<data.length; i++){
      if(data[i].pm.calo > this.recMaxCalo) {
        this.recMaxCalo = data[i].pm.calo
      }
      if(data[i].pm.calo < this.recMinCalo) {
        this.recMinCalo = data[i].pm.calo
      }
      if(data[i].pm.carb > this.recMaxCarb) {
        this.recMaxCarb = data[i].pm.carb
      }
      if(data[i].pm.carb < this.recMinCarb) {
        this.recMinCarb = data[i].pm.carb
      }
      if(data[i].pm.prot > this.recMaxProt) {
        this.recMaxProt = data[i].pm.prot
      }
      if(data[i].pm.prot < this.recMinProt) {
        this.recMinProt = data[i].pm.prot
      }
      if(data[i].pm.fib > this.recMaxFib) {
        this.recMaxFib = data[i].pm.fib
      }
      if(data[i].pm.fib < this.recMinFib) {
        this.recMinFib = data[i].pm.fib
      }
    }

    this.minimalCalo = this.recMinCalo;
    this.maximalCalo = this.recMaxCalo;
    this.minimalCarb = this.recMinCarb;
    this.maximalCarb = this.recMaxCarb;
    this.minimalProt = this.recMinProt;
    this.maximalProt = this.recMaxProt;
    this.minimalFib = this.recMinFib;
    this.maximalFib = this.recMaxFib;

  this.recMinCalo = 1000;
this.recMaxCalo = 0;
  this.recMinCarb = 1000;
   this.recMaxCarb = 0;
   this.recMinProt = 1000;
    this.recMaxProt = 0;
    this.recMinFib = 1000;
     this.recMaxFib = 0; 



    
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


}
