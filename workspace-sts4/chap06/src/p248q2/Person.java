package p248q2;

public class Person {
	protected String name;
    protected int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public Person(String a, int b){
		setName(a);
		setAge(b);
	}
	
//	void show() {
//		System.out.println("��� [�̸� : "+name+", ���� : "+age+"]");
//	}
	
	public String show() {
		return "��� [�̸� : "+name+", ���� : "+age+"]";
	}
}
