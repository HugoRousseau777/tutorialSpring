import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Product } from './product';


@Injectable({
  providedIn: 'root'
})
export class ProductService {

  private baseURL = "http://localhost:8080/";

  constructor(private httpClient: HttpClient) {}

    getProductsList(): Observable<Product[]>{
      return this.httpClient.get<Product[]>(`${this.baseURL}product`);
      }

      getProduct(id: Number): Observable<Product>{
        return this.httpClient.get<Product>(`${this.baseURL}product/${id}`);
      }
   }

