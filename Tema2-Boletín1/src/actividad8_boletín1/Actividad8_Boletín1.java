package actividad8_boletín1;

import java.util.Scanner;

public class Actividad8_Boletín1 {

	public static void main(String[] args) {
		double nota;
		Scanner read = new Scanner (System.in);
		System.out.print("Introduce tu nota: ");
		nota = read.nextDouble();
		
		if (nota>=0 && nota<5) {
			System.out.print("INSUFICIENTE");
		} else if(nota >= 5 && nota<6) {
			System.out.print("SUFICIENTE");
		} else if(nota >= 6 && nota <7) {
			System.out.print("BIEN");
		} else if(nota>= 7 && nota<9) {
			System.out.print("NOTABLE");
		} else if(nota >= 9 && nota<10) {
			System.out.print("SOBRESALIENTE");
		}
		
		read.close();
	}

}