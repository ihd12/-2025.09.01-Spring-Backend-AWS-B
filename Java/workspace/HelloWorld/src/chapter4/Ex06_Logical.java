package chapter4;

public class Ex06_Logical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 논리 연산자
		// && : true&&true=true, true&&false=false, false&&false=false
		System.out.println("true && true : " + (true && true) );
		System.out.println("true && false : " + (true && false) );
		System.out.println("false && true : " + (false && true) );
		System.out.println("false && false : " + (false && false) );
//		boolean login = id=="hong" && pw=="1234";
		int age = 9;
		int tall = 129;
		boolean ticket = true;
		System.out.println("롤러코스터 탑승 조건은 나이가10살 이상, "
				+ "키가 130cm이상이고 티켓이 있어야합니다.");
		System.out.println("롤러코스터 탑승 가능 여부 : "
				+(age>=10 && tall>=130 && ticket));
		// ||(Or연산자) : true||true=true, true||false=true, false||false=false
		System.out.println("true || true : " + (true || true) );
		System.out.println("true || false : " + (true || false) );
		System.out.println("false || true : " + (false || true) );
		System.out.println("false || false : " + (false || false) );
		// 간식 고르기: 사과, 바나나, 과자, 아이스크림 이중에 하나만 있으면 간식을 먹을 수 있음
		// 우산 가져가기 : 비가오거나 눈이 올 때 우산 가져가야 함
		// !(Not연산자) : !true=false, !false=true
		boolean bool = false;
		System.out.println(!bool);
		System.out.println("!true : "+!true);
		System.out.println("!false : "+!false);
		System.out.println("1000미만 2000초과 계산식을 작성하자");
		int x = 500;
		System.out.println("x<1000 || x>2000 :"+ (x<1000 || x>2000));
		System.out.println("!(x>=1000 && x<=2000) :" + !(x>=1000 && x<=2000));
		
		// 시험 합격 조건(or연산자)
		// 국어, 수학, 영어 중 90점이 넘는 과목이 있다면 true를 출력합니다.
		int 국어 = 95;
		int 수학 = 80;
		int 영어 = 70;
		System.out.println("합격여부: "+(국어>=90 || 수학>=90 || 영어>=90));
		// 비행기 탑승 가능 여부(And연산자)
		// 비행기를 타려면 여권, 비행기표, 9시 이전에 true 출력합니다.
		boolean 여권 = false;
		boolean 비행기표 = true;
		int 현재시간 = 10; 
//		System.out.println(여권==true && 비행기표==true && 현재시간<9);
		System.out.println("비행기 탑승 여부: "+(여권 && 비행기표 && 현재시간<9));
		
		//논리 연산자 사용시의 주의점
		// 최단 거리 평가(SCE)
		// 1. And연산(&&) : 앞쪽 조건에서 false가 나오면 
		//        	   뒤쪽 조건은 계산하지 않고 결과를 false로 출력한다.
		// 2. Or연산(||) : 앞쪽 조건에서 true가 나오면
		//			   뒤쪽 조건은 계산하지 않고 결과를 true로 출력한다.
		
		
	}

}














