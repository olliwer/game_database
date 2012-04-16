/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tsoha.controller;

import Tsoha.domain.Peli;
import Tsoha.domain.Genre;
import Tsoha.domain.Kommentti;
import Tsoha.domain.Arvostelu;
import Tsoha.service.GenreService;
import Tsoha.service.KommenttiService;
import Tsoha.service.PeliService;
import Tsoha.service.ArvosteluService;
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
    @Autowired
    private KommenttiService kommenttiService;
    @Autowired
    private ArvosteluService arvosteluService;

    @RequestMapping(value = "*")
    public String kuuntele() {
        return "redirect:/home";
    }

    @RequestMapping(value = "lisaaPeli", method = RequestMethod.POST)
    public String lisaa(@ModelAttribute Peli peli) {
        peli = peliService.add(peli);
        return "redirect:/listaa";
    }

    @RequestMapping(value = "lisaaGenre", method = RequestMethod.POST)
    public String lisaaGenre(@ModelAttribute Genre genre) {
        genre = genreService.add(genre);
        return "redirect:/listaa";
    }

    @RequestMapping(value = "lisaaArvostelu", method = RequestMethod.POST)
    public String lisaaArvostelu(@ModelAttribute Arvostelu arvostelu) {
        arvostelu = arvosteluService.add(arvostelu);
        return "redirect:/listaa";
    }

    @RequestMapping(value = "listaa")
    public String listaaPelitJaGenretJaArvostelut(Model model) {
        model.addAttribute("pelit", peliService.listAll());
        model.addAttribute("genret", genreService.listAll());
        model.addAttribute("arvostelut", arvosteluService.listAll());
        return "listaa";
    }

    @RequestMapping(value = "kommentoi/{peliId}")
    public String kommentoiPelia(@PathVariable Integer peliId, Model model) {
        System.out.println(peliService.findPeli(peliId).getNimi());
        model.addAttribute("games", peliService.findPeli(peliId));
        return "kommentoi";
    }

    @RequestMapping(value = "lisaaKommentti")
    public String lisaaKommentti(@ModelAttribute Kommentti kommentti) {
        kommenttiService.add(kommentti);
        //model..
        return "listaa";
    }

    @RequestMapping(value = "/lisaa")
    public String lisaaKuuntelija() {
        return "lisaa";
    }

    @RequestMapping(value = "/home")
    public String home() {
        return "home";
    }
}
