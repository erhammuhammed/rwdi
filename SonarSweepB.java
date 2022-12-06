package org.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SonarSweep {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		File file = new File("E:\\Work\\STS-Workspace\\Assessment_RWDI\\src\\org\\test\\Data1");
		int count = 0;
		Scanner myReader = new Scanner(file);
		List<Integer> readings = new ArrayList<>();
		while (myReader.hasNextLine()) {
			readings.add(Integer.parseInt(myReader.nextLine()));
		}
		int initial = readings.get(0)+readings.get(1)+readings.get(2); 
		for(int i=1;i<readings.size()-2;i++) {
			int current = readings.get(i)+readings.get(i+1)+readings.get(i+2);
			if(initial<current) {
				count++;
			}
			initial = current;
		}
		System.out.println("Count:" + count);
	}

}
