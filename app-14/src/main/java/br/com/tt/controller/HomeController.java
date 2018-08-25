package br.com.tt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String home() {
		
		return "home";
		
			
//		@GetMapping("/teste")
//		public String meuTeste();{
//			return "teste";
//		}
		
	}
}
