package com.deloitte.corejava.training.collections;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) {
		try {
			FileReader fr=new FileReader("db.properties");
			Properties p=new Properties();
			p.load(fr);
			System.out.println(p.get("user"));
			System.out.println(p.get("password"));
			System.out.println(p.get("db"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
