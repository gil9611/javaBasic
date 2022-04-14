package ch13;
class Student{
	String name;
	int no;
	int year;
	int ban;
	Student(){};
}


class Scores{
	int edps;
	int oa;
	int pg;
	
	public Student setStudent(String name, int no, int year, int ban) {
		Student st = new Student();
		st.name = name;
		st.no = no;
		st.year = year;
		st.ban = ban;
		return st;
	}
	public Student setStudent(Student s) {
		Student st = new Student();
		st.name = s.name;
		st.no = s.no;
		st.year = s.year;
		st.ban = s.ban;
		return st;
	}
}

public class StudentEx {

	public static void main(String[] args) {
		Scores hak1_c = new Scores();

	}

}
