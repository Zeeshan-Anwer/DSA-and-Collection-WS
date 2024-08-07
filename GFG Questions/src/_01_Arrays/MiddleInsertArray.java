package _01_Arrays;

public class MiddleInsertArray {

	public static void main(String[] args) {
		
		int arr[]= new int[5];
		arr[0]=1;
		arr[1]=21;
		arr[2]=56;
		int pos=1;
		int cap=3;
		System.out.println("Before Shift");
		
		for(int k:arr) {	
			System.out.println(k);
		}
		arr=shiftArray(arr,pos,cap);
		System.out.println("After Shift");
		
		for(int k:arr) {	
			System.out.println(k);
		}
		
	}

	public static int[] shiftArray(int arr[],int pos,int cap) {
		
		while(cap>=pos-1) {
			arr[cap+1]=arr[cap];
			cap--;
		}
		arr[pos]=9999;
		
		return arr;
	}
}
