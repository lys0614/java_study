package p248q2;

public class Student extends Person{

	int StudentNum;
	
	public int getStudentNum() {
		return StudentNum;
	}

	public void setStudentNum(int studentNum) {
		StudentNum = studentNum;
	}
	
	public Student(String a, int b, int c){
		super(a,b);
		setStudentNum(c);
	}
	
//	void show(){
//		System.out.println("�л�[�̸� : "+name+", ���� : "+age+", �й� : "+StudentNum+"]");
//	}
	public String show() {
		return "�л�[�̸� : "+name+", ���� : "+age+", �й� : "+StudentNum+"]";
	}
	
}
