package sec1;

public class Array1 {

	public static void main(String[] args) {
		// 배열 : 같은 타입을 가진 여러개의 연속한 기억장소
		
		int jum1=100, jum2=50, jum3=70, jum4=45, jum5=80;
		//귀찮고 양이많고 어렵다.
		int[] Arrjum = {100, 50, 70, 45, 80};
		//			Arrjum[0]...Arrjum[4]
		int tot = 0;
		for(int i=0; i<Arrjum.length; i++) {
			System.out.println(i+"번째 점수 : " +Arrjum[i]);
			tot+=Arrjum[i];
		}
	}

}
