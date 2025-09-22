package practice1;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		6. 돈의 액수를 입력받아 오만원권, 만원권, 천원권, 500원짜리 동전, 100원짜리 동전, 10원
//		짜리 동전, 1원짜리 동전 각 몇 개로 변환되는지 출력하라. 힌트 참조. [난이도 중]
//		돈의 액수를 입력하세요>>65245
//		오만원1개, 만원1개, 천원5개, 500원0개, 100원2개, 10원4개, 1원5개
		Scanner sc = new Scanner(System.in);
		System.out.print("돈의 액수를 입력하세요>>");
		int money = sc.nextInt();
		int count50000 = money/50000; // 오만원 1개
		money = money % 50000; // 5만원권을 뺀 나머지  15245원
		int count10000 = money/10000; //만원 1개
		money %= 10000; // 1만원권을 뺀 나머지 5245원
		int count1000 = money/1000; //천원 5개
		money %= 1000; // 1천원권을 뺀 나머지 245원
		int count500 = money/500; //오백원 0개
		money %= 500; // 오백원권을 뺀 나머지 245원
		int count100 = money/100; //백원 2개
		money %= 100; // 백원권을 뺀 나머지 45원
		int count10 = money/10; //십원 4개
		money %= 10; // 백원권을 뺀 나머지 5원
		System.out.println("오만원"+count50000+"개, "
				+ "만원"+count10000+"개, "
				+ "천원"+count1000+"개, "
				+ "500원"+count500+"개, "
				+ "100원"+count100+"개, "
				+ "10원"+count10+"개, "
				+ "1원"+money+"개");
		
		
	}

}









