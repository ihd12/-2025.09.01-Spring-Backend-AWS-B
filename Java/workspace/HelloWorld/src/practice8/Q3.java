package practice8;

import java.util.Scanner;
import java.util.Vector;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		3. Vector 컬렉션을 이용하여 강수량의 평균을 유지 관리하는 프로그램을 작성하라. 강수량을 입력
//		하면 벡터에 추가하고 현재 입력된 모든 강수량의 평균을 출력하라.
		Scanner sc = new Scanner(System.in);
		Vector<Integer> vector = new Vector<>();
		while(true) {
			System.out.print("강수량 입력(0 입력시 종료)>>");
			Integer num = sc.nextInt();
			if(num == 0) {
				break;
			}
			vector.add(num);
			System.out.println(vector);
//			int sum = 0;
//			for(int data : vector) {
//				sum += data;
//			}
//			int avg = sum / vector.size();
			// stream 사용 방식
			int sum = vector.stream()
					.mapToInt(Integer::intValue)
					.sum();
			double avg = vector.stream()
					.mapToInt(Integer::intValue)
					.average().getAsDouble();
			
			System.out.println("현재 평균 : " + (int)avg);
		}
		System.out.println("End");
//		----------------------------------------------
//		강수량 입력(0 입력시 종료)>>5
//		5
//		현재 평균 : 5
//		강수량 입력(0 입력시 종료)>>80
//		5 80
//		현재 평균 : 42
//		강수량 입력(0 입력시 종료)>>53
//		5 80 53
//		현재 평균 46
//		강수량 입력(0 입력시 종료)>>22
//		5 80 53 22
//		현재 평균 40
//		강수량 입력(0 입력시 종료)>>0
//		End
//		----------------------------------------------
	}

}
