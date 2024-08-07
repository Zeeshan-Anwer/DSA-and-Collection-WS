package _02_Arrays;

/*
 * Given a String A of lower case character,
 * find how many subsequence of String "ag" are present.
 */
public class _06_SubsequenceofStringArray {
	
	public static void main(String[] args) {
		
		String str="zagragmtag";
		System.out.println(findSubsequenceBruteForce(str));
		System.out.println(findSubsequenceOptimized(str));
	}

	public static int findSubsequenceBruteForce(String str){
		int n=str.length();
		int ans=0;
		for(int i=0;i<n;i++) {
				if(str.charAt(i)=='a')
					// for left side a all right side g will be count
				for(int j=i+1;j<n;j++)
					if(str.charAt(j)=='g')
						ans++;
		}
		return ans;
}
	
	public static int findSubsequenceOptimized(String str) {
		
		int n=str.length();
		
		int counta=0,ans=0;
		for(int i=0;i<n;i++) {
			if(str.charAt(i)=='a')
				counta++;
			if(str.charAt(i)=='g')		
				ans=ans+counta;	//for every single 'g' all the left side a will be counted
								//here counta is doing that job
			
		}
		return ans;
	}
	
	  
}