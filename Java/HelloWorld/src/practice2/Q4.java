package practice2;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		4. 반복문을 사용하여 다음 모양을 출력하는 프로그램을 만들어 보세요.
//		*****
//		****
//		***
//		**
//		*
		// starEnd : 별을 몇번 출력할지 설정하는 변수 
		int starEnd = 5;
		// 몇줄을 출력할지 설정하는 반복문
		for(int i=1; i<=5; i++) {
			// 별을 몇개 출력할지 설정하는 반복문
			for(int j=1; j<=starEnd; j++) {
				System.out.print("*");
			}
			// 별 출력횟수를 매 반복마다 1씩 줄여주는 설정
			starEnd--;
			// 별을 모두 출력한 후 줄바꿈을 실행하는 설정
			System.out.println();
		}
		// 몇줄을 출력할지 설정하는 반복문  5,4,3,2,1 순서로 실행
		for(int i=5; i>=1; i--) {
			// 별을 몇개 출력할지 설정하는 반복문
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			// 별을 모두 출력한 후 줄바꿈을 실행하는 설정
			System.out.println();
		}
	}

}








