package chapter23;

import java.util.ArrayList;
import java.util.List;

class Student{
	int sno;
	String name;
	int math;
	int kor;
	int eng;
	public Student(int sno, String name, int math, int kor, int eng) {
		this.sno = sno;
		this.name = name;
		this.math = math;
		this.kor = kor;
		this.eng = eng;
	}
	
}

public class Ex08_Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student(1, "이순신", 90, 95, 100));
		studentList.add(new Student(2, "홍길동", 80, 70, 90));
		studentList.add(new Student(3, "전우치", 100, 90, 80));
		// 수학점수의 합계
		int mathSum = studentList.stream()
				.mapToInt(student -> student.math)
				.sum();
		System.out.println("수학 점수의 합계 : " + mathSum);
		// 수학, 국어, 영어를 더한 값 출력하기
		int sum = studentList.stream()
				.mapToInt(student -> student.math+student.kor+student.eng)
				.sum();
//		각 인원에 대한 국영수 합계 점수	
		System.out.println("국영수 모든 점수를 더한 값: " + sum);
		studentList.stream()
				.mapToInt(student -> student.math+student.kor+student.eng)
				.forEach(total -> System.out.println(total));
		
	}

}









