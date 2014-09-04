package ir.sgholami.git;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GitTest {
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Git is fun .. what? what?");
		
		File inFile = new File("input.txt");
		Scanner reader = new Scanner(inFile);
		
		while(reader.hasNext())
			System.out.println(reader.nextLine());
		
		reader.close();
	}
}
