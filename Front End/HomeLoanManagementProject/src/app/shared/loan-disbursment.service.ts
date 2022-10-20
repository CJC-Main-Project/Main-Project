import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LoanDisbursmentService {

  url:string= "http://localhost:9090"
  constructor(private http:HttpClient) { }

  updateLoanDisbursement(loanTransfer:any){
    return this.http.put(this.url+"/updateLoan/"+loanTransfer.agreementId,loanTransfer)
  }

  getLoanDisbursment(){
  return this.http.get(this.url+"/getLoan")
}

getById(id:number){
  console.log("ID :-"+id)
  return this.http.get(this.url+"/getLoanById/"+id)
}
}
