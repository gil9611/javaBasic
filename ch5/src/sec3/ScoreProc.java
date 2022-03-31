package sec3;

public class ScoreProc {

	public static void main(String[] args) {
		
		String[] names = {"길정훈", "김동협", "김성민","김태균","신길호"};
		int[][] scores = {{90,75,100},{95,90,65},{80,85,95},{85,80,85},{70,90,80}};
		int[] tot = {0,0,0};				//과목별 총점
		float[] avg = {0.0f,0.0f,0.0f};		//과목별 평균
		int total = 0;							//전체 총점
		float average = 0.0f;				//전체 평균
		int[] hap = {0,0,0,0,0};
		float[] pyo = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
		
		//정보출력 및 과목별 총점 계산
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
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
		
		//과목별 평균, 전체 총점 계산
		for(int i=0; i<3; i++) {
			avg[i] = (float)tot[i]/names.length;
			total += tot[i];
		}
		average = (float)total/names.length/3;
		
		//나머지 출력
		System.out.println("-------------------------------");
		System.out.print("과목별총점");
		for(int i=0; i<3; i++) {
			System.out.print("\t"+tot[i]);
		}
		System.out.println("");
		System.out.print("과목별평균");
		for(int i=0; i<3; i++) {
			System.out.printf("\t%3.2f", avg[i]);
		}
		System.out.println("");
		System.out.printf("전체총점 : %d\t전체평균 : %3.2f", total, average);

	}

}
