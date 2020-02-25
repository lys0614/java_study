package javaReview2;
import java.lang.Math;

public class q8 {
	public static void main(String[] args) {
		
	Dice d = new Dice();
	System.out.println("주사위의 숫자 : " + d.roll());
	
	}
}
//(int)(Math.random()*n) = 0~(n-1) 범위 내의 정수 를 아무거나 하나 반환함.
//Math.random()은 0.0~1.0 사이의 무작위 실수를 반환하는 건데 거기에 n값을 곱해서 하는것.
//(int)(Math.random()*n)의 경우는 0~1 사이의 정수인데 값이 아무것도 없기 떄문에 n을 곱해주어서 범위를 확장시키는것. 최대 범위값에 적힌 정수는 포함되지 않는 범위이기 때문에 보통 식 뒤에 +1을 적어서 1부터 n까지의 범위를 구하는 방식으로 사용한다.
class Dice{
	public int face;
	public int roll() {
		face = (int)(Math.random()*6 + 1);
		return face;
	}
	
}