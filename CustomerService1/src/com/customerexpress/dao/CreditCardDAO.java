package com.customerexpress.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;
import com.customerexpress.model.CreditCardModel;
import com.customerexpress.util.HibernateUtil;

@Component
public class CreditCardDAO {
	public void saveCreditCardIssues(CreditCardModel creditCardModel){
		Session session= HibernateUtil.getHibenateSession();
		Transaction tx = session.beginTransaction();
		session.save(creditCardModel);
		tx.commit();
		
	}

}
