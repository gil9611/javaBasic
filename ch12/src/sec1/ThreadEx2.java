package sec1;

import java.awt.Toolkit;

class BeepTask implements Runnable {
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		 String[] names = {"길","김","김","이","박","임","설","화"};
		 for(int i=0; i<names.length; i++) {
			 System.out.println(names[i]);
			 if(names[i].equals("설")) {
				 System.out.println("설씨");
				 toolkit.beep();
				 continue;
			 }else {
				 System.out.println("나머지");
			 }
			 
			 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		 }
	}
}
public class ThreadEx2 {

	public static void main(String[] args) {
		BeepTask bt = new BeepTask();
		bt.run();

	}

}
