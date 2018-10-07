package br.com.tt.app27.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String index() {
		return "index";
	}
	@GetMapping("/teste")
	public String teste() {
		return "page";
	}

	

}
