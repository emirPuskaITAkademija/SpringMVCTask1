package com.itakademija;

import java.util.Random;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HelloController {
    
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String printHello(ModelMap modelMap){
        Random random = new Random();
        int slucajni = 1+ random.nextInt(10);
        //message ćemo koristiti unutar .jsp
        modelMap.addAttribute("message", "Pozdrav iz Spring MVC aplikacije");
        modelMap.addAttribute("slucajan", "Slučajna vrijednost: " + slucajni);
        return "hello"; // ime view komponente
    }
}
