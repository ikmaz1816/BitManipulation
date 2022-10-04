package bitmanipulation;

import java.util.Scanner;

public class ArrayUnique {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int unique=unique_array(arr);
		System.out.println(unique);
		sc.close();
	}

	private static int unique_array(int[] arr) {
		int res=0;
		for(int i=0;i<arr.length;i++)
		{
			res=res^arr[i];
		}
		return res;
	}

}
