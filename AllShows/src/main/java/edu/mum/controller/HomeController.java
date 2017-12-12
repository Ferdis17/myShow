package edu.mum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import edu.mum.service.CommentService;
import edu.mum.service.TVSerieService;

@Controller
public class HomeController {
	
	 @Autowired
	    TVSerieService tvSerieService;

	    @Autowired
	    CommentService commentService;

	    @GetMapping({"/", "/home"})
	    public String home(Model model) {
	        model.addAttribute("featureTvSeries", tvSerieService.getFeatureTVSeries());
	       // model.addAttribute("frontpageDeals", dealService.getFrontpageDeals());

	        return "home";
	    }

}
