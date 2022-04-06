package fr.afpa.exo;

//imports tools
import java.util.Scanner;
// exercice testing condition
public class Exo13 {
	
   public static void main(String[] args) {
	   
	   Scanner sc = new Scanner(System.in);
	   //ask number
	   System.out.println("Saisissez un nombre");
	   int nb = sc.nextInt();
	   if (nb > 0 ) {
		   System.out.println("Ce nombre est positif");
	   } else {
		   System.out.println("Ce nombre est négatif");
	   }
	   
   }
}
