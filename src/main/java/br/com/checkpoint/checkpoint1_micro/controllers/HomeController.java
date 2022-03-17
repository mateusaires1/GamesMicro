package br.com.checkpoint.checkpoint1_micro.controllers;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/home")
	public String home(HttpServletRequest request) {
		request.setAttribute("nomeUsuario", "Mateus Aires rm 84350 e Eduardo Yoshio rm ");
		
		return "home";
	}

}
