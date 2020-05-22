package com.example.java;

class Calculator {

    public static void main(String[] args) {
		int int1 = 5;
		int int2 = 5;
		int i = 2;
		String s1 = "Hello";
		String s2 = "Hello";
		if (int1 == int2) {
			System.out.println("They match!");
		};
		if (int1 != int2) {
			System.out.println("The don't match!");
		};
		if (int1 > int2){
			System.out.println("The result is " + (int1 * int2));
		};
		if (int1 < int2) {
			System.out.println("The result is " + (int1 + int2));
		};
		if (int1 == int2) {
			System.out.println("The result is " + (int1 - int2));
		};
		if (s1.equals(s2)) {
			System.out.println("Both Objects are equal!");
		};
		var message = (i == 1)         // boolean test
				? "There is 1"         // result if true
				: "There are " + i;    // result if false
		System.out.println(message);
	}
}
