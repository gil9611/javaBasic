package sec1;


//모든 클래스의 조상은 Object이다.
//extends Object하지 않아도 상속되어 있다. 
class Member{		
	public String id;
	Member(String id){
		this.id = id;
	}
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Member) {
			Member mb = (Member) obj;
			if(id.equals(mb.id)) {
				return true;
			}
		
		}
		return false;
	}
	
}

public class ObjectEx2 {

	public static void main(String[] args) {
		Member obj1 = new Member("no");
		Member obj2 = new Member("yes");
		Member obj3 = new Member("no");
		
		if(obj1.equals(obj2)) {
			System.out.println("같");
		} else {
			System.out.println("false");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

}
