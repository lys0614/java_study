package chap03;

public class MethodDemo2 {

	public static void main(String[] args) {
		
		System.out.println("1~10�� : "+sum(1,10));
		System.out.println("10~100��:"+sum(10,100));
		System.out.println("100~1000��:"+sum(100,1000));
	}
	
	public static int sum(int i1, int i2) {//�Ű����� �� ������ int i1, int i2�� �޴� �޼���(= �Լ�)
		int sum = 0;
		for (int i = i1; i <=i2; i ++) {
			sum+=i;
		}
		
		return sum;
	}
	
}
