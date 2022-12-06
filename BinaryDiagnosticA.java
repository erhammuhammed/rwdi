package org.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BinaryDiagnostics {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("E:\\Work\\STS-Workspace\\Assessment_RWDI\\src\\org\\test\\Data3");
		Scanner myReader = new Scanner(file);
		int[] zbit = {0,0,0,0,0,0,0,0,0,0,0,0};
		int[] obit = {0,0,0,0,0,0,0,0,0,0,0,0};
		int gamma = 0;
		int epsilon = 0;
		
		while(myReader.hasNextLine()) {
			String current = myReader.nextLine().trim();
			for(int i=0;i<12;i++) {
				if(current.charAt(i)=='0') {
					zbit[i] += 1;
				} else {
					obit[i] += 1;
				}
			}
		}
		for(int i=0;i<12;i++) {
			if(obit[i]>zbit[i]) {
				gamma += Math.pow(2, 11-i);
			} else {
				epsilon += Math.pow(2, 11-i);
			}
		}
		System.out.println("Power:"+(gamma*epsilon));
	}

}
