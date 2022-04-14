package test1;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		
		//7번 문제
		int max = 0;
		int[] array7 = {1,5,3,8,2};
		
		for(int i=0;i<array7.length;i++) {
			if(max<array7[i]) max=array7[i];
		}
		System.out.println("max: " +max);
		
		
		//8번 문제
		int[][] array8 = {
				{95,86},
				{83,92,96},
				{78,83,83,87,88}
		};
		
		int sum = 0;
		double avg = 0.0;
		
		int count = 0;
		for(int i=0;i<array8.length;i++) {
			for(int j=0;j<array8[i].length;j++) {
				sum += array8[i][j];
				count++;
			}
		}
		avg=(double)sum/count;
		
		System.out.println(sum);
		System.out.println(avg);
		
		//9
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("1. 학생수 2.점수입력 3.점수리스트 4.분석 5.종료");
			
			int selectNo = sc.nextInt();
			
			if(selectNo == 1) {
				System.out.println("학생수를 입력하세요.");
				studentNum = sc.nextInt();
				scores = new int[studentNum];				//한번 초기화 해줘야함.
			} else if(selectNo == 2) {
				System.out.println("점수를 입력하세요.");
				for(int i=0;i<studentNum;i++) {
					System.out.print((i+1)+"번째\t");
					scores[i] =  sc.nextInt();				//그래야 입력가능.
				}
			} else if(selectNo == 3) {
				System.out.println("점수 리스트를 출력합니다.");
				for(int i=0;i<studentNum;i++) {
					System.out.print(scores[i]+"\t");
				}
				System.out.println("");
			} else if(selectNo == 4) {
				System.out.println("분석합니다..");
				int max9 = 0, sum9 = 0;
				float avg9 = 0f;
				for(int i=0;i<studentNum;i++) {
					sum9+=scores[i];
					if(max9<scores[i]) max9=scores[i];
				}
				avg9 = (float)sum9/studentNum;
				System.out.println("가장 높은 점수는 " +max9);
				System.out.println("평균은 " +avg9);
			} else if(selectNo == 5) {
				System.out.println("시스템 종료.");
				run = false;
			}
			
		}

	}

}
