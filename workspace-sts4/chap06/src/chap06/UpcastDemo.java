package chap06;

public class UpcastDemo {

	public static void main(String[] args) {
		Person p;
		Student s = new Student();
		
		p = s;//�ڵ����� Ÿ�Ժ�ȯ�Ǿ� p=(Person)s; �� ������
		
		p.name = "ȫ�浿";
		System.out.println(p.name);
		p.whoamI();
		System.out.println("-----------------");	
		s.name = "�Ӳ���";
		s.number = 1;
		System.out.println(s.name);
		System.out.println(s.number);
		s.whoamI();
		s.work();
		
		System.out.println("-----------------");
//		p.number=1; number�� work()�� �θ� Ÿ�Կ� ���� ����̹Ƿ� �θ�Ÿ�� �������� �� �� ����
//		p.work();
		// Person Ŭ������ ��ü ������ Student Ŭ������ ��ü�� �����Ͽ� Person Ŭ���� Ÿ������ �ڵ� Ÿ�� ��ȯ�Ǳ� ������ ����� �� ���� �κ� 
		System.out.println(p.name);
		p.whoamI();//Person Ÿ�� ����̹Ƿ� ȣ���Ҽ� �ִ�
		System.out.println("-----------------");
//		
//		Student s2;
//		Person p2 = new Person();
//		s2 = p2;// �θ�Ŭ������ �ڽ�Ŭ������ ����ȯ�� �Ұ���
		
		System.out.println("-----------------");
		//��ü�� ���� Ÿ�� ��ȯ�� �ڽ� Ŭ���� Ÿ������ ������ ��ü�� �θ� Ŭ���� Ÿ������ �����ߴٰ� �ٽ� �ڽ� Ŭ���� Ÿ������ ���� Ÿ�� ��ȯ�ϴ� ���� ������
		Student s1;
		s1 = (Student)p;
		System.out.println(s1.name);
		System.out.println(s1.number);
		s1.whoamI();
		s1.work();
	}
}
