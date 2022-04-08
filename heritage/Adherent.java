package fr.afpa.heritage;

public class Adherent extends Personne {

	int idA;

	public Adherent() {
	}

	public Adherent(String name, String surname, int age, int idA) {
		super(name, surname, age);
		this.idA = idA;
	}

	public int getIdA() {
		return idA;
	}

	public void setIdA(int idA) {
		this.idA = idA;
	}

	public void display() {

		System.out.println(
				"nom = " + getName() + "prenom :" + getSurname() + "age : " + getAge() + "numero adherent : " + idA);
	}
}
