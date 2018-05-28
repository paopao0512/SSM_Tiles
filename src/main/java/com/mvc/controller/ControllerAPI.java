package com.mvc.controller;

import com.mvc.model.TypeClass;
import com.mvc.model.Student;
import com.mvc.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/rest")
public class ControllerAPI {

	@Autowired
	private PersonService personService;

	@RequestMapping(value = "/home")
	public String queryWork(Model model)throws Exception{
		int student = personService.queryWork(1);
		int student1 = personService.queryWork(0);
		List<Student> student2 = personService.queryGood(1);
		System.out.println(student+"wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww");
		System.out.println(student1+"fffffffffffffffffffffffffffffffffffffffff");
		System.out.println(student2+"rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
		model.addAttribute("items1",student1);
		model.addAttribute("items",student);
		model.addAttribute("items2",student2);
		return "homepage";
	}
	@RequestMapping(value = "/pro")
	public String profession(Model model)throws Exception{
		TypeClass typeClass = personService.queryDirection("前端");
		int student = personService.queryType("WEB");
		System.out.println(typeClass+"rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
		model.addAttribute("items",typeClass);
		model.addAttribute("item",student);
		return "profession";
	}
}