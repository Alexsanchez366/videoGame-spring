
package com.dosideas.videojuegos.listadoController;

import com.dosideas.videojuegos.domai.videojuego;
import com.dosideas.videojuegos.service.distribuidorService;
import com.dosideas.videojuegos.service.videojuegoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class videojuegoAbmController {
    
    private final distribuidorService distribuidorService;
    private final videojuegoService videojuegoService;

    public videojuegoAbmController(distribuidorService distribuidorService, videojuegoService videojuegoService) {
        this.distribuidorService = distribuidorService;
        this.videojuegoService = videojuegoService;
    }
    

   
    
    @RequestMapping("/videojuego/crear")
    public String mostrarFormAlta(Model model){
        model.addAttribute("distribuidores", distribuidorService.buscarTodos());
        model.addAttribute("videojuego", new videojuego());
        return "formvideojuego";
    }
    
     @PostMapping("/videojuego/guardar")
     public String guardar(videojuego videojuego){
         videojuegoService.guardar(videojuego);
         //System.out.println(videojuego);
         return "redirect:/";
     }
    
    
}
