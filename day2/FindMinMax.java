package week1.day2;

import java.util.Arrays;

public class FindMinMax {

	public static void main(String[] args) {
		
		int[] num = {22,3981,-19,82,0,45,37};
		
		Arrays.sort(num);
		System.out.println("Min : "+num[0]);
		System.out.println("Max :"+num[num.length-1]);
		
		

	}

}
