package actividad6_boletín1;

import java.util.Scanner;

public class Actividad6_Boletín1 {

	public static void main(String[] args) {
		
		//Creo las variables a, b y c. Guardarán el valor de estos 3 coeficientes
		int a;
		int b;
		int c;
		
		//Creo la variable raízCuadrada. Guardará el resultado del cálculo de la ecuación correspondiente al de caluclar la Raíz Cuadrada
		int raizCuadrada;
		
		//Creo las variables xPositive y xNegative. Guardarán los resultados de la ecuación 
		int xPositive ;
		int xNegative;
		
		//Creamos el Scanner para leer por el teclado todo lo introducido por el usuario
		Scanner read = new Scanner (System.in);
		
		//Le pedimos al usuario que introduzca el valor del coeficiente a
		System.out.print("¿Cuánto vale a?");
		
		//Declaramos la variable a, que recogerá y será igual al primer valor introducido por el usuario
		a = read.nextInt();
		
		//Le pedimos al usuario que introduzca el valor del coeficiente b
		System.out.print("¿Cuánto vale b ?");
		
		//Declaramos la variable b, que recogerá y será igual al segundo valor introducido por el usuario
		b = read.nextInt();
		
		//Le pedimos al usuario que introduzca el valor del coeficiente c
		System.out.print("¿Cuánto vale c?");
		
		//Declaramos la variable c, que recogerá y será igual al tercer valor introducido por el usuario
		c = read.nextInt();
		
		//Declaramos la variable raízCuadrada, que guardará el resultado del siguiente cálculo de la ecuación: b² - 4 * a * c
		raizCuadrada = (int) (Math.pow(b, 2) -4 *a*c);
			
		//Mediante condicionales, indicamos, que si el valor de la variable a es igual a 0 o el resultado de la variable raízCuadrada es menor que 0 
		if (a==0 || raizCuadrada <0) {
			
			//Imprima que no hay solución
			System.out.print("No hay solución");
		}
		
		//En caso contrario, que realice los cálculos de la ecuación y los muestre
		else {
			
			//Declaramos la variable xPositive, que guardará el primer resultado de la ecuación, realizando el siguiente cálculo: -b + √raízCuadrada / 2 * a
			xPositive = (int) ((-b + (Math.sqrt(raizCuadrada))) / (2*a));
			
			//Declaramos la variable xNegative, que guardará el segundo resultado de la ecuación, realizando el siguiente cálculo: -b - √raízCuadrada / 2 * a
			xNegative = (int) ((-b - (Math.sqrt(raizCuadrada))) / (2*a));
			
			//Y muestre por pantalla los dos resultados, xPositive y xNegative
			System.out.println("Primera solución real: " + xPositive);
			System.out.print("Segunda solución real: " + xNegative);
		}
		
		//Cerramos el Scanner
		read.close();
			
		
		}
	}


