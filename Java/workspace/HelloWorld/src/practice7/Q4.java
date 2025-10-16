package practice7;

class Food{
	
}
class Melon extends Food{
	
}

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		4. 일반적인 음식을 나타내는 Food 클래스를 상속받아서 멜론을 나타내는 Melon 클래스를
//		작성하여 보자. Food 클래스는 칼로리, 가격, 중량 등의 정보를 가진다. Melon 클래스는
//		추가로 경작 농원 정보를 가진다. 생성자, 접근자, 설정자를 포함하여서 각각의 클래스를
//		작성한다. 이들 클래스들의 객체를 만들고 각 객체의 모든 정보를 출력하는 테스트 클래
//		스를 작성하라. 
		Melon melon1 = new Melon(300,10000,1.5,"머스크 멜론");
		Melon melon2 = new Melon(600,20000,3,"네트 멜론");
		melon1.print();
		melon2.print();
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
