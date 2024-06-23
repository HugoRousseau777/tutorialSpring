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

  constructor(private productService: ProductService,
    private router: Router
  ) {  }

  ngOnInit(): void {
    this.getProducts("");
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
