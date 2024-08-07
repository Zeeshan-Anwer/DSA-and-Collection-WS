package _02_Arrays;

public class _02ArrKthSwap {
	
	/*
	 * Given an Array of size N and a values K, around which we need to right
	 * rotate the array. 
	 *  Examples :
	 *  Input: Array[] = {1, 3, 5, 7, 9}, K = 2. 
	 *  Output: 7 9 1 3 5 
	 * Explanation: 
	 *  After 1st rotation - {9, 1, 3, 5, 7} 
 	 *	After 2nd rotation - {7, 9, 1, 3, 5}
	 *  Input: Array[] = {1, 2, 3, 4, 5}, K = 4. 
	 *  Output: 2 3
	 * 4 5 1
	 */	
	public static void main(String[] args) {
		
		//Array Declaration
		int arr[]= {1,2,3,4,5,6,7,8,9};
		
		//position from where to shift array
		int k=5;
		
		
		//logic to get desired output
		
		arr=rev(arr,0,arr.length-1);
		arr=rev(arr,0,k-1);
		arr=rev(arr,k,arr.length-1);

		//printing array
		
		for(int i:arr)
		{
			System.out.println(i);
		}
	}

	public static int[] rev(int[] arr,int startIndex, int endIndex) {
		
		//contains how many times loop run 
		int looptimes;
		
		if(startIndex>0)
			looptimes=((endIndex-startIndex)/2)+1;	
		else
			looptimes=(startIndex+endIndex)/2;
		
		//for swap
		int temp;
		
		//swap array logic
		while(looptimes>0) {
			temp=arr[endIndex];
			arr[endIndex]=arr[startIndex];
			arr[startIndex]=temp;
			startIndex++;
			endIndex--;
			looptimes--;
		}
		
				return arr;
	}
}

//TC :- O(n)
//SC :- O(1)
