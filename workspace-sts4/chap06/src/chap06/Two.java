package chap06;

public class Two {

	void Print() {
		One O = new One();
		//������Ű�� ������ One Ŭ������ ��ü�� �ν��Ͻ�ȭ
		
		
//		System.out.println(O.secret); private���������� -> �ܺ����� �ȵ�
		System.out.println(O.roommate);//default ���������� -> �ܺ����� ��, �ܺ���Ű������ �ȵ�
		System.out.println(O.child);//protected ���������� -> �ܺ����� ��, �ܺ���Ű������ �ȵ�, �ܺ���Ű������ ��ӹ����� ���� ��.
		System.out.println(O.anybody);//public ���������� -> �ܺ����� ��, �ܺ���Ű������ ��,
	}
}
