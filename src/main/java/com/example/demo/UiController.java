package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UiController {
	@Autowired
	uuidrepo repo;
	
	@RequestMapping("/")
	public String generator() {
		return "uiidgen";
	}

	@RequestMapping("/uiidgen")
	public String generated(UUIDClass uuid) {
		repo.save(uuid);
		return "uiidgen";
}

//	@PostMapping("/retrieve")
//	public ModelAndView viewUUIDS(@RequestParam int id ) {
//		ModelAndView mv = new ModelAndView("retrieve");
//		UUIDClass uuid = repo.findById(id).orElse(null);
//		mv.addObject(uuid);
//		return mv;
//	}
	
	@RequestMapping("/UUID/list")
	@ResponseBody
	public List<UUIDClass> getUUids() {
		return repo.findAll();
		}
}
