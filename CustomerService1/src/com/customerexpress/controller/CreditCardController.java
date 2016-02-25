package com.customerexpress.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.customerexpress.domain.CreditCardDomain;
import com.customerexpress.model.CreditCardModel;

@Controller
public class CreditCardController {
	@Autowired
	private CreditCardDomain creditCardDomain;
	
	@RequestMapping(value = "/logcreditissue")
	public ModelAndView createCreditIssues(){
		ModelAndView model = new ModelAndView("createcreditissue");
		CreditCardModel creditCardModel = new CreditCardModel();
		model.addObject(creditCardModel);
		return model;
	}
	
	@RequestMapping(value = "/savecreditissue")
	public ModelAndView creditcard(@ModelAttribute("creditCardModel") CreditCardModel creditCardModel){
		creditCardDomain.saveCreditIssues(creditCardModel);
		ModelAndView model = new ModelAndView("successpage");
		return model;
		
	}

}
