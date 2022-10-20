package com.cjc.homeloanmanagement.app.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cjc.homeloanmanagement.app.model.AllPersonalDocuments;
import com.cjc.homeloanmanagement.app.model.BankAccountDetails;
import com.cjc.homeloanmanagement.app.model.Customer;
import com.cjc.homeloanmanagement.app.model.CustomerAddress;
import com.cjc.homeloanmanagement.app.model.CustomerVerification;
import com.cjc.homeloanmanagement.app.model.DependentInfo;
import com.cjc.homeloanmanagement.app.model.GuarantorDetails;
import com.cjc.homeloanmanagement.app.model.GuaruntorAddress;
import com.cjc.homeloanmanagement.app.model.LoanDisbursement;
import com.cjc.homeloanmanagement.app.model.MortgageDetails;
import com.cjc.homeloanmanagement.app.model.Profession;
import com.cjc.homeloanmanagement.app.model.PropertyAddress;
import com.cjc.homeloanmanagement.app.model.PropertyInfo;
import com.cjc.homeloanmanagement.app.model.SanctionLetter;
import com.cjc.homeloanmanagement.app.serviceI.CustomerServiceI;
import com.fasterxml.jackson.databind.ObjectMapper;

@CrossOrigin("*")
@RestController
public class CustomerController {

	@Autowired
	CustomerServiceI cs;
	
	@PostMapping(value = "/saveCustomer",consumes =MediaType.MULTIPART_FORM_DATA_VALUE )
	public String savaCustomer(@RequestPart (value = "addharCard") MultipartFile addharCard,@RequestPart (value = "photo") MultipartFile photo,
			  @RequestPart (value = "bankCheque") MultipartFile bankCheque,@RequestPart (value = "pancardNo") MultipartFile pancardNo,
			  @RequestPart (value = "signature") MultipartFile signature,@RequestPart (value = "bankStatement") MultipartFile bankStatement,
			  @RequestPart(value="propertyDocuments") MultipartFile propertyDocuments,@RequestPart (value = "mortgagePropertyProof") MultipartFile mortgagePropertyProof,
			  @RequestPart (value = "mortgagePropertyInsurance") MultipartFile mortgagePropertyInsurance,
	           @RequestPart (value = "information") String information) throws IOException
	{
		ObjectMapper om=new ObjectMapper();
		
        Customer md=om.readValue(information, Customer.class);
		MortgageDetails mortgage=new MortgageDetails();
		mortgage.setMortgageLoanOnProperty(md.getMortgageDetails().getMortgageLoanOnProperty());
		mortgage.setMortgagePropertyType(md.getMortgageDetails().getMortgagePropertyType());
		mortgage.setMortgagePropertyValue(md.getMortgageDetails().getMortgagePropertyValue());
		mortgage.setMortgagePropertyInsurance(mortgagePropertyInsurance.getBytes());
		mortgage.setMortgagePropertyProof(mortgagePropertyProof.getBytes());
		
		AllPersonalDocuments docs=new AllPersonalDocuments();
		docs.setAddharCard(addharCard.getBytes());
		docs.setBankCheque(bankCheque.getBytes());
		docs.setBankStatement(bankStatement.getBytes());
		docs.setPancardNo(pancardNo.getBytes());
		docs.setPhoto(photo.getBytes());
		docs.setSignature(signature.getBytes());
		
		//PropertyAddress pa=om.readValue(information,PropertyAddress.class);
		
		//PropertyInfo pi = om.readValue(information,PropertyInfo.class);
		 PropertyInfo propertyInfo=new PropertyInfo();
		 propertyInfo.setPropertyType(md.getPropertyinfo().getPropertyType());
		 propertyInfo.setPropertyTotalArea(md.getPropertyinfo().getPropertyTotalArea());
		 propertyInfo.setConstructionArea(md.getPropertyinfo().getConstructionArea());
		 propertyInfo.setPropertyPrice(md.getPropertyinfo().getPropertyPrice());
		 propertyInfo.setConstructionPrice(md.getPropertyinfo().getConstructionPrice());
		 propertyInfo.setPropertyDocuments(propertyDocuments.getBytes());
		 propertyInfo.setPropertyAddress(md.getPropertyinfo().getPropertyAddress());
		 
		// GuaruntorAddress ga=om.readValue(information,GuaruntorAddress.class);
		// GuarantorDetails gd=om.readValue(information,GuarantorDetails.class);
		// gd.setGuarantorAddress(ga);
		 
		// BankAccountDetails ba=om.readValue(information,BankAccountDetails.class);
		// DependentInfo di=om.readValue(information,DependentInfo.class);
		// Profession p=om.readValue(information,Profession.class);
		// CustomerVerification cv=om.readValue(information,CustomerVerification.class);
		// LoanDisbursement  ld=om.readValue(information,LoanDisbursement.class);
		 //SanctionLetter sl=om.readValue(information,SanctionLetter.class);
		// CustomerAddress ca=om.readValue(information,CustomerAddress.class);
		 
		// Customer c=om.readValue(information,Customer.class);
		Customer co=new Customer();
		co.setAllpersonaldocs(docs);
		co.setMortgageDetails(mortgage);
		co.setPropertyinfo(propertyInfo);
		co.setBankAccountDetails(md.getBankAccountDetails());
		co.setCustomerverification(md.getCustomerverification());
		co.setDependentInfo(md.getDependentInfo());
		co.setGuarantordetails(md.getGuarantordetails());
		co.setLoandisbursement(md.getLoandisbursement());
		co.setProfession(md.getProfession());
		co.setSanctionletter(md.getSanctionletter());
		co.setCustomerAdditionalMobileNumber(md.getCustomerAdditionalMobileNumber());
		co.setCustomerAge(md.getCustomerAge());
		co.setCustomerDateOfBirth(md.getCustomerDateOfBirth());
		co.setCustomerEmail(md.getCustomerEmail());
		co.setCustomerGender(md.getCustomerGender());
		co.setCustomerMobileNumber(md.getCustomerMobileNumber());
		co.setCustomerName(md.getCustomerName());
		co.setCustomerTotalLoanRequired(md.getCustomerTotalLoanRequired());
		co.setCustomerAddress(md.getCustomerAddress());
		cs.savaCustomer(co);
		return "Customer Save Successfully...";
	}
	
	@GetMapping("/getCustomer")
	public List<Customer> getCustomer()
	{
		 List<Customer> list= cs.getCustomer();
		return list;
	}
	
	@GetMapping("/getById/{customerId}")
	public Customer getById(@PathVariable Integer customerId)
	{
		Customer c=cs.getById(customerId);
		return c;
	}
	
	@PutMapping("/updateCustomer/{customerId}")
	public String updateCustomer(@RequestBody Customer c)
	{
		cs.savaCustomer(c);
		return "updated Successfully...";
	}
	
	@DeleteMapping("/deleteCustomer/{customerId}")
	public String deleteCustomer(@PathVariable Integer customerId )
	{
		cs.deleteCustomer(customerId);
		return "Deleted  Successfully...";
	}
}
