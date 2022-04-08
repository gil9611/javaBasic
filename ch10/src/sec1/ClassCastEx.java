package sec1;
class Animal{
	String name;
}

public class ClassCastEx {

	public static void main(String[] args) {
		Dog dog = new Dog();
		changeType(dog);

	}
	
	public static void changeType(Animal animal) {
		try {
			Dog dog = (Dog)animal;		//됨
			Cat cat = (Cat)animal;		//안됨.
		} catch(ClassCastException e) {
			System.out.println("a");
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("d");
			e.printStackTrace();
		}
	}

}
