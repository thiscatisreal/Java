package studentInfo;
import java.util.ArrayList;

public class StudentArrayList {
	public static void main(String[] args) {
		ArrayList<Student> student = new ArrayList<Student>();
		
		student.add(new Student(1001,"James"));
		student.add(new Student(1002,"Tomas"));
		student.add(new Student(1003,"Imhyojin"));
		
		for(Student call : student) {
			call.showStudentInfo();
		}
	}

}
