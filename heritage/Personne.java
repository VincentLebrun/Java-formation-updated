package fr.afpa.heritage;

public class Personne {
	// Define variable
	private String name;
	private String surname;
	private int age;

	// Constructor field
	public Personne(String name, String surname, int age) {
		this.name = name;
		this.surname = surname;
		this.age = age;
	}

	// Person default
	Personne() {
	};

	public void display() {
		System.out.println("Nom: " + name + ", prenom: " + surname + ", age: " + age);
	}

	// getter setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return "Personne [nom = " + name + ", prenom = " + surname + ", age = " + age + "]";
	}

}
