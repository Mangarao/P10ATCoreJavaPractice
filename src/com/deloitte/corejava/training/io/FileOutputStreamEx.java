package com.deloitte.corejava.training.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		FileOutputStream fos=new FileOutputStream("abc.txt", true);
		String s=" I am going to be Java expert";
		fos.write(s.getBytes());
		fos.close();
		System.out.println("File write opertion is done");
	}

}
