package _02_Arrays;

import java.util.Scanner;

public class _04_MatrixSpiralMode {
	
	public static void main(String[] args) {
		
		//taken array
		//int [][]arr= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		int [][]arr= {{6, 6, 2, 28, 2,},{ 12, 26, 3, 28, 7,},
				{ 22, 25, 3, 4, 23}};
		
		//array size
		int n=3,m=4;
		
		
		int T=0,L=0,R=m-1,B=n-1;
		
		while(T<=B && L<=R)
		{		
		for(int K=L;K<=R;K++) {
			System.out.println(arr[T][K]);
		}
		T++;
		
		
		for(int K=T;K<=B;K++) {
			System.out.println(arr[K][R]);	
		}
		R--;
		
		
		for(int K=R;K>=L;K--) {
			System.out.println(arr[B][K]);
		}
		B--;
		
		for(int K=B;K>=T;K--) {
			System.out.println(arr[K][L]);
		}
		L++;
		
		}
	}

}
