package chap04;

//서브 클래스 : 메인 클래스인 PhoneDemo를 실행하기 위해서 필요한 클래스
class Phone {// 클래스 선언
	//필드
	//멤버 선언
	String model; // 모델 명을 저장할 멤버 변수
	int value; // 가격을 저장할 멤버 변수
	
	//void는 없다, 비었다라는 의미고. 반환값이 없음을 뜻함
	void print() {//메서드(함수)라서 ()가 필요함
		System.out.println(value + "만 원짜리 " + model + "스마트폰");
	}
}

public class PhoneDemo {
	//메인 클래스
	//클래스 중 메인으로 동작할 클래스에만 접근 제한자를 public으로 사용한다
	//클래스는 설계도기 때문에 실행시 필요한 ()이 필요없음
	public static void main(String[] args) {
		Phone myPhone = new Phone(); // 클래스 Phone 을 new 키워드를 통해서 인스턴스화 함 == 메모리에 등록함
		myPhone.model = "갤럭시s20"; // 변수 model에다가 갤럭시s20을 넣은 것인데. myPhone이라는 클래스에서 model이라는 변수를 꺼내왔다는 뜻.
		myPhone.value = 160;// 변수 value에다가 160을 넣은것인데 myPhone이라는 클래스에서 value라는 변수를 꺼내왔다는 뜻
		myPhone.print();// myPhone클래스에 있는 print()멤버 메서드를 가지고옴 그리고 메서드 안에 있는 동작들을 실행함
		
		Phone yourPhone = new Phone(); // 클래스 Phone을 yourPhone 이라는 이름으로 메모리에 등록함.
		yourPhone.model = "G6";
		yourPhone.value = 85;
		myPhone.print();
	}

}
