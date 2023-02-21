package com.deloitte.corejava.training.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapEx {
	
	public static void main(String[] args) {
		Map<Integer,String> map=new Hashtable<>();
		map.put(103, "Aarohi");
		map.put(101, "Mihi");
		map.put(102, "Aarohi");
		map.put(101, "Mihiraan Krishna");
		//map.put(null, null);
		
		System.out.println(map);
		
		for (Entry<Integer, String> e : map.entrySet()) {
			System.out.println(e.getKey()+":"+e.getValue());
		}
	}

}
