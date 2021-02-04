package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String strings[]=new String[10];
		for(int i =0; i<strings.length;i++) {
		strings[i]="string"+i;
		}
		
	random(strings);
	}
	
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	
	static void string(String[] array ) {
		for(int i =0; i<array.length;i++) {
		System.out.print(array[i]+" ");
		}
	}
	
	static //3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	void backwards(String[] array ) {
		for(int i =array.length-1; i>0;i-=1) {
		System.out.print(array[i]+" ");
		}
	}
	
	
	static //4. Write a method that takes an array of Strings and prints every other String in the array.
	
	void skip(String[] array ) {
		
		for(int i =0; i<array.length;i++) {
		 
		if(i%2 == 0) {
			System.out.println(array[i]);
		}
		}
	}
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	
	static void random(String[] array ) {
		Random ran = new Random();
		int random;
		for(int i =0; i<array.length;i++) {
			random = ran.nextInt(9);
		System.out.print(array[random]+" ");
		}
	}
}
