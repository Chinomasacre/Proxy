package com.example.proxy.Domains;

import java.util.*;

public class PaginaWeb {
    private static List<String> Paginas = new ArrayList<String>();

    public static void AgregarPagina(String pagina) {
        Paginas.add(pagina);
    }
    public static boolean AccederPagina(String pagina) {
        return Paginas.contains(pagina);

    }
}
