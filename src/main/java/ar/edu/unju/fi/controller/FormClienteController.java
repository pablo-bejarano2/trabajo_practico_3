package ar.edu.unju.fi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FormClienteController {
	@GetMapping("/form")
	public String getIndex() {
		return "form-cliente";
	}
}
