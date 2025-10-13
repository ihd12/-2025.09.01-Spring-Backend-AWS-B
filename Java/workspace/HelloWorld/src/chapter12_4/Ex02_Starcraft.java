package chapter12_4;

abstract class Building{
	int health;
	abstract void doBuild();
}
interface Fly{
	void flyBuilding();
	default void method2() {
		System.out.println("메서드2 입니다.");
	}
	default void method3() {}
}
// 인간형생산건물
class Barracks extends Building implements Fly{
	@Override
	void doBuild() {
		System.out.println("인간형 유닌 생산 건물을 짓습니다.");
	}
	@Override
	public void flyBuilding() {
		System.out.println("건물이 날아서 이동하게 합니다.");
	}
	void doMakeMarine() {
		System.out.println("총쏘는 유닛을 생산합니다.");
	}
	@Override
	public void method3() {
		System.out.println("Barracks에만 있는 method3 구현");
	}
}
//기갑형생산건물
class Factory extends Building implements Fly{
	@Override
	void doBuild() {
		System.out.println("기갑형 유닛 생산 건물을 짓습니다.");
	}
	@Override
	public void flyBuilding() {
		System.out.println("건물이 날아서 이동하게 합니다.");
	}
	void doMakeTank() {
		System.out.println("탱크 유닛을 생산합니다.");
	}
}
//인간형 유닛을 숨겨서 보호하는 건물
class Bunker extends Building{
	@Override
	void doBuild() {
		System.out.println("인간형 유닛이 숨을 건물을 짓습니다.");
	}
	void doDefense() {
		System.out.println("숨은 유닛을 적의 공격으로부터 보호합니다.");
	}
}

public class Ex02_Starcraft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Barracks barracks = new Barracks();
		barracks.doBuild();
		barracks.doMakeMarine();
		barracks.flyBuilding();
		Factory factory = new Factory();
		factory.doBuild();
		factory.doMakeTank();
		factory.flyBuilding();
		Bunker bunker = new Bunker();
		bunker.doBuild();
		bunker.doDefense();
	}

}







