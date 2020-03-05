package chap06;

public class UpcastDemo {

	public static void main(String[] args) {
		Person p;
		Student s = new Student();
		
		p = s;//자동으로 타입변환되어 p=(Person)s; 와 동일함
		
		p.name = "홍길동";
		System.out.println(p.name);
		p.whoamI();
		System.out.println("-----------------");	
		s.name = "임꺽정";
		s.number = 1;
		System.out.println(s.name);
		System.out.println(s.number);
		s.whoamI();
		s.work();
		
		System.out.println("-----------------");
//		p.number=1; number와 work()는 부모 타입에 없는 멤버이므로 부모타입 변수에서 볼 수 없다
//		p.work();
		// Person 클래스의 객체 변수에 Student 클래스의 객체를 대입하여 Person 클래스 타입으로 자동 타입 변환되기 때문에 사용할 수 없는 부분 
		System.out.println(p.name);
		p.whoamI();//Person 타입 멤버이므로 호출할수 있다
		System.out.println("-----------------");
//		
//		Student s2;
//		Person p2 = new Person();
//		s2 = p2;// 부모클래스는 자식클래스로 형변환이 불가능
		
		System.out.println("-----------------");
		//객체의 강제 타입 변환은 자식 클래스 타입으로 생성된 객체를 부모 클래스 타입으로 변경했다가 다시 자식 클래스 타입으로 강제 타입 변환하는 것이 가능함
		Student s1;
		s1 = (Student)p;
		System.out.println(s1.name);
		System.out.println(s1.number);
		s1.whoamI();
		s1.work();
	}
}
