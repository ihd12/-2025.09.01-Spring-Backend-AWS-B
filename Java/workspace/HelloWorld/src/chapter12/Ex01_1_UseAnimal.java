package chapter12;

class Animal{
	// 멤버 변수 : name, age
	String name;
	int age;
	// 메서드 : eat() : 먹습니다 , move(): 움직입니다
	void eat() {
		System.out.println("먹습니다");
	}
	void move() {
		System.out.println("움직입니다.");
	}
}
class Cat extends Animal{
	// 메서드 : meow(): 고양이가 야옹하고 웁니다.
	void meow() {
		System.out.println("고양이가 야옹하고 웁니다.");
	}
//	eat()메서드를 오버라이딩하여 고양이는 천천히 먹습니다 출력하도록 변경
	@Override
	void eat() {
		System.out.println("고양이는 천천히 먹습니다");
	}
//	move()메서드를 오버라이딩하여 고양이는 조용히 움직입니다 출력하도록 변경
	@Override
	void move() {
		System.out.println("고양이는 조용히 움직입니다");
	}
}
class Dog extends Animal{
	// 메서드 : bark() : 강아지가 멍멍하고 짖습니다.
	void bark() {
		System.out.println("강아지가 멍멍하고 짖습니다.");
	}
	// eat()를 실행하면 아래 내용이 출력되도록 설정하기 
	@Override
	void eat() {
		super.eat(); //	먹습니다. 
		System.out.println("주인의 허락이 떨어져야 먹습니다.");//주인의 허락이 떨어져야 먹습니다.
	}
	// move()를 실행하면 아래 내용이 출력되도록 설정하기 
	@Override
	void move() {
		super.move(); //움직입니다. 
		System.out.println("산책할때는 더 빠르게 움직입니다."); //	산책할때는 더 빠르게 움직입니다.
	}
}

public class Ex01_1_UseAnimal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat = new Cat();
		cat.name = "고양이";
		cat.age = 2;
		cat.eat();
		cat.move();
		cat.meow();
		
		Dog dog = new Dog();
		dog.name = "멍멍이";
		dog.age = 3;
		dog.eat();
		dog.move();
		dog.bark();
	}
}









