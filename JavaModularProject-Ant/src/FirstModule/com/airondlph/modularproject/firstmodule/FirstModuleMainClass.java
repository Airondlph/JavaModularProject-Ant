package com.airondlph.modularproject.firstmodule;

/**
 * 
 * @author Airondlph
 * 
 */
public class FirstModuleMainClass {
	public static void main(String[] args) {
		System.out.println("I am the first module");
		System.out.println("Nº of args: " + args.length);
		for (int i = 0; i < args.length; i++) {
			System.out.println("Arg " + (i+1) + ": " + args[i]);
		}
	}
}
