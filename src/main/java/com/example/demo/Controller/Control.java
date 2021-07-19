package com.example.demo.Controller;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.example.demo.DAO.studentDAO;
import com.example.demo.Entity.student;

@RestController
public class Control {
	
	@Autowired
	studentDAO st;
	
	@GetMapping("/")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("home");
		
		return mv;
	}
	
	@GetMapping("add")
	public RedirectView add(student std) {
		
		st.save(std);
		RedirectView rv = new RedirectView("/");
		
		//return "redirect:home";
		return rv;
	}
	
	
	@GetMapping("search")
	public ModelAndView requestMethodName(String sname) {
		ModelAndView mv = new ModelAndView("liste");
		List<student> std = st.findTop3BySname(sname);
		mv.addObject("liste",std);
		return mv;
	}
	
	
	@GetMapping(path="allstudents",produces= {"application/json"})
	public List<student> allstudents() {
		
		return st.findAll();
		
	}
	
	@GetMapping("allstudents/{aid}")
	public Optional<student> student(@PathVariable int aid) {
		
		return st.findById(aid);
		
	}
	
	@PostMapping("/sending")
	public student sendData(student std) {
		st.save(std);
		return std;
	}
	
	@DeleteMapping("/delete/{sid}")
	public String deletedata(@PathVariable int sid) {
		student s = st.getOne(sid);
		student p =s;
		st.delete(s);
		return "deleted"+p;
		
	}
	
	@PutMapping("/update")
	public student putMethodName(@RequestBody student s) {
		
		st.save(s);
		
		return s;
	}






}
