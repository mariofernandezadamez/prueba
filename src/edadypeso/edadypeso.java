package edadypeso;

import java.util.Scanner;

public class edadypeso {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("How old are you?");
		int age = in.nextInt();
		
		
		System.out.println("What is your wight?");
		System.out.println("hola");
		double weight = in.nextDouble();
		int age2= age + 1;
		double weight1= weight * 0.9;
		System.out.println("el año que viene tendras " +  age2 + " y deberias pesar " + weight1);
	}
}
