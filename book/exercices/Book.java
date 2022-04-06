package exercices;

class Book {

	int id;
	String title;
	String author;
	int price;

	/**
	 * 
	 */
//  Book default
	Book() {
	};

	/**
	 * @return
	 */
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * 
	 * @param title
	 * @param author
	 * @param price
	 */
	public Book(int id, String title, String author, int price) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;

	}

	public String toString() {
		return " id " + " " + id + " Titre : " + " " + title + " Auteur : " + " " + author + " Prix : " + price;

	}

}
