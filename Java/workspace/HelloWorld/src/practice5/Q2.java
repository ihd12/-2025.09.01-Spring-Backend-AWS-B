package practice5;

import java.util.Scanner;

class Phone {
	// 같은 자료형이면 ,를 이용하여 동시에 선언할 수 있음
	private String name, tel;
	// 생성자 : name, tel변수를 반드시 설정하도록 작성
	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	// 멤버 변수가 private일 경우 사용하는 getter
	public String getName() {
		return name;
	}

	public String getTel() {
		return tel;
	}
}

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2. 다음은 이름(name 필드)과 전화번호(tel 필드)를 가진 Phone 클래스이다. 이름과 전화번
//		호를 입력받아 2개의 Phone 객체를 생성하고, 출력하는 main 메소드를 작성하라.
//		[목적 – 클래스 만들기 연습] [난이도 하]
		Scanner sc = new Scanner(System.in);
		Phone[] phoneArr = new Phone[2];
//		이름과 전화번호를 입력 받아 phone객체를 생성하여 배열에 저장하는 반복문 
		for(int i=0; i<phoneArr.length; i++) {
			System.out.print("이름과 전화번호 입력 >>");
			//이름을 입력 받는 코드
			String name = sc.next();
			//전화번로를 입력받는 코드
			String tel = sc.next();
			//Phone객체를 생성하여 phoneArr배열에 저장하는 코드
			phoneArr[i] = new Phone(name, tel);
		}
		for(Phone phone : phoneArr) {
			System.out.println(phone.getName()+"의 번호 "+phone.getTel());
		}
//		-----------------------------------------------------------------------------
//		이름과 전화번호 입력 >>스폰지밥 333-3333
//		이름과 전화번호 입력 >> 징징이 999-9999
//		스폰지밥의 번호 333-3333
//		징징이의 번호 999-9999
//		-----------------------------------------------------------------------------
	}

}
