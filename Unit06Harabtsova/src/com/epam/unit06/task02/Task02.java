package com.epam.unit06.task02;
import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		Time t = new Time (1,20,30);
		//System.out.println(t.getHour());
		//System.out.println(t.getMinutes());
		//System.out.println(t.getSeconds());
		
		Scanner sc = new Scanner(System.in);
		int x;
		System.out.print("> ");
	
		x = sc.nextInt();
		
		int changeInHours;
		changeInHours = t.updateHours(x);
		System.out.println("changeInHours= " +changeInHours);
		
		Scanner sc2 = new Scanner (System.in);
		int z;
		System.out.print("> ");
		z = sc2.nextInt();
		int changeInMinutes;
		changeInMinutes = t.updateMinutes(z);
		System.out.println("changeInMinutes= " +changeInMinutes);
		
		Scanner sc3 = new Scanner (System.in);
		int a;
		System.out.print("> ");
		a = sc3.nextInt();
		int changeInSeconds;
		changeInSeconds = t.updateSeconds(a);
		System.out.println("changeInSeconds= " +changeInSeconds);
		
		Time t2 = new Time (1,3,12);
		Scanner sc4 = new Scanner (System.in);
		int c;
		System.out.print("> ");
		c = sc3.nextInt();
		int changedTime;
		changedTime = t2.changeTheWholeTime(c);
		//System.out.println("changedTime= " +changedTime);
		int updatedHour;
		int updatedMinutes;
		int updatedSeconds;
		updatedHour = changedTime/ 3600;
		//System.out.println(updatedHour);
		updatedMinutes = (changedTime - (updatedHour * 3600))/ 60;
		//System.out.println(updatedMinutes);
		updatedSeconds = changedTime - (updatedHour * 3600) - (updatedMinutes * 60);
		//System.out.println(updatedSeconds);
		System.out.println("Updated Time - " +updatedHour + ":" + updatedMinutes + ":" +updatedSeconds);
	}

}
