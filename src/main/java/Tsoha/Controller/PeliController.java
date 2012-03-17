/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tsoha.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PeliController {

    @RequestMapping(value = "toka")
    public String toka() {
        System.out.println("moro");
        return "index";
    }

    @RequestMapping(value="osoite", method=RequestMethod.POST)
    public String eka() {
        System.out.println("moro1");
        return "redirect:/main";
    }
    
    @RequestMapping(value = "main")
    public String main() {
        System.out.println("mainissa");
        return "main";
    }
}
