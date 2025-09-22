package practice1;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		8. 음료수 종류와 잔 수를 입력받으면 가격을 알려주는 프로그램을 작성하라. 에스프레소
//		는 2000원, 아메리카노 2500원, 카푸치노 3000원, 카페라떼 3500원이다. [난이도 중]
//		커피 주문하세요>>카푸치노 3
//		9000원입니다.
		Scanner sc = new Scanner(System.in);
		System.out.print("커피 주문하세요>>");
		String coffee = sc.next(); // 커피의 종류
		int count = sc.nextInt(); // 몇잔인지 저장
//		(1) if문을 활용하라.
//		힌트) if문으로 문자열을 비교할 때는 반드시 equals() 메소드를 이용하라. 예를 들면 다음
//			과 같다.
		if(coffee.equals("에스프레소")) {
			System.out.println(count*2000 + "원 입니다.");
		}else if(coffee.equals("아메리카노")) {
			System.out.println(count*2500 + "원 입니다.");
		}else if(coffee.equals("카푸치노")) {
			System.out.println(count*3000 + "원 입니다.");
		}else if(coffee.equals("카페라떼")) {
			System.out.println(count*3500 + "원 입니다.");
		}
//		(2) switch문을 활용하라.
		switch(coffee) {
		case "에스프레소":
			System.out.println(count*2000+"원 입니다.");
			break;
		case "아메리카노":
			System.out.println(count*2500+"원 입니다.");
			break;
		case "카푸치노":
			System.out.println(count*3000+"원 입니다.");
			break;
		case "카페라떼":
			System.out.println(count*3500+"원 입니다.");
			break;
		}
	}

}








