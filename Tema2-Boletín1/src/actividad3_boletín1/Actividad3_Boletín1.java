package actividad3_boletín1;

import java.util.Scanner;

public class Actividad3_Boletín1 {

	public static void main(String[] args) {
		float num;
		Scanner read = new Scanner (System.in);
		System.out.print("Introduce un número: ");
		num = read.nextFloat();
		
		if (num > -1 && num <1 && num != 0) {
			System.out.print("casi-cero");
		}
		
		else {
			System.out.print("No es casi-cero");
		}
	
	}

}
