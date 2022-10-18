import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { EnquiryDetails } from 'app/model/enquiry-details';
import { EnquiryService } from 'app/shared/enquiry.service';

@Component({
  selector: 'app-enquiry-details',
  templateUrl: './enquiry-details.component.html',
  styleUrls: ['./enquiry-details.component.scss']
})
export class EnquiryDetailsComponent implements OnInit {

  edform!: FormGroup;
  constructor(private formBuilder: FormBuilder, private ser:EnquiryService) {}

  enquiryList:EnquiryDetails[];
 ngOnInit(): void {
    this.edform=this.formBuilder.group( {
       fullname:[''],
        age:[],
        email:[],
        mobileNo:[''],
        totalLoanRequired:[],
        pancardNo:[],
        cibilScore:[],
        cibilScoreDateTime:['']
      })

  this.ser.getEnquiry().subscribe((data:EnquiryDetails[])=>{
    this.enquiryList=data;
  })    

}
pstate:number=1;
save()
{
   this.ser.postEnquiery(this.edform.value).subscribe()
}
viewDetails()
{
  this.pstate++;
}

back()
{
  this.pstate--;
}

}