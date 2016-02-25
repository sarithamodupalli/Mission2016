package com.customerexpress.dao;

import java.util.ArrayList;
import java.util.Iterator;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.springframework.stereotype.Component;
import com.customerexpress.model.DebitCardModel;
import com.customerexpress.util.HibernateUtil;

@Component
public class DebitCardDAO {
	static ArrayList<DebitCardModel> arrayList = new ArrayList<DebitCardModel>();

	public void saveDebitCardIssues(DebitCardModel debitCardModel) {
		arrayList.add(debitCardModel);
		Session 	session= HibernateUtil.getHibenateSession();
		Transaction tx = session.beginTransaction();
		session.save(debitCardModel);
		tx.commit();
		
	}

	public ArrayList<DebitCardModel> getDebitCardIssues() {

		ArrayList<DebitCardModel> dbArrayList = new ArrayList<DebitCardModel>();
		Session 	session= HibernateUtil.getHibenateSession();
		String sql_query = "from  com.customerexpress.model.DebitCardModel";
		Query query = session.createQuery(sql_query);

		for (Iterator it = query.iterate(); it.hasNext();) {
			DebitCardModel debitCardModel = (DebitCardModel) it.next();

			dbArrayList.add(debitCardModel);

			System.out.println("AccountId: " + debitCardModel.getAccountId());
			System.out.println("IssueType: " + debitCardModel.getIssueType());
			System.out.println("IssueType: " + debitCardModel.getIssueDesc());
		}

		session.close();

		return dbArrayList;

	}
}
