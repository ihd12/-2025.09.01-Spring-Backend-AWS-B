package practice5;

class Rect {
	private int width, height;

	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int getArea() {
		return width * height;
	}
}

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		3. 사각형을 표현하는 다음 Rect 클래스를 활용하여, Rect 객체 배열을 생성하고, 사용자로부
//		터 4개의 사각형을 입력받아 배열에 저장한 뒤, 배열을 검색하여 사각형 면적의 합을 출
//		력하는 main() 메소드를 가진 RectArray 클래스를 작성하라. [목적 – 객체 배열 활용]
//		[난이도 중]
		Rect[] rectArr = new Rect[4];
		for(int i=0; i<rectArr.length; i++) {
			System.out.print("너비와 높이 >>");
			// Rect를 만드는 코드
		}
		System.out.println("저장하였습니다...");
		int sum = 0;
		for(Rect rect : rectArr ) {
			// 각 Rect의 넓이를 더하는 코드
			sum += 
		}
		System.out.println("사각형 전체의 합은 " + sum);
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
