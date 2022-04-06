package fr.afpa.exo;

import java.util.Scanner;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class callStudent {

	public static void main(String[] args) {
		String name;
		String changeName;
		int age;
		Scanner sc = new Scanner(System.in);
		Student[] arr;
		arr = new Student[9];
		arr[0] = new Student("Pierre", 23);
		arr[1] = new Student("Christophe", 45);
		arr[2] = new Student("Christian", 39);
		arr[3] = new Student("Rémi", 25);
		arr[4] = new Student("Joe", 33);
		arr[5] = new Student("Eric", 28);
		arr[6] = new Student("Toto", 18);

		System.out.println("Changez le nom de Toto en marie ");
		changeName = sc.next();
		arr[6].name = changeName;
		// Student res = recherche(arr, "Eric");
		addPers(arr);
		// System.out.println(arr[7].getName());
		// System.out.println("Search DONE \n Result : Name : " + res.getName() + ", Age
		// : " + res.getAge());
		System.out.println(arr[6].getName());

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null)
				System.out.println(i + " : " + arr[i].getName() + arr[i].getAge());
		}
		// List<Student> student = new ArrayList<>(9);
		// Calling student methods from instance
		/*
		 * for (int i = 0; i < 10; i++) {
		 * System.out.println("Veuillez entrez le prénom n ° " + (i + 1)); nom =
		 * sc.next(); System.out.println("Quel est son age ?"); age = sc.nextInt();
		 * student.add(new Student(name, age )); }
		 */
	}

	public static Student recherche(Student[] tata, String name) {
		// TODO Auto-generated method stub
		for (int i = 0; i < tata.length; i++) {
			if (tata[i] != null && tata[i].getName().equals(name)) {
				return tata[i];
			}
		}
		return null;
	}

//Si il n'y a pas de retour utiliser le void car on ne vas pas nécessairement vouloir afficher 
	public static void addPers(Student[] tata) {
		Scanner sc = new Scanner(System.in);
		String p;
		int a;
		int cpt = 0;
		System.out.println("saisissez un prénom ");
		p = sc.next();
		System.out.print("Son age");
		a = sc.nextInt();
		Student s = new Student(p, a);
		Student res = recherche(tata, s.getName());
		if (res != null)
			System.out.println("l'utilisateur existe déjà ");
		else {
			for (int i = 0; i < tata.length; i++) {
				if( tata[i] != null) 
					cpt++ ; 
			}
			if(cpt < tata.length) 
				tata[cpt] = s;
		}

	}

}
