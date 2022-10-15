package com.cjc.homeloanmanagement.app.serviceI;

import java.util.List;

import com.cjc.homeloanmanagement.app.model.AllPersonalDocuments;

public interface AllPersonalDocumentsServiceI {

	void savePersonalDocuments(AllPersonalDocuments docs);

	List<AllPersonalDocuments> getPersonalDocumets();

	void deletePersonalDocuments(Integer documentId);

}
