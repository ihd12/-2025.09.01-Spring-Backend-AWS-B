package practice2;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//7. 반복문을 사용하여 다음 모양을 출력하는 프로그램을 만들어 보세요.
//		  *
//		 ***
//		*****
//	   *******
//		*****
//		 ***
//		  *
		int space = 3;
		int star = 1;
		// 4줄을 출력하는 반복문
		for(int i=1; i<=3; i++) {
			// 공백을 출력하는 반복문 3,2,1,0
			for(int j=1; j<=space; j++) {
				System.out.print(" ");
			}
			space--;
			// 별을 출력하는 반복문 1,3,5,7
			for(int k=1; k<=star; k++) {
				System.out.print("*");
			}
			star+=2;
			System.out.println();
		}
		space = 0;
		star = 7;
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=space; j++) {
				System.out.print(" ");
			}
			space++;
			for(int k=1; k<=star; k++) {
				System.out.print("*");
			}
			star-=2;
			System.out.println();
		}
	}

}
