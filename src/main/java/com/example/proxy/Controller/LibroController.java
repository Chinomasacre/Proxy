package com.example.proxy.Controller;

import com.example.proxy.Domains.PaginaWeb;
import com.example.proxy.Domains.Proxy.AccesProxy;
import com.example.proxy.Domains.ILibro;
import com.example.proxy.Domains.Libro;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/obtener")
public class LibroController {
    @GetMapping("leer/{tipousuario}")
    public String obtenerLibro(@PathVariable("tipousuario") String tipousuario) {

        ILibro libro = new AccesProxy(new Libro(), tipousuario);

        return libro.Leer();
    }

    @PostMapping("descargar/{tipousuario}")
    public String descargarLibro(@PathVariable("tipousuario") String tipousuario, @RequestBody PaginaAbstract pagina) {
        PaginaWeb.AgregarPagina("www.libros.com");
        PaginaWeb.AgregarPagina("www.libros2.com");


        ILibro libro = new AccesProxy(new Libro(), tipousuario);

        return libro.Descargar(pagina.getPagina());
    }
}
