package fr.afpa.exo;

import java.util.Scanner;

public class Exo30 {
	public static void main(String[] args) {
		int a, b, i, res;
		Scanner sc = new Scanner(System.in);
		System.out.println("Donnez la valeur de a et b");
		
		a= sc.nextInt();		
	
		b= sc.nextInt();
		res = 0;
		for(i= 0 ; i< b; i ++) {
		  res = res + a ;
		}
		
		System.out.println("La multiplication est : " + res);
		
	}
}
