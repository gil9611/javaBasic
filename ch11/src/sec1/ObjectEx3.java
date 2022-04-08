package sec1;

import java.util.HashMap;

//Student.name = "머시기";	name : key, "머시기" : value

class Key{
	public int number;
	public String value;
	
	Key(int num){
		this.number = num;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key compareKey = (Key) obj;
			if(this.number == compareKey.number) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return number;
	}

	@Override
	public String toString() {
		
		return number +" : " +value;
	}
	
	
	
}
public class ObjectEx3 {
	public static void main(String[] args) {
		HashMap<Key, String> hash1 = new HashMap<>();
		hash1.put(new Key(200), "머시기");
		
		
		String value = hash1.get(new Key(200));
		System.out.println(value);
		
		Key hi = new Key(80);
		hi.value = "hi";
		System.out.println(hi.toString());
	}

}
