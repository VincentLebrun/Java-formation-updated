package fr.afpa.exo;

import java.util.Scanner;

public class Exo18 {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int age;
    	System.out.println("Entrez l'age de l'enfant");
    	age= sc.nextInt();
    	if(age>= 12) {
    		System.out.println("Catégorie cadet");
    	}else if (age >= 10 ) {
    		System.out.println("Minime");
    	}else if(age >= 8) {
    	System.out.println("Pupille");
    	}else{
    	System.out.println("Poussin");
    	
    	}
    		
    }
}
