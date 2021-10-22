package main;

import java.util.Scanner;

/**
 * (WARNING: Mengubah nama author dan nim menyebabkan program tidak berjalan!)
 * @author Arya
 * Introduction to Programming
 */
public class AreaCalculator {
	
	public AreaCalculator() {
		System.out.println("Programmed by Arya");
		System.out.println("Geometry Area Counter");
		System.out.println("=====================");
		System.out.println("1. Square");
		System.out.println("2. Rectangle");
		System.out.println("3. Triangle");
		System.out.println("4. Circle");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Option: ");
		
		int option = scan.nextInt();
		
		if (option == 1) {
			System.out.print("Input side: ");
			double side = scan.nextDouble();
			double area = side * side;
			System.out.print("Area: " + area);
		
		} else if (option == 2) {
			System.out.print("Input width: ");
			double width = scan.nextDouble();
			
			System.out.print("Input height: ");
			double height = scan.nextDouble();
			
			double area = width * height;
			System.out.print("Area: " + area);
			
		} else if (option == 3) {
			System.out.print("Input floor: ");
			double floor = scan.nextDouble();
			
			System.out.print("Input height: ");
			double height = scan.nextDouble();
			
			double area = 0.5 * (floor * height);
			System.out.print("Area: " + area);
		
		} else if (option == 4) {
			System.out.print("Input r: ");
			double r = scan.nextDouble();
			double area = Math.PI * (r * r);
			System.out.print("Area: " + area);
		
		} else {
			System.out.println(
				String.format("Incorrect option (%s).", option)
			);
		}
		System.out.println("");
		System.out.println("Thank you! This program is developed by Arya");
		scan.close();
	}
	
	public static void main(String[] args) {
		new AreaCalculator();
	}
	
}
