package com.cog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cog.entity.Member;
import com.cog.service.MemberService;

@Controller
public class MemberController {
	
	@Autowired
	MemberService service;
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String addMember(@RequestParam String name, @RequestParam Double salary, Model model){
		
		Member member = new Member(name, salary);
		
		boolean result = service.addMember(member);
		String message;
		if(result){
			message = "Registration Successful";
		}
		else{
			message = "Registration Failure";
		}
		
		model.addAttribute("msg", message);
		return "member.jsp";
	}

}