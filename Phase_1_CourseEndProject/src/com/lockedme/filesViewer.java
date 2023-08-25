package com.lockedme;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class filesViewer {
	
	 private List filesList= new ArrayList();
	 private String userDirectory = System.getProperty("user.dir") + "\\fileStorage\\";
	 private File[] files = new File(userDirectory).listFiles();
	 
	 public void getFilesList1() {
	        for(File file : files) {
	            if(file.isFile()) {
	                filesList.add(file.getName());
	            }
	        }
	        Collections.sort(filesList);
	        filesList.forEach(System.out::println);

	    }

}
