package kr.or.bit;

//데이터를 담을 수 있는 클래스
//목적 : DTO , VO , DOMAIN
public class Emp { //extends Object
	private int empno;
	private String ename;
	
	public Emp(int empno, String ename) {
		this.empno = empno;
		this.ename = ename;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + "]";
	}
	
	//사번과 이름을 출력하는 메서드 .....
	
	//toString : Object  클래스가 가지는 메서드 
	//내가 Object  ...  toString()  내 마음대로 ..쓰고 .. 범용 
	/*
	@Override
	public String toString() {
		return this.empno + " / " + this.ename;
	}
   */
	
}





