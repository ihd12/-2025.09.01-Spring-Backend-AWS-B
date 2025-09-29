package practice2;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		3. 반복문을 사용하여 다음 모양을 출력하는 프로그램을 만들어 보세요.
//		*
//		**
//		***
//		****
//		*****
//		몇줄 출력할지 설정하는 반복문
		for(int i=1; i<=5; i++) {
//			별을 몇개 출력할지 설정하는 반복문
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
//			한줄을 모두 출력한 후 엔터를 치는 명령어
			System.out.println();
		}
	}

}







