import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Set �������̽� �����ϰ� �ִ�  : Ŭ����
//Set  ���ȿ� ������ (���� ����(x) , �ߺ�(x)) : ������ ���� �ߺ��� ������� �ʴ� ������ ���� : Set
//HashSet , TreeSet
public class Ex09_Set {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		
		hs.add(1);
		hs.add(100);
		boolean bo2 = hs.add(55);
		System.out.println(bo2);
		
		bo2 = hs.add(1);  //���� : �ߺ����� ����� 
		System.out.println(bo2);
		
		System.out.println(hs.toString());
		
		hs.add(2);
		System.out.println(hs.toString()); //��� ���� ���� ���� �ʾƿ�
		
		HashSet<String> hs2 = new HashSet<String>();
		hs2.add("b");
		hs2.add("A");
		hs2.add("F");
		hs2.add("c");
		hs2.add("z");
		hs2.add("A");
		hs2.add("A");
		hs2.add("A");

		System.out.println(hs2.toString());
		
		String[] obj = {"A" , "B" ,"C" ,"D" ,"B" ,"A"};
		HashSet<String> hs3 = new HashSet<String>();
		for(int i = 0 ; i < obj.length ; i++) {
			hs3.add(obj[i]);
		}
		System.out.println(hs3.toString());
		
		//Quiz
		//HashSet ��  1~45 ���� 6�� ��������
		/*
		 int[] lotto = new int[6];
    
		for(int i = 0 ; i < 6 ; i++) {
			lotto[i] = (int)(Math.random()*45 + 1);
			 for(int j = 0 ; j < i ; j++) { //j < i (ä���� ���� ��ŭ ��)
				 if(lotto[i] == lotto[j]) {
					 i--; //point ���� ���� ���� �ٲپ �Ѵ�
					 break;
				 }
			 }
		}
		 */
		HashSet<Integer> lotto = new HashSet<Integer>();
		for(int i = 0 ;  lotto.size() < 6 ; i++) {   //lotto.size() < 6
			int num = (int)(Math.random()*45 + 1);
			lotto.add(num);
			System.out.println("i : " + i + " num :" + num);
		}
		System.out.println(lotto);
		
		Set set2 = new HashSet(); //Set �θ� Ÿ��
		int index=0;
		while(set2.size() < 6) {
			int num = (int)(Math.random()*45 + 1);
			set2.add(num);
		}
		System.out.println("lotto : " + set2);
		
		HashSet<String> set3 = new HashSet<String>();
		set3.add("AA");
		set3.add("DD");
		set3.add("ABC");
		set3.add("FFF");
		System.out.println(set3.toString());
		
		Iterator<String> st = set3.iterator();
		while(st.hasNext()) {
			System.out.println(st.next());
		}
		
		
		
	}

}

















