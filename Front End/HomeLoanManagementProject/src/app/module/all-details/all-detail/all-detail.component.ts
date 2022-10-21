import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { ActivatedRoute } from '@angular/router';
import { Customer } from 'app/model/customer';
import { CustomerService } from 'app/shared/customer.service';

@Component({
  selector: 'app-all-detail',
  templateUrl: './all-detail.component.html',
  styleUrls: ['./all-detail.component.scss']
})
export class AllDetailComponent implements OnInit {

  cobj:Customer;
  constructor(private fb:FormBuilder,private routes:ActivatedRoute,private ser:CustomerService) { }

  customerForm:FormGroup;
  ngOnInit(): void {
    this.customerForm=this.fb.group({
      customerId:[''],
      customerName:[''],
      customerDateOfBirth:[''],
      customerAge:[''],
      customerGender:[''],
      customerEmail:[''],
      customerMobileNumber:[''],
      customerAdditionalMobileNumber:[''],
      customerTotalLoanRequired:[''],
       customerAddress:this.fb.group({
        country:[''],
        streetName:[''],
        areaName:[''],
        cityName:[''],
        houseNumber:[''],
        pincode:[''],
        district:[''],
        state:[''],
       
        
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
      guarantordetails:this.fb.group({
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
        ifscCode:[''],
        accountType:[''],
        transferAmount:[''],
        paymentStatus:[''],
        amountPaidDate:[''],
      }),
      sanctionletter: this.fb.group({
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
        status:[''],
      }),
      customerverification:this.fb.group({
        verificationDate:[''],
        status:[''],
        remarks:['']
      }),
      dependentInfo:this.fb.group({
        fatherName:[''],
        motherName:[''],
        spouseName:[''],
        noOfFamilyMember:[''],
        maritalStatus:[''],
        familyIncome:[''],
      }),
    });

    this.routes.paramMap.subscribe(param1=>{
        this.ser.getById(parseInt(param1.get('id')) ).subscribe((data:Customer)=>{
          this.cobj=data;
          console.log("Customer Id In All Details :"+this.cobj.customerId)
          this.customerForm.get('customerId').setValue(this.cobj.customerId)
          this.customerForm.get('customerName').setValue(this.cobj.customerName)
          this.customerForm.get('customerDateOfBirth').setValue(this.cobj.customerDateOfBirth)
          this.customerForm.get('customerAge').setValue(this.cobj.customerAge)
          this.customerForm.get('customerGender').setValue(this.cobj.customerGender)
          this.customerForm.get('customerEmail').setValue(this.cobj.customerEmail)
          this.customerForm.get('customerMobileNumber').setValue(this.cobj.customerMobileNumber)
          this.customerForm.get('customerAdditionalMobileNumber').setValue(this.cobj.customerAdditionalMobileNumber)
          this.customerForm.get('customerTotalLoanRequired').setValue(this.cobj.customerTotalLoanRequired)
          this.customerForm.get('customerAddress.streetName').setValue(this.cobj.customerAddress.streetName)
          this.customerForm.get('customerAddress.district').setValue(this.cobj.customerAddress.district)
          this.customerForm.get('customerAddress.state').setValue(this.cobj.customerAddress.state)
          this.customerForm.get('customerAddress.country').setValue(this.cobj.customerAddress.country)
          this.customerForm.get('customerAddress.areaName').setValue(this.cobj.customerAddress.areaName)
          this.customerForm.get('customerAddress.cityName').setValue(this.cobj.customerAddress.cityName)
          this.customerForm.get('customerAddress.pincode').setValue(this.cobj.customerAddress.pincode)
          this.customerForm.get('customerAddress.houseNumbe').setValue(this.cobj.customerAddress.houseNumber)
    
          this.customerForm.get('mortgageDetails.mortgagePropertyType').setValue(this.cobj.mortgageDetails.mortgagePropertyType)
          this.customerForm.get('mortgageDetails.mortgagePropertyValue').setValue(this.cobj.mortgageDetails.mortgagePropertyValue)
          this.customerForm.get('profession.professionType').setValue(this.cobj.profession.professionType)
          this.customerForm.get('profession.professionWorkingPeriod').setValue(this.cobj.profession.professionWorkingPeriod)
          this.customerForm.get('profession.professionYearlyIncome').setValue(this.cobj.profession.professionYearlyIncome)
          this.customerForm.get('bankAccountDetails.accounType').setValue(this.cobj.bankAccountDetails.accounType)
          this.customerForm.get('bankAccountDetails.accountBalance').setValue(this.cobj.bankAccountDetails.accountBalance)
          this.customerForm.get('bankAccountDetails.accountHolderNam').setValue(this.cobj.bankAccountDetails.accountHolderName)
          this.customerForm.get('bankAccountDetails.accountNumbe').setValue(this.cobj.bankAccountDetails.accountNumber)
          this.customerForm.get('bankAccountDetails.accountStatus').setValue(this.cobj.bankAccountDetails.accountStatus)
          this.customerForm.get('bankAccountDetails.bankName').setValue(this.cobj.bankAccountDetails.bankName)
          this.customerForm.get('bankAccountDetails.branchName').setValue(this.cobj.bankAccountDetails.branchName)
          this.customerForm.get('bankAccountDetails.ifsccode').setValue(this.cobj.bankAccountDetails.ifsccode)
          this.customerForm.get('propertyinfo.constructionArea').setValue(this.cobj.propertyinfo.constructionArea)
          this.customerForm.get('propertyinfo.constructionPrice').setValue(this.cobj.propertyinfo.constructionPrice)
          this.customerForm.get('propertyinfo.propertyPrice').setValue(this.cobj.propertyinfo.propertyPrice)
          this.customerForm.get('propertyinfo.propertyTotalArea').setValue(this.cobj.propertyinfo.propertyTotalArea)
          this.customerForm.get('propertyinfo.propertyType').setValue(this.cobj.propertyinfo.propertyType)
          this.customerForm.get('propertyinfo.propertyAddress.areaName').setValue(this.cobj.propertyinfo.propertyAddress.areaName)
          this.customerForm.get('propertyinfo.propertyAddress.cityName').setValue(this.cobj.propertyinfo.propertyAddress.cityName)
          this.customerForm.get('propertyinfo.propertyAddress.country').setValue(this.cobj.propertyinfo.propertyAddress.country)
          this.customerForm.get('propertyinfo.propertyAddress.district').setValue(this.cobj.propertyinfo.propertyAddress.district)
          this.customerForm.get('propertyinfo.propertyAddress.pincode').setValue(this.cobj.propertyinfo.propertyAddress.pincode)
          this.customerForm.get('propertyinfo.propertyAddress.state').setValue(this.cobj.propertyinfo.propertyAddress.state)
          this.customerForm.get('propertyinfo.propertyAddress.streetName').setValue(this.cobj.propertyinfo.propertyAddress.streetName)
          this.customerForm.get('guarantordetails.guarantorAdharCardNo').setValue(this.cobj.guarantordetails.guarantorAdharCardNo)
          this.customerForm.get('guarantordetails.guarantorMobileNo').setValue(this.cobj.guarantordetails.guarantorMobileNo)
          this.customerForm.get('guarantordetails.guarantorName').setValue(this.cobj.guarantordetails.guarantorName)
          this.customerForm.get('guarantorPancardNo').setValue(this.cobj.guarantordetails.guarantorPancardNo)
          this.customerForm.get('guarantordetails.guarantorYearlyIncome').setValue(this.cobj.guarantordetails.guarantorYearlyIncome)
          this.customerForm.get('guarantordetails.guarantorAddress.areaName').setValue(this.cobj.guarantordetails.guarantorAddress.areaName)
          this.customerForm.get('guarantordetails.guarantorAddress.cityName').setValue(this.cobj.guarantordetails.guarantorAddress.cityName)
          this.customerForm.get('guarantordetails.guarantorAddress.country').setValue(this.cobj.guarantordetails.guarantorAddress.country)
          this.customerForm.get('guarantordetails.guarantorAddress.district').setValue(this.cobj.guarantordetails.guarantorAddress.district)
          this.customerForm.get('guarantordetails.guarantorAddress.pincode').setValue(this.cobj.guarantordetails.guarantorAddress.pincode)
          this.customerForm.get('guarantordetails.guarantorAddress.sta').setValue(this.cobj.guarantordetails.guarantorAddress.state)
          this.customerForm.get('guarantordetails.guarantorAddress.streetName').setValue(this.cobj.guarantordetails.guarantorAddress.streetName)
          this.customerForm.get('loandisbursement.accountNumber').setValue(this.cobj.loandisbursement.accountNumber)
          this.customerForm.get('loandisbursement.accountType').setValue(this.cobj.loandisbursement.accountType)
          this.customerForm.get('loandisbursement.amountPaidDate').setValue(this.cobj.loandisbursement.amountPaidDate)
          this.customerForm.get('loandisbursement.amountPayType').setValue(this.cobj.loandisbursement.amountPayType)
          this.customerForm.get('loandisbursement.bankName').setValue(this.cobj.loandisbursement.bankName)
          this.customerForm.get('loandisbursement.ifscCode').setValue(this.cobj.loandisbursement.ifscCode)
          this.customerForm.get('loandisbursement.loanNo').setValue(this.cobj.loandisbursement.loanNo)
          this.customerForm.get('loandisbursement.paymentStatus').setValue(this.cobj.loandisbursement.paymentStatus)
          this.customerForm.get('loandisbursement.totalAmount').setValue(this.cobj.loandisbursement.totalAmount)
          this.customerForm.get('loandisbursement.transferAmount').setValue(this.cobj.loandisbursement.transferAmount)
          this.customerForm.get('sanctionletter.applicantName').setValue(this.cobj.sanctionletter.applicantName)
          this.customerForm.get('sanctionletter.email').setValue(this.cobj.sanctionletter.email)
          this.customerForm.get('sanctionletter.interestType').setValue(this.cobj.sanctionletter.interestType)
          this.customerForm.get('sanctionletter.loanAmtSanctioned').setValue(this.cobj.sanctionletter.loanAmtSanctioned)
          this.customerForm.get('sanctionletter.loanTenure').setValue(this.cobj.sanctionletter.loanTenure)
          this.customerForm.get('sanctionletter.mobileNo').setValue(this.cobj.sanctionletter.mobileNo)
          this.customerForm.get('sanctionletter.modeOfPayment').setValue(this.cobj.sanctionletter.modeOfPayment)
          this.customerForm.get('sanctionletter.monthlyEmiAmount').setValue(this.cobj.sanctionletter.monthlyEmiAmount)
          this.customerForm.get('sanctionletter.rateOfInterest').setValue(this.cobj.sanctionletter.rateOfInterest)
          this.customerForm.get('sanctionletter.remarks').setValue(this.cobj.sanctionletter.remarks)
          this.customerForm.get('sanctionletter.sanctionDate').setValue(this.cobj.sanctionletter.sanctionDate)
          this.customerForm.get('sanctionletter.status').setValue(this.cobj.sanctionletter.status)
          this.customerForm.get('sanctionletter.termsCondition').setValue(this.cobj.sanctionletter.termsCondition)
          this.customerForm.get('customerverification.remarks').setValue(this.cobj.customerverification.remarks)
          this.customerForm.get('customerverification.status').setValue(this.cobj.customerverification.status)
          this.customerForm.get('customerverification.verificationDate').setValue(this.cobj.customerverification.verificationDate)
          this.customerForm.get('dependentInfo.familyIncome').setValue(this.cobj.dependentInfo.familyIncome)
          this.customerForm.get('dependentInfo.fatherNam').setValue(this.cobj.dependentInfo.fatherName)
          this.customerForm.get('dependentInfo.maritalStatus').setValue(this.cobj.dependentInfo.maritalStatus)
          this.customerForm.get('dependentInfo.motherName').setValue(this.cobj.dependentInfo.motherName)
          this.customerForm.get('dependentInfo.noOfFamilyMember').setValue(this.cobj.dependentInfo.noOfFamilyMember)
          this.customerForm.get('dependentInfo.spouseName').setValue(this.cobj.dependentInfo.spouseName)
        

        })
      })

  }

   back(){

   }
  saveCustomer(){

  }
}
