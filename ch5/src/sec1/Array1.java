package sec1;

public class Array1 {

	public static void main(String[] args) {
		// �迭 : ���� Ÿ���� ���� �������� ������ ������
		
		int jum1=100, jum2=50, jum3=70, jum4=45, jum5=80;
		//������ ���̸��� ��ƴ�.
		int[] Arrjum = {100, 50, 70, 45, 80};
		//			Arrjum[0]...Arrjum[4]
		int tot = 0;
		for(int i=0; i<Arrjum.length; i++) {
			System.out.println(i+"��° ���� : " +Arrjum[i]);
			tot+=Arrjum[i];
		}
	}

}