package chap07;

interface Animal {

	void sound();
}


class dog implements Animal{
	public void sound() {
		System.out.println("¸Û");
	}
}

class cuckoo implements Animal{
	public void sound() {
		System.out.println("»µ„û");
	}
}

public class AnimalDemo{
	public static void main(String[] args) {
		dog d= new dog();
		cuckoo c = new cuckoo();
		
		makeSound(d);
		makeSound(c);

	}

	static void makeSound(Animal a) {
		a.sound();
	}
}
