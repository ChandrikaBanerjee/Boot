package com.example.RestfulJsp.controller;

import java.util.List;

import org.apache.catalina.loader.ResourceEntry;
import org.springframework.beans.factory.xml.ResourceEntityResolver;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.example.RestfulJsp.pojo.Employee;

@Controller
public class JspController {

	@RequestMapping("/employeemongo")
	public String home(Model model)
	{
		RestTemplate restTemplate=new RestTemplate();
		
		List<Employee> resources = restTemplate.getForObject("http://localhost:8080/employeemongo", List.class);
		model.addAttribute("employeemongo", resources);
		
		
		
		return "employeemongo";
	}
}
