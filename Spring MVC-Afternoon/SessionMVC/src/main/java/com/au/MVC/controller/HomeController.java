package com.au.MVC.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.au.MVC.controller.exception.StudentNotFound;
import com.au.MVC.controller.exception.StudentExist;
import com.au.MVC.controller.service.Student;
import com.au.MVC.controller.service.ServiceNew;

@Controller
public class HomeController {

	@Autowired
	ServiceNew service;
	
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	
	@RequestMapping(value="/StudentList")
	public ModelAndView getAlldata(HttpServletResponse response) throws IOException{
		ArrayList<Student> list = service.getAlldata();
		ModelAndView model = new ModelAndView("DisplayData");
		model.addObject("list",list);
		return model;
	}	

	@RequestMapping(value="/insert", method = RequestMethod.POST)
	public ModelAndView welcome(@RequestParam("id") int id,@RequestParam("firstname") String firstname,@RequestParam("lastname") String lastname,@RequestParam("dept") String dept) throws Exception{		
		if(!service.insert(new Student(id,firstname,lastname,dept)))
			throw new StudentExist(id);
		ModelAndView model = new ModelAndView("newData");
		model.addObject("id",id);
		model.addObject("firstname",firstname);
		return model;
	}

	@RequestMapping(value="/update", method = RequestMethod.POST)
	public ModelAndView update(@RequestParam("id") int id,@RequestParam("firstname") String firstname,@RequestParam("lastname") String lastname,@RequestParam("dept") String dept) throws Exception{		
		if(!service.update(id, new Student(id,firstname,lastname,dept)))
			throw new StudentExist(id);
		ModelAndView model = new ModelAndView("newData");
		model.addObject("id",id);
		model.addObject("firstname",firstname);
		return model;
	}
	
	@RequestMapping(value="/update/{id}")
	public ModelAndView updateItem(@PathVariable int id) throws Exception
	{
		Student obj  = service.getStudent(id);
		if(obj == null)
			throw new StudentNotFound(id);
		
		ModelAndView model = new ModelAndView("update");
		model.addObject("id",obj.getId());
		model.addObject("firstname",obj.getFirstname());
		model.addObject("lastname",obj.getLastname());
		model.addObject("dept",obj.getDept());
		return model;
		
	}
	
	@RequestMapping(value="/delete/{id}")
	public ModelAndView deleteItem(@PathVariable int id) throws Exception
	{
		if(!service.delete(id))
			throw new StudentNotFound(id);
		return new ModelAndView("redirect:/StudentList");
	}
}
