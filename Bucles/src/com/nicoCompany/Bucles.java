package com.nicoCompany;

public class Bucles {
    public static void main(String[] args) {
        String[] nombreApellidoEdad = {"Nicolás", "Aimar", "Software Developer"};

        String cadenaDeTexto = "";

        // Solución con Bucle For
        for (int i = 0; i < nombreApellidoEdad.length; i++) {
           cadenaDeTexto += nombreApellidoEdad[i] + " ";
        }

        System.out.println(cadenaDeTexto);

        // Solución con ForEach
        for(String palabra : nombreApellidoEdad) {
            cadenaDeTexto += palabra + " ";
        }

        System.out.println(cadenaDeTexto);
    }
}
