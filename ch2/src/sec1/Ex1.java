package sec1;


public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���� :  �ֱ����ġ �ȿ� �����͸� �ִ� ���� �ϳ�
		String name;	//��������
		//�⺻ �ڷ���(primitive)
		name = "������";
		
		char pass = 'y';		//�ѱ��� ������ ����� �ʱ�ȭ
		
		byte data1;		//1����Ʈ
		boolean data2;	// ��or����
		int su1;		//����
		long su2;
		float su3;		//�Ҽ��� 2��¥��
		double su4;		//�Ҽ��� 4°?
		
		//������ �ҹ��� Ŭ�����̸��� ù���� �빮�� _����
		/*������ �ϳ��� ���� ������ �� �ִ� �޸𸮰���
		 *�������� ��� ��Ģ
		 * ù ���ڴ� �������� �����ϴ� ���� ��Ģ�̳�, Ư������ �߿��� $�Ǵ� _�� ������ ���� �ִ�.
		 * ���� ��ҹ��ڴ� ������ ���еȴ�.
		 * �ڹ��� ������ ����� �� ������, �ٸ� ���ڳ� ���ڸ� ȥ���Ͽ� ����ϱ⵵ �Ѵ�.
		 * �������̳� Ŭ�������� ���ʻ� �� �뵵�� ���� �� �� �ְ� ����� �ؾ��Ѵ�.
		 * �������̳� Ŭ������ �޼���� ���� ���� �ܾ �����Ͽ� ������ ���� ������ھ���(_)
		 * �Ǵ� ī������ Ȱ���Ѵ�.
		 * jeonghungohome (x)
		 * jeonghunGoHome (o) ī����. �߰��� �빮�ڸ� �ִ� ��
		 * jeonghun_go_home (o) ������ھ��� ����.
		 * 
		 * �����
		 * 
		 * ������ (private, public, protected, static, final)
		 * �⺻�ڷ��� ���� Ű����(char, byte, boolean, int, long, float, double)
		 * ������ ���� Ű����(Char, Byte, Bloolean, Integer, Long, Float, Double)
		 * Ŭ���� ���� ���� Ű����(class, ���)
		 * ��ü ���� Ű����(new, this, super, null)
		 * ��ɹ� Ű����(if, else, switch, case, ���
		 * ��Ÿ Ű���� true, false, void, return ���
		 */
		 //���ͷ� : ������ ����Ǵ� ��, ����, ���ڿ�, ����(��,��,��) �Ǽ�(��,��) 2���� 8���� 16����
		  String nickname = "ȣ����";
		  //string nick1 = 't'; ������. ���� ����ǥ 
		  char nick2= 't'; 
		  
		  byte a= 19; //����. 1byte=8bit => -128 ~ 127 ����÷ο�
		  short c= 32767; //2byte=16bit => -32768~32767
		  int b= 250; //4byte=32bit => ������ ��û�� 21��/
		  long d = 450; //8byte=64bit => ����
		  
		 /* �ε��Ҽ�����= �Ǽ�
		 * 365.325=0.365325 * 10��3��
		 * ��ȣ ���� ����
		 * +   3��  365325
		 */
		  float e = 364.325f; //4byte=32bit f�� �����
		  double f = 36.245d; //8byte=>64bit ��� d�� ��������
		  boolean g = true; //1bit => ibyte 1��Ʈ�� 1����Ʈ�� ����.  true or
		  char h = 'k'; 		//2byt��
		  //String i = 256;  Ÿ�Կ���
		  //int j= "������";
		 /*
		  * ����ũ�� ����
		  * 1024byte(2�� 10��) = 1KB
		  * 1024KB = 1MB
		  * 1024MB = 1GB
		  * 1024GB = 1TB
		  * 1024TB = 1PB
		  * 1024PB = 1EB
		  * KMGTPE �������
		  */
		  
		  int k1 = 0b1101;	//2���� ���ͷ�
		  int k2 = 0123;	//8���� ���ͷ�
		  int k3 = 0x123;	//16���� ���ͷ�
		  System.out.println("k1="+k1+ ", k2="+k2+ ", k3="+k3);
		
	}

}
