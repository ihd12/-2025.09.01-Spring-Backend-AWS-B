package practice5;

import java.util.Scanner;

class Phone {
	private String name, tel;

	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}

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
		Phone[] phones = new Phone[2];
		for(int i=0; i<phones.length; i++) {
			
		}
		for(Phone i: phones) {
			System.out.println(i.getName()+"의 번호 "+i.getTel());
		}
//		-----------------------------------------------------------------------------
//		이름과 전화번호 입력 >>스폰지밥 333-3333
//		이름과 전화번호 입력 >> 징징이 999-9999
//		스폰지밥의 번호 333-3333
//		징징이의 번호 999-9999
//		-----------------------------------------------------------------------------
	}

}
