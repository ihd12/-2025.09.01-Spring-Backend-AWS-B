package practice1;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 두 정수를 입력받아 합을 구하여 출력하는 프로그램을 작성하라. 키보드 입력은 Scanner 
//		클래스를 이용하라. [난이도 하]
//		두 정수를 입력하세요>>10 20
//		10+20은 30
		Scanner sc = new Scanner(System.in);
		System.out.print("두 정수를 입력하세요>>");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a+"+"+b+"은 "+(a+b));
	}

}






