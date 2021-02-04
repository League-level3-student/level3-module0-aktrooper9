package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
//String[] streng = new String[5];
		//2. print the third element in the array
//System.out.print(streng[3]);
		//3. set the third element to a different value
//streng[2]="HI";
		//4. print the third element again
//System.out.print(streng[3]);

		//5. use a for loop to set all the elements in the array to a string of your choice
		//for(int i=0;i<streng.length;i++) {
		//	streng[i]="word";
		//	System.out.print(streng[i]);
	//	}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		
		//7. make an array of 50 integers
int[] nums= new int[50];
Random ran = new Random();

		//8. use a for loop to make every value of the integer array a random number
for(int i =0; i<nums.length;i++) {
	int f= ran.nextInt(200);
	nums[i]=f;
}
int largest= nums[0];
int small = nums[0];
for(int a=1; a<nums.length;a++) {
	if(nums[a]<small) {
		small=nums[a];
		
		
	}
	if(nums[a]>largest) {
		largest=nums[a];
		
		
	}
	//System.out.print(nums[a]+" ");
}
//System.out.println(small);
System.out.println(largest);
		//9. without printing the entire array, print only the smallest number on the array

		//10 print the entire array to see if step 8 was correct
System.out.println(nums[50]);
		//11. print the largest number in the array.
		
		//12. print only the last element in the array
		
	}
}
