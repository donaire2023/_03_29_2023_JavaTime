package com.hedima.presentacion;
public class Main {
    public static void main(String[] args) {
        //Metodos metodo de la classe String
 /*       String frase = "La casa verde";
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
        System.out.println("Longitud de la frase: " + frase.length());
        System.out.println("("+frase.substring(0, 2) + ")");
        System.out.println("("+frase.substring(3, 7) + ")");
        System.out.println("posicion de la s: " + frase.indexOf("s"));
        System.out.println("posicion de la a: " + frase.indexOf("a"));
        System.out.println("posicion de la a: " + frase.lastIndexOf("a"));
        String frase2 = "La casa verde";
        System.out.println(frase.equals(frase2));*/
        /*
         * Crear la cadena de texto: “Nunca mates una mosca sobre la cabeza de un
         * tigre.”
         * Mostrar la cadena toda en mayúsculas
         * Mostrar la cadena en minúsculas
         * Mostrar solo la palabra Nunca
         * Mostrar solo la palabra mosca
         * Mostrar la palabra cabeza
         * Mostrar la posición de la letra primera m
         * Devolver la longitud de la cadena
         */
        String frase = "Nunca mates una mosca sobre la cabeza de un tigre";
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
        System.out.println("("+frase.substring(0, 5) + ")");
        System.out.println("("+frase.substring(16, 21) + ")");
        System.out.println("("+frase.substring(31, 37) + ")");
        System.out.println("posicion de la M: " + frase.indexOf("m"));
        System.out.println("Longitud de la frase: " + frase.length());



    }
}