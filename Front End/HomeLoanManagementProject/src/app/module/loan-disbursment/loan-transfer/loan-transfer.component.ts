import { Location } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { LoanDisbursmentService } from 'app/shared/loan-disbursment.service';

@Component({
  selector: 'app-loan-transfer',
  templateUrl: './loan-transfer.component.html',
  styleUrls: ['./loan-transfer.component.scss']
})
export class LoanTransferComponent implements OnInit {

  constructor(private fb:FormBuilder,private location:Location,private ser:LoanDisbursmentService) { }
 
  loanTransferForm:FormGroup;

  ngOnInit(): void {
    this.loanTransferForm=this.fb.group({
       agreementId:[''],
       loanNo:[''],
       amountPayType:[''],
       totalAmount:[''],
       bankName:[''],
       accountNumber:[''],
       ifscCode:[''],
       accountType:[''],
       transferAmount:[''],
       paymentStatus:[''],
       amountPaidDate:['']
      


    });
    this.editData();
  }
  
   transfer(){
    this.ser.updateLoanDisbursement(this.loanTransferForm.value).subscribe()

   }
   editData(){
    let stuObj:any =this.location.getState();
    if(stuObj.id!=0)
    {
      this.loanTransferForm.get('agreementId').setValue(stuObj.agreementId);
      this.loanTransferForm.get('loanNo').setValue(stuObj.loanNo);
      this.loanTransferForm.get('amountPayType').setValue(stuObj.amountPayType);
      this.loanTransferForm.get('totalAmount').setValue(stuObj.totalAmount);
      this.loanTransferForm.get('bankName').setValue(stuObj.bankName);
      this.loanTransferForm.get('accountNumber').setValue(stuObj.accountNumber);
      this.loanTransferForm.get('ifscCode').setValue(stuObj.ifscCode);
      this.loanTransferForm.get('accountType').setValue(stuObj.accountType);
      this.loanTransferForm.get('transferAmount').setValue(stuObj.transferAmount);
      this.loanTransferForm.get('paymentStatus').setValue(stuObj.paymentStatus);
      this.loanTransferForm.get('amountPaidDate').setValue(stuObj.amountPaidDate);

      

    }

   }


}
