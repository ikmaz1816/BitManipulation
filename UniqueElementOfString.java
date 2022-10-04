package bitmanipulation;

import java.util.Scanner;

public class UniqueElementOfString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int res=0;
		for(int i=0;i<s.length();i++)
		{
			res=res^s.charAt(i);
		}
		System.out.println((char)res);
		sc.close();
	}

}
