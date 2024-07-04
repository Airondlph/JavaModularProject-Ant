package com.airondlph.proyecto.modulo1;

public class Modulo1MainClass {
    public static void main(String[] args) {
        System.out.println("Soy el modulo 1");
        System.out.println("Nº argumentos: " + args.length);

        int i = 0;
        for (String arg : args) {
            System.out.println("Argumento " + (++i) + ": " + arg);
        }
    }
}
