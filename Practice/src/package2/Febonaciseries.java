package package2;

import java.util.Scanner;

public class Febonaciseries
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter limit");
		int l=sc.nextInt();
		int x=0;
		int y=1;
		System.out.print(x+" "+y+" ");
		int z=x+y;
		while(z<=l)
		{
			System.out.print(z+" ");
			x=y;
			y=z;
			z=x+y;
		}

	}

}
