package sec4;

import java.util.Arrays;

public class ArraysEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] arr1 = {'J','A','V','A'};
		char[] arr2 = arr1;				//arr1의 내용이 아니라 주소를 복제하여 넣음. 얕은 복제.
		System.out.println(arr1);
		System.out.println(arr2);
		
		//Arrays.arraycopy(배열원본객체명, 시작인덱스, 배열복제객체명, 복제객채의시작위치, 복사요소개수)
		//char[] arr3 = Arrays.arraycopy(arr1, 0, arr2, 0, arr1.length);  복잡함.
		
		char[] arr3 = Arrays.copyOf(arr1, arr1.length);
		System.out.println(arr3);
		char[] arr4 = Arrays.copyOfRange(arr3, 4, 11);
		
		System.out.println("얕은 복제의 비교 : " +Arrays.equals(arr1, arr2));
		System.out.println("깊은 복제의 비교 : " +Arrays.equals(arr1, arr4));
		//System.out.println("얕은 복제의 비교 : " +Arrays.deepEquals(arr1, arr2)); -2차원 배열의 경우 deepEquals를 사용
		
		System.out.println("arr1의 주소 : " +Arrays.hashCode(arr1));
		System.out.println("arr2의 주소 : " +Arrays.hashCode(arr2));
		System.out.println("arr4의 주소 : " +Arrays.hashCode(arr4));
		String[] arr5 = {"누구","머시기","김머시기","한가","나임"};
		Arrays.sort(arr5);
		System.out.println("정렬합니다.");
		for(String name : arr5) {
			System.out.println(name);
		}
		
		String data = "한가";
		int idx = Arrays.binarySearch(arr5, data);
		System.out.println(data+"의 인덱스"+idx);
	}

}
