package _02_Arrays;

/*Given a square matrix, turn it by 90 degrees in an
 *  clockwise direction without using any extra space

Examples: 

Input:
Matrix:    1  2  3
           4  5  6
           7  8  9

Output:  7  4  1
         8  5  2 
         9  6  3 
         
         anti-clockwise
         
         Input:
Matrix:    1  2  3
               4  5  6
               7  8  9

Output:  3  6  9 
               2  5  8 
               1  4  7
*/

public class _05_RotateMatrixBy90 {
	
	public static void main(String[] args) {
		
		//Array Declaration
		int arr[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
		// 
		arr=arrayTranspose(arr);
		for(int i=0;i<arr.length;i++) {
		arr[i]=_02ArrKthSwap.rev(arr[i], 0, arr[i].length-1);	//can take m/n eg:- m*n
		}
		int len=arr.length;
		for(int i=0;i<len;i++) {
			System.out.println();
			for(int j=0;j<arr.length;j++)
				System.out.print(arr[i][j]+" ");
		}
		}
		
	public static int[][] arrayTranspose(int arr[][]){	
		
		int n=arr.length-1;
		for(int i=0;i<=n;i++) {
			for(int j=i+1;j<=n;j++) 
				swap(arr,i,j);	
		}
		return arr;
	}
	
		
	public static int[][] swap(int arr[][],int i,int j)
	{
		int temp;
		temp=arr[i][j];
		arr[i][j]=arr[j][i];
		arr[j][i]=temp;
		return arr;
	}
}
