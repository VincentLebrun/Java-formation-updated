package fr.afpa.heritage;



public class Author extends Personne {
     private int numAuthor;

	public Author(String name, String surname, int age, int numAuthor) {
		super(name, surname, age);
		this.numAuthor = numAuthor;
	}

	public int getAuthor() {
		return numAuthor;
	}

	public void setAuthor(int numAuthor) {
		this.numAuthor = numAuthor;
	}
	public void afficher() {
       System.out.println(" coucou " );
       
      
	}
	
}
