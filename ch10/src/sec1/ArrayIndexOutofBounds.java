package sec1;

class Student{
	int num;
	String name;
}

public class ArrayIndexOutofBounds {

	public static void main(String[] args) {
		Student[] s = new Student[100];			//0~99
		try {
			System.out.println(s[100].num);		//100없음
			System.out.println(s[100].name);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("지정된 배열 수 보다 많음.");
			e.printStackTrace();
		} finally {
			
		}

	}

}
