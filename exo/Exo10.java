package fr.afpa.exo;

//imports tools
import java.util.Scanner;

public class Exo10 {

	public static void main(String[] args) {
        // declare variable
		int  pttc;
		//Initialization scanner
		Scanner sc = new Scanner(System.in);
		
		// PHT entries i used sc 
		System.out.println("Saisissez le pht");
		int pht = sc.nextInt();
		System.out.println(pht);
		
		//number products
		System.out.println("Veuillez saisir un nombre");
		int nb = sc.nextInt();
		System.out.println(nb);
		
	    //tva
		System.out.println("Entrez le taux tva");
		int ttva = sc.nextInt();
		System.out.println(ttva);
		
		// calculation module
		   pttc = nb * pht * (1+ttva);
		
		//printing result
		System.out.println("Le prix total est : " + pttc);
		

	}
}
