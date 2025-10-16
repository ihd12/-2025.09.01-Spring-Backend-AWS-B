package practice7;

class Student2{
	
}
class UnderGraduate extends Student2{
	
}
class Graduate extends Student2{
	
}

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		6. 다음 그림에 해당하는 클래스를 작성하여 보자. 모든 학생은 이름, 학번, 소속 학과, 학
//		년, 이수 학점 수를 가진다. 추가적으로 학부생은 소속 동아리명을 가지고 있고 대학원생
//		은 조교 유형과 장학금 비율을 가진다. 조교 유형에는 교육 조교와 연구 조교가 있으며
//		장학금 비율은 0과 1사이의 값이다. 각 클래스는 적절한 생성자 메소드, 접근자 메소드, 변경자 메소드를 가진다. 이러한 클래스들의 객체를 만들고 각 객체의 모든 정보를 출력
//		하는 테스트 클래스를 작성하라
		UnderGraduate underGraduate1 = new UnderGraduate("갑",1000,"컴공",84,"날자날어");
		underGraduate1.toString();
		underGraduate1.setCredit(87);
		underGraduate1.setClub("돌고 돌아");
		underGraduate1.toString();
		Graduate graduate1 = new Gradute("을",100,"전자공학",2,51,"교육 조교", false);
		Graduate graduate2 = new Gradute("병",102,"세포생물",3,61,"연구 조교", true);
		graduate1.toString();
		graduate2.toString();
//		=================출력결과===================
//		이름:갑/ 학번:1000/ 학과:컴공/ 학년:3/ 이수학점:84/ 소속동아리:날자날어
//		이름:갑/ 학번:1000/ 학과:컴공/ 학년:3/ 이수학점:87/ 소속동아리:돌고 돌아
//		이름:을/ 학번:100/ 학과:전자공학/ 학년:2/ 이수학점:51/ 조교 유형: 교육 조교/ 장학금 여부 :못받음
//		이름:병/ 학번:102/ 학과:세포생물/ 학년:3/ 이수학점:61/ 조교 유형: 연구 조교/ 장학금 여부 :받음
//		==========================================
		
	}

}








