package sec3;

public class ScoreProc {

	public static void main(String[] args) {
		
		String[] names = {"������", "�赿��", "�輺��","���±�","�ű�ȣ"};
		int[][] scores = {{90,75,100},{95,90,65},{80,85,95},{85,80,85},{70,90,80}};
		int[] tot = {0,0,0};				//���� ����
		float[] avg = {0.0f,0.0f,0.0f};		//���� ���
		int total = 0;							//��ü ����
		float average = 0.0f;				//��ü ���
		int[] hap = {0,0,0,0,0};
		float[] pyo = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
		
		//������� �� ���� ���� ���
		System.out.println("�̸�\t����\t����\t����\t����\t���");
		for(int i=0; i<names.length; i++) {
			System.out.print(names[i]);
			for(int j=0; j<3; j++) {
				System.out.print("\t"+scores[i][j]);
				tot[j] += scores[i][j];
				hap[i] += scores[i][j];
			}
			pyo[i] = (float)hap[i]/3;
			System.out.printf("\t%d\t%3.2f\n", hap[i],pyo[i]);
		}
		
		//���� ���, ��ü ���� ���
		for(int i=0; i<3; i++) {
			avg[i] = (float)tot[i]/names.length;
			total += tot[i];
		}
		average = (float)total/names.length/3;
		
		//������ ���
		System.out.println("-------------------------------");
		System.out.print("��������");
		for(int i=0; i<3; i++) {
			System.out.print("\t"+tot[i]);
		}
		System.out.println("");
		System.out.print("�������");
		for(int i=0; i<3; i++) {
			System.out.printf("\t%3.2f", avg[i]);
		}
		System.out.println("");
		System.out.printf("��ü���� : %d\t��ü��� : %3.2f", total, average);

	}

}
