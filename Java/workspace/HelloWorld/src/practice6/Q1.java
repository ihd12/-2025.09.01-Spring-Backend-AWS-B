package practice6;

class Circle {
	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}
}

class NamedCircle extends Circle{
	private String name;
	public NamedCircle(int radius, String name) {
		super(radius);
		this.name = name;
	}
	void show() {
		System.out.println(name + ", 반지름 = " + getRadius());
	}
}

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Circle 클래스를 상속받은 NamedCircle 클래스를 작성하여, 
//		다음 main()을 실행할 때 다음 실행
//		결과와 같이 출력되도록 하라. [목적 – 간단한 클래스 상속] [난이도 하]		
		NamedCircle w = new NamedCircle(5, "Waffle");
		w.show();
//		Waffle, 반지름 = 5
	}

}






