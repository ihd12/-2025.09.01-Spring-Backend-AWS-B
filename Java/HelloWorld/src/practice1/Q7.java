package practice1;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		7. 학점이 A, B이면 “Excellent”, 학점이 C, D이면 “Good”, 학점이 F이면 “Bye”라고 출력하
//		는 프로그램을 작성하라. switch와 break를 활용 [난이도 중]
//		학점을 입력하세요>>B
//		Excellent
		Scanner sc = new Scanner(System.in);
		System.out.print("학점을 입력하세요>>");
		String str = sc.next();
		switch(str) {
		case "A": case "B":
			System.out.println("Excellent");
			break;
		case "C": case "D":
			System.out.println("Good");
			break;
		case "F":
			System.out.println("Bye");
			break;
		default :
			System.out.println("A,B,C,D,F 중에 입력해주세요.");
		}
	}

}










