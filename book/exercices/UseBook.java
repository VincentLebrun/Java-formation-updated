package exercices;

import java.util.Scanner;

public class UseBook {
	public static void main(String[] arg) {
		int id, price;
		String title, author;
		Book[] books;
		Scanner sc = new Scanner(System.in);

		books = new Book[2];
		addBook(books);
		System.out.println(books[1].toString());
	}

	public static void addBook(Book[] b) {
		//imports
		Scanner sc = new Scanner(System.in);
		//variable
		int id, price;
		String ti, au;
		int cpt = -1;
		//loop to read the size of array 
		for (int i = 0; i < b.length; i++) {
			System.out.println("Veuillez saisir un id!");
			id = sc.nextInt();
			System.out.println("Veuillez saisir un titre!");
			ti = sc.next();
			System.out.println("Veuillez saisir un auteur!");
			au = sc.next();
			System.out.println("Veuillez saisir un prix!");
			price = sc.nextInt();
			Book s = new Book(id, ti, au, price);
			if (b[i] == null) {
				cpt++;
			}
			if (cpt < b.length) {
				b[cpt] = s;
			}

		}
		sc.close();
	}

}