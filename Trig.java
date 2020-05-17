import java.io.*;
import java.util.Scanner;

class Trig{
	public static void main(String[] args) {
		double degree;
		double radian;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter degree: ");
		degree = scan.nextDouble();
		radian = Math.toRadians(degree);

		System.out.println("Cosine: " + Math.cos(radian));

	}
}