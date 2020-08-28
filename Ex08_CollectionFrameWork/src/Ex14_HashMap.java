import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
	HashMap<K, V>
		HashMap<String, String>
		HashMap<Integer, String>
		HashMap<String, Student>  *********
		>> put("kim",new Student()) ********

*/
class Student{
	int kor;
	int math;
	int eng;
	String name;
	
	public Student(int kor, int math, int eng, String name) {
		super();
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		this.name = name;
	}
	
}

class ArrayTest{
	  ArrayList<String[]> al = new ArrayList<String[]>();
}



public class Ex14_HashMap {
	public static void main(String[] args) {
		HashMap<String, Student> sts = new HashMap<String, Student>();
		sts.put("hong", new Student(100, 99, 98, "»´±Êµø"));
		sts.put("kim", new Student(50, 40, 60, "±Ë¿ØΩ≈"));

		 Student std = sts.get("hong");
		 System.out.println(std.kor);
		 System.out.println(std.name);
		 
		 //Tip 1
		 //Map æ»ø° key , value  >> key + "=" + value >>  
		Set set =  sts.entrySet();   // hong=Student@15db9742
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		//Tip .. ∫–∏Æµ» key , value  »πµÊ ... 2
		//  class Entry { Object key , Object value}
		//  Map { Entry[] elements } >>   Map.Entry ¿Œ≈Õ∆‰¿ÃΩ∫ ....
		for(Map.Entry m : sts.entrySet()) {
					System.out.println(m.getKey()  + " / " + ((Student)m.getValue()).name);
		}
		
		
		
		
		//Tip   ..3 ^^! 
		ArrayTest at = new ArrayTest();
		at.al.add(new String[] {"1","2","3","4"});
		at.al.add(new String[] {"5","6","7","9"});
		String[] str = at.al.get(0);
		for(String s : str) {
			System.out.println(s);
		}
		
		
		
		
	}

}






