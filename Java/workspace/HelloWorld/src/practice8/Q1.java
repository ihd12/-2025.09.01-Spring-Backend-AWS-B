package practice8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;

public class Q1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 학점(‘A’, ‘B’, ‘C’, ‘D’, ‘F’)을 컬렉션에 저장하라. 그러고 나서 컬렉션을 검색하여 학점을 점수
//		(A=4.0, B=3.0, C=2.0, D=1.0, F=0.0)로 변환하여 출력하는 프로그램을 작성하라.
//		1) Vector 컬렉션을 이용
		Vector<String> scoreVector = new Vector<>();
		scoreVector.add("A");
		scoreVector.add("B");
		scoreVector.add("C");
		scoreVector.add("D");
		scoreVector.add("F");
		for(String score : scoreVector) {
			if(score.equals("A")) {
				System.out.println("A = 4.0 입니다.");
			}else if(score.equals("B")) {
				System.out.println("B = 3.0 입니다.");
			}else if(score.equals("C")) {
				System.out.println("C = 2.0 입니다.");
			}else if(score.equals("D")) {
				System.out.println("D = 1.0 입니다.");
			}else if(score.equals("F")) {
				System.out.println("F = 0.0 입니다.");
			}
		}
//		2) HashMap 컬렉션을 이용
		Map<String, Double> scoreMap = new HashMap<>();
		scoreMap.put("A", 4.0);
		scoreMap.put("B", 3.0);
		scoreMap.put("C", 2.0);
		scoreMap.put("D", 1.0);
		scoreMap.put("F", 0.0);
		Scanner sc = new Scanner(System.in);
		System.out.print("A~F사이의 점수를 입력해주세요>>");
		String data = sc.next();
		System.out.println(data + "="+ scoreMap.get(data) + " 입니다.");
		
	}

}








