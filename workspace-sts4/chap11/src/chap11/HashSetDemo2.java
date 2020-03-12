package chap11;
import java.util.HashSet;
import java.util.Set;

class Element{
	String value;
	
	public Element(String value) {
		this.value = value;
	}

		// 이 부분을 주석처리해제 하면 hashcode가 같아지므로 중복 저장이 안되는 HashSet은 두번의 추가중에 한번을 배제시킨다
//	public int hashCode() {
//		return value.hashCode();
//	}
	
	public boolean equals(Object o) {
		boolean result = false;
		
		if(o instanceof Element) {
			Element el = (Element)o;
			if(value.equals(el.value)) {
				result = true;
			}
		}
		return result;
//		if(o instanceof Element) {
//			return((Element)o).value.equals(value);
//		}
//		return false;
	}
	
	public String toString() {
		return "Element["+value+"]";
	}
}



public class HashSetDemo2 {

	public static void main(String[] args) {
		Set<Element> h = new HashSet<>();
		h.add(new Element("안녕"));// 기본적으로 Set 타입은 중복을 허용하지 않음
		h.add(new Element("안녕"));// 동일한 내용의 다른 객체를 추가하는 방식으로 HashSet이 다른 객체로 취급해서 두개 추가 가능, Element 클래스 타입으로 2개 생성했기 때문에 내용은 같으나 다른 객체임
		System.out.println(h.size());
		System.out.println(h);
	}
	
}
