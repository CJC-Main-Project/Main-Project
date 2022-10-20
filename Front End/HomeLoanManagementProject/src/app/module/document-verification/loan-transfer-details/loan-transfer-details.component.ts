import { Component, OnInit } from '@angular/core';
import { LoanDisbursement } from 'app/model/loan-disbursement';
import { LoanDisbursmentService } from 'app/shared/loan-disbursment.service';

@Component({
  selector: 'app-loan-transfer-details',
  templateUrl: './loan-transfer-details.component.html',
  styleUrls: ['./loan-transfer-details.component.scss']
})
export class LoanTransferDetailsComponent implements OnInit {

  constructor(private ser:LoanDisbursmentService) { }
   diburstlist:LoanDisbursement[];
  ngOnInit(): void {

    this.ser.getLoanDisbursment().subscribe((data:LoanDisbursement[])=>{
       this.diburstlist=data;
    })
  }

}
