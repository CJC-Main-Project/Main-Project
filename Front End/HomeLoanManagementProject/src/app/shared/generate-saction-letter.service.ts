import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class GenerateSactionLetterService {

  url:string= "http://localhost:9090"

  constructor(private http:HttpClient) { }
  updateGenerateSactionLetter(sanction:any){
    return this.http.put(this.url+"/updateSanctionLetter/"+sanction.sanctionId,sanction)
  }
  
  getGenerateSanctionLetter(){
    return this.http.get(this.url+"/getSanctionLetter")
  }

}
