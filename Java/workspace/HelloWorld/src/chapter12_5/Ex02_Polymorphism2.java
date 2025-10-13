package chapter12_5;

// 부모클래스
abstract class Human{
	abstract void print();
}
// 자식클래스
class Man extends Human{
	int a = 1;
	void a() {
		System.out.println("a메서드");
	}
	@Override
	void print() {
		System.out.println("남자 생성");
	}
}
//자식클래스
class Woman extends Human{
	int b = 2;
	void b() {
		System.out.println("b메서드");
	}
	@Override
	void print() {
		System.out.println("여자 생성");
	}
}

public class Ex02_Polymorphism2 {
	public static Human humanCreate(int kind) {
		if(kind==1) {
			return new Man();
		}else {
			return new Woman();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		다형성 : 하나의 메서드가 여러가지 다른 형태를 가지고 있는 것
		Human h1 = new Man();
//		print라는 같은 메서드를 사용함에도 
		h1.print(); // 남자 생성을 출력
//		System.out.println(h1.a); a변수는 부모클래스에 없기 때문에 사용할 수 없음
//		h1.a(); 부모클래스에 없는 메서드는 사용할 수 없음
		Human h2 = new Woman();
		h2.print(); // 여자 생성을 출력
//		System.out.println(h2.b); b변수는 부모클래스에 없기 때문에 사용할 수 없음
//		h2.b(); 부모클래스에 없는 메서드는 사용할 수 없음
	}

}








