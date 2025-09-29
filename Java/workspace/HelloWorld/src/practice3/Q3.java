package practice3;

import java.util.Arrays;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		3. 합계 & 평균 구하기
//		학생 점수가 들어있는 배열이 주어질 때, 점수들의 합과 평균을 구하세요.
		int[] studentArr = {100,50,70,90,100,60,30,10,50};
		int sum = 0;
		for(int i:studentArr) {
			sum+=i;
		}
		int avg = sum/studentArr.length;
		System.out.println("합계:"+sum);
		System.out.println("평균:"+avg);
//		stream 사용
		sum = Arrays.stream(studentArr).sum();
		double avg1 = Arrays.stream(studentArr).average().getAsDouble();
		System.out.println("합계:"+sum);
		System.out.println("평균:"+avg1);
	}

}






