import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { EmailSender } from 'app/model/email-sender';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EmailSenderService {

  url:string= "http://localhost:9090"
  constructor(private http:HttpClient) { }

  sendEmail(e:any):Observable<EmailSender>
  {
    return this.http.post<EmailSender>(this.url+"/sendEmail",e);
  }

}
