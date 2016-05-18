package jaker.familytree.util;

import java.io.File;

public class PersonJSON {
	
	private static File peopleFolder = new File("people");
	
	public PersonJSON() {
		
	}
	
	// Later make this part of pre-initialization, not part of this class
	
	public static void prepareFilesystem() {
		if(!peopleFolder.exists()) {
			if(peopleFolder.mkdir()) {
				System.out.println("People folder created");
			} else {
				System.out.println("Failed to create people folder");
			}
		} else {
			System.out.println("People folder already exists");
		}
	}
}
