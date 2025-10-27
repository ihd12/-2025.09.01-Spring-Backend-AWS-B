package practice8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Student{
//	이름, 학과, 학번, 학점
	private String name;
	private String dept;
	private int sno;
	private double score;
//	생성자
	public Student(String name, String dept, int sno, double score) {
		this.name = name;
		this.dept = dept;
		this.sno = sno;
		this.score = score;
	}
	
//	Getter, Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	
	
}
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		4. 학생정보를 나타내는 Student클래스에 이름, 학과, 학번, 학점을 저장하는 필드를 작성하라.
//		(1) 학생 객체를 생성하고 5명을 학생정보를 ArrayList<Student>컬렉션에 저장한 후에,
//		ArrayList<Student>의 모든학생(5명) 정보를 출력하고 학생의 이름을 입력받아 해당 학생의 학생정
//		보를 출력하는 프로그램을 작성하라.
		ArrayList<Student> studentList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("학생이름, 학과, 학번, 학점을 입력하세요.");
		for(int i=0; i<5; i++) {
			System.out.print(">>");
			String name = sc.next();
			String dept = sc.next();
			int sno = sc.nextInt();
			double score = sc.nextDouble();
			Student s = new Student(name, dept, sno, score);
			studentList.add(s);
		}
		for(Student student : studentList) {
			System.out.println("---------------------");
			System.out.println("이름 : " + student.getName());
			System.out.println("학과 : " + student.getDept());
			System.out.println("학번 : " + student.getSno());
			System.out.println("학점 : " + student.getScore());
		}
		while(true) {
			System.out.print("학생 이름>>");
			String name = sc.next();
			if(name.equals("그만")) {
				break;
			}
			boolean flag = false;
			for(Student student:studentList) {
				if(name.equals(student.getName())){
					System.out.println(student.getName()
							+","+student.getDept()
							+","+student.getSno()
							+","+student.getScore());
					flag = true;
				}
			}
			if(flag == false) {
				System.out.println("해당 학생이 없습니다.");
			}
		}
		System.out.println("프로그램이 종료됩니다.");
//		(2) ArrayList<Student> 대신, HashMap<String, Student> 해시맵을 이용하여 다시 작성하라. 해시
//		맵의 키(key)는 학생이름으로 한다.
		Map<String, Student> studentMap = new HashMap<>();
//		데이터 저장 코드
		for(int i=0; i<5; i++) {
			System.out.print(">>");
			String name = sc.next();
			String dept = sc.next();
			int sno = sc.nextInt();
			double score = sc.nextDouble();
			Student s = new Student(name, dept, sno, score);
			studentMap.put(name,s);
		}
//		전체 인원 출력 코드
		for(String name : studentMap.keySet()) {
			System.out.println("---------------------");
			System.out.println("이름 : " + studentMap.get(name).getName());
			System.out.println("학과 : " + studentMap.get(name).getDept());
			System.out.println("학번 : " + studentMap.get(name).getSno());
			System.out.println("학점 : " + studentMap.get(name).getScore());
		}
		while(true) {
			System.out.print("학생 이름>>");
			String name = sc.next();
			if(name.equals("그만")) {
				break;
			}
			if(studentMap.containsKey(name)) {
				System.out.println(studentMap.get(name).getName()
						+","+studentMap.get(name).getDept()
						+","+studentMap.get(name).getSno()
						+","+studentMap.get(name).getScore());
			}else {
				System.out.println("해당하는 학생이 없습니다.");
			}
		}
//		-출력결과---------------------------------------
//		학생이름, 학과, 학번, 학점을 입력하세요.
//		>> 홍길동 모바일 1 4.1
//		>> 이재문 안드로이드 2 3.9
//		>> 김남윤 웹공학 3 3.5
//		>> 최찬미 빅데이터 4 4.25
//		>> 정영웅 컴퓨터공학 5 3.0
//		----------------------------------------
//		이름 : 홍길동
//		학과 : 모바일
//		학번 : 1
//		학점 : 4.1
//		-----------------------------
//		이름 : 이재문
//		학과 : 안드로이드
//		학번 : 2
//		학점 : 3.9
//		------------------------------
//		이름 : 김남윤
//		학과 : 웹공학
//		학번 : 3
//		학점 : 3.5
//		----------------------------
//		이름 : 최찬미
//		학과 : 빅데이터
//		학번 : 4
//		학점 : 4.25
//		----------------------------
//		이름 : 정영웅
//		학과 : 컴퓨터공학
//		학번 : 5
//		학점 : 3.0
//		----------------------------
//		학생 이름 >> 최찬미
//		최찬미, 빅데이터, 4, 4.25
//		학생 이름 >> 이재문
//		이재문, 안드로이드, 2, 3.9
//		학생 이름 >> 그만
	}

}






