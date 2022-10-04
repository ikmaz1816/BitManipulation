package bitmanipulation;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=sc.nextInt();
		
		n=n ^ a;
		a=n^a;
		n=n^a;
		
		System.out.println(n+" "+a);
		sc.close();
	}

}
