package com.example.springwebflux.thymeleaf.taedd_springwebflux_thymeleaf.Servicio;

import com.example.springwebflux.thymeleaf.taedd_springwebflux_thymeleaf.Entidad.Producto;
import com.example.springwebflux.thymeleaf.taedd_springwebflux_thymeleaf.Repositorio.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class ProductoServicio {

    @Autowired
    private ProductoRepositorio productoRepositorio;
    public Flux<Producto> buscarTodos(){
        Flux<Producto> flux1 = productoRepositorio.buscarTodos();
        Flux<Producto> flux2 = productoRepositorio.buscarOtros();
        return Flux.merge(flux1,flux2);
    }
}
