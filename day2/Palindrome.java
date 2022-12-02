package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		
		
		int num=34343;
				int tem=num,i, sum=0;
				
				while (num>0) {
					
					i=num%10;
					sum=(sum*10)+i;
					num=num/10;
					System.out.println(sum);
				}
				
				if(tem==sum) {
					System.out.println("Palindrome Number");
					
				}
					
					else {
						System.out.println("Not a Palindrome Number");
						
						
				}

	}

}
