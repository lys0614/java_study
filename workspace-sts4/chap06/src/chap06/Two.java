package chap06;

public class Two {

	void Print() {
		One O = new One();
		//동일패키지 내에서 One 클래스를 객체로 인스턴스화
		
		
//		System.out.println(O.secret); private접근제한자 -> 외부접근 안됨
		System.out.println(O.roommate);//default 접근제한자 -> 외부접근 됨, 외부패키지접근 안됨
		System.out.println(O.child);//protected 접근제한자 -> 외부접근 됨, 외부패키지접근 안됨, 외부패키지에서 상속받으면 접근 됨.
		System.out.println(O.anybody);//public 접근제한자 -> 외부접근 됨, 외부패키지접근 됨,
	}
}
