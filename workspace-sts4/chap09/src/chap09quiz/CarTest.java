package chap09quiz;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car myCar = new Car("그렌져");
		Car yourCar = new Car("그렌져");
		String bigyo ;
		Date date = new Date();
		
		if(myCar.equals(yourCar.getName()) == true) {
			bigyo = "같다";
		}
		else{
			bigyo = "다르다";
		}
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("MM-dd-YYYY");
		String s = MessageFormat.format("내 차 [{0}], 니 차 [{1}] 로  {2}", myCar.getName(), yourCar.getName(), bigyo);
		String s1 = MessageFormat.format("날짜: {0}, 자동차 모델 = {1}, 운전자(홍길동)", sdf1.format(date), myCar.getName());
		System.out.println(s);
		System.out.println(s1);

		StringTokenizer token = new StringTokenizer(s1," =,()");
		//문장에 있는 문자들을 문자단위로 구분하여 추출하려할때 쓰는 클래스 StringTokenizer.
		//StringTokenizer(구분할 문자열 변수명, "조건들");
		//조건들에는 공백문자도 포함하므로 조건과 조건 사이에 공백을 안써도 된다.
		//즉, 이 문장에서 구분 추출의 조건은 공백문자 / = / , / ( / ) 이다.
		System.out.println(token.countTokens());
		
		while(token.hasMoreTokens()) {
			System.out.println(token.nextToken());
		}
	}

}

class Car{
	String name;
	public Car(String name){
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public boolean equals(String yourCar){
		if(this.name == yourCar) {
			return true;
		}
		else{
			return false;
		}
	}
}