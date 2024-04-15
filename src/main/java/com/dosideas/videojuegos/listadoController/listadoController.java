package com.dosideas.videojuegos.listadoController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import com.dosideas.videojuegos.service.videojuegoService;
import com.dosideas.videojuegos.domai.videojuego;
import java.util.List;
import org.springframework.web.bind.annotation.RequestParam;

//PASO1
// es lo primero que se hace en el proyecto para la vista 


@Controller
public class listadoController {

    // PASO 3 CREAR EL FINAL PARA LLAMAR AL SERVICE Y LUEGO AGREGARLE EL MODEL AL PRIMER REQUESTMAPING
    private final videojuegoService videojuegoService;

    public listadoController(videojuegoService videojuegoService) {
        this.videojuegoService = videojuegoService;
    }

    @RequestMapping("/")
    public String listarVideojuegos(Model model){
    // busqueda de los videojuegos
        List<videojuego> destacados = videojuegoService.buscarDestacados();
        model.addAttribute("videojuego",destacados);
        return "listado";
    }


    @RequestMapping("/videojuegosporDistribuidor")
    public String listarVideojuegosporDstribuidor(int distribuidor_id, Model model){
        List<videojuego> juegos = videojuegoService.buscarporDistribuidor(distribuidor_id);
        model.addAttribute("videojuego", juegos);
        return "listado";
    }
    
    @RequestMapping("/buscar")
    public String buscar(@RequestParam("q") String consulta, Model model){
        List<videojuego> juego= videojuegoService.buscar(consulta);
        model.addAttribute("videojuego", juego);
        return "listado";
    }
    

}
