package com.lockedme;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class UserInteraction_Console {
	
	private static void displayMainMenu() {
		System.out.println("---------------------------------------------------");
        System.out.println("\nMain Menu:");
        System.out.println("\t1. List Files");
        System.out.println("\t2. File Manager [Add | Delete | Search | Navigate]");
        System.out.println("\t3. Close Application");
        System.out.println("---------------------------------------------------");
    }
	
	private static int getUserChoice() {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your choice to execute the Main menu operations : ");
        for (int attempt = 1; attempt <= 3; attempt++) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                scanner.next(); // Consume the invalid input
                System.out.println("Invalid input. Attempts remaining: " + (3 - attempt));
            }
        }
        return -1; // Return a value that indicates no valid input
    }
	
	 private static void displayFileManagerMenu(){
	    System.out.println("---------------------------------------------------");
	    System.out.println("File Manager Menu:");
	    System.out.println("\t1. Add a file");
	    System.out.println("\t2. Delete a file");
	    System.out.println("\t3. Search for a file");
	    System.out.println("\t4. Return to main menu");
	    System.out.println("---------------------------------------------------");
	 }
	 
	 private static int getUserSubChoice() {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter your choice to execute the File Manager operations : ");
	        for (int attempt = 1; attempt <= 3; attempt++) {
	            try {
	                return scanner.nextInt();
	            } catch (InputMismatchException e) {
	                scanner.nextLine(); // Consume the invalid input
	                System.out.println("Invalid input. Attempts remaining: " + (3 - attempt));
	            }
	        }
	        return -1; // Return a value that indicates no valid input
	 }
	 
	
	 public static void userConsole() throws FileNotFoundException {
		 int choice;
		 int choice2;
	        do {
	            displayMainMenu();
	            choice = getUserChoice();
	            switch(choice){
	                case 1:
	                    filesViewer view = new filesViewer();
	                    view.getFilesList1();
	                    break;
	                    
	                case 2:
	                    do {
	                        displayFileManagerMenu();
	                        choice2 = getUserSubChoice();
	                        BusinessLevelOperation ops = new BusinessLevelOperation();
	                        switch (choice2) {
	                            case 1:
	                                ops.addFile();
	                                break;
	                            case 2:
	                                ops.deleteFile();
	                                break;
	                            case 3:
	                                ops.searchFile();
	                                break;
	                            case 4:
	                                System.out.println("Return to Main Menu");
	                                break;
	                            default:
	                                System.out.println("Invalid Input Retry");
	                        }
	                    }while(choice2!=4);
	                    break;
	                case 3:
	                    System.out.println("Exit Application");
	                    return;
	                default:
	                    System.out.println("Invalid Input Retry");
	            }
	        }while(choice!=3);

	    }

}