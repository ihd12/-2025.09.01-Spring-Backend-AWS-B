package practice5;

import java.util.Scanner;

class Rect {
//	가로,세로크기를 저장하는 멤버 변수 두개를 선언
	private int width, height;
//	가로,세로 크기를 반드시 설정하여 Rect클래스를 생성하도록 하는 생성자
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
//	가로, 세로 크기를 곱하여 넓이를 구하는 getArea메서드
	public int getArea() {
		return width * height;
	}
//	getter,setter가 없기 때문에 Rect클래스에서 가로,세로 크기를 출력하거나 변경하는 것은 불가능
}

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		3. 사각형을 표현하는 다음 Rect 클래스를 활용하여, Rect 객체 배열을 생성하고, 사용자로부
//		터 4개의 사각형을 입력받아 배열에 저장한 뒤, 배열을 검색하여 사각형 면적의 합을 출
//		력하는 main() 메소드를 가진 RectArray 클래스를 작성하라. [목적 – 객체 배열 활용]
//		[난이도 중]
		Scanner sc = new Scanner(System.in);
		Rect[] rectArr = new Rect[4];
		for(int i=0; i<rectArr.length; i++) {
			System.out.print(i+1+" 너비와 높이 >>");
			int width = sc.nextInt();
			int height = sc.nextInt();
			rectArr[i] = new Rect(width, height);
		}
		System.out.println("저장하였습니다…");
		int sum = 0;
		for(Rect rect : rectArr) {
			sum += rect.getArea();  
		}
		System.out.println("사각형의 전체 합은 "+sum);
//		-----------------------------------------------------------------------------
//		1 너비와 높이 >>3 5
//		2 너비와 높이 >>3 9
//		3 너비와 높이 >>2 7
//		4 너비와 높이 >>9 5
//		저장하였습니다…
//		사각형의 전체 합은 101
//		-----------------------------------------------------------------------------
	}

}
