package com.example.springwebflux.thymeleaf.taedd_springwebflux_thymeleaf.Repositorio;

import com.example.springwebflux.thymeleaf.taedd_springwebflux_thymeleaf.Entidad.Producto;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductoRepositorio {

    private static List<Producto> lista = new ArrayList<>();
    private static List<Producto> lista2 = new ArrayList<>();

    static{
        lista.add(new Producto(1, "Smartphone", 1200));
        lista.add(new Producto(2, "Camara", 800));
        lista.add(new Producto(3, "Router Wi-Fi", 600));
        lista.add(new Producto(4, "Impresora Laser", 700));
        lista.add(new Producto(5, "Gafas de realidad virtual", 1000));
        lista.add(new Producto(6, "Disco Duro", 400));
        lista.add(new Producto(7, "Robot aspirador", 1500));
        lista.add(new Producto(8, "Auriculares inalambricos", 600));
        lista.add(new Producto(9, "Tablet", 500));
        lista.add(new Producto(10, "Reloj inteligente (Smartwatch)", 350));

        lista2.add(new Producto(11, "Televisor 4K", 900));
        lista2.add(new Producto(12, "Laptop Gaming", 1500));
        lista2.add(new Producto(13, "Altavoz Inteligente", 120));
        lista2.add(new Producto(14, "Cargador Inalámbrico", 50));
        lista2.add(new Producto(15, "Tablet Gráfica", 400));
        lista2.add(new Producto(16, "Mouse Gamer", 80));
        lista2.add(new Producto(17, "Teclado Mecánico", 120));
        lista2.add(new Producto(18, "Auriculares con cancelación de ruido", 250));
        lista2.add(new Producto(19, "Consola de Videojuegos Retro", 200));
        lista2.add(new Producto(20, "Cámara de Seguridad Inteligente", 150));

    }

    public Flux<Producto> buscarTodos(){
        return Flux.fromIterable(lista).delayElements(Duration.ofSeconds(3));
    }

    public Flux<Producto> buscarOtros(){
        return Flux.fromIterable(lista2).delayElements(Duration.ofSeconds(3));
    }
}
