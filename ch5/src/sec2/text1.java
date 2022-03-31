package sec2;

public class text1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i = 0; i <= 100; i++) {
			if(i%2 == 0){
				continue;
			}
			sum += i;
		} 
		System.out.printf("%d", sum);
	}

}
