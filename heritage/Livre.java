package fr.afpa.heritage;

public class Livre {
	private int isbn;
	private String title;
	private Author []  author = new Author[4];

	public Livre(int isbn, String title, Author[]  author) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Author[] getAuthor() {
		return author;
	}

	public void setAuthor(Author[] author) {
		this.author = author;
	}

	public void afficher() {
		System.out.println("Numéro Isbn : " + isbn + "\n Auteur : " + author);
		for (int i = 0; i < author.length; i++) {
			System.out.print("   -");
			author[i].afficher();
		}
		System.out.println("]");
	}

}
