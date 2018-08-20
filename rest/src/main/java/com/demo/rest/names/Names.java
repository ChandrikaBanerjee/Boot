package com.demo.rest.names;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Names {
	@Autowired
	private NamesService namesService;

	@RequestMapping("/names")
	public List<NamesInput> getAllNames() {
		return namesService.getAllNames();
	}

	@RequestMapping("/names/{id}")
	public NamesInput getName(@PathVariable("id") int id) {
		return namesService.getName(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/names")
	public void addName(@RequestBody NamesInput name) {
		namesService.addName(name);
	}
	@RequestMapping(method = RequestMethod.PUT, value = "/names/{id}")
	public void updateName(@RequestBody NamesInput name,@PathVariable("id") int id) {
		namesService.updateName(id,name);
	}
	@RequestMapping(method = RequestMethod.DELETE,value="/names/{id}")
	public void deleteName(@PathVariable("id") int id) {
		 namesService.deleteName(id);
	}
}
