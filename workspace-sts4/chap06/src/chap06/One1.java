package chap06;

public class One1 extends One{
//One 클래스를 상속받음
	void print() {
		
//		System.out.println(secret); 접근제한자가 private라 상속안되서 접근안됨
		System.out.println(roommate); //default 접근제한자 -> 상속자가 접근가능
		System.out.println(child);//protected 접근제한자 -> 상속자가 접근가능
		System.out.println(anybody);//public 접근제한자 -> 상속자가 접근가능, 상속가능 + 외부접근가능
	}
//	@Override
//	void show() {
//		
//	}
	
	
}
