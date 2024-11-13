package com.example.proxy.Domains.Proxy;

import com.example.proxy.Domains.ILibro;
import com.example.proxy.Domains.Libro;
import com.example.proxy.Domains.PaginaWeb;

public class AccesProxy implements ILibro {
    private Libro Libro;
    private String UsuarioTipo;

    public AccesProxy() {
    }

    public AccesProxy(Libro libro, String usuarioTipo) {
        Libro = libro;
        UsuarioTipo = usuarioTipo;
    }

    public String getUsuarioTipo() {
        return UsuarioTipo;
    }

    public void setUsuarioTipo(String usuarioTipo) {
        UsuarioTipo = usuarioTipo;
    }

    @Override
    public String Leer() {
        if(UsuarioTipo.equals("Premium")){
            return Libro.Leer();
        }else if(UsuarioTipo.equals("Estandar")){
            return "Vista Previa: "+ "\n\tTitulo: " + Libro.getTitulo() + "\n\tAutor: " + Libro.getAutor();
        }else{
            return "No tienes acceso a este libro";
        }
    }

    @Override
    public String Descargar(String Pagina) {
        if(PaginaWeb.AccederPagina(Pagina)){
            if(UsuarioTipo.equals("Premium")){
                return Libro.Descargar(Pagina);
            }else{
                return "Sube tu nivel de usuario para descargar de esta pagina";
            }
        }else{
            return "Esta Pagina no esta disponible para descargar";
        }
    }
}
