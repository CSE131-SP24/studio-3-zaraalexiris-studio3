package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a number for n: ");
		int arraySize = in.nextInt();
		boolean [] numbers = new boolean[arraySize];
		for (int i = 2; i< numbers.length; i++)
		{
		
			for (int j = (int) Math.pow(i,2) ; j<numbers.length; j+= i)
			{	
				numbers[j] = true;
			}
			
			

			{

			}
			if (numbers[i] == false)
			{
			System.out.println(i);
			}
		}


	}

}
