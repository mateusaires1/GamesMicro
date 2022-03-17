package br.com.checkpoint.checkpoint1_micro.controllers;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.checkpoint.checkpoint1_micro.model.Games;

@Controller
public class GamesController {
	
	@GetMapping("/games")
	public ModelAndView index() {
		ModelAndView modelView = new ModelAndView("games/index");
		Games game1 = new Games((long) 1, "God of War", 115, new BigDecimal(150), 2018, 16);
		Games game2 = new Games((long) 2, "The Witcher 3", 100, new BigDecimal(90), 2015, 16);
		Games game3 = new Games((long) 3, "Spider Man - Miles Morales", 115, new BigDecimal(250), 2021, 16);
		
		List<Games> games = Arrays.asList(game1, game2, game3);
		modelView.addObject("listarGames", games);
		
		return modelView;
	}

}
