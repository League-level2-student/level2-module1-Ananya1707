package _00_intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList (java.util) class
		ArrayList<String> colors = new ArrayList<String>();

		//2. Add five Strings to your list
		colors.add("red");
		colors.add("orange");
		colors.add("yellow");
		colors.add("green");
		colors.add("blue");
		
		//3. Print all the Strings using a standard for-loop
		for(int i = 0; i < colors.size(); i++) {
			System.out.println(colors.get(i));
			
		}
		
		System.out.println("");
		//4. Print all the Strings using a for-each loop
		for(String i: colors) {
			System.out.println(i);
		}
				
		System.out.println("");
		//5. Print only the even numbered elements in the list.
		for(int i = 0; i < colors.size(); i++) {
			if(i%2 == 0) {
				System.out.println(colors.get(i));
			}
			
		}
				
		System.out.println("");
		//6. Print all the Strings in reverse order.
		for(int i = colors.size()-1; i >= 0; i--) {
			System.out.println(colors.get(i));
			
		}
		
		System.out.println("");
		//7. Print only the Strings that have the letter 'e' in them.
		for(String i: colors) {
			if(i.indexOf("e") != -1) {
				System.out.println(i);
			}
		}
	}
}
