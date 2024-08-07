package OldProgrammes;

import java.util.ArrayList;
import java.util.Scanner;
class fabonacci
{
	public static void main(String args[]) 
	{
		Scanner obj =new Scanner (System.in);
		System.out.print("\nEnter the number of sequence=\t");
		int n=obj.nextInt();
		
		ArrayList<Integer> al =getFabonacci(n);

		System.out.println(al);

	}
	
	public static ArrayList getFabonacci(int noOfSqnc) {
	
		int a=0,b=1,c=0,n=noOfSqnc,i;
		ArrayList al=new ArrayList();
		al.add(0);
		al.add(1);
		
		for(i=1;i<n-2;i++)
		{
			c=a+b;
			al.add(c );
		
		a=b;
		b=c;
		}
		return al;
		
	}
}