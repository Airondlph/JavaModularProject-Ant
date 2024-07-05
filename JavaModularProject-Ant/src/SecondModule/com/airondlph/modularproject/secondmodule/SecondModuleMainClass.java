package com.airondlph.modularproject.secondmodule;

import com.airondlph.modularproject.firstmodule.FirstModuleMainClass;
import java.util.Arrays;

/**
 * 
 * @author Airondlph
 * 
 */
public class SecondModuleMainClass {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		FirstModuleMainClass firstmodule = new FirstModuleMainClass();

		String[] arr = Arrays.copyOf(args, args.length+1);
		arr[arr.length-1] = "I am the second module";
		firstmodule.main(arr);
	}
}
