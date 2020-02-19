package chap03;

public class MethodDemo {

	public static void main(String[] args) {
		int sum = 0 ;
		for (int i=1; i<=10;i++) {
			sum+=i;
		}
		System.out.println("1~10의 합"+sum);
		sum = 0;
		
		for(int i = 10; i <= 100; i++) {
			sum+=i;
		}
		System.out.println("10~100의 합 : "+sum);
		sum = 0;
		
		for(int i=100;i<=1000;i++) {
			sum+=i;
		}
		System.out.println("100~1000의 합 : "+sum);
	}
}
