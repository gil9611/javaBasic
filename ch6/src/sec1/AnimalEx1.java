package sec1;

public class AnimalEx1 {

	public static void main(String[] args) {
		Animal dog1 = new Animal("개", "포유류", 4, 0, true, 20);
		dog1.running();
		dog1.running(dog1.getName());
		dog1.running(dog1.getName(), dog1.getSpeed());
		
		Animal cat1 = new Animal("고양이", "포유류");
		cat1.running(cat1.getName());
		Animal momo = new Animal("매");
		momo.setType("조류");
		momo.setLegs(2);
		
		
		
		

	}

}
