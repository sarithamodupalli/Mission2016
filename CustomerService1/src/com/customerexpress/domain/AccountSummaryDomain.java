package com.customerexpress.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customerexpress.dao.AccountSummaryDAO;
import com.customerexpress.dao.CreditCardDAO;
import com.customerexpress.model.AccountSummaryModel;
import com.customerexpress.model.CreditCardModel;

@Service
public class AccountSummaryDomain {
	
	@Autowired
	AccountSummaryDAO accountSummaryDAO;
	
	public void getSummaryDetails(AccountSummaryModel accountSummaryModel){
		accountSummaryDAO.saveAccountSummary(accountSummaryModel);
	}

}
