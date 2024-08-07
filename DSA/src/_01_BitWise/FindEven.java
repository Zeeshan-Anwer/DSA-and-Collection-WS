package _01_BitWise;

//working
public class FindEven {

	public static void main(String[] args) {
		
		for(int i=0;i<10;i++) {
		
			if((i & 1)==0)
				System.out.println(i+" is Even");
		}
	}
}
