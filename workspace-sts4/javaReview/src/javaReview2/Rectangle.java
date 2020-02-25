package javaReview2;

public class Rectangle {
	//클래스 멤버 변수
	//클래스 내에서 전체적으로 사용하는 변수
	
	
	//클래스의 멤버들
	int width=50;//클래스의 멤버 변수
	int height=100;//클래스의 멤버 변수
	
	public void area1() {//클래스의 멤버 메서드
		int width = 10;//메서드 area1()의 지역 변수
		int height = 5;//메서드 area1()의 지역 변수
//		area1()이 실행될때 메모리에 등록되고 끝날때 메모리에서 제거됨		
		System.out.println("사각형의 넓이는 : "+(width*height));
	}
	
	public void area2() {
		int x = 10;
		int y = 5;
		
		System.out.println("지역변수 x*y = "+x*y);
		System.out.println("클래스 멤버 변수 width*hegiht는 "+width*height);
	}
	
	public void area3() {
		int width = 10; // 지역변수이지만 클래스의 전역 멤버 변수와 동일한 이름
		int height =  5;// 지역변수이지만 클래스의 전역 멤버 변수와 동일한 이름
		//이름이 같으면 클래스 전역 멤버 변수보다 지역변수가 우선순위를 가진다.
		//(this). 를 사용하면 클래스 전역 멤버변수를 호출할 수 있음.
		System.out.println("지역변수 width*height = "+width*height);
		System.out.println("클래스 멤버 변수 width*hegiht는 "+this.width*this.height);
	}
	public void area4() {
		int x = 0;
		for(int i = 0; i < 5; i++) {
			int y=0;
			System.out.println("변수 x의 값 : "+x+"\n 변수 y의 값 : "+y+"\n");
			x++;
			y++;
		}
		
	}
}
