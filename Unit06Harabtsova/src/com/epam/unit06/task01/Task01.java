package com.epam.unit06.task01;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {

		Counter c1 = new Counter(66, 0, 200);
		
		Scanner sc = new Scanner(System.in);
		int y;
		System.out.print("> ");
	
		y = sc.nextInt();
		
		int resultIncrease;

		resultIncrease = c1.increaseCounter(y);
		System.out.println("Updated result after increase " +resultIncrease);

		Scanner sc2 = new Scanner (System.in);
		int z;
		System.out.print("> ");
		z = sc2.nextInt();

		int resultDecrease;

		resultDecrease = c1.decreaseCounter(z);
		System.out.println("Updated result after decrease " +resultDecrease);

	}

}
