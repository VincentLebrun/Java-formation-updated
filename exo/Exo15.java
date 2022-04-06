package fr.afpa.exo;

//imports tools
import java.util.Scanner;

public class Exo15 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String a, b, c;
		System.out.println("Saisissez trois lettres ");
		
		a = sc.next();
		b = sc.next();
		c = sc.next();
		System.out.println(a + b + c);
		// close the scanner 
        sc.close();
	}

}
