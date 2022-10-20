import { Location } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { ActivatedRoute } from '@angular/router';
import { LoanDisbursement } from 'app/model/loan-disbursement';
import { LoanDisbursmentService } from 'app/shared/loan-disbursment.service';

@Component({
  selector: 'app-loan-transfer',
  templateUrl: './loan-transfer.component.html',
  styleUrls: ['./loan-transfer.component.scss']
})
export class LoanTransferComponent implements OnInit {

  constructor(private fb:FormBuilder,private location:Location,private routes:ActivatedRoute,private ser:LoanDisbursmentService) { }
 
  loanTransferForm:FormGroup;
  stuobj:LoanDisbursement={
    agreementId: 0,
    loanNo: 0,
    amountPayType: '',
    totalAmount: 0,
    bankName: '',
    accountNumber: 0,
    ifscCode: '',
    accountType: '',
    transferAmount: 0,
    paymentStatus: '',
    amountPaidDate: ''
  }
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

    this.routes.paramMap.subscribe(param1=>{
      console.log((param1.get('id')));
       this.ser.getById(parseInt(param1.get('id')) ).subscribe((data:LoanDisbursement)=>
       {this.stuobj=data
        this.loanTransferForm.get('agreementId').setValue(this.stuobj.agreementId);
        this.loanTransferForm.get('loanNo').setValue(this.stuobj.loanNo);
        this.loanTransferForm.get('amountPayType').setValue(this.stuobj.amountPayType);
        this.loanTransferForm.get('totalAmount').setValue(this.stuobj.totalAmount);
        this.loanTransferForm.get('bankName').setValue(this.stuobj.bankName);
        this.loanTransferForm.get('accountNumber').setValue(this.stuobj.accountNumber);
        this.loanTransferForm.get('ifscCode').setValue(this.stuobj.ifscCode);
        this.loanTransferForm.get('accountType').setValue(this.stuobj.accountType);
        this.loanTransferForm.get('transferAmount').setValue(this.stuobj.transferAmount);
        this.loanTransferForm.get('paymentStatus').setValue(this.stuobj.paymentStatus);
        this.loanTransferForm.get('amountPaidDate').setValue(this.stuobj.amountPaidDate);
      })
  });
  

}

transfer(){
  this.ser.updateLoanDisbursement(this.loanTransferForm.value).subscribe();
 }
}
