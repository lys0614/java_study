package chap11;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class HashSetDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//list와 비슷한 형태의 자료구조이지만 index가 없고 중복저장 안댐
		String[] fruits = {"사과","바나나","포도","수박"};

		Set<String> h1 = new HashSet<>();
		Set<String> h2 = new HashSet<>();
		
		//배열 fruits가 갖고있는 모든 요소를 Set타입의 객체 h1에 모두 저장
		for(String s : fruits) {
			h1.add(s);
		}
		
		System.out.println("1단계 : "+h1);
		h1.add("바나나");//Set 타입의 객체 h1에 문자열 '바나나' 추가, 그러나 중복저장이 안되기때문에 실행되지 않음.
		h1.remove("포도");//h1이 갖고 있는 문자열 중에서 '포도' 제거
		h1.add(null);//h1에 null 추가 // 콜렉션에서 add()메서드는 데이터를 추가하는 명령어, 가장 뒤에 추가함.
		
		System.out.println("2단계 : "+h1);
		System.out.println(h1.size());
		System.out.println(h1.contains("수박"));
		
		List<String> list = Arrays.asList(fruits); // 배열을 List 타입으로 변환
		h2.addAll(list);//Set 타입의 객체 h2에 list가 가지고 있는 모든 데ㅣㅇ터 저장
		System.out.println("3단계 : "+h2);
		h2.clear();//Set타입의 객체 h2가 가지고 있는 모든 데이터 삭제
		System.out.println(h2.isEmpty());//h2가 비어있는지 확인
		
	}

}
