package chapter6;

public class Ex04_while1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// while 반복문 : 몇번 반복할지 정해져 있지 않은 경우 사용하는 반복문
//		int 초기값 = 1;
//		while(조건식) {
//			증감식;
//			반복해서 실행할 코드;
//		}
		int i=1;
		while(i<=5) {
			System.out.print(i+",");
			i++; 
		}
		System.out.println();
		int j=0;
		while(j<5) {
			j++;
			System.out.print(j+",");
		}
		System.out.println();
		// 100에서 110까지 출력하는 while문 작성하기
		int i1 = 100;
		while(i1<=110) {
			System.out.print(i1+",");
			i1++;
		}
		System.out.println();
		// 2에서 9까지 출력하는 while문 작성하기
		int i2 = 2;
		while(i2<=9) {
			System.out.print(i2+",");
			i2++;
		}
		System.out.println();
		// 10에서 1까지 출력하는 while문 작성하기
		int i3 = 10;
		while(i3>=1) {
			System.out.print(i3+",");
			i3--;
		}
		System.out.println();
		// 5,10,15를 출력하는 while문 작성하기
		int i4=5;
		while(i4<=15) {
			System.out.print(i4+",");
			i4+=5;
		}
		
	}

}





