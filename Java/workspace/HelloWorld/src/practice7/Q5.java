package practice7;

class Phone{
	
}
class SmartPhone{
	
}

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		5. 일반적인 휴대폰을 나타내는 Phone 클래스를 작성한다. Phone에는 제조사, 가격, 통신타
//		입(2g 또는 3g) 등의 정보가 저장되어 있다. Phone에서 상속받아서 SmartPhone 클래스
//		를 작성하여 보자. SmartPhone 클래스에는 운영체제 타입, 운영체제 버전, 내부 메모리
//		크기, 카메라 장착 여부, 블루투스 지원 여부 등의 필드가 추가된다. 생성자, 접근자, 설
//		정자를 포함하여서 각각의 클래스를 작성한다. 이들 클래스들의 객체를 만들고 각 객체
//		의 모든 정보를 출력하는 테스트 클래스를 작성하라. 
		SmartPhone sp1 = new SmartPhone("삼성",1000000,"2g","안드로이드"
				,"3.1.4","4gb",true, false);
		sp1.toString();
//		=================출력결과===================
//		제조사 : 삼성 
//		가격 : 1000000
//		통신타입 : 2g
//		운영체제 타입 : 안드로이드
//		운영체제 버전 : 3.1.4
//		내부 메모리 : 4gb
//		카메라 장착 여부 : 지원
//		블루투스 지원 여부 : 미지원
//		==========================================
		
	}

}







