package sec3;

public class Gugudan {

	public static void main(String[] args) {
		//������ ��� ���α׷� ���� for
		int gugu = 9;				//��ܱ��� ����� ���ΰ�.
		
		
		//������ ���.
		for(int i=1; i<=gugu;i++) {
			for(int j=2; j<=gugu; j++) {
				System.out.print(j +" * " +i +" = " +(i*j)+"\t");
			}
			System.out.println("");
		}

	}

}