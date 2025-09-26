package practice2;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2. 구구단을 단보다 곱하는 수가 작거나 같은 경우까지만 출력하는 프로그램
//		을 만들어 보세요 . (break 사용)
		// 2*1=2 2*2=4
		// 3*1=3 3*2=6 3*3=9
		// 4*1=4 4*2=8 4*3=12 4*4=16
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.print(i*j+" ");
				if(i==j) {
					break;
				}
			}
			System.out.println();
		}
	}

}







