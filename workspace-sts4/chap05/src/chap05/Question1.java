package chap05;

import java.util.Arrays;
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		
		//학생 수 와 점수를 입력하면 각 학생의 성적을 추력하는 프로그램을 작성해 보자
		int NumOfStudents = 0;
		int[] scores;
		Scanner in = new Scanner(System.in);
		
		System.out.print("학생 수를 입력하시오 : ");
		NumOfStudents = in.nextInt();
		scores = new int[NumOfStudents];
		
		for(int i=0; i<NumOfStudents;i++) {
			System.out.print("성적을 입력하시오 : ");
			int grade = in.nextInt();
			scores[i] += grade;
		}
		System.out.println(NumOfStudents+"명의 학생의 성적은 다음과 같습니다");
//		for(int i=0; i<NumOfStudents; i++) {
//			System.out.print(scores[i]+" ");
//		}
		for(int i:scores) {
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i=0; i<scores.length; i++) {
			if(scores[i] >= 90) {
				System.out.println(i+"번 학생의 성적은 A 입니다");
			}
			else if(scores[i] >= 80) {
				System.out.println(i+"번 학생의 성적은 B 입니다");
			}
			else if(scores[i]>= 70) {
				System.out.println(i+"번 학생의 성적은 C 입니다");
			}
			else if(scores[i] >= 60) {
				System.out.println(i+"번 학생의 성적은 D 입니다");
			}
			else if(scores[i]< 60 && scores[i]>0) {
				System.out.println(i+"번 학생의 성적은 F 입니다");
			}
			else if(scores[i]<0) {
				System.out.println("잘못 입력하였습니다");
			}
		}
		
		
		
	}
	
}
