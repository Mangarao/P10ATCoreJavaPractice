package com.deloitte.corejava.training.oops;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationEx {
	public static void main(String[] args) {
		FileInputStream fis;
		try {
			fis = new FileInputStream("student.txt");
			try (ObjectInputStream ois = new ObjectInputStream(fis)) {
			Student s=(Student)	ois.readObject();
			System.out.println(s);
				
			} catch (FileNotFoundException e) {
				throw e;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
