package sec3;
import sec1.Animal;
//public 패키지가 달라도 import하면 사용가능		//클래스 필드 생성자 매서드
//default 같은 패키지에서만 사용 가능				//필드 생성자 메서드
//private 같은 클래스 내에서만 사용 가능			//필드
//public > protected > default > private


//하나의 java파일 안에 여러개의 클래스 서술 가능. 하지만 public은 하나만 가능
class Data1{
	int field1;
}

public class AccessControll1 {

	public static void main(String[] args) {
		Animal cat1 = new Animal();

	}

}
