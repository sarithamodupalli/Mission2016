package com.customerexpress.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.customerexpress.dao.CreditCardDAO;
import com.customerexpress.model.CreditCardModel;

@Service
public class CreditCardDomain {
	
	@Autowired
	CreditCardDAO creditCardDAO;
	
	public void saveCreditIssues(CreditCardModel creditCardModel){
		creditCardDAO.saveCreditCardIssues(creditCardModel);
	}

}
