package sec1;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] names = {"���±�", "��ȿ��", "�ű�ȣ", "���¿�", "�̱���"};
		//5���� 3���� ���� ����
		int[][] jum = {{100,80,90},{70,90,80},{60,90,80},{90,80,70},{85,95,85}};
		
		//��ü����hap ��ü��� py ��������tot �������avg
		int hap = 0;
		float py = 0.0f;
		int[] tot = new int[3];
		float[] avg = new float[3];
		
		//���
		System.out.println("����\t����\t����\t����");
		for(int i=0; i<names.length; i++) {
			System.out.print(names[i]);
			for (int j=0; j<3; j++) {
				System.out.print("\t" +jum[i][j]);	//���
				tot[j] += jum[i][j];				//�����������.
				//hap += jum[i][j];
			}
			System.out.println("");
			
		}
		
		//������� ���
		for(int i=0; i<3; i++) {
			avg[i] = (float)tot[i]/names.length;
		}
		
		//���� ��յ� ���
		System.out.println("***************************");
		System.out.print("����");
		for(int i=0; i<3; i++) {
			System.out.print("\t" +tot[i]);
			hap +=tot[i];						//��ü ����
		}
		py = (float)hap/names.length/3;			//��ü ���
		
		
		System.out.print("\n���");
		for(int i=0; i<3; i++) {
			System.out.print("\t" +avg[i]);
		}
		
		System.out.println("\n��ü���� : " +hap +" ��ü��� : " +py);

		

	}

}
