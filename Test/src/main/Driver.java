package main;

import java.util.HashMap;

import zoo.Animals;

public class Driver {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		System.out.println("this is a test");
		
		
		Animals cat = new Animals("joe", "black", 5 ,6);
		System.out.println(cat.toString());
		System.out.println(cat.getAge());
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("pete", 17);
		System.out.println(map);
		

	}

}
