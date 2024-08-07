package _02_Arrays;


// not working 

import java.util.Scanner;

public class ArrayRotateKthIndex {
	
	public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the size of Array");
	
	int size=sc.nextInt();
	int rotate=3;
	
	int arr[]=new int[size];

	for(int i=0;i<size;i++) {
		System.out.println("Enter value: ");
		arr[i]=sc.nextInt();
	}
	
	rotateKthTerm(arr,rotate);
	}
	
	public static void rotateKthTerm(int[] arr,int rotate) {
		
		int temp[]=new int[arr.length];
		//reverse an array
		for(int i=arr.length-1,j=0; i>=0; i--,j++) {
			temp[j]=arr[i];
		}
		
		for(int i=rotate-1,j=0;i>=0;i--,j++) {
			arr[j]=temp[i];
		}
		
		for(int i=temp.length-1,j=0;i>rotate;i--,j++) {
			arr[j]=temp[i];
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
	
	}
}
