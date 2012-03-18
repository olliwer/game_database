package Tsoha.controller;

import Tsoha.domain.Peli;
import Tsoha.service.PeliService;
import Tsoha.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PlayerController {
 
    @Autowired
    private PeliService peliService;
    
    @Autowired
    private GenreService genreService;
    
    @RequestMapping(value="/test1", method = RequestMethod.GET)
    public String list(Model model){
        model.addAttribute("pelit", peliService.listAll());
        return "index";
    }
    
    @RequestMapping(value="/peli", method = RequestMethod.GET)
    public String getPeli(Model model){
        model.addAttribute("peli", new Peli());
        model.addAttribute("genret", genreService.listAll());
        return "index";
    }
}

