package chap03;

public class MethodDemo3 {

	public static void main(String[] args) {
		
		Mathman1();
		Mathman2(5,9);
		int[] result3 = new int[4];
		result3 = Mathman3();
		System.out.println("----------Mathman3--------");
		System.out.println("변수 a+b 는 : "+result3[0]);
		System.out.println("변수 a-b 는 : "+result3[1]);
		System.out.println("변수 a*b 는 : "+result3[2]);
		System.out.println("변수 a/b 는 : "+result3[3]);
		int[] result4 = new int[4];
		result4 = Mathman4(10,7);
		System.out.println("-----------Mathman4---------");
		System.out.println("변수 a+b 는 : "+result4[0]);
		System.out.println("변수 a-b 는 : "+result4[1]);
		System.out.println("변수 a*b 는 : "+result4[2]);
		System.out.println("변수 a/b 는 : "+result4[3]);
		
		System.exit(0);
	}
	
	public static void Mathman1() {
		System.out.println("--------------Mathman1----------");
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(a+"+"+b+"="+c);
		c = a-b;
		System.out.println(a+"-"+b+"="+c);
		c = a*b;
		System.out.println(a+"*"+b+"="+c);
		c = a/b;
		System.out.println(a+"/"+b+"="+c);
		
	}
	
	public static void Mathman2(int a, int b) {//return 하는 값이 없으면 void 해야 한다.
		//2번형식 : 매개변수 o 반환값 x
		System.out.println("--------------Mathman2----------");
		int plus = a + b;
		int minus = a - b;
		int multi = a * b;
		int divide = a / b;
		System.out.println("두 수의 덧셈은 : "+a+"+"+b+"="+plus);
		System.out.println("두 수의 뺄셈은 : "+a+"-"+b+"="+minus);
		System.out.println("두 수의 곱셈은 : "+a+"*"+b+"="+multi);
		System.out.println("두 수의 나눗셈은 : "+a+"/"+b+"="+divide);
	}
	
	public static int[] Mathman3() {//반환값이 있을땐 세번째 코드에 반환값의 형식을 정하는 단어가 있어야 함.
		//3번형식 매개변수 x 반환값 o

		int a = 20;
		int b = 5;
		int[] c = new int[4];//4개 포함할수있는 배열 선언
		c[0] = a+b;
		c[1] = a-b;
		c[2] = a*b;
		c[3] = a/b;
		
		return c;
	}
	
	public static int[] Mathman4(int a, int b) {
		//4번형식 매개변수 o, 반환값 o
		
		int[] c = new int[4];
		c[0] = a+b;
		c[1] = a-b;
		c[2] = a*b;
		c[3] = a/b;
		return c;
	}
}
