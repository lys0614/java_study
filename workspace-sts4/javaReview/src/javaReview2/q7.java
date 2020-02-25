package javaReview2;

public class q7 {

	public static void main(String[] args) {
	
		GolfClub g1 = new GolfClub();
		g1.print();
		GolfClub g2 = new GolfClub(8);
		g2.print();
		GolfClub g3 = new GolfClub("퍼터");
		g3.print();
	}
}

class GolfClub {
	String GolfName;
	//생성자 = 클래스명이랑 같은 이름을 가지고 있으며, 인스턴스화 할때 입력하는 매개변수에 따라 같은 이름이지만 다른 효과를 낼 수 있다. 오버로딩의 개념을 이용할 수 있다는것
	public GolfClub() {//매개변수가 없는 생성자
		GolfName = "7번 아이언 입니다";
	}
	public GolfClub(int a) {//매개변수가 있는 생성자 1
		GolfName = a+"번 아이언 입니다";
	}
	
	public GolfClub(String a) {//매개변수가 있는 생성자 2
		GolfName = a+"입니다";
	}
	public void print() {
		System.out.println(GolfName);
	}
}
