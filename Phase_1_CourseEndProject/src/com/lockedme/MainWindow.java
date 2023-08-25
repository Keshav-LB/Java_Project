package com.lockedme;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainWindow {
	
	 public static void appSpecification(){ 
	        System.out.println("*****************************************");
	        System.out.println("*                                       *");
	        System.out.println("*    Application Name: Locked_Me        *");
	        System.out.println("*    Developed By : Keshav Mishra       *");
	        System.out.println("*    Email: keshavmishra1001@gmail.com	*");
	        System.out.println("*    Version: 1.0.0                     *");
	        System.out.println("*                                       *");
	        System.out.println("*****************************************");
	    }

	public static void main(String[] args) throws Exception  {
		
		appSpecification();
		
		UserInteraction_Console userConsole = new UserInteraction_Console();

        try {
            userConsole.userConsole();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

	}

}
