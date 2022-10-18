import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-emi-calculator',
  templateUrl: './emi-calculator.component.html',
  styleUrls: ['./emi-calculator.component.scss']
})
export class EmiCalculatorComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  loan={
    propertyValue :null,
  loanRequired :null,
  loanAmount:null,
  msg: null

}

calculate(){
this.loan.loanAmount=(this.loan.propertyValue*60)/100;
if(this.loan.loanAmount>=this.loan.loanRequired){                    
  this.loan.msg="Loan Amount Approved";
}
else{
  this.loan.msg="Loan Amount Rejected because property value is less";
}
}
}
