package practice4;

import java.util.Arrays;
import java.util.Comparator;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		5.정수를 10개 입력받아 배열에 저장하고 오름차순으로 정렬하여 출력하라. 
//		[목적-배열과 for 반복문 연습] [난이도 중]
//	   정수 10개 입력>>17 3 9 -6 77 234 5 23 -3 1
//	   -6 -3 1 3 5 9 17 23 77 234
		Integer[] intArr = {17,3,9,-6,77,234,5,23,-3,1};
		Arrays.sort(intArr, new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			};
		});
		System.out.println(Arrays.toString(intArr));
	}

}
