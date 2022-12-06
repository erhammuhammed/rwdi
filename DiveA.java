package org.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DiveA {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("E:\\Work\\STS-Workspace\\Assessment_RWDI\\src\\org\\test\\Data2");
		Scanner myReader = new Scanner(file);
		int horizontal = 0;
		int depth = 0;
		while (myReader.hasNextLine()) {
			String current = myReader.nextLine();
			int value = Integer.parseInt(current.split(" ")[1]);
			if(current.contains("forward")) {
				horizontal += value;
			}
			if(current.contains("down")) {
				depth += value;
			}
			if(current.contains("up")) {
				depth-=value;
			}
		}
		System.out.println("Position:"+(horizontal*depth));
		
	}

}
