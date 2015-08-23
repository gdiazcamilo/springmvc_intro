package local.gdiaz.fitnesstracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import local.gdiaz.fitnesstracker.model.Exercise;

@Controller
public class MinutesController {

	@RequestMapping(value = "/addMinutes")
	public String addMinutes(@ModelAttribute("exercise") Exercise exercise) {
		
		System.out.println(exercise.getMinutes());
		
		return "addMinutes"; 
	}
	
	/*@RequestMapping(value = "/addMoreMinutes")
	public String addMoreMinutes(@ModelAttribute("exercise") Exercise exercise) {
		
		System.out.println(exercise.getMinutes());
		
		return "addMinutes";
	}*/
	
}
