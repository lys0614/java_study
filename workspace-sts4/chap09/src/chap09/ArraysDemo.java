package chap09;

import java.util.Arrays;//java.lang 패키지에 잇는게 아니어서 import문을 사용해줘야함

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] a1 = {'j','a','v','a'};
		char[] a2 = Arrays.copyOf(a1, a1.length);//배열 복사
		System.out.println(a2);
		
		String[] sa = {"케이크","애플","도넛","바나나","오이"};
		print(sa);
		
		Arrays.sort(sa);//배열원소들 정렬하는 키워드
		print(sa);
		
		System.out.println(Arrays.binarySearch(sa,"애플")); // 배열 위치를 탐색함
		
		Arrays.fill(sa, 2,4,"기타"); // 배열의 인덱스 2번에서 4-1번까지 원소를 기타 문자열로 채운다
		print(sa);
	}
	
	static void print(Object[] oa) {
		for(Object o : oa) {
			System.out.print(o+" ");
		}
		System.out.println();
	}

}
