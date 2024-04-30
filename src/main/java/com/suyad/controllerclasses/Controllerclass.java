package com.suyad.controllerclasses;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.suyad.Entity.Books;
import com.suyad.Repository.BooksRepo;

@Controller
public class Controllerclass 
{
	@Autowired
	BooksRepo p;
	
	@GetMapping("/book")
	public ModelAndView getBookbyId(@RequestParam("id")Integer id)
	{
		
		ModelAndView m = new ModelAndView();
		Optional<Books> findById = p.findById(id);
		if(findById.isPresent())
		{
			Books books = findById.get();
			m.addObject("msg", "Book details for yours given ID = "+id);
			m.addObject("book", books);
		}
		else
		{
			m.addObject("msg", "No book is available for yours given ID = "+id);
		}
		m.setViewName("index");
		return m;
	}
	
	@GetMapping("/books")
	public String getBookbyIds(@RequestParam("id")Integer id,Model m)
	{
		
		
		Optional<Books> findById = p.findById(id);
		if(findById.isPresent())
		{
			Books books = findById.get();
			m.addAttribute("msg", "Book details for yours given ID = "+id);
			m.addAttribute("book", books);
		}
		else
		{
			m.addAttribute("msg", "No book is available for yours given ID = "+id);
		}
		
		return "index";
	}

}
