package practice3;

import java.util.Arrays;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2. 최대값 & 최소값 찾기
//		정수 배열이 주어졌을 때, 배열 안에서 최댓값과 최솟값을 찾아 출력하세요.
		int[] arr = {10,70,50,90,60,30,20};
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i:arr) {
			if(max<i) {
				max = i;
			}
			if(min>i) {
				min = i;
			}
		}
		System.out.println("최대값:"+max);
		System.out.println("최소값:"+min);
		
		// stream을 이용한 최대값 구하기
		int streamMax = Arrays.stream(arr).max().getAsInt();
		System.out.println("최대값:"+streamMax);
		// stream을 이용한 최소값 구하기
		int streamMin = Arrays.stream(arr).min().getAsInt();
		System.out.println("최소값:"+streamMin);
		
	}

}









