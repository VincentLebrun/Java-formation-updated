package fr.afpa.exo;

import java.util.Scanner;

public class Exo27 {
	public static void main(String[] args) {

		double n1,n2,moy;
		Scanner sc = new Scanner(System.in);
		System.out.println("Donnez la note d'oral");
		n1 = sc.nextInt();
		System.out.println("Donnez la valeur de bla note d'�crit");
		n2 = sc.nextInt();
		moy = (n1+2*n2)/3; 
		if(moy <10) {
			System.out.println("Module non valid�");
		}else {
			System.out.println("Module valid�");
		}
	}
}
