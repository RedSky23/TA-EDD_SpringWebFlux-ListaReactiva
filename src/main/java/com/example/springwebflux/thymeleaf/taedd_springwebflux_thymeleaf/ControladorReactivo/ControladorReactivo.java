package com.example.springwebflux.thymeleaf.taedd_springwebflux_thymeleaf.ControladorReactivo;

import com.example.springwebflux.thymeleaf.taedd_springwebflux_thymeleaf.Servicio.ProductoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.spring5.context.webflux.IReactiveDataDriverContextVariable;
import org.thymeleaf.spring5.context.webflux.ReactiveDataDriverContextVariable;

@Controller
public class ControladorReactivo {

    @Autowired
    private ProductoServicio productoServicio;

    @RequestMapping("/lista")
    public String listarProductos(Model model){
        //Esta variable es reactiva, emite elementos de forma asincrona
        IReactiveDataDriverContextVariable listaReactiva =
                new ReactiveDataDriverContextVariable(productoServicio.buscarTodos(), 1);
        model.addAttribute("listaProductos", listaReactiva);

        return "lista";
    }
}

