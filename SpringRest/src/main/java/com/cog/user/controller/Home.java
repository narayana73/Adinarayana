package com.cog.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cog.user.entity.NewUser;
import com.cog.user.repo.UserRepository;

@Controller
@RequestMapping("/test")
public class Home {
	
	@Autowired
	UserRepository userRepository;

	public UserRepository getUserRepository() {
		return userRepository;
	}

	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@RequestMapping(method = RequestMethod.GET)
    public String helloWorld(Model model) {
		System.out.println("Web MVC Controller");
		NewUser user = new NewUser("gopal");
		userRepository.addMember(user);
        model.addAttribute("message", "Hello World Get!");
        return "hello.jsp";
    }
	
}

