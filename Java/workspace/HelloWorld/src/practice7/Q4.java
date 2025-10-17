package practice7;

class Food{
	// 멤버 변수
	private int cal;
	private int cost;
	private int kg;
	
	//생성자
	public Food(int cal, int cost, int kg) {
		this.cal = cal;
		this.cost = cost;
		this.kg = kg;
	}
	
	// Getter, Setter
	public int getCal() {
		return cal;
	}
	public void setCal(int cal) {
		this.cal = cal;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getKg() {
		return kg;
	}
	public void setKg(int kg) {
		this.kg = kg;
	}
}
class Melon extends Food{
	// 멤버 변수
	private String info;
	
	//생성자
	public Melon(int cal, int cost, int kg, String info) {
		super(cal, cost, kg);
		this.info = info;
	}
	
	//Getter, Setter
	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
	
	@Override
	public String toString() {
//		칼로리 : 300 
//		가격 : 10000
//		중량 : 1.5
//		정보 : 머스크 멜론
		System.out.println("칼로리 : " + getCal());
		System.out.println("가격 : " + getCost());
		System.out.println("중량 : " + getKg());
		System.out.println("정보 : " + getInfo());
		return getInfo();
	}
	
}

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		4. 일반적인 음식을 나타내는 Food 클래스를 상속받아서 멜론을 나타내는 Melon 클래스를
//		작성하여 보자. Food 클래스는 칼로리, 가격, 중량 등의 정보를 가진다. Melon 클래스는
//		추가로 경작 농원 정보를 가진다. 생성자, 접근자, 설정자를 포함하여서 각각의 클래스를
//		작성한다. 이들 클래스들의 객체를 만들고 각 객체의 모든 정보를 출력하는 테스트 클래
//		스를 작성하라. 
		Melon melon1 = new Melon(300,10000,2,"머스크 멜론");
		Melon melon2 = new Melon(600,20000,3,"네트 멜론");
		melon1.toString();
		melon2.toString();
//		=================출력결과===================
//		칼로리 : 300 
//		가격 : 10000
//		중량 : 1.5
//		정보 : 머스크 멜론
//		칼로리 : 600
//		가격 : 20000
//		중량 : 3
//		정보 : 네트 멜론
//		==========================================

	}

}
