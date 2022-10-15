package com.cjc.homeloanmanagement.app.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.homeloanmanagement.app.model.AllPersonalDocuments;
import com.cjc.homeloanmanagement.app.repositoryI.AllPersonalDocumentsRepositoryI;
import com.cjc.homeloanmanagement.app.serviceI.AllPersonalDocumentsServiceI;

@Service
public class AllPersonalDocumentsServiceImpl implements AllPersonalDocumentsServiceI{

	@Autowired
	AllPersonalDocumentsRepositoryI apdr;

	@Override
	public void savePersonalDocuments(AllPersonalDocuments docs) {
		try {
			apdr.save(docs);
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

	@Override
	public List<AllPersonalDocuments> getPersonalDocumets() {
		
		return apdr.findAll();
	}

	@Override
	public void deletePersonalDocuments(Integer documentId) {
		apdr.deleteById(documentId);
		
	}
}
