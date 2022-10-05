package actividad4_boletín1;

import java.util.Scanner;

public class Actividad4_Boletín1 {

	public static void main(String[] args) {
		int num1;
		int num2;
		Scanner read = new Scanner (System.in);
		System.out.print("Inroduce el primer número: ");
		num1 = read.nextInt();
		System.out.print("Introduce el segundo número: ");
		num2 = read.nextInt();
		
		if (num1 < num2) {
			System.out.print(num1 + ", " + num2);
		}
		
		else {
			System.out.print(num2 + ", " +num1);
		}

	}

}
