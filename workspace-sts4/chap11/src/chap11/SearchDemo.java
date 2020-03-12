package chap11;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SearchDemo {

	public static void main(String[] args) {
		
		String[] s = {"황금을","돌","같이","보라"};//배열 생성
		List<String> list = Arrays.asList(s);//배열을 리스트 타입의 변수 대입
		
		Collections.sort(list);//정렬 실행
		System.out.println(list);
		int i = Collections.binarySearch(list, "돌");
		System.out.println(i);

	}

}
