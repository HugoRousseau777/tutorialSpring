import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, map } from 'rxjs';
import { Product } from './product';


@Injectable({
  providedIn: 'root'
})
export class ProductService {

  private baseURL = "http://localhost:8080/";

  constructor(private httpClient: HttpClient) {}



      getProductsList(params: string): Observable<Product[]>{
        if(params.length>2){
          return this.httpClient.get<Product[]>(`${this.baseURL}productCat`, {
            params: {
              categoriePlat: params
            }
          }).pipe(
          map((product : any)=> product));
        } else {
          return this.httpClient.get<Product[]>(`${this.baseURL}product`);
        }
      }

      getProduct(id: Number): Observable<Product>{
        return this.httpClient.get<Product>(`${this.baseURL}product/${id}`);
      }
   }

