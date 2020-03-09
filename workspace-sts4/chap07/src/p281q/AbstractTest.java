package p281q;

public class AbstractTest {

	public static void main(String[] args) {
		
		Concrete c = new Concrete(100,50);
		c.show();
	}

}

abstract class Abstract{
	int i;
	
	Abstract(int a){
		this.i = a;
	}
	
	void show() {}
}

class Concrete extends Abstract{
	int j;
	
	public Concrete(int a, int b) {
		super(a);
		this.j = b;
	}
	
	void show() {
		System.out.println("i = "+i+", j = "+j);
	}
	
}