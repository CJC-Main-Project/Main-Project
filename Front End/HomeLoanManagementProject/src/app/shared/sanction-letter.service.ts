import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class SanctionLetterService {
  url:string= "http://localhost:9090"

  constructor(private http:HttpClient) { }


  getById(id:number){
    console.log("ID :-"+id)
    return this.http.get(this.url+"/getSanction/"+id)
  }
  updateGenerateSactionLetter(sanction:any){
    return this.http.put(this.url+"/updateSanctionLetter/"+sanction.sanctionId,sanction)
  }
}
