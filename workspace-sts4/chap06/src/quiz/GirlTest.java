package quiz;

public class GirlTest {

	public static void main(String[] args) {
		
//		Girl g1 = new Girl(); //클래스 Girl 을 객체로 생성
//		Girl g2 = new GoodGirl(); //부모클래스 Girl의 객체로 사용하고 자식 클래스 GoodGirl의 객체를 생성, 부모 클래스 타입으로 선언되었기 때문에 Girl 클래스가 가진 멤버만 사용 가능하다.
//		GoodGirl gg = new BestGirl(); //부모클래스  GoodGirl의 객체로 사용하고 자식클래스 BestGirl의 객체를 생성, 부모클래스 타입으로 선언되었기 때문에  GoodGirl 클래스가 가진 멤버만 사용 가능하다.
//		
		
		//g2.show();//Girl 클래스는 show()메서드가 없으므로 g2는 show()메서드를 사용할 수 없음
//		gg.show(); //BestGirl 클래스 에서 show()메서드를 상속받아 오버라이딩하여 사용한걳
		
		Girl[] girls = {new Girl("갑순이"), new GoodGirl("콩쥐"), new BestGirl("황진이")};
		
		for(Girl g : girls) {
			g.show();//다형성을 사용하여 하나의 메서드로 여러가지 메서드를 실행한 효과
		}
		System.out.println("----------------------");
	}


}