
package com.demo.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greetings {
	
@RequestMapping(value="/hello",method=RequestMethod.POST)
public String sayHello(String name)
{
	return "Hello "+name;
}

}
