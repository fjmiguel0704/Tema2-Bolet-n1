package actividad5_boletín1;

import java.util.Scanner;

public class Actividad5_Boletín1 {

	public static void main(String[] args) {
		int num1;
		int num2;
		int num3;
		
		Scanner read = new Scanner (System.in);
		System.out.print("Introduce el primer número: ");
		num1 = read.nextInt();
		System.out.print("Introduce el segundo número: ");
		num2 = read.nextInt();
		System.out.print("Introduce el tercer número: ");
		num3 = read.nextInt();
		
		if (num1 > num2 && num2 > num3) {
			System.out.print(num1 + ", " +num2 + ", " + num3);
		}
		
		else {
			if (num1>num3 && num3>num2) {
				System.out.print(num1 + ", " + num3 + ", "+ num2);
			}
			
			else {
				if(num2>num1 && num1>num3) {
					System.out.print(num2 + ", " +num1 +", "+ num3);
				}
				else {
					if (num2>num3&&num3>num1) {
						System.out.print(num2 + ", " +num3 +", "+ num1);
					}
					else {
						if(num3>num1&&num1>num2) {
							System.out.print(num3 + ", " +num1 +", "+ num2);
						}
						else {
							if(num3>num2&&num2>num1) {
								System.out.print(num3 + ", " +num2 +", "+ num1);
							}
						}
					}
				}
			}
		}
 
	}

}
