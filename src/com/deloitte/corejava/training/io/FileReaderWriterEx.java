package com.deloitte.corejava.training.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterEx {
	public static void main(String[] args) {
		String fileName="abc.txt";
		String outputFile="abc1.txt";
		File f1=new File(fileName);
		File f2=new File(outputFile);
		
		
		try {
			FileReader fr=new FileReader(f1);
			FileWriter fw=new FileWriter(f2);
			BufferedReader br=new BufferedReader(fr);
			String input=null;
			while((input=br.readLine())!=null) {
				fw.write(input);
			}
			
			System.out.println();
			
			fw.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
