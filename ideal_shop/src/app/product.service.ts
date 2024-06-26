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

  getProductsSugar(catPlat: string): Observable<Product[]>{
    return this.httpClient.get<Product[]>(`${this.baseURL}sugar`, {
      params: {
        catPlat: catPlat,
      }
    }).pipe(
        map((product : any)=> product));
  }



  getProductsListPM(
      catPlat : string, 
      minCalo: number, maxCalo: number,
      minCarb: number, maxCarb: number,
      minProt: number, maxProt: number,
      minFib: number, maxFib: number): Observable<Product[]>{
        if(minCalo >= 0 && maxCalo > 0){
          if(minCarb >= 0 && maxCarb > 0) {
              if (minProt >= 0 && maxProt > 0) {
                  if (minFib >= 0 && maxFib > 0) {
                    return this.httpClient.get<Product[]>(`${this.baseURL}PM`, {
                      params: {
                        catPlat: catPlat,
                        minCalo: minCalo,
                        maxCalo: maxCalo,
                        minCarb: minCarb,
                        maxCarb: maxCarb,
                        minProt: minProt,
                        maxProt: maxProt,
                        minFib: minFib,
                        maxFib: maxFib
                      }
                    }).pipe(
                        map((product : any)=> product));
                  }
                  return this.httpClient.get<Product[]>(`${this.baseURL}PM`, {
                    params: {
                      catPlat: catPlat,
                      minCalo: minCalo,
                      maxCalo: maxCalo,
                      minCarb: minCarb,
                      maxCarb: maxCarb,
                      minProt: minProt,
                      maxProt: maxProt
                    }
                  }).pipe(
                      map((product : any)=> product));
              } else if (minFib >= 0 && maxFib > 0) {
                return this.httpClient.get<Product[]>(`${this.baseURL}PM`, {
                  params: {
                    catPlat: catPlat,
                    minCalo: minCalo,
                    maxCalo: maxCalo,
                    minCarb: minCarb,
                    maxCarb: maxCarb,
                    minFib: minFib,
                    maxFib: maxFib
                  }
                }).pipe(
                    map((product : any)=> product));
              }
              return this.httpClient.get<Product[]>(`${this.baseURL}PM`, {
                params: {
                  catPlat: catPlat,
                  minCalo: minCalo,
                  maxCalo: maxCalo,
                  minCarb: minCarb,
                  maxCarb: maxCarb
                }
              }).pipe(
                  map((product : any)=> product));
          } else if (minProt >= 0 && maxProt > 0) {
              if (minFib >= 0 && maxFib > 0) {
                return this.httpClient.get<Product[]>(`${this.baseURL}PM`, {
                  params: {
                    catPlat: catPlat,
                    minCalo: minCalo,
                    maxCalo: maxCalo,
                    minProt: minProt,
                    maxProt: maxProt,
                    minFib: minFib,
                    maxFib: maxFib
                  }
                }).pipe(
                    map((product : any)=> product));
              }
              return this.httpClient.get<Product[]>(`${this.baseURL}PM`, {
                params: {
                  catPlat: catPlat,
                  minCalo: minCalo,
                  maxCalo: maxCalo,
                  minProt: minProt,
                  maxProt: maxProt
                }
              }).pipe(
                  map((product : any)=> product));
          } else if (minFib >= 0 && maxFib > 0) {
            return this.httpClient.get<Product[]>(`${this.baseURL}PM`, {
              params: {
                catPlat: catPlat,
                minCalo: minCalo,
                maxCalo: maxCalo,
                minFib: minFib,
                maxFib: maxFib
              }
            }).pipe(
                map((product : any)=> product));
          }

          return this.httpClient.get<Product[]>(`${this.baseURL}PM`, {
            params: {
              catPlat: catPlat,
              minCalo: minCalo,
              maxCalo: maxCalo,
            }
          }).pipe(
              map((product : any)=> product));
      } else if (minCarb >=0 && maxCarb >0){
          if (minProt >=0 && maxProt >0) {
              if (minFib >=0 && maxFib >0) {
                return this.httpClient.get<Product[]>(`${this.baseURL}PM`, {
                  params: {
                    catPlat: catPlat,
                    minCarb: minCarb,
                    maxCarb: maxCarb,
                    minProt: minProt,
                    maxProt: maxProt,
                    minFib: minFib,
                    maxFib: maxFib
                  }
                }).pipe(
                    map((product : any)=> product));
              }
              return this.httpClient.get<Product[]>(`${this.baseURL}PM`, {
                params: {
                  catPlat: catPlat,
                  minCarb: minCarb,
                  maxCarb: maxCarb,
                  minProt: minProt,
                  maxProt: maxProt
                }
              }).pipe(
                  map((product : any)=> product));
          } else if (minFib >=0 && maxFib >0) {
            return this.httpClient.get<Product[]>(`${this.baseURL}PM`, {
              params: {
                catPlat: catPlat,
                minCarb: minCarb,
                maxCarb: maxCarb,
                minFib: minFib,
                maxFib: maxFib
              }
            }).pipe(
                map((product : any)=> product));
          }

          return this.httpClient.get<Product[]>(`${this.baseURL}PM`, {
            params: {
              catPlat: catPlat,
              minCarb: minCarb,
              maxCarb: maxCarb
            }
          }).pipe(
              map((product : any)=> product));
      } else if (minProt >= 0 && maxProt>0){
          if (minFib >=0 && maxFib>0) {
            return this.httpClient.get<Product[]>(`${this.baseURL}PM`, {
              params: {
                catPlat: catPlat,
                minProt: minProt,
                maxProt: maxProt,
                minFib: minFib,
                maxFib: maxFib
              }
            }).pipe(
                map((product : any)=> product));
          }

          return this.httpClient.get<Product[]>(`${this.baseURL}PM`, {
            params: {
              catPlat: catPlat,
              minProt: minProt,
              maxProt: maxProt
            }
          }).pipe(
              map((product : any)=> product));
      } else if (minFib >=0 && maxFib >0){
        return this.httpClient.get<Product[]>(`${this.baseURL}PM`, {
          params: {
            catPlat: catPlat,
            minFib: minFib,
            maxFib: maxFib
          }
        }).pipe(
            map((product : any)=> product));
      } else if (catPlat.length > 0) {
        return this.httpClient.get<Product[]>(`${this.baseURL}PM`, {
          params: {
            catPlat: catPlat,
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

