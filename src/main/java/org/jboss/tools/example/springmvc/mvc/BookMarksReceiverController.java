package org.jboss.tools.example.springmvc.mvc;

import javax.validation.Valid;

import org.jboss.tools.example.springmvc.domain.BookMarks;
import org.jboss.tools.example.springmvc.repo.BookMarksDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/addbookmarks/poststring")
public class BookMarksReceiverController {
	
	@Autowired
	private BookMarksDao bd;

	@RequestMapping(method=RequestMethod.GET)
	public String receiveBookMarks(Model model){
		
		model.addAttribute("bookMarks",new BookMarks());
		model.addAttribute("bookMarksList", bd.findAllBookMarks());
		return "bookmarks";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String receiveBookMarks(@Valid @ModelAttribute("bookMarks") BookMarks bookMarks,BindingResult result, Model model){
		if(!result.hasErrors()){
			System.out.println(bookMarks.getName());
			bd.saveBookMark(bookMarks);
			
			model.addAttribute("bookMarks",new BookMarks());
			model.addAttribute("bookMarksList", bd.findAllBookMarks());
		}
		
		System.out.println(">>>>>"+bd.getBookNum());
		return "redirect:/addbookmarks/poststring";
	}

}
