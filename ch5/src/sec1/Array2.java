package sec1;

public class Array2 {

	public static void main(String[] args) {
		// 
		
		int[] arr1 = {10,40,20,15,30};
		int[] arr2;
		//arr2 = {40, 15, 10, 30, 20}; 갯수 지정을 안해줬으므로 컴파일 에러
		arr2 = new int[] {40, 15, 10, 30, 20};
		//타입 재정리.
		
		String[] names = null;
		names = new String[] {"김아무개", "김머시기", "김누구"};
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		
		
		float[] arr3 = {3.14f, 2.84f, 1.59f};
		
		int[] arr4 = new int[5]; //arr4[0]~arr4[4] 는 초기화가 0으로 됨.
		//arr4 = {20, 40, 30, 15, 25};
		for(int i=0;i<arr4.length;i++) {
			System.out.println(arr4[i]);
		}
		
		//int k;
		//System.out.println(k);  //안나옴
		
		double[] arr5 = new double[5];
		for(int i=0;i<arr5.length;i++) {
			System.out.println(arr5[i]);
		}
		
		/*배열은 초기화를 하지않으면 정수는 0 실수는 0.0 문자는 null로 자동초기화.
		 * 
		 */

	}

}
