package org.accenture.training.day4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class IOException {

	public static void main(String[] args) throws java.io.IOException {
		System.out.println("Checked Exception : File Not Found Exception");
		
		File file = new File("D:\\Selenium\\GreenTech\\IOException.txt");
		
		FileReader fd = new FileReader(file);
		
		int i;
		while ((i=fd.read())!=-1) 
			
			System.out.println("Character from file"+(char)i);
			fd.close();
			
		
			
		}
			
		

	}


