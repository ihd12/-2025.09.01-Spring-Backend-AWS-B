package practice1;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		3. x 값을 입력받아 y = x²-3x+7 식을 계산하여 y 값을 출력하는 
//			프로그램을 작성하라.
//			x 값을 입력하세요>>5
//			x=5, y=17
		Scanner sc = new Scanner(System.in);
		System.out.print("x 값을 입력하세요>>");
		int x = sc.nextInt();
//		y = x²-3x+7
		int y = x*x-3*x+7;
		System.out.println("x="+x+", y="+y);

	}

}








