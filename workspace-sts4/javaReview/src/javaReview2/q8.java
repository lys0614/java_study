package javaReview2;
import java.lang.Math;

public class q8 {
	public static void main(String[] args) {
		
	Dice d = new Dice();
	System.out.println("�ֻ����� ���� : " + d.roll());
	
	}
}
//(int)(Math.random()*n) = 0~(n-1) ���� ���� ���� �� �ƹ��ų� �ϳ� ��ȯ��.
//Math.random()�� 0.0~1.0 ������ ������ �Ǽ��� ��ȯ�ϴ� �ǵ� �ű⿡ n���� ���ؼ� �ϴ°�.
//(int)(Math.random()*n)�� ���� 0~1 ������ �����ε� ���� �ƹ��͵� ���� ������ n�� �����־ ������ Ȯ���Ű�°�. �ִ� �������� ���� ������ ���Ե��� �ʴ� �����̱� ������ ���� �� �ڿ� +1�� ��� 1���� n������ ������ ���ϴ� ������� ����Ѵ�.
class Dice{
	public int face;
	public int roll() {
		face = (int)(Math.random()*6 + 1);
		return face;
	}
	
}