import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  url:string= "http://localhost:9090"
  constructor(private http:HttpClient) { }


  postCustomer(customer){
   return this.http.post(this.url+"/saveCustomer",customer);
  }
}
