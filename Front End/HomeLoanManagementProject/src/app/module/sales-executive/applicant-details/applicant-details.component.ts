import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { CustomerAddress } from 'app/model/customer-address';
import { CustomerService } from 'app/shared/customer.service';

@Component({
  selector: 'app-applicant-details',
  templateUrl: './applicant-details.component.html',
  styleUrls: ['./applicant-details.component.scss']
})
export class ApplicantDetailsComponent implements OnInit {

  constructor(private fb:FormBuilder,private ser:CustomerService) { }

  customerForm:FormGroup;
  ngOnInit(): void {
    this.customerForm=this.fb.group({
      customerName:[''],
      customerDateOfBirth:[''],
      customerAge:[''],
      customerGender:[''],
      customerEmail:[''],
      customerMobileNumber:[''],
      customerAdditionalMobileNumber:[''],
      customerTotalLoanRequired:[''],
      customerAddress:this.fb.group({
        areaName:[''],
        cityName:[''],
        district:[''],
        state:[''],
        pincode:[''],
        houseNumber:[''],
        country:[''],
        streetName:[''],
      }),
      mortgageDetails:this.fb.group({
        mortgagePropertyValue:[''],
        mortgagePropertyType:[''],
        mortgageLoanOnProperty:[''],
      }),
      profession:this.fb.group({
        professionType:[''],
        professionWorkingPeriod:[''],
        professionYearlyIncome:[''],
      }),
      bankAccountDetails:this.fb.group({
        accounType:[''],
        accountBalance:[''],
        accountHolderName:[''],
        accountStatus:[''],
        accountNumber:[''],
        branchName:[''],
        bankName:[''],
        ifsccode:[''],
      }),
      propertyinfo:this.fb.group({
        propertyType:[''],
        propertyTotalArea:[''],
        constructionArea:[''],
        propertyPrice:[''],
        constructionPrice:[''],
        propertyAddress:this.fb.group({
          areaName:[''],
          cityName:[''],
          district:[''],
          state:[''],
          pincode:[''],
          country:[''],
          streetName:[''],
        }),
      }),
      gurantordetails:this.fb.group({
        guarantorName:[''],
        guarantorPancardNo:[''],
        guarantorMobileNo:[''],
        guarantorAdharCardNo:[''],
        guarantorYearlyIncome:[''],
        guarantorAddress:this.fb.group({
          areaName:[''],
          cityName:[''],
          district:[''],
          state:[''],
          pincode:[''],
          country:[''],
          streetName:[''],
        }),
      }),
      loandisbursement:this.fb.group({
        loanNo:[''],
        amountPayType:[''],
        totalAmount:[''],
        bankName:[''],
        accountNumber:[''],
        IFSCCode:[''],
        accountType:[''],
        transferAmount:[''],
        paymentStatus:[''],
        amountPaidDate:[''],
      }),
      sanctionletter: this.fb.group({}),
      customerverification:this.fb.group({}),
      dependentInfo:this.fb.group({
        fatherName:[''],
        motherName:[''],
        spouseName:[''],
        noOfFamilyMember:[''],
        maritalStatus:[''],
        familyIncome:[''],
      }),
    })
  }


  pstate:number=1;

  nextDiv(){
    this.pstate++;
  }
  backDiv(){
    this.pstate--;
  }

  cpropertyProof:any;
  cpropertyInsurance:any;
  cpropertyDocument:any;
  cphoto:any;
  cpancard:any;
  csigniture:any;
  cbankStatement:any;
  cbankCheque:any;
  cadharcard:any;
  propertyProof(event){
    this.cpropertyProof=event.target.files[0];
  }
  propertyInsurance(event){
    this.cpropertyInsurance=event.target.files[0];
  }
  propertyDocument(event){
    this.cpropertyDocument=event.target.files[0];
  }
  photo(event){
    this.cphoto=event.target.files[0];
  }
  bankCheque(event){
    this.cbankCheque=event.target.files[0];
  }
  bankStatement(event){
    this.cbankStatement=event.target.files[0];
  }
  signiture(event){
    this.csigniture=event.target.files[0];
  }
  pancard(event){
    this.cpancard=event.target.files[0];
  }
  adharcard(event){
    this.cadharcard=event.target.files[0];
  }

  saveCustomer(){
    const doc=JSON.stringify(this.customerForm.value);
    const d=new FormData();
    d.append("mortgagePropertyProof",this.cpropertyProof);
    d.append("mortgagePropertyInsurance",this.cpropertyInsurance);
    d.append("propertyDocuments",this.cpropertyDocument);
    d.append("addharCard",this.cadharcard);
    d.append("photo",this.cphoto);
    d.append("bankCheque",this.cbankCheque);
    d.append("pancardNo",this.cpancard);
    d.append("signature",this.csigniture);
    d.append("bankStatement",this.cbankStatement);
    d.append("information",doc);
    this.ser.postCustomer(d).subscribe();

  }

  
}
