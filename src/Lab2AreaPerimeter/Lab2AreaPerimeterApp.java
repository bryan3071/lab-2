package Lab2AreaPerimeter;
import java.util.Scanner;
public class Lab2AreaPerimeterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scnr = new Scanner (System.in);
		System.out.println("Welcome to Grand Circus' Room Detail Generator!");
		System.out.println();
		
		double length = 0;
		double width = 0;
		double height = 0;
		String answer;
		
		
		do {
		System.out.println ("Enter length:");
		length = scnr.nextDouble();
		
		System.out.println ("Enter width:");
		width = scnr.nextDouble();
		
		System.out.println("Enter height:");
		height = scnr.nextDouble();
		
		
		
		System.out.println ("Area: " + width * length);
		System.out.println("Perimeter: " + 2 * (width + length));
		System.out.println("Volume: " + length *width *height);
		
		System.out.println();
		System.out.println("Continue? (y/n):");
		answer = scnr.next();
		 
		} while (answer.equalsIgnoreCase("Y"));
		

	}

}
