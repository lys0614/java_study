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
//		System.out.println("학생[이름 : "+name+", 나이 : "+age+", 학번 : "+StudentNum+"]");
//	}
	public String show() {
		return "학생[이름 : "+name+", 나이 : "+age+", 학번 : "+StudentNum+"]";
	}
	
}
