package com.airondlph.modularproject.secondmodule.test;

import com.airondlph.modularproject.secondmodule.SecondModuleMainClass;
import java.util.Arrays;

/**
 * 
 * @author Airondlph
 * 
 */
public class AllTests {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		SecondModuleMainClass secondmodule = new SecondModuleMainClass();

		String[] arr = Arrays.copyOf(args, args.length+1);
		arr[arr.length-1] = "I am the testing module for the first module";
		secondmodule.main(arr);
	}
}
