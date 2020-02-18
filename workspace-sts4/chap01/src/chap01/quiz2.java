package chap01;
import java.util.Scanner;
public class quiz2 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("--------문1-------");
		System.out.println("     *     ");
		System.out.println("    ***    ");
		System.out.println("   *****   ");
		System.out.println("  *******  ");
		System.out.println(" ********* ");
		System.out.println("***********");
		
		System.out.println("--------문2-------");
		System.out.print("정수를 입력하세요 : ");
		int a = sc.nextInt();
		System.out.println(a + "의 제곱은 : " + a*a);
		
		System.out.println("--------문3-------");
		System.out.print("원기둥 밑면의 반지름은? : ");
		double radius = sc.nextDouble();
		System.out.print("원기둥의 높이는? : ");
		double height = sc.nextDouble();
		System.out.println("원기둥의 부피는 " + radius*radius*height*3.14);
		
		System.out.println("--------문4-------");
		System.out.print("초단위 정수를 입력해 주세요 : " );
		int sec = sc.nextInt();
		System.out.println(sec/3600 + "시간 " +((sec%3600)/60) + "분 " + sec%60 +"초");
		
		System.out.println("--------문5-------");
		System.out.print("영어 소문자 1글자를 입력 : ");
		String str = sc.next();
		char c = str.charAt(0);
		System.out.printf("%c \n",c-(32));
		
		
		System.out.println("--------문6-------");
		System.out.println("화씨 온도를 입력하세요 : ");
		double degree = sc.nextDouble();
		double ondo = (double)5/9 * (degree - 32);
		System.out.println("섭씨 온도 : " + ondo);
		
		System.out.println("--------문7-------");
		System.out.print("정수를 입력하세요 : ");
		int q7 = sc.nextInt();
		if(q7 % 4 == 0 && q7 % 5 == 0) {
			System.out.println("4 와 5로 나누어짐  "+true);
		}
		else if (q7 %4 !=0 && q7 % 5 != 0) {
			System.out.println("4 와 5로 나누어지지 않음 "+false);
		}
		
		if(q7 % 4 == 0 || q7 % 5 == 0) {
			System.out.println("4 혹은 5로 나누어 짐 " + true);
		}
		else if(q7 % 4 != 0 || q7 % 5 != 0 ) {
			System.out.println("4 혹은 5로 나누어 지지 않음 " + false);
		}
		if(q7 % 4 == 0 || q7 % 5 ==0) {
			if(q7 % 20 != 0) {
				System.out.println("4 혹은 5로 나누어 지지만 두 수 모두로는 나누어 지지 않음 "+false);
			}
			else if (q7 % 20 == 0) {
				System.out.println("4 혹은 5로 나누어 지면서 두 수 모두로 나누어 짐 " + true);
			}
		}
		
		System.out.println("--------문8-------");
		System.out.print("0~999 범위내의 정수를 입력하세요 : ");
		int q8 = sc.nextInt();
		if(q8 < 0 || q8 >=1000) {
			System.out.print("다시 입력하세요 : " );
			q8 = sc.nextInt();
		}
		int q8a = q8/100;
		int q8b = (q8 - (q8a*100))/10;
		int q8c = (q8 - (q8a*100) - (q8b*10));
		System.out.println("각 자릿수의 합 : " +(q8a+q8b+q8c));
		
		System.out.println("--------문9-------");
		// 140점 졸업학점
		System.out.print("전공 학점을 입력하세요 : ");
		int point1 = sc.nextInt();
		System.out.print("교양 학점을 입력하세요 : ");
		int point2 = sc.nextInt();
		System.out.print("일반 학점을 입력하세요 : ");
		int point3 = sc.nextInt();
		
		if(point1 >= 70) {//전공학점은 70점 이상 이어야 하며(and)
			
			if(point2 >= 30 && point3 >= 30) {//교양 일반은 각각 30점 이상 이거나(or) 총점이 80점 이상이어야 함
				System.out.println("졸업 가능");
			}
			else if(point2+point3 >= 80) {
				System.out.println("졸업 가능");
			}
			else {
				System.out.println("졸업 불가");
			}
		
		}
		else {
			System.out.println("졸업 불가");
		}
		
		
		
		
	}
}
