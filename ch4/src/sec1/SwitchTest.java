//������ �¾ ���� ���� ������ �Է��ϸ� �ش��ϴ� ���� ź������ ���
/*
 * 1��	������	����
 * 2��	�ڼ���	�Ƹ޽ý�Ʈ
 * 3��	����		����Ƹ���
 * 4��	�ݰ���	���̾Ƹ��
 * 5��	����		���޶���
 * 6��	����		��
 * 7��	ȫ��		���
 * 8��	������	�丮��Ʈ
 * 9��	û��		�����̾�
 * 10��	�ܹ鼮	����
 * 11��	Ȳ��		������
 * 12��	��ۼ�	��Ű
 */

package sec1;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		System.out.println("�¾ ���� �Է����ּ���.");
		Scanner sc = new Scanner(System.in);
		
		int mode = sc.nextInt();
		
		switch(mode) {
			case 1:
				System.out.println("1���� ź������ ������, �����Դϴ�.");
				break;
			case 2:
				System.out.println("2���� ź������ �ڼ���, �Ƹ޽ý�Ʈ�Դϴ�.");
				break;
			case 3:
				System.out.println("3���� ź������ ����, ����Ƹ����Դϴ�.");
				break;
			case 4:
				System.out.println("4���� ź������ �ݰ���, ���̾Ƹ���Դϴ�.");
				break;
			case 5:
				System.out.println("5���� ź������ ����, ���޶����Դϴ�.");
				break;
			case 6:
				System.out.println("6���� ź������ ����, ���Դϴ�.");
				break;
			case 7:
				System.out.println("7���� ź������ ȫ��, ����Դϴ�.");
				break;
			case 8:
				System.out.println("8���� ź������ ������, �丮��Ʈ�Դϴ�.");
				break;
			case 9:
				System.out.println("9���� ź������ û��, �����̾��Դϴ�.");
				break;
			case 10:
				System.out.println("10���� ź������ �ܹ鼮, �����Դϴ�.");
				break;
			case 11:
				System.out.println("11���� ź������ Ȳ��, �������Դϴ�.");
				break;
			case 12:
				System.out.println("12���� ź������ ��ۼ�, ��Ű�Դϴ�.");
				break;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				break;
		}

	}

}
