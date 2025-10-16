package practice6;

interface AdderInterface {
	int add(int x, int y); // x와 y의 합 리턴
	int add(int n); // 1에서 n까지의 정수 합 리턴. n은 0보다 큰 수로 가정
}
class MyAdder implements AdderInterface{
	@Override
	public int add(int x, int y) {
		return x+y;
	}
	@Override
	public int add(int n) {
		int sum = 0;
		for(int i=1; i<=n; i++) {
			sum+=i;
		}
		return sum;
	}
}

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		AdderInterface를 상속받은 클래스 MyAdder를 작성하여, 
//		다음 main()을 실행할 때 아래 실행 결
//		과와 같이 출력되도록 하라. [목적 – 인터페이스를 구현한 클래스 만들기] [난이도 하]
		MyAdder adder = new MyAdder();
		System.out.println(adder.add(5, 10));
		System.out.println(adder.add(10));
	}

}








