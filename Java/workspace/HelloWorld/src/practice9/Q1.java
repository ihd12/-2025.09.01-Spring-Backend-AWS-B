package practice9;

import java.util.ArrayList;
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
		empList.add(new Emp(7369,"SMITH",20,800,0));
		empList.add(new Emp(7499,"ALLEN",30,1600,300));
		empList.add(new Emp(7521,"WARD",30,1250,500));
		empList.add(new Emp(7654,"MARTIN",30,1250,1400));
		empList.add(new Emp(7788,"SCOTT",20,3000,0));

		// stream 실습하
		// 1. 사원들의 sal 총합을 출력해보자
		// 2. 사원들의 sal 평균을 출력해보자
		// 3. 30번 부서에 있는 사람 수를 출력해보자
		// 4. 사원들 중 가장 급여를 많이 받는 사람을 출력해보자
		// 5. 사원들 중 가장 급여를 적게 받는 사람을 출력해보자
		// 6.사원 이름의 첫글자만 출력하고 나머지는 *로 출력해보자
		// 7. sal는 한달 급여이고 사원들의 월 평균 근무일수는 21일, 하루 근무시간은 8시간일때 하루 급여와 시급을 출력 해보자
		// 8. 30번 부서에서 가장 sal를 많이 받는 사람을 출력 해보자
		// 9. sal와 comm을 더하여 2000이상 받는 사람 수를 출력해보자
		
		
	}

}













