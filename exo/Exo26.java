package fr.afpa.exo;

import java.util.Scanner;

public class Exo26 {
	public static void main(String[] args) {

		double a, b, c, delta;
		Scanner sc = new Scanner(System.in);
		System.out.println("Donnez la valeur de a");
		a = sc.nextInt();
		System.out.println("Donnez la valeur de b");
		b = sc.nextInt();
		System.out.println("Donnez la valeur de c");
		c = sc.nextInt();
		
		if (a == 0) 
		{
			System.out.println("Equation de premier ordre");
			if (b == 0) {
				if (c == 0) 
					System.out.println("Tous réel est solution");
				else 
					System.out.println("Pas de solution");
			}else
				System.out.println("Solution unique x=");	
		}else {
			delta = b * b - 4 * a * c;
			if (delta <= 0) 
				System.out.println("Pas de solution");
			 else if (delta == 0) 
				System.out.println("Solution double : x1 = x2= " + (-b / 2 * a));
			 else {
				delta = Math.sqrt(delta);
				System.out.println("Deux solutions x1 = " + (-b - (delta)) / 2 * a + "x2 = " + (-b + (delta)) / 2 * a);
			}
		}

	}
}
