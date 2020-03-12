package p434q;
import java.util.*;


public class quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Person> set = new HashSet<>();
		//PersonŸ���� HashSet ��ü�� ����
		set.add(new Person("�迭��",20));
		set.add(new Person("�ְ��",56));
		set.add(new Person("����",16));
		set.add(new Person("���ڹ�",35));
		
		for(Person s : set) {//�÷����� �̿��� �ݺ������� ���
			System.out.println(s.name + " : " + s.age);
		}

		Iterator<Person> iterator = set.iterator();
		while(iterator.hasNext()) {//Iterator �ݺ��� ��Ʈ�� �� �̿��� ���
			System.out.print(iterator.next() + " ");
		}

	}

}

class Person{
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public int hashCode() {
	
		return name.hashCode() + age;
	}
	
	public boolean equals(Object o) {
		boolean result = false;
		
		if(o instanceof Person) {
			Person p = (Person)o;
			if(name.equals(p.name)&&age == p.age) {
				result = true;
			}
		}
		return result;
		//		if(o instanceof Person) {
//			return ((Person) o).name.equals(name);
//		}
//		return false;
	}
	
	public String toString() {
		return "Person["+this.name+", "+ this.age+"]";
	}
}