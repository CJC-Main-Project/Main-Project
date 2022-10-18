import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class EnquiryService {

  url:string= "http://localhost:9090"
  constructor(private http:HttpClient) { }

  postEnquiery(enquiry:any)
  {
    return this.http.post(this.url+"/saveEnquiryDetails",enquiry)
  }

getEnquiry()
{
  return this.http.get(this.url+"/getEnquiryDetails")
}

}
