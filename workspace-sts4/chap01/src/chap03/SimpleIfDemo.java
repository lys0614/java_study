package chap03;

import java.util.Scanner;

public class SimpleIfDemo {
	// SimpleIfDemo 클래스에 필드에 Scanner 타입의 sc 속성을 선언해서 void로 숨기지 않고 공용으로 사용할 수 있게 함.
	static Scanner sc = new Scanner(System.in); 
	
	public static void main(String[] args) {
		//제어문
		//자바 프로그램에서 조건에 따라 프로그램의 흐름을 변경하는 문구
		//자바스크립트의 제어문과 동일함
		// if, if ~ else, else if, switch ~ case
		
		//단순 if문
		System.out.println("-------단순 if 문---------");
		
		System.out.print("아무 숫자 입력 하셈 : " );
		int num = sc.nextInt();
		
		if( num % 2 == 0 ) {
			System.out.println("짝수");
			}
		if( num % 2 != 0 ) {
			System.out.println("홀수");
			}
		System.out.println("종료");
		
		System.out.println("-------if ~ else 문---------");
		//if ~ else 문
		// 조건에 따라 true일때와 false일때 실행하는 실행문이 달라지는 조건문
		// 무조건 둘중 하나를 실행 해야 할때 사용하는 문구
		
		System.out.print("아무 숫자나 입력하셈 : ");
		int num2 = sc.nextInt();
		
		if(num2 % 2 == 0) {
			System.out.println("짝수");
		}
		else {
			System.out.println("홀수");
		}		
		//삼항 연산자 사용시
		System.out.println((num2 % 2 == 0)? "짝수":"홀수");
		System.out.println("종료");
		
		System.out.println("------- else if 문 ---------");

		//else if 문
		// 하나의 if 에서 여러가지 조건을 비교할 경우 사용
		// 마지막 else 문은 필요 가 없을 경우 삭제 해도 됨
		String grade = "";
		System.out.print("점수를 입력하세요 : ");
		int score = sc.nextInt();
		
		if(score >= 90) {grade = "A";}
		else if (score >= 80) {grade = "B";}
		else if (score >= 70) {grade = "C";}
		else if (score >= 60) {grade = "D";}
		else {grade = "F";}
		System.out.println("님 성적은 : "+grade);
		
		System.out.println("------- 중첩 if 문 ---------");
		//중첩 if 문
		// if문 내부에 if문을 사용하는 방식
		// if문, if ~ else 문, else if문에 또다른 if문을 사용하는 방식.
		
		String grade2 = "";
		System.out.print("점수를 입력하세요 : ");
		int score2 = sc.nextInt();
		
//		if (score2 >= 90) {
//			grade2 ="A";
//		}
//		else {
//			if(score2 >= 80) {
//				grade2 = "B";
//			}else {
//				if(score2 >= 70) {
//					grade2 = "C";
//				}else {
//					if(score2 >= 60) {
//						grade2 = "D";
//					}else {
//						grade2 = "F";
//					}
//				}
//			}
//		}
		//중첩if문 사용해서 프로그램 만들기
				
			if(score2 >= 60) {
				grade2 = "D";
					if(score2 >= 70) {
						grade2 = "C";
						if(score2 >= 80) {
							grade2 = "B";
							if(score2 >= 90) {
								grade2 ="A";								
							}
						}
					}
				}
			else {
				grade2 = "F";
			}
		
		System.out.println("님 학점은 : "+grade2);
		
		System.out.println("------- switch ~ case 문 ---------");
		//switch 문 자바스크립트의 switch ~ case 문과 동일함
		//switch 의 조건문의 결과값을 case에서 찾아서 실행하는 형태이다.
		//case에 결과값이 없을 경우 default를 실행하지만, default값이 반드시 필요한것은 아님. else if 문의 else와 같은 맥락.
		//break : 프로그램 실행 중 break문을 만날 시 해당 조건문 or 반복문을 즉시 종료함.
		//switch~case 문에서 break 문을 입력하지 않으면 switch 문의 코드블럭이 끝날때 까지 계속 실행함 = 조건문 활용을 목적으로 하는데 목적이 이루어지지 않음.
		System.out.print("등수 입력하셈 : ");
		int rank = sc.nextInt();
		
		switch(rank) {
		case 1 : System.out.println("1등 ㅊㅋ \n"); break;
		case 2 : System.out.println("2등 콩 \n"); break;
		case 3 : System.out.println("3등 굳 \n"); break;
		case 4 : System.out.println("4등 ㄴㅇㅅ \n"); break;
		default : System.out.println("순위권 밖임 ㅅㄱ \n");
		}
		
		
		int num3 = 3;
		
		switch (num = 3) {// break 문이 없으니 case3부터 case1까지 전부 실행함.
		case 4 : System.out.print("*");
		case 3 : System.out.print("*");
		case 2 : System.out.print("*");
		case 1 : System.out.print("*");
		}
		
		
		
		
		
		
		
		
		
		System.exit(0);//프로그램 종료시켜서 쓰레기 데이터 없애느 ㄴ용
	}//main 메서드 닫는 괄호

}//SimpleIfDemo 클래스 닫는 괄호
