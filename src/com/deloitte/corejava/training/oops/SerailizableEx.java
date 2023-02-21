package com.deloitte.corejava.training.oops;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerailizableEx {
	
	public static void main(String[] args) {
		try {
			FileOutputStream fos=new FileOutputStream("student.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			Student s1=new Student(101,"Manga");
			oos.writeObject(s1);
			System.out.println("Serialization is done..");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
