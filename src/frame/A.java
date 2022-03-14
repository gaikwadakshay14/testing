package frame;

import java.util.Arrays;

public class A {
public static void main(String[] args) {
		
		int ar[]= {40,50,10,20,66,55,22,11,2,8,71,94,52,67,35,58,102,5,8,1,9};
		
		Arrays.sort(ar);
		System.out.println(ar.length-1);         //20
		System.out.println("----ascending array order-----");
		for(int i=0; i<=ar.length-1;i++) {
			System.out.println(i);
		}
		//to get largest element
		System.out.println("----largest no-------");
		System.out.println(ar[ar.length-1]);     //102
	}


}
