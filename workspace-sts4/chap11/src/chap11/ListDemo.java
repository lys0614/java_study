package chap11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		
		String[] name1 = {"사슴","호랑","바다표범","곰"}; // 문자열 배열 선언 및 데이터 추가

		List<String> list = Arrays.asList(name1);//배열을 리스트타입으로 변환 후 저장
		list.set(1, "앵무새");//set()을 사용하여 데이터 변경
		
		//화면에 리스트 출력
		for(String s : list) {
			System.out.print(s + "\t");
		}
		System.out.println();

		//리스트 데이터 정렬
		list.sort((x,y) -> x.length() - y.length());
		
		//리스트를 배열로 변환
		//리스트는 크기가 유동적이기 때문에 배열로 변환 시 새로운 배열을 생성하여 저장해야함
		String[] name2 = list.toArray(new String[list.size()]);
		for(int i=0; i<name2.length;i++) {
			System.out.print(name2[i]+"\t");
		}
		
		System.out.println("\n-------------------");
		
		List<String> list2 = new ArrayList<String>();
		System.out.println(list2.size());
		
		list2.add("야");
		list2.add("왜");
		list2.add("뭐");
		System.out.println(list2.size());
		
		for(int i=0;i<list2.size();i++) {
			System.out.print(list2.get(i)+ " ");//list2의 i번 인덱스 데이터를 출력
		}
		System.out.println();
		
		list2.remove(0);
		
		for(String s : list2) {
			System.out.print(s + " ");
		}
		
		list2.set(0, "응");
		System.out.println();
		for(String s : list2) {
			System.out.print(s + " ");
		}
	}

}
