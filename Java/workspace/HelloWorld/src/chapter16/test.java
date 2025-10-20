package chapter16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			예외가 발생할 수 있는 코드를 작성
			Scanner sc = new Scanner(System.in);
			System.out.println("숫자를 입력해주세요>>");
			int num1 = sc.nextInt();
			int num2 = 10/num1;
			System.out.println(num2);

	}

}







