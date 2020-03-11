package chap10;

public class GenericlassDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cup c1 = new Cup();
		
		//제네릭 사용 시 Raw타입을 지원하지만 Raw타입 사용 시  타입을 지정하는 부분이 없기 때문에 Object 클래스 타입을 사용해야 함
		//해당 객체를 다시 강제 타입 변환을 하여 사용해야 함
		c1.setBeverage(new Beer());
		
		
		//제네릭 클래스를 사용햤을 경우는 강제 타입 변환이 필요없음
		//제네릭 클래스 사용 시 타입을 지정 했으므로 타입 변환 없이 사용 가능 
//		Beer b = c1.getBeverage();
		Beer beer = (Beer) c1.getBeverage();
	}

}
