import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Product } from "../product";
import { ProductService } from '../product.service';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrl: './product-list.component.css'
})
export class ProductListComponent implements OnInit {
  products!: Product[];

  constructor(private productService: ProductService,
    private router: Router
  ) {  }

  ngOnInit(): void {
    this.getProducts();
  }
  getProducts(){
    this.productService.getProductsList().subscribe(data => {
      this.products = data;
      console.log(data);
    })
  }
  details(id: number){
    this.router.navigate(['', id]);
  }
}
