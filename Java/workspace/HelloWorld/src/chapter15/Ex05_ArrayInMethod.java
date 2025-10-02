package chapter15;

public class Ex05_ArrayInMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0~4까지 저장되어있는 배열 만들기
		int[] arr = makeInArray(3);
		// 배열에 저장되어있는 숫자의 합 저장
		int sum = sumOfArray(arr);
		System.out.println(sum);
		System.out.println("테스트");
		System.out.println("테스트");
		System.out.println("테스트");
	}
	public static int[] makeInArray(int len) {
		int[] arr = new int[len];
		for(int i=0; i<len; i++) {
			arr[i] = i;
		}
		return arr;
	}
	public static int sumOfArray(int[] arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}
}






