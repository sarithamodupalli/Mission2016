package com.customerexpress.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.customerexpress.domain.AccountSummaryDomain;
import com.customerexpress.model.AccountSummaryModel;

@Controller
public class AccountSummaryController {

	@Autowired
	AccountSummaryDomain accountSummaryDomain;

	@RequestMapping(value = "/getsummary")
	public ModelAndView getAccountSummary() {
		ModelAndView model = new ModelAndView("accountsummary");
		AccountSummaryModel accountSummaryModel = new AccountSummaryModel();
		model.addObject(accountSummaryModel);
		return model;
	}

	@RequestMapping(value = "/savesummarydetails")
	public ModelAndView summary(@ModelAttribute("accountSummaryModel") AccountSummaryModel accountSummaryModel) {
		accountSummaryDomain.getSummaryDetails(accountSummaryModel);
		ModelAndView model = new ModelAndView("successpage");
		return model;
	}
}
