package chap03;
import java.util.Scanner;
public class q1 {

	public static void main(String[] args) {
		
		int result;
		int n = 0;
		Scanner in = new Scanner(System.in);
	
		System.out.print("팩토리얼을 구할 값을 입력하시오 (정수): ");
		n = in.nextInt();
		System.out.print(n);
		result = 1;
		while(true) {
			result *= n;
			n--;
			if(n <= 0 ) {
				break;
			}
		}
		System.out.println(" 팩토리얼 : "+result);
		System.out.println("-----------------------------------------");
		
		System.out.print("팩토리얼을 구할 값을 입력하시오 (정수): ");
		int n1 = in.nextInt();
		result = Factorial(n1);
		System.out.println("메서드 Factorial 을 써서 만든 결과값 " + result);
		
		System.out.println("-----------------------------------------");
		System.out.println(Factorial(5));
		System.out.println(Factorial(1,5));
		System.out.println(Factorial(3,5));
		System.out.println(Factorial(10,5));
		
		System.exit(0);
	}
	
	public static int Factorial(int x) {
		int r = 1;
		
		while(true) {
			r *= x;
			x--;
			if(x <= 0) {
				break;
			}
		}
		return r;
	}
	
	public static int Factorial(int x, int y) {
		int r=1;
		if(x < y) {
			while(true) {
			r *= x;
			x++;
				if(x > y) {
				break;
				}
			}
		}
		return r;
	}
}
