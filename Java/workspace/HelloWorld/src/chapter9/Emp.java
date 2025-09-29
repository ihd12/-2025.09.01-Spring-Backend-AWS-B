package chapter9;

import java.time.LocalDate;

public class Emp {
	private int empno; // 사원번호
	private String ename; // 사원이름
	private String job; // 직책
	private int mgr; // 직속상사의 사원번호
	private LocalDate hireDate; // 고용일
	private double sal; //급여
	private double comm; // 급여외 수당
	private int deptno; // 부서번호
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		if(empno<0 || empno>9999) {
			System.out.println("사원번호는 9999까지 입력 가능합니다");
			this.empno = 0;
			return;
		}
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		if(ename.length()>10) {
			System.out.println("사원이름은 10글자 이하로 입력하세요.");
			this.ename="";
			return;
		}
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		if(job.length()>10) {
			System.out.println("직책은 9글자 이하로 입력하세요.");
			this.job="";
			return;
		}
		this.job = job;
	}
	public int getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		if(mgr<0 || mgr>9999) {
			System.out.println("직속상사의 사원번호는 9999까지 입력 가능합니다");
			this.mgr = 0;
			return;
		}
		this.mgr = mgr;
	}
	public LocalDate getHireDate() {
		return hireDate;
	}
	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		// sal를 문자열 자료형으로 변경
		String salToStr = sal.toString();
		// sal에 있는 소수점의 위치를 index에 저장
		int index = salToStr.indexOf(".");
		// sal에 소수점 뒤에있는 문자열만 잘라서 저장
		salToStr = salToStr.substring(index+1);
		if(sal<0 || sal>9999999.99 || salToStr.length()>2) {
			System.out.println("급여는 정수부 7자 실수부 2자까지만 입력 가능합니다.");
			this.sal = 0.0;
			return;
		}
		this.sal = sal;
	}
	public double getComm() {
		return comm;
	}
	public void setComm(Double comm) {
		String commToStr = comm.toString();
		int index = commToStr.indexOf(".");
		commToStr = commToStr.substring(index+1);
		if(comm<0 || comm>9999999.99 || commToStr.length()>2) {
			System.out.println("보너스는 정수부 7자 실수부 2자까지만 입력 가능합니다.");
			this.comm = 0.0;
			return;
		}
		this.comm = comm;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		if(deptno<0 || deptno>99) {
			System.out.println("부서번호는 99까지 입력 가능합니다");
			this.deptno = 0;
			return;
		}
		this.deptno = deptno;
	}
	
	
	
//	public void setSal(Double sal) {
//		String salToStr = sal.toString();
//		int index = salToStr.indexOf(".")+1;
//		salToStr = salToStr.substring(index);
//		System.out.println(salToStr);
//		if(sal<0 || sal>9999999.99 || salToStr.length()>2) {
//			System.out.println("7자리, 소수점 2자리 이하의 숫자로 입력해주세요.");
//			this.sal = 0.0;
//			return;
//		}
//		this.sal = sal;
//	}
	
	
}
