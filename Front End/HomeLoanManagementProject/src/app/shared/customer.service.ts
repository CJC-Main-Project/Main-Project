import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  url:string= "http://localhost:9090"
  constructor(private http:HttpClient) { }


  postCustomer(customer:any){
   return this.http.post(this.url+"/saveCustomer",customer);
  }

  getCustomer(){
    return this.http.get(this.url+"/getCustomer");
  }
}
