package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UiController {
	@Autowired
	uuidrepo repo;
	@GetMapping("/")
	public String generator() {
		return "uiidgen";
	}

	@RequestMapping("generated")
	public String generated(UUIDClass uuid) {
		repo.save(uuid);
		return "result";
}
	@PostMapping("/UUIDs")
	public ModelAndView viewUUIDS(@RequestParam int id ) {
		ModelAndView mv = new ModelAndView("retrieve");
		UUIDClass uuid = repo.findById(id).orElse(null);
		mv.addObject(uuid);
		return mv;
	}

}
