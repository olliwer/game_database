/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tsoha.controller;

import Tsoha.domain.Peli;
import Tsoha.domain.Genre;
import Tsoha.service.GenreService;
import Tsoha.service.PeliService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PeliController {

    @Autowired
    private PeliService peliService;
    
    @Autowired
    private GenreService genreService;

    @RequestMapping(value = "*")
    public String kuuntele(){
        return "/lisaa";
    }
    
    @RequestMapping(value = "lisaaPeli",method = RequestMethod.POST)
    public String lisaa(@ModelAttribute Peli peli){
        peli = peliService.add(peli);
        return "redirect:/listaa";
    }
    
     @RequestMapping(value = "lisaaGenre",method = RequestMethod.POST)
    public String lisaaGenre(@ModelAttribute Genre genre){
        genre = genreService.add(genre);
        return "redirect:/listaa";
    }

    @RequestMapping(value = "listaa")
    public String listaaPelitJaGenret(Model model){
        model.addAttribute("pelit", peliService.listAll());
        model.addAttribute("genret", genreService.listAll());
        return "listaa";
    }
    
    @RequestMapping(value = "kommentoi/{peliId}")
    public String kommentoiPelia(@PathVariable Integer peliId, Model model){
        model.addAttribute("games", peliService.findPeli(peliId));
        return "kommentoi";  
    }
    
 
    
    @RequestMapping(value = "/lisaa")
    public String lisaaKuuntelija(){
        return "lisaa";
    }
}
