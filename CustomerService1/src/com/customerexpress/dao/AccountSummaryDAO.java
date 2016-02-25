package com.customerexpress.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;
import com.customerexpress.model.AccountSummaryModel;
import com.customerexpress.util.HibernateUtil;

@Component
public class AccountSummaryDAO {
	public void saveAccountSummary(AccountSummaryModel accountSummaryModel) {
		Session session = HibernateUtil.getHibenateSession();
		Transaction tx = session.beginTransaction();
		session.save(accountSummaryModel);
		tx.commit();
	}
}
