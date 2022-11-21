package module1;

import java.util.Scanner;

/** @author mgonza22
*/
public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = new String("Hola Marina");
		
		System.out.println("pon un número del 1 al 2");
		
		int i = sc.nextInt();
		
		int num = (int) (Math.random()*2 +1);
		
		System.out.println("número premiado: " + num);

		if (num== i) {
			System.out.println("Ganaste");
		} else {
			System.out.println("Perdiste");
		}
	}

}
