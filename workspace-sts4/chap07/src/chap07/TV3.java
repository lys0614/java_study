package chap07;
//TV3Ŭ������ �������̽� Conterol3�� ��ӹ޾� ������
//Control3�� ������ �ִ� �߻� �޼��� ChannelUp, ChannelDown�� �������̵��� ���� �����ϸ� ������ �߻�
//Control3�� ��ӹ��� Control1�� Control2�� �߻�޼��嵵 ������ ����� ������ �߻����� ����.
public class TV3 implements Control3{

	//Control3�� �߻�޼����
	@Override
	public void ChannelUp() {
		System.out.println("ä�� 1 �ø�");
	}
	
	@Override
	public void ChannelDown() {
		System.out.println("ä�� 1 ����");
	}
	//Control3���� ��ӹ��� Cotnrol1�� �߻�޼����
	@Override 
	public void powerOn(){
		System.out.println("TV���� ��");
	}
	@Override
	public void powerOff() {
		System.out.println("TV���� ��");
	}
	//Control3 ���� ��ӹ��� Control2�� �߻�޼����
	@Override
	public void VolumeUp() {
		System.out.println("TV���� �ø�");
	}
	@Override
	public void VolumeDown() {
		System.out.println("TV���� ����");
	}
}
