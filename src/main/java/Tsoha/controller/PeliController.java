/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tsoha.controller;

import Tsoha.service.PeliService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PeliController {

    @Autowired
    private PeliService peliService;

    @RequestMapping(value = "/home")
    public String home(Model model) {
        model.addAttribute("pelit", peliService.listAll());
        model.addAttribute("genret", genreService.listAll());
        return "list";
    }
    
    @RequestMapping(value = "poista/{peliId}")
    public String poista(@PathVariable Integer peliId){
        
        return "main";
    }

}
