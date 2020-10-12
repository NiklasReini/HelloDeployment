package com.example.week2.web;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.week2.model.Message;


import org.springframework.ui.Model;
@Controller
public class HelloController {
@RequestMapping(value="/hello",method=RequestMethod.GET)
	
public String greeting(@RequestParam(value="name") String name, @RequestParam(value="age") int age , Model model) {
	
	model.addAttribute("name", name);
	model.addAttribute("age", age);
	
	return "hello";
}
@RequestMapping("/message")
	public String messages(Model model) {
		
		List<Message> messages = new ArrayList<Message>();
		Message msg1 = new Message(1, "greeting", "Whats up?");
		Message msg2 = new Message(2, "greeting", "Hello");

		messages.add(msg1);
		messages.add(msg2);
		
		model.addAttribute("messages", messages);
	
	return "List";
}
}