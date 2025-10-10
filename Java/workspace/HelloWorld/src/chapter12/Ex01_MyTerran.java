package chapter12;

class Unit{
	String name;
	int hp;
	int mp;
	Unit(String name,int hp,int mp ){
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
	void doMove() {
		System.out.println(name+"가 이동속도 10으로 이동");
	}
	void printUnit() {
		System.out.print("이름:"+name+", HP:"+hp+", MP:"+mp);
	}
}

// 상속 방식 : class 클래스이름 extends 상속받을클래스{}
// name,hp,mp변수와 doMove(),printUnit()메서드를 
// 선언하지 않아도 사용할 수 있음.
class Marine extends Unit{
	int attack;
	Marine(String name,int hp,int mp, int attack){
		super(name, hp, mp);
		this.attack = attack;
	}
	void printMarine() {
//		부모 클래스의 메서드는 자식클래스에서 자유롭게 사용할 수 있음.
		printUnit();
		System.out.println(", 공격력:"+attack);
//		부모 클래스의 멤버 변수는 자식클래스에서 자유롭게 사용할 수 있음.
		System.out.println(name+","+hp+","+mp+","+attack);
	}
}
class Medic extends Unit{
	int heal = 5;
	Medic(String name, int hp, int mp, int heal){
//		부모에 있는 생성자를 실행하는 super()
//	 	부모클래스에 생성자가 있다면 자식클래스에서 반드시 실행해야함.
		super(name, hp, mp);
		this.heal = heal;
	}
	void printMedic() {
		printUnit();
		System.out.println(", 회복력:"+heal);
	}
}
//FireBat클래스 만들기

public class Ex01_MyTerran {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marine unit1 = new Marine("마린",50,0,5);
		// name, hp, mp 세가지 변수는 Unit클래스를 상속 받아 사용
		unit1.name = "마린"; 
		unit1.hp = 100;
		unit1.mp = 0;
		// attack변수는 Marine클래스에서 선언하여 사용
		unit1.attack=20;
		unit1.doMove();
		unit1.printMarine();
		
		Medic unit2 = new Medic("메딕",120,100,5);
		// attack변수는 Marine클래스에서 선언하여 사용
		unit2.doMove();
		unit2.printMedic();
		
	}

}








