package chapter12_3;

// 추상 클래스 : 추상메서드를 포함하는 클래스는 추상클래스로 작성해야함. 
// 일반 클래스에 추상메서드를 포함하면 에러가 발생합니다.
// 작성방법 : class 선언 앞에 abstract를 붙이면 추상 클래스로 구현됨
// 반드시 필요한 메서드이지만 각각 다른 코드가 실행되어야 하는 경우 추상메서드로 설정
// 추상클래스는 추상메서드가 포함되어있기 때문에 직접 인스턴화 하는것은 불가능함
// 반드시 상속하여 자식클래스 만들고 인스턴화 해야함. 
abstract class Unit{
	String name;
	int hp;
	Unit(String name, int hp){
		this.name = name;
		this.hp = hp;
	}
	void printUnit() {
		System.out.println("이름:"+name+", HP:"+hp);
	}
//	추상 메서드 : 실행코드를 작성하지 않고 상속을 했을때 실제 코드를 
//	자식클래스에서 각각 실행코드를 구현하도록 만드는 메서드 
	abstract void doMove();
}
class Marine extends Unit{
	Marine(String name, int hp){
		super(name, hp);
	}
//	부모클래스의 추상메서드는 자식클래스에서 오버라이드하여 구현하면 에러가 발생하지 않음
	@Override
	void doMove() {
		System.out.println("마린은 두발로 이동합니다.");
	}
}
class Zergling extends Unit{
	Zergling(String name, int hp){
		super(name, hp);
	}
	@Override
	void doMove() {
		System.out.println("저글링은 네 발로 이동합니다.");
	}
}
public class MyStarcraft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marine unit1 = new Marine("마린", 50);
		unit1.doMove();
		unit1.printUnit();
		Zergling unit2 = new Zergling("저글링",40);
		unit2.doMove();
		unit2.printUnit();
//		추상클래스는 인스턴화 할 수 없기 때문에 에러 발생
//		Unit unit3 = new Unit();
//		unit3.doMove();
	}

}






