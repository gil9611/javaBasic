package sec3;

public class Gugudan {

	public static void main(String[] args) {
		//구구단 출력 프로그램 이중 for
		int gugu = 9;				//몇단까지 출력할 것인가.
		
		
		//구구단 출력.
		for(int i=1; i<=gugu;i++) {
			for(int j=2; j<=gugu; j++) {
				System.out.print(j +" * " +i +" = " +(i*j)+"\t");
			}
			System.out.println("");
		}

	}

}
