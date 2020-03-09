package p281q;

interface Delicious extends Edible, Sweetable {
	
}

interface Sweetable{
	void sweet();
}

interface Edible{
	void eat();
}

class Deli implements Delicious{
	
	public void sweet() {
		System.out.println("���˵�");
	}
	
	public void eat() {
		System.out.println("�����");
	}
	
}
