package practice8;

public class Q1 {
	public static int solution(int num1, int num2) {
		double answer = (double)num1 / num2 * 1000;
		return (int)answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 학점(‘A’, ‘B’, ‘C’, ‘D’, ‘F’)을 컬렉션에 저장하라. 그러고 나서 컬렉션을 검색하여 학점을 점수
//		(A=4.0, B=3.0, C=2.0, D=1.0, F=0.0)로 변환하여 출력하는 프로그램을 작성하라.
//		1) Vector 컬렉션을 이용
		System.out.println(solution(3,2));
//		2) HashMap 컬렉션을 이용
		
	}

}
