package com.customerexpress.domain;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.customerexpress.dao.DebitCardDAO;
import com.customerexpress.model.DebitCardModel;


@Service
public class DebitCardDomain {
	@Autowired
	DebitCardDAO debitCardDAO;

	public void saveDebitIssues(DebitCardModel debitCardModel) {
		debitCardDAO.saveDebitCardIssues(debitCardModel);
	}
	public ArrayList<DebitCardModel> getDebitIssues() {
		return debitCardDAO.getDebitCardIssues();

	}
	}


