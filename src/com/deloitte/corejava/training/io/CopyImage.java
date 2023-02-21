package com.deloitte.corejava.training.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class CopyImage {
	
	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("javaloog.png");
			FileOutputStream fos=new FileOutputStream("javalogo1.png");
			
			BufferedReader br=new BufferedReader(new InputStreamReader(fis));
			while(br.readLine()!=null) {
				fos.write(br.readLine().getBytes());
			}
			/*
			 * int i=0; while((i=fis.read())!=-1) { fos.write(i); }
			 */
			System.out.println("Image is copied successfully");
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
