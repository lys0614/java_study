package p434q;
import java.util.*;


public class quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Person> set = new HashSet<>();
		//Person타입의 HashSet 객체를 선언
		set.add(new Person("김열공",20));
		set.add(new Person("최고봉",56));
		set.add(new Person("우등생",16));
		set.add(new Person("나자바",35));
		
		for(Person s : set) {//컬렉션을 이용한 반복문으로 출력
			System.out.println(s.name + " : " + s.age);
		}

		Iterator<Person> iterator = set.iterator();
		while(iterator.hasNext()) {//Iterator 반복자 스트림 을 이용한 출력
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