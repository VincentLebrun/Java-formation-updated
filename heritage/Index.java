package fr.afpa.heritage;
import java.util.Scanner;

public class Index {
	public static void main(String[] args) {
	    Adherent ad = new Adherent();
	    int isbn, age , nbAu , numAuteur ;
	    String nom, prenom, titre;
	    Scanner sc = new Scanner(System.in);
		Personne[] p = new Personne[2];
		p[0] = new Personne("Roger", "robert", 5);
		Author [] auteurs; 
		displayPerson(p);
		System.out.println("Creation d'un nouveau livre ");
		System.out.println("Veuillez saisir l'isbn du livre");
		isbn = sc.nextInt();
		System.out.println("Veuillez saisir le titre du livre ");
		titre = sc.next();
		System.out.println("Veuillez saisir le nombre d'autteurs du livre");
		nbAu= sc.nextInt();
		auteurs= new Author[nbAu];
		for(int i = 0 ; i < auteurs.length; i++) {
			System.out.println("Veuillez saisir le nom de l'auteur" + i + 1 );
			nom= sc.next();
			System.out.println("Veuillez saisir le prénom de l'auteur " + i + 1 );
			prenom= sc.next();
            System.out.println("Veuillez saisir l'âge de l'auteru " + i +1  );
            age = sc.nextInt();
            System.out.println("Veuillez saisir le numéro de l'auteur ");
            auteurs[i] = new Author(nom, prenom, age, i); 
		}
		Livre livre = new Livre(isbn,titre,auteurs);
		livre.afficher();
	} 
	    
        // Personne[] p = new Adherent[];
	public  static void displayPerson(Personne[] p) {
		for (int i = 0; i < p.length; i++) {
			try {
				System.out.println(p[i].toString());
			} catch (NullPointerException e) {
				System.out.println("La place est libre");
			}
		}
	}
			
}
