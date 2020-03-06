package q1;
//문1)Calculator 클래스를 생성하고 멤버 변수 int 타입 num1,num2선언
//sum, sub, multi, div 메서드 선언, 각 메서드를 사용하여 입력된 2개의 숫자를 연산하는 프로그램을 작성하기
//생성자를 통해서 숫자 2개르 입력 받음
//2개의 멤버 변수를 변경할 수 있는 getter, setter 생성

//문2) Calculator 클래스를 수정한 형태의 클래스 Calculator2 생성
//클래스 Numbers는 멤버변수 num1,num2 갖고잇음
//클래스 Cal1는 멤버 메서드 sum()을 가지고 잇음, 클래스 Number을 상속받음
//클래스 Cal2는 멤버 메서드 sub()을 가지고 잇음, 클래스 Number을 상속받음
//클래스 Cal3는 멤버 메서드 multi()을 가지고 잇음, 클래스 Number을 상속받음
//클래스 Calculator2는 멤버메서드 div()를 가지고 있음 Cal3 상속받음
public class CalculatorTest {

	public static void main(String[] args) {
		Calculator cal = new Calculator(10,3);
		int result1 = cal.sum();
		int result2 = cal.sub();
		int result3 = cal.multi();
		int result4 = cal.div();
		System.out.println("두 수의 합 = "+result1);
		System.out.println("두 수의 차 = "+result2);
		System.out.println("두 수의 곱 = "+result3);
		System.out.println("두 수의 나눔 = "+result4);
		System.out.println("--------------------------");
		
		Calculator2 cal2 = new Calculator2(10,3);
		System.out.println(cal2.sum());
		System.out.println(cal2.sub());
		System.out.println(cal2.multi());
		System.out.println(cal2.div());
		
		
		
	}
	
}
