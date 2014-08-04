package org.jboss.tools.example.springmvc.mvc;

import java.util.List;

import javax.validation.Valid;

import org.jboss.tools.example.springmvc.domain.BookMarks;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/addbookmarks/poststring")
public class BookMarksReceiverController {


	@RequestMapping(method=RequestMethod.GET)
	public String receiveBookMarks(Model model){
		model.addAttribute("bookMarks",new BookMarks());
		return "bookmarks";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String receiveBookMarksString(@Valid @ModelAttribute("bookMarks") BookMarks bookMarks,BindingResult result, Model model){
		if(!result.hasErrors()){
			System.out.println(bookMarks.getName());
		}
		model.addAttribute("bookMarks",new BookMarks());
		return "redirect:/addbookmarks/poststring";
	}

}
