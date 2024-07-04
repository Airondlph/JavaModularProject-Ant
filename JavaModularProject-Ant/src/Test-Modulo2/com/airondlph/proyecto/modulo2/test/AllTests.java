package com.airondlph.proyecto.modulo2.test;

import com.airondlph.proyecto.modulo2.Modulo2MainClass;

public class AllTests {
    public static void main(String[] args) {
        System.out.println("Soy el modulo de testeo del segundo modulo");
        
        Modulo2MainClass modulo2 = new Modulo2MainClass();
        modulo2.main(new String[]{ "Soy el modulo de testeo del segundo modulo, ¿me escuchas?"});
    }
}
