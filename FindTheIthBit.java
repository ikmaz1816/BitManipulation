package bitmanipulation;

import java.util.Scanner;

public class FindTheIthBit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		int n=sc.nextInt();
		
		int mask=1<<i-1;
		
		n=n & mask;
		if(n!=0)
			System.out.println(1);
		else
			System.out.println(0);
		sc.close();
	}

}
