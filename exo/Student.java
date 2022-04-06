package fr.afpa.exo;

class Student {
	public String name;
	private int age;

	public  Student(String name, int age) {
		this.age = age;
		this.name = name;
	}

//name}
	public String getName() {
		return (this.name);
	}

	public void setName(String name) {
		this.name = name;
	}

//age
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
