package com.airondlph.proyecto.modulo2;

import com.airondlph.proyecto.modulo1.Modulo1MainClass;

public class Modulo2MainClass {
    public static void main(String[] args) {
        System.out.println("Soy el modulo 2");

        Modulo1MainClass modulo1 = new Modulo1MainClass();
        if (args.length <= 0) {
            modulo1.main(new String[] {"Soy el modulo 2, ¿me escuchas?"});
        } else {
            modulo1.main(args);
        }
        
    }
}
