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
  emical={
    loanamt:null,
    tenure:null,
    roi:null,
    totalint:null,
    totalpayamt:null,
    emi:null
  }

  rate:number
  a:number
  b:number
  c:number
  n:number
  
  calculate()
  {
  this.rate=((this.emical.roi)/12)/100
  this.a=this.emical.loanamt*this.rate
  this.n=this.emical.tenure*12
  this.b=Math.pow((1+this.rate),this.n)
  this.c=this.b-1
  
  this.emical.emi=(this.a*this.b)/this.c
  
  this.emical.totalpayamt=this.emical.emi*this.n
  
  this.emical.totalint=this.emical.totalpayamt-this.emical.loanamt
  }

}
