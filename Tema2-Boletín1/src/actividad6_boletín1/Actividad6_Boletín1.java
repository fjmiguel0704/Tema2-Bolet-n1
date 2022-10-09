package actividad6_boletín1;

import java.util.Scanner;

public class Actividad6_Boletín1 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int raizCuadrada;
		int xPositive ;
		int xNegative;
		
		Scanner read = new Scanner (System.in);
		System.out.print("¿Cuánto vale a?");
		a = read.nextInt();
		System.out.print("¿Cuánto vale b ?");
		b = read.nextInt();
		System.out.print("¿Cuánto vale c?");
		c = read.nextInt();
		
		
		raizCuadrada = (int) (Math.pow(b, 2) -4 *a*c);
			
		if (a==0 || raizCuadrada <0) {
			System.out.print("No hay solución");
		}
		
		else {
			xPositive = (int) ((-b + (Math.sqrt(raizCuadrada))) / (2*a));
			xNegative = (int) ((-b - (Math.sqrt(raizCuadrada))) / (2*a));
			System.out.println("Primera solución real: " + xPositive);
			System.out.print("Segunda solución real: " + xNegative);
		}
		
		read.close();
			
		
		}
	}


