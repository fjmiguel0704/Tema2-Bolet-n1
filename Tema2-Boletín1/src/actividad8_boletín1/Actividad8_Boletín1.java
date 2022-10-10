package actividad8_boletín1;

import java.util.Scanner;

public class Actividad8_Boletín1 {

	public static void main(String[] args) {
		
		//Creo la variable nota de tipo double. Esta recogerá la nota del usuario, entera o con decimales
		double nota;
		
		//Creamos el Scanner para leer por el teclado todo lo introducido por el usuario
		Scanner read = new Scanner (System.in);
		
		//Le pedimos al usuario que introduzca su nota
		System.out.print("Introduce tu nota: ");
		
		//Declaramos la variable nota, que guardará el valor introducido por el usuario
		nota = read.nextDouble();
		
		//Mediante condicionales, indicamos, que si la variable nota es mayor o igual a 0 y menor que 5
		if (nota>=0 && nota<5) {
			
			//Imprima por pantalla que la nota es insuficiente
			System.out.print("INSUFICIENTE");
			
			//En caso contrario, si nota es mayor o igual a 5 y menor que 6
		} else if(nota >= 5 && nota<6) {
			
			//Imprima que la nota es suficiente
			System.out.print("SUFICIENTE");
			
			//En caso contrario, si nota es mayor o igual a 6 y menor que 7
		} else if(nota >= 6 && nota <7) {
			
			//Imprima que la nota es un bien
			System.out.print("BIEN");
			
			//En caso contrario, si nota es mayor o igual a 7 y menor que 9
		} else if(nota>= 7 && nota<9) {
			
			//Imprima que la nota es un notable
			System.out.print("NOTABLE");
			
			//En caso contrario, si la nota es mayor o igual a 9 y menor o igual a 10
		} else if(nota >= 9 && nota<=10) {
			
			//Imprime que la nota es un sobresaliente
			System.out.print("SOBRESALIENTE");
		}
		
		//Cerramos el Scanner
		read.close();
	}

}