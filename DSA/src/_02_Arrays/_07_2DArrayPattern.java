package _02_Arrays;

/*
 *  Given an integer N, you have to form a pattern;
 *  N=3 
 *  	0 0 1
 *  	0 2 1
 *  	3 2 1
 *  N=4
 *  	0 0 0 1
 *  	0 0 2 1
 *  	0 3 2 1
 *  	4 3 2 1 
 */
public class _07_2DArrayPattern {
	
	public static void main(String[] args) {

		int n=7;
		
		int arr[][]= new int [n][n];
		
		int k,l,count;
		
		for(int i=0;i<n;i++) {
			k=i;
			l=n-1;
			count=1;
			while(count<=(i+1)) {
				arr[k][l]=count;
				count++;
				l--;
			}
			}
		
		for(int i=0;i<n;i++) {
			System.out.println();
			for(int j=0;j<arr.length;j++)
				System.out.print(arr[i][j]+" ");
		}
		}
	}


