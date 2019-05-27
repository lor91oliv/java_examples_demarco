package org.protor.sandbox.LorOliv.tests;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test02 {

	public static void main(String[] args) {

//		System.out.println("Input files will be read from dir: "+ System.getenv("INPUTS_DIR"));
		
		
		
		
		
		//String fileName = "cars.xml";
		//		File carsFile = new File("input" + File.separator + fileName);//oggetto di tipo file,nome oggetto = chiamata
		//		al costruttore
		if (args.length !=0) {
			// get the file name
			String filePath = args [0];
			File carsFile = new File(filePath);

		

			FileReader fileReader;
			try {
				fileReader = new FileReader(carsFile);
				System.out.println("Found file: "+carsFile.getAbsolutePath());
				System.out.println("-----------------------------------------");
				
				
				System.out.println("Reading file, line by line...");
				BufferedReader br = new BufferedReader (fileReader);
					String currentLine;
					int counter = 0;
					while ((currentLine = br.readLine())!= null) {
						System.out.println(++counter + ": "+ currentLine);
					}
				
				System.exit(0);
				
				
			} catch (FileNotFoundException e) {
				//e.printStackTrace();
				System.err.println("File " + carsFile.getAbsolutePath() + " not found \n"+"Terminating.");
				System.exit(1);
// is a
			} catch (IOException e) {
				System.err.println("A problem occurred with file "+carsFile.getAbsolutePath()+"\n"+"Terminating.");
				//e.printStackTrace();
				System.exit(1);
			}

			// separator: variabile statica, ad accesso pubblico, dichiarata final della classe
		}
		else {
			System.err.println("You must run this program with arguments. \n"+"Terminating.");
			System.exit(0);
		}

	}
}
