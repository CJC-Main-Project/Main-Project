import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Customer } from 'app/model/customer';
import { CustomerVerificationService } from 'app/shared/customer-verification.service';
import { CustomerService } from 'app/shared/customer.service';

@Component({
  selector: 'app-view-details',
  templateUrl: './view-details.component.html',
  styleUrls: ['./view-details.component.scss']
})
export class ViewDetailsComponent implements OnInit {

  constructor(private ser:CustomerService,private fb:FormBuilder,private vser:CustomerVerificationService) { }

  customerList:Customer[];
   verificationForm:FormGroup;
  ngOnInit(): void {
    this.verificationForm=this.fb.group({
      verificationId:[''],
      verificationDate:[''],
      status:[''],
      remarks:[''],
    })
    this.ser.getCustomer().subscribe((data:Customer[])=>{
      this.customerList=data;
    })
    
  }

   masg:string;
  approved(c:Customer){
    console.log("Cus Ver ID :"+c.customerverification.verificationId)
    this.masg="Approed By Site Visit Officer";
    this.verificationForm.get('verificationId').setValue(c.customerverification.verificationId);
       this.verificationForm.get('status').setValue(this.masg); 
         this.vser.updateVerification(this.verificationForm.value).subscribe();
}
reject(c:Customer){
  console.log("Cus Ver ID :"+c.customerverification.verificationId)
  this.masg="Reject By Site Visit Officer";
  this.verificationForm.get('verificationId').setValue(c.customerverification.verificationId);
     this.verificationForm.get('status').setValue(this.masg); 
       this.vser.updateVerification(this.verificationForm.value).subscribe();
}

  
}
