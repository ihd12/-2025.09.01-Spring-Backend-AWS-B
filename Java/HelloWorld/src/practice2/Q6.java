package practice2;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		6. 반복문을 사용하여 다음 모양을 출력하는 프로그램을 만들어 보세요.
//		*******
//		 *****
//		  ***
//		   *
		int space = 0;
		int star = 7;
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






