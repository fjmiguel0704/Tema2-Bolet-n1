package actividad7_boletín1;

import java.util.Scanner;

public class Actividad7_Boletín1 {

	public static void main(String[] args) {
		
		//Creo la variable num, donde se guardará el número que se le pida al usuario
		int num;
		
		//Creamos el Scanner para leer por el teclado todo lo introducido por el usuario
		Scanner read = new Scanner (System.in);
		
		//Le pedimos al usuario que introduzca un número
		System.out.print("Introduce el número: ");
		
		//Declaramos la variable num, indicando que recogerá el dato introducido por el usuario
		num = read.nextInt();
		
		//Mediante condicionales, indicamos, que si el valor de la variable num es menor a 100000 y mayor o igual a 10000
		if (num<100000 && num>=10000) {
			
			//Imprima que el número introducido tiene 5 cifras
			System.out.print("Tú número tiene 5 cifras");
		}
		
		//En caso contrario, si num es menor a 10000 y mayor o igual a 1000
		else if(num<10000 && num>=1000) {
			
			//Imprima que el número introducido tiene 4 cifras
			System.out.print("Tú número tiene 4 cifras");
		}
		
		//En caso contrario, si num es menor a 1000 y mayor o igual a 100
		else if(num<1000 && num>=100) {
			
			//Imprima que el número introducido tiene 3 cifras
			System.out.print("Tú número tiene 3 cifras");
		}
		
		//En caso contrario, si num es menor a 100 y mayor o igual a 10
		else if(num<100 && num>=10) {
			
			//Imprima que el número introducido tiene 2 cifras
			System.out.print("Tú número tiene 2 cifras");
		}
		
		//En caso contrario, si num es menor a 10
		else if(num<10) {
			
			//Imprima que el número introducido tiene 1 cifras
			System.out.print("Tú número tiene 1 cifras");
		}
		
		//Cerramos el Scanner
		read.close();


	}

}
