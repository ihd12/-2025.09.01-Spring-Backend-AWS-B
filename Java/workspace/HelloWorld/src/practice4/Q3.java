package practice4;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		3. 정수를 입력받아 짝수이면 “짝”, 홀수이면 “홀”을 출력하는 프로그램을 작성하라. 사용자
//		가 정수를 입력하지 않는 경우에는 프로그램을 종료하라. [목적-자바의 예외 처리 연습]
//		[난이도 하]
//		정수를 입력하세요>>352
//		짝수
//		정수를 입력하세요>>java
//		수를 입력하지 않아 프로그램을 종료합니다.
//		예외처리 : try catch문 사용하여 예외가 발생하더라도 
//				프로그램이 꺼지지 않고 계속 실행되록 하는 방식 
//		try{
//			에러가 발생할 가능성이 있는 코드 작성
//		}catch(Exception e) {
//			에러가 발생했을때 실행할 코드 작성
//		}
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("정수를 입력하세요>>");
			int num = sc.nextInt();
			if(num%2==0) {
				System.out.println("짝수");
			}else {
				System.out.println("홀수");
			}
		}catch(Exception e) {
			System.out.println("수를 입력하지 않아 프로그램을 종료합니다.");
		}
		System.out.println("정상실행, catch문 실행이 끝나고 나면 실행되는 부분");
	}

}








