package bitmanipulation;

import java.util.Scanner;

public class SetTheIthBit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		int n=sc.nextInt();
		int mask=1<<i-1;
		
		n= n | mask;
		System.out.println(n);
		sc.close();
	}

}
