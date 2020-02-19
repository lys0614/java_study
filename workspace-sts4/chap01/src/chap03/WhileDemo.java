package chap03;

public class WhileDemo {

	public static void main(String[] args) {
		System.out.println("===========while 1=============");
		int i = 1;
		while(i < 5) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println("\n ===========while 2=============");
		int row = 2;
		while(row<10) {
			System.out.print("구구단 "+row+"단 : ");
			int column = 1;
			while(column < 10) {
				System.out.printf("%4d", row*column);//%4d = 4자리수 10진수로 출력하라는 뜼, 빈자리는 공백임
				//%-4d이면 10진수 4자리수 이며, 왼쪽정렬함. 그래도 빈자리는 공백임
				//ex) : %-4d 로 10 표현 > "10  "
				column++;
			}
			System.out.println();
			row++;
		}
		
		System.out.println("===========do while 1=============");
		
		int a = 1;
		do {
			System.out.print(a + " ");
			a++;
		}while(a < 5);
		
		System.out.println("\n===========do while 2=============");
		
		int x = 10;
		do {
			x++;//조건이 맞지 않아도 do 문에서 1번 실행하기 때문에 x값 변동이 있음.
		}while(x<5);
		System.out.println("do~while문 실행후 x : "+x);
		
		x = 10;
		while(x<5) {
			x++;//조건이 맞지 않아서 코드를 한번도 실행하지 않으므로 x값 변경 없음
		}
		System.out.println("while문 실행후 x : "+x);
		
		
		System.exit(0);
	}
}
