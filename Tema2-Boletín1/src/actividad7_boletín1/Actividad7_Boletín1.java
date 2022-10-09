package actividad7_boletín1;

import java.util.Scanner;

public class Actividad7_Boletín1 {

	public static void main(String[] args) {
		int num;
		Scanner read = new Scanner (System.in);
		System.out.print("Introduce el número: ");
		num = read.nextInt();
		
		if (num<100000 && num>=10000) {
			System.out.print("Tú número tiene 5 cifras");
		}
		else if(num<10000 && num>=1000) {
			System.out.print("Tú número tiene 4 cifras");
		}
		else if(num<1000 && num>=100) {
			System.out.print("Tú número tiene 3 cifras");
		}
		else if(num<100 && num>=10) {
			System.out.print("Tú número tiene 2 cifras");
		}
		else if(num<10) {
			System.out.print("Tú número tiene 1 cifras");
		}
		
		read.close();


	}

}
