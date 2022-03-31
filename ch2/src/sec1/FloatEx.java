package sec1;

public class FloatEx {

	public static void main(String[] args) {
		// 실수 : 부동소수점수 -> float. 4byte	double. 8byte 
		
		int kor = 100;
		int eng = 70;
		int mat = 100;
		int tot = kor + eng + mat;
		//int avg = tot / 3;			//평균은 소수점 이하가 나올 수 있으므로 int가 아니라 float로 하는것이 바람직하다.
		float avg = tot / 3.0f;			// 정수 / 정수 = 정수. 실수로 나눠야지 실수값이 나온다.
		
		double pi1 = 3.1415;			//f생략 가능
		float pi2 = 3.1415f;
		
		int radius = 20;
		float area = radius * radius * pi2;		//double인 pi1을 사용하면 double의 범위가 더 크므로 오류.
		//표현 범위가 너무 작은 타입을 쓰면 규모가 큰 데이터를 저장하거나 처리하지 못하므로,, 범위가 큰 타입을 사용
		//반대로 표현 범위가 너무 크면 메모리 용량을 많이 차지하게 되므로 큰 메모리가 필요하며 실행속도가 느려짐.
		//본인이 개발하고자 하는 프로젝트에 가장 적절한 규모를 정하고, 타입을 결정해야 한다.
		
		System.out.println("총점 : " +tot);
		System.out.println("평균 : " +avg);

	}

}
