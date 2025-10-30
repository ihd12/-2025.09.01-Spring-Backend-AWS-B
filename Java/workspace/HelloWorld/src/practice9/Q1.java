package practice9;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Emp{
	int empno;
	String ename;
	int deptno;
	int sal;
	int comm;
	public Emp(int empno, String ename,int deptno,int sal,int comm) {
		this.empno = empno;
		this.ename = ename;
		this.deptno = deptno;
		this.sal = sal;
		this.comm = comm;
	}
}

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Emp> empList = new ArrayList<>();
//						  사원번호, 이름, 부서번호, 급여, 커미션
		empList.add(new Emp(7369,"SMITH",20,800,0)); // S****
		empList.add(new Emp(7499,"ALLEN",30,1600,300));
		empList.add(new Emp(7521,"WARD",30,1250,500)); // W***
		empList.add(new Emp(7654,"MARTIN",30,1250,1400)); // M*****
		empList.add(new Emp(7788,"SCOTT",20,3000,0));

		// stream 실습하기
		// 1. 사원들의 sal 총합을 출력해보자
		int sumSal = empList.stream()
				.mapToInt(emp -> emp.sal)
				.sum();
		System.out.println("전체 사원의 급여 합계 : " + sumSal);
		// 2. 사원들의 sal 평균을 출력해보자
		double avg = sumSal / empList.size();
		avg = empList.stream()
				.mapToInt(emp -> emp.sal)
				.average().getAsDouble();
		System.out.println("전체 사원의 평균 급여 : " + avg);
		// 3. 30번 부서에 있는 사람 수를 출력해보자
		long count30 = empList.stream()
				.filter(emp -> emp.deptno == 30)
				.count();
		System.out.println("30번 부서의 인원수 : " + count30);
		// 4. 사원들 중 가장 급여를 많이 받는 사람을 출력해보자
		int maxSal = empList.stream()
				.mapToInt(emp -> emp.sal)
				.max().getAsInt();
		empList.stream()
			.filter(emp -> emp.sal == maxSal)
			.forEach(emp -> System.out.println("가장 많이 받는 사원:"
					+emp.ename+":"+emp.sal ));
		// 5. 사원들 중 가장 급여를 적게 받는 사람을 출력해보자
		int minSal = empList.stream()
				.mapToInt(emp -> emp.sal)
				.min().getAsInt();
		empList.stream()
			.filter(emp -> emp.sal == minSal)
			.forEach(emp -> System.out.println("가장 적게 받는 사원:"
					+emp.ename+":"+emp.sal ));
		Emp maxEmp = empList.stream()
				.max(Comparator.comparingInt(emp->emp.sal))
				.get();
		System.out.println("가장 많이 받는 사원:"
				+maxEmp.ename+":"+maxEmp.sal);
		Emp minEmp = empList.stream()
				.min(Comparator.comparingInt(emp->emp.sal))
				.get();
		System.out.println("가장 적게 받는 사원:"
				+minEmp.ename+":"+minEmp.sal);
		// 6.사원 이름의 첫글자만 출력하고 나머지는 *로 출력해보자
		empList.stream()
			.map(emp -> emp.ename.charAt(0) 
					+ "*".repeat(emp.ename.length()-1)+" ")
			.forEach(ename -> 
				System.out.print(ename));
		empList.stream()
		.map(emp -> {
			String star = "";
			for(int i=0; i<emp.ename.length()-1; i++) {
				star+="*";
			}
			return emp.ename.charAt(0)+star+" ";
		})
		.forEach(ename -> 
			System.out.print(ename));
		System.out.println();
		// 7. sal는 한달 급여이고 사원들의 월 평균 근무일수는 21일, 하루 근무시간은 8시간일때 하루 급여와 시급을 출력 해보자
		empList.stream()
		.mapToDouble(emp -> emp.sal/21)
		.forEach(daySal -> System.out.println("하루 급여:"+daySal));
		empList.stream()
		.mapToDouble(emp -> emp.sal/21/8)
		.forEach(timeSal -> System.out.println("시급:"+timeSal));
		// 8. 30번 부서에서 가장 sal를 많이 받는 사람을 출력 해보자
		Emp maxEmp30 = empList.stream()
				.filter(emp -> emp.deptno == 30)
				.max(Comparator.comparingInt(emp->emp.sal))
				.get();
		System.out.println("30번 부서에서 가장 많이 받는 사원:"
				+maxEmp30.ename+":"+maxEmp30.sal);
		// 9. sal와 comm을 더하여 2000이상 받는 사람 수를 출력해보자
		long count = empList.stream()
		.filter(emp -> emp.sal + emp.comm >= 2000)
		.count();
		System.out.println(
				"급여와 보너스를 포함하여 2000이상 받는 사원의 수:" + count);
		
	}

}













