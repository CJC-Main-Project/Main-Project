import { Location } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { ActivatedRoute } from '@angular/router';
import { SanctionLetter } from 'app/model/sanction-letter';
import { SanctionLetterService } from 'app/shared/sanction-letter.service';
// import pdfMake from "pdfmake/build/pdfmake";
// import pdfFonts from "pdfmake/build/vfs_fonts";
// pdfMake.vfs = pdfFonts.pdfMake.vfs;


@Component({
  selector: 'app-generate-saction-letter',
  templateUrl: './generate-saction-letter.component.html',
  styleUrls: ['./generate-saction-letter.component.scss']
})
export class GenerateSactionLetterComponent implements OnInit {

  constructor(private fb:FormBuilder,private location:Location,private routes:ActivatedRoute,private sers:SanctionLetterService) { }

  sactionLetterForms:FormGroup;
   stuobj:SanctionLetter={
     sanctionId: 0,
     sanctionDate: '',
     applicantName: '',
     mobileNo: 0,
     email: '',
     loanAmtSanctioned: 0,
     interestType: '',
     rateOfInterest: 0,
     loanTenure: '',
     monthlyEmiAmount: 0,
     modeOfPayment: '',
     remarks: '',
     termsCondition: '',
     status: ''
   };
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

    this.routes.paramMap.subscribe(param1=>{
      console.log("Saction Id In letter :"+(param1.get('id')));
       this.sers.getById(parseInt(param1.get('id')) ).subscribe((data:SanctionLetter)=>
       {this.stuobj=data
        this.sactionLetterForms.get('sanctionId').setValue(this.stuobj.sanctionId);
        this.sactionLetterForms.get('sanctionDate').setValue(this.stuobj.sanctionDate);
        this.sactionLetterForms.get('applicantName').setValue(this.stuobj.applicantName);
        this.sactionLetterForms.get('mobileNo').setValue(this.stuobj.mobileNo);
        this.sactionLetterForms.get('email').setValue(this.stuobj.email);
        this.sactionLetterForms.get('loanAmtSanctioned').setValue(this.stuobj.loanAmtSanctioned);
        this.sactionLetterForms.get('interestType').setValue(this.stuobj.interestType);
        this.sactionLetterForms.get('rateOfInterest').setValue(this.stuobj.rateOfInterest);
        this.sactionLetterForms.get('loanTenure').setValue(this.stuobj.loanTenure);
        this.sactionLetterForms.get('monthlyEmiAmount').setValue(this.stuobj.monthlyEmiAmount);
        this.sactionLetterForms.get('modeOfPayment').setValue(this.stuobj.modeOfPayment);
        this.sactionLetterForms.get('remarks').setValue(this.stuobj.remarks);
        this.sactionLetterForms.get('termsCondition').setValue(this.stuobj.termsCondition);
        this.sactionLetterForms.get('status').setValue(this.stuobj.status);
        
      })
        
      });

  }
  
//   generatePDF(action = 'open') {
//     let docDefinition = {
//       content: [
//         {
//           text: 'Home Loan',
//           fontSize: 16,
//           alignment: 'center',
//           color: '#047886'
//         },
//         {
//           text: 'Sanction Letter',
//           fontSize: 20,
//           bold: true,
//           alignment: 'center',
//           decoration: 'underline',
//           color: 'skyblue'
//         },
//         {
//           text: 'Customer Details',
//           style: 'sectionHeader'
//         },
//         {
//           columns: [
//             [
//               {
//                 text: this.sactionLetterForms.controls['applicantName'].value,
//                 bold:true
//               },
             
//               { text: this.sactionLetterForms.controls['email'].value },
//               { text: this.sactionLetterForms.controls['mobileNo'].value }
//             ],
//             [
//               {
//                 text: this.sactionLetterForms.controls['sanctionDate'].value,
//                 alignment: 'right'
//               },
//               { 
//                 text: 'Loan Sanction Id :',
//                 alignment: 'right'}, 
//                 {text: this.sactionLetterForms.controls['sanctionId'].value,
//                 alignment: 'right' 
//               },
              
//             ]
//           ]
//         },
//         {
//           text: 'Loan Details',
//           style: 'sectionHeader'
//         },
        
//           { text: 'Dear ',},{text:this.sactionLetterForms.controls['applicantName'].value, },
// 		  { text: '       This letter is made in reference to your loan application Number '},{text:this.sactionLetterForms.controls['sanctionId'].value },
// 		  { text: 'Date '},{text:this.sactionLetterForms.controls['sanctionDate'].value},{text:'.  Based on the information you provided in your loan application,' },
// 		  { text: 'we are please to inform you of the approval of your loan based on the following terms and conditions: ' },
		   
// 		  { text: 'Loan Amount of Rs. '},{text:this.sactionLetterForms.controls['loanAmtSanctioned'].value },
// 		  { text: 'Loan interest of '},{text:this.sactionLetterForms.controls['rateOfInterest'].value},{text:'% applicable in relation to market conditions upon the ' },
//           { text: 'disbursement of the loan.' },
//           { text: 'Payment Mode : '},{text:this.sactionLetterForms.controls['modeOfPayment'].value  },
//           { text: 'Interest Type : '},{text:this.sactionLetterForms.controls['interestType'].value, },
//           { text: 'Loan Tenure Peroid : '},{text:this.sactionLetterForms.controls['loanTenure'].value, },
//           { text: 'Monthely EMI Amount : '},{text:this.sactionLetterForms.controls['monthlyEmiAmount'].value, },
//           { text:  this.sactionLetterForms.controls['remark'].value,		    },
			
        
//          { text: '     ' },
// 		 { text: '     '},
// 		 { text: '     '},
//         {
//           columns:  [{ text: 'Signature', alignment: 'right', italics: true}],
          
//         },
//         {
//           text: 'Terms and Conditions',
//           style: 'sectionHeader'
//         },
//         {
//             ul: [
//               'This offer is valid 30 days from the date of this letter',
//               'This letter send by sanction officer',
//             ],
//         },
// 		{
// 		   text: '     Disbursement shall be made upon compleletion of the signing of the loan agreement.'
// 		},
// 		{ text:'Regards,'},
// 		{ text: '   '},
// 		{ text: 'Loan Sanction Officer'},
// 		{ text: ' Home Loan Management '},
		
//       ],
//       styles: {
//         sectionHeader: {
//           bold: true,
//           decoration: 'underline',
//           fontSize: 14,
//           margin: [0, 15,0, 15]          
//         }
//       }
//     };
//     if(action==='download'){
//       pdfMake.createPdf(docDefinition).download();
//     }else if(action === 'print'){
//       pdfMake.createPdf(docDefinition).print();      
//     }else{
//       pdfMake.createPdf(docDefinition).open();      
//     }
// }

  
  sanction(){
    this.sers.updateGenerateSactionLetter(this.sactionLetterForms.value).subscribe()

  }

}
