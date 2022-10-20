import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { ActivatedRoute } from '@angular/router';
import { Customer } from 'app/model/customer';

import { CustomerService } from 'app/shared/customer.service';
import { EmailSenderService } from 'app/shared/email-sender.service';

@Component({
  selector: 'app-email-recipe',
  templateUrl: './email-recipe.component.html',
  styleUrls: ['./email-recipe.component.scss']
})
export class EmailRecipeComponent implements OnInit {

  constructor(private fb:FormBuilder,private routes:ActivatedRoute,private ser:EmailSenderService,private cser:CustomerService) { }
  // cobj:Customer[];
    
  emailForm:FormGroup;
  ngOnInit(): void {

    this.emailForm=this.fb.group({
      toEmail:[''],
      subject:[''],
      textbody:['']
    });
    //  this.routes.paramMap.subscribe(param1=>{
    //   this.cser.getById(parseInt(param1.get('id')) ).subscribe(data=>{
    //     this.cobj=data;
    //     this.emailForm.get('toEmail').setValue(this.cobj)
    //   })
    // })
  }

  eattch:any;
  attach(event){
       this.eattch=event.target.files[0];
  }


  sendEmail(){
    const doc=JSON.stringify(this.emailForm.value);
    const d=new FormData();
    d.append("attachment",this.eattch);
    d.append("information",doc)
    this.ser.sendEmail(d).subscribe();
  }
}
