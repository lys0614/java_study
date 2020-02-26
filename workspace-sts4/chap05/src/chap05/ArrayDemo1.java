package chap05;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		//자바의 배열은 생성할 때 크기를 지정함
		//자바의 배열은 크기를 늘리거나 줄일 수 없음
		int scores[] = new int[5]; //int 타입의 빈 배열 선언
//		int[] scores1 = new int[5]; 이렇게 해도 됨.
		int sum = 0;
		
		for(int i=0; i<scores.length;i++) {
			scores[i] = in.nextInt();
		}
		for(int i=0; i<scores.length;i++) {
			sum +=scores[i];
		}
		
		System.out.println("평균 : "+sum/5.0);
	}

}
