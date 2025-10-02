package practice3;

import java.util.Arrays;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		5. 짝수/홀수 개수 세기
//		정수 배열에서 짝수와 홀수의 개수를 각각 구하세요.
		int[] intArr = {1,3,12,16,11,50,36,27,60,89,100};
		int evenCount = 0;
		int oddCount = 0;
		for(int i : intArr) {
			if(i%2==0) {
				evenCount++;
			}else{
				oddCount++;
			}
		}
		System.out.println("짝수개수:"+evenCount);
		System.out.println("홀수개수:"+oddCount);
		// stream을 사용한 짝수 개수 구하기
		evenCount = (int)Arrays.stream(intArr).filter(i->i%2==0).count();
		oddCount = (int)Arrays.stream(intArr).filter(i->i%2!=0).count();
		System.out.println("짝수개수:"+evenCount);
		System.out.println("홀수개수:"+oddCount);
	}

}








