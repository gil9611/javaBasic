package sec1;

public class Array2 {

	public static void main(String[] args) {
		// 
		
		int[] arr1 = {10,40,20,15,30};
		int[] arr2;
		//arr2 = {40, 15, 10, 30, 20}; ���� ������ ���������Ƿ� ������ ����
		arr2 = new int[] {40, 15, 10, 30, 20};
		//Ÿ�� ������.
		
		String[] names = null;
		names = new String[] {"��ƹ���", "��ӽñ�", "�贩��"};
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		
		
		float[] arr3 = {3.14f, 2.84f, 1.59f};
		
		int[] arr4 = new int[5]; //arr4[0]~arr4[4] �� �ʱ�ȭ�� 0���� ��.
		//arr4 = {20, 40, 30, 15, 25};
		for(int i=0;i<arr4.length;i++) {
			System.out.println(arr4[i]);
		}
		
		//int k;
		//System.out.println(k);  //�ȳ���
		
		double[] arr5 = new double[5];
		for(int i=0;i<arr5.length;i++) {
			System.out.println(arr5[i]);
		}
		
		/*�迭�� �ʱ�ȭ�� ���������� ������ 0 �Ǽ��� 0.0 ���ڴ� null�� �ڵ��ʱ�ȭ.
		 * 
		 */

	}

}