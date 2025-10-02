package practice3;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 배열 입력 & 출력
//		크기 5의 정수 배열을 만들고, 사용자에게 5개의 정수를 입력받아 배열에 저장한 뒤 출력하세
//		요. 
		int[] intArr = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("배열에 저장할 숫자를 입력해주세요>>");
		for(int i=0; i<intArr.length; i++) {
			intArr[i] = sc.nextInt();
		}
		for(int i : intArr) {
			System.out.print(i + ",");
		}
	}

}









