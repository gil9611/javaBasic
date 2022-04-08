package sec2;

import java.util.Comparator;

/*
public interface Comparator<T> {		//<T> 어떤 타입이든 다 올 수 있음.
	int comparator(어쩌구)
}
*/
class Student {
	public int sno;
	public String sname;
	
	Student(int sno, String sname){
		this.sno = sno;
		this.sname = sname;
	}
}

class StudentCompare implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.sno == o2.sno && o1.sname == o2.sname) {
			return 2;
		} else if(o1.sno == o2.sno || o1.sname == o2.sname) {
			return 1;
		}
		return 0;
	}
	
}

public class ObjectsEx1 {

	public static void main(String[] args) {
		Student a = new Student(1, "멍멍");
		Student b = new Student(1, "멍멍");
		Student c = new Student(2, "야옹");
		
		StudentCompare sc = new StudentCompare();
		System.out.println("같은 수." +sc.compare(a, b));
		System.out.println("같은 수." +sc.compare(b, c));
		
	}

}
