package chapter12_4;

// interface 이름 {
//  스태틱 상수; 모든 인터페이스에서 공통으로 사용하는 값을 설정
//	추상 메서드; 자식 클래스에서 구현해야하는 메서드를 설정
//  디폴트 메서드; 모든 인터페이스에서 공통으로 사용하는 메서드를 설정
//}
interface Greet{
	void greet();
}
interface Talk{
	void talk();
}
// 자식클래스에 implements를 작성 후 인터페이스 이름을 작성
class Morning implements Greet, Talk{
//	추상메서드를 실제로 구현하여야 에러가 발생하지 않음
	@Override
	public void greet() {
		System.out.println("안녕하세요");
	}
//	인터페이스 여러개 상속 받았다면 상속받은 모든 추상메서드를 구현해야함
	@Override
	public void talk() {
		System.out.println("날씨 좋네요");
	}
}

public class Ex01_Meet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Morning morning = new Morning();
		morning.greet();
		morning.talk();
	}

}






