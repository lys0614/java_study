package chap11;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SearchDemo {

	public static void main(String[] args) {
		
		String[] s = {"Ȳ����","��","����","����"};//�迭 ����
		List<String> list = Arrays.asList(s);//�迭�� ����Ʈ Ÿ���� ���� ����
		
		Collections.sort(list);//���� ����
		System.out.println(list);
		int i = Collections.binarySearch(list, "��");
		System.out.println(i);

	}

}
