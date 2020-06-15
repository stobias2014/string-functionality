package com.tobias.saul;

public class App {
	
	public static void main(String[] args) {
		String name = "John Doe";
		
		System.out.println(name.charAt(0));
		System.out.println(name.concat(" Vaun"));
		System.out.println(name);
		System.out.println("Length: " + name.length());
		System.out.println(name.replace('o', 'u'));
		System.out.println(name);
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
	}

}
