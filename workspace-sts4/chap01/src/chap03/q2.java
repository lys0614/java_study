package chap03;
import java.util.Scanner;
public class q2 {
	
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("------------------문1---------------------");
		int age;
		System.out.print("나이를 입력하시오 : ");
		age = in.nextInt();
		if(age >= 19) {
			System.out.println("성년");
		}
		else if(age < 19) {
			System.out.println("미성년");
		}
		System.out.println("------------------문2-----------------------");
		System.out.print("순위를 입력하시오 : ");
		int rank = in.nextInt();
		switch(rank) {
		case 1 : System.out.println("아주 잘했습니다"); break;
		case 2 : System.out.println("잘했습니다"); break;
		case 3 : System.out.println("잘했습니다"); break;
		case 4 : System.out.println("보통입니다"); break;
		case 5 : System.out.println("보통입니다"); break;
		case 6 : System.out.println("보통입니다"); break;
		default : System.out.println("노력해야 겠습니다"); break;
		}
		System.out.println("------------------문3-----------------------");
		System.out.print("양의 정수를 입력하세요 : ");
		int sum = in.nextInt();
		int res = 0;
		do {
			res+=sum;
			System.out.print("양의 정수를 입력하세요 : ");
			sum = in.nextInt();
		}
		while(sum > 0);
		System.out.println("입력한 양의 정수들의 합 : "+res);
		System.out.println("------------------문4-----------------------");
		String q4 = "";
		for(int i=1; i<=5; i++) {
			q4+="*";
			System.out.println(q4);
		}
		
		System.out.println("------------------문5-----------------------");
		int a,b,c;
		for(c=1;c<100;c++) {
			for(b=1;b<100;b++) {
				for(a=1;a<100;a++) {
					
				}
			}
		}
		System.out.println("------------------문6-----------------------");
		//가위 s 바위 r 보 p
		System.out.println("가위 s 바위 r 보 p");
		System.out.print("내가 가위바위보 하는데 낼 거 입력하셈 : ");
		String cheolsu = in.next();
		System.out.print("영희가 가위바위보 하는데 낼 거 입력하셈 : ");
		String yeonghui = in.next();
		whoswin(cheolsu, yeonghui);
		if(cheolsu.equals("s")) {
			if(yeonghui.equals("s")) {
				System.out.println("비김");
			}
			else if(yeonghui.equals("r")) {
				System.out.println("짐");
			}
			else if(yeonghui.equals("p")) {
				System.out.println("이김");
			}
		}
		if(cheolsu.equals("r")) {
			if(yeonghui.equals("s")) {
				System.out.println("이김");
			}
			else if(yeonghui.equals("r")) {
				System.out.println("비김");
			}
			else if(yeonghui.equals("p")) {
				System.out.println("짐");
			}
		}
		if(cheolsu.equals("p")) {
			if(yeonghui.equals("s")) {
				System.out.println("짐");
			}
			else if(yeonghui.equals("r")) {
				System.out.println("이김");
			}
			else if(yeonghui.equals("p")) {
				System.out.println("비김");
			}
		}
		System.out.println("------------------문7 - 6-----------------------");
		//가위 s 바위 r 보 p
		String c1 = input("철수");
		String y1 = input("영희");
		whoswin(c1, y1);

		
		System.exit(0);
	}
	
	public static String input(String a) {
		
		return "";
	}

	public static String whoswin(String a, String b) {
		
		return "";
	}

}
