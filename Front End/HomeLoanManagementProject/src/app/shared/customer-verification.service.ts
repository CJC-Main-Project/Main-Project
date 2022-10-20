import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { CustomerVerification } from 'app/model/customer-verification';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CustomerVerificationService {
  url:string= "http://localhost:9090"

  constructor(private http:HttpClient) { }

  updateVerification(sanction:any):Observable<CustomerVerification[]>
  {
    console.log("Verification Id "+sanction.verificationId)
    return this.http.put<CustomerVerification[]>(this.url+"/updateCustomerVerification/"+sanction.verificationId,sanction)
  }
  
  getVerificationr():Observable<CustomerVerification[]>
  {
    return this.http.get<CustomerVerification[]>(this.url+"/getCustomerVerification")
  }
}
