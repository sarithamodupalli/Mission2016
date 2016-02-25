package com.customerexpress.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.customerexpress.domain.DebitCardDomain;
import com.customerexpress.model.DebitCardModel;

@Controller
public class DebitCardController {

	@Autowired
	private DebitCardDomain debitCardDomain;

	@RequestMapping(value = "/homepage")
	public ModelAndView homePage() {
		ModelAndView model = new ModelAndView();
		model.setViewName("homepage");
		return model;
	}

	@RequestMapping(value = "/logissue")
	public ModelAndView loggingDebitCardIssue() {
		ModelAndView model = new ModelAndView("createissue");
		DebitCardModel debitCard = new DebitCardModel();
		model.addObject(debitCard);
		return model;
	}

	@RequestMapping(value = "/debitcardsave")
	public ModelAndView debitcard(@ModelAttribute("debitCardModel") DebitCardModel debitCardModel) {
		debitCardDomain.saveDebitIssues(debitCardModel);
		ArrayList<DebitCardModel> list = debitCardDomain.getDebitIssues();
		ModelAndView model = new ModelAndView();
		model.setViewName("successpage");
		model.addObject("list", list);
		return model;
	}

	@RequestMapping(value = "/listofissues")
	public ModelAndView getListOfIssues() {
		ArrayList<DebitCardModel> list = debitCardDomain.getDebitIssues();
		ModelAndView model = new ModelAndView();
		model.setViewName("issuesInfo");
		model.addObject("list", list);
		return model;
	}
}