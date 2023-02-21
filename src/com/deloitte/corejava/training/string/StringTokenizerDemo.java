package com.deloitte.corejava.training.string;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
	
	public static void main(String[] args) {
		System.out.println(args.length);
		String name="My name is MangaRao";
		/*
		 * StringTokenizer st=new StringTokenizer(name," "); while(st.hasMoreElements())
		 * { System.out.println(st.nextElement()); }
		 */
		
		String[] names = name.split(" ");
		for (String name1 : names) {
			System.out.println(name1);
		}
	}

}
