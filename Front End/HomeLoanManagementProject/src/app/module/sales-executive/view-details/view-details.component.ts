import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { Customer } from 'app/model/customer';
import { CustomerVerificationService } from 'app/shared/customer-verification.service';
import { CustomerService } from 'app/shared/customer.service';

@Component({
  selector: 'app-view-details',
  templateUrl: './view-details.component.html',
  styleUrls: ['./view-details.component.scss']
})
export class ViewDetailsComponent implements OnInit {

  constructor(private ser:CustomerService,private fb:FormBuilder,private vser:CustomerVerificationService,private router:Router) { }

  customerList:Customer[];
   verificationForm:FormGroup;
  ngOnInit(): void {
    this.ser.getCustomer().subscribe((data:Customer[])=>{
      this.customerList=data;
    });
    this.verificationForm=this.fb.group({
      verificationId:[''],
      verificationDate:[''],
      status:[''],
      remarks:[''],
    })
    
    
  }

   masg:string;
  approved(c:Customer){
    console.log("Cus Ver ID :"+c.customerverification.verificationId)
    this.masg="Approed By Sales Executive";
    this.verificationForm.get('verificationId').setValue(c.customerverification.verificationId);
       this.verificationForm.get('status').setValue(this.masg); 
         this.vser.updateVerification(this.verificationForm.value).subscribe();
}
reject(c:Customer){
  console.log("Cus Ver ID :"+c.customerverification.verificationId)
  this.masg="Reject By Sales Executive";
  this.verificationForm.get('verificationId').setValue(c.customerverification.verificationId);
     this.verificationForm.get('status').setValue(this.masg); 
       this.vser.updateVerification(this.verificationForm.value).subscribe();
}

allDetail(id:number){
  sessionStorage.setItem('role','ad');
  this.router.navigate(['role/ad/all-details',id]);
 }
}
