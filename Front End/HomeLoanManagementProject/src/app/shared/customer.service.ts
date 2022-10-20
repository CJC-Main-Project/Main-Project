import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Customer } from 'app/model/customer';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  url:string= "http://localhost:9090"
  constructor(private http:HttpClient) { }


  postCustomer(customer:any):Observable<Customer[]>
  {
   return this.http.post<Customer[]>(this.url+"/saveCustomer",customer);
  }

  getCustomer():Observable<Customer[]>
  {
    return this.http.get<Customer[]>(this.url+"/getCustomer");
  }

  getById(id:number):Observable<Customer[]>
  {
    return this.http.get<Customer[]>(this.url+"/getById"+id);
  }
}
