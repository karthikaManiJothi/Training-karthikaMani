package com.onebill.training.ass.file;

import java.io.FileWriter;
import java.io.IOException;

public class FileWritingDemo {

	public static void main(String[] args) throws IOException {
	    	  FileWriter filewriter =new FileWriter("write.txt");
	    	  filewriter.write("writing into the file");
	    	  filewriter.close();
	    	  System.out.println("Successfully written !");
	    	  
	      }
	}
	      


