import { Location } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { GenerateSactionLetterService } from 'app/shared/generate-saction-letter.service';

@Component({
  selector: 'app-generate-saction-letter',
  templateUrl: './generate-saction-letter.component.html',
  styleUrls: ['./generate-saction-letter.component.scss']
})
export class GenerateSactionLetterComponent implements OnInit {

  constructor(private fb:FormBuilder,private location:Location,private ser:GenerateSactionLetterService) { }

  sactionLetterForms:FormGroup;

  ngOnInit(): void {

    this.sactionLetterForms=this.fb.group({

    
    sanctionId:[''],
    sanctionDate:[''],
    applicantName:[''],
    mobileNo:[''],
    email:[''],
    loanAmtSanctioned:[''],
    interestType:[''],
    rateOfInterest:[''],
    loanTenure:[''],
    monthlyEmiAmount:[''],
    modeOfPayment:[''],
    remarks:[''],
    termsCondition:[''],
    status:['']
    });
    this.editData();
    
  }
  editData(){
    let stuObj:any =this.location.getState();
    if(stuObj.id!=0)
    {
      this.sactionLetterForms.get('sanctionId').setValue(stuObj.sanctionId);
      this.sactionLetterForms.get('sanctionDate').setValue(stuObj.sanctionDate);
      this.sactionLetterForms.get('applicantName').setValue(stuObj.applicantName);
      this.sactionLetterForms.get('mobileNo').setValue(stuObj.mobileNo);
      this.sactionLetterForms.get('email').setValue(stuObj.email);
      this.sactionLetterForms.get('loanAmtSanctioned').setValue(stuObj.loanAmtSanctioned);
      this.sactionLetterForms.get('interestType').setValue(stuObj.interestType);
      this.sactionLetterForms.get('rateOfInterest').setValue(stuObj.rateOfInterest);
      this.sactionLetterForms.get('loanTenure').setValue(stuObj.loanTenure);
      this.sactionLetterForms.get('monthlyEmiAmount').setValue(stuObj.monthlyEmiAmount);
      this.sactionLetterForms.get('modeOfPayment').setValue(stuObj.modeOfPayment);
      this.sactionLetterForms.get('remarks').setValue(stuObj.remarks);
      this.sactionLetterForms.get('termsCondition').setValue(stuObj.termsCondition);
      this.sactionLetterForms.get('status').setValue(stuObj.status);
    }


  }
  sanction(){
    this.ser.updateGenerateSactionLetter(this.sactionLetterForms.value).subscribe()

  }

}
