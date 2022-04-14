package sec1;
//쓰레드 CPU가 현재 처리중일 일.
//프로세스 : CPU가 현채 실행중인 프로그램.
//자바는 쓰레드 단위로 관리
import java.awt.Toolkit;

public class ThreadEx1 {

	public static void main(String[] args) {
		 Toolkit toolkit = Toolkit.getDefaultToolkit();
		 String[] names = {"길"};
		 for(int i=0; i<10; i++) {
			 toolkit.beep();
			 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		

	}

}
