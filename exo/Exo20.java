package fr.afpa.exo;

import java.util.Scanner;

public class Exo20 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int nb,i,som; 
    	System.out.println("Saisissez un nombre");
    	nb = sc.nextInt();
    	som= 0;
    	for(i = 1 ; i <= nb;i++) {
    		som = som+i;
    		System.out.println(i + " + " +  som + " = " + som );
    	
    		
    	}
    	System.out.println("La somme est "+  som );
    }
}
