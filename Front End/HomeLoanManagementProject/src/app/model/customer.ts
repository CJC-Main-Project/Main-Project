import { BankAccountDetails } from "./bank-account-details";
import { CustomerAddress } from "./customer-address";
import { CustomerVerification } from "./customer-verification";
import { DependentInfo } from "./dependent-info";
import { GuarantorDetails } from "./guarantor-details";
import { LoanDisbursement } from "./loan-disbursement";
import { MortgageDetails } from "./mortgage-details";
import { Profession } from "./profession";
import { PropertyInfo } from "./property-info";
import { SanctionLetter } from "./sanction-letter";

export class Customer {
customerId:number;
customerName:string;
customerDateOfBirth:string;
customerAge:number;
customerGender:string;
customerEmail:string;
customerMobileNumber:number;
customerAdditionalMobileNumber:number;
customerTotalLoanRequired:number;
customerAddress:CustomerAddress;
mortgageDetails:MortgageDetails;
profession:Profession;
bankAccountDetails:BankAccountDetails;
propertyinfo:PropertyInfo;
guarantordetails:GuarantorDetails;
loandisbursement:LoanDisbursement;
sanctionletter: SanctionLetter;
customerverification:CustomerVerification;
dependentInfo:DependentInfo;

}
