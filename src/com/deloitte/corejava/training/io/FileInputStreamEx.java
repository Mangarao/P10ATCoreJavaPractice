package com.deloitte.corejava.training.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx {
	
	public static void main(String[] args) throws IOException {
		FileInputStream fis=null;
		try {
			fis=new FileInputStream("abc.txt");
			int i=0;
			while((i=fis.read())!=-1) {
				System.out.print((char) i);
			}
			
			
		} catch (FileNotFoundException e) {
			System.err.println("dGiven is file is not   found");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			fis.close();
		}
	}

}
