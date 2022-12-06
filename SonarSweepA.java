package org.test;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SonarSweep {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		File file = new File("E:\\Work\\STS-Workspace\\Assessment_RWDI\\src\\org\\test\\Data1");
		int count = 0;
		Scanner myReader = new Scanner(file);
		int initial = Integer.parseInt(myReader.nextLine().trim());
		while (myReader.hasNextLine()) {
			String current = myReader.nextLine().trim();
			if (initial < Integer.parseInt(current)) {
				count++;
			}
			initial = Integer.parseInt(current);
		}
		System.out.println("Count:" + count);
	}

}
