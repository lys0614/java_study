package chap07_031001;

public class TalkableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		speak(new Korean());
		speak(new American());
	}

	static void speak(Talkable t) {
		//�ΰ��� Ŭ������ ����� �θ� Ŭ���� Ȥ�� �θ� �������̽�, ObjectŸ��
		//���� �޼��忡 �Ű������� Talkable Ÿ���� ������ �޾�  talkable �� �ڽ� Ŭ������ �����ִ� �޼������  ������� �����Ѱ�
		t.talk();
	}
}
