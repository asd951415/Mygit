import java.util.ArrayList;

import kr.or.bit.Emp;

public class Ex03_ArrayList_Object {

	public static void main(String[] args) {
		//사원 1명을 만드세요
		Emp emp = new Emp(100, "김유신", "군인");
		System.out.println(emp.toString());
		
		//사원 2명 (Array)
		Emp[] emplist = {new Emp(100,"김씨","일반"), new Emp(200,"박씨","학생")};
		for(Emp e : emplist) {
			System.out.println(e.toString());
		}
		//1명 입사를 더 했어요  추가하세요 (기존)
		//ArrayList ...
		ArrayList elist = new ArrayList();
		elist.add(new Emp(1,"강","IT"));
		elist.add(new Emp(2,"김","IT"));
		//1명 입사
		elist.add(new Emp(3,"이","IT"));
		System.out.println(elist.size());
		//System.out.println(elist.get(0).toString());
		for(int i= 0 ; i < elist.size() ;i++) {
			System.out.println(elist.get(i));
		}
		//toString()  사용하지 말고 사원의 사번 , 이름 , 직종을 출력하세요
		//일반 for 문으로 .... getEmpno() , getEname() , getJob() 함수를 호출 출력
		for(int i= 0 ; i < elist.size() ;i++) {
				Object obj = elist.get(i);
				//Object 는 Emp 타입의 부모 타입이다
				Emp e = (Emp)obj;
				System.out.println(e.getEmpno() + " / " + e.getEname() + " / " + e.getJob());
		}
		for(Object e : elist) {
				Emp em = (Emp)e;
				
		}
			
		//이런식의 코드는  개발자 ...... 정 말  짜증 ....
		// 다시 다운 캐스팅 .... 반복적 ......
		// Object 쓰지 않고도 객체 .....
		//제너릭 (객체 생성 타입 강제)
		//현업에서 만드는 코드는 90% 제너릭 ......
		ArrayList<Emp> list2 = new ArrayList<Emp>();
		list2.add(new Emp(1,"A","IT"));
		
		for(Emp e  : list2) {
			 System.out.println(e.getEmpno());
		}
		
	
	
		
	}

}











