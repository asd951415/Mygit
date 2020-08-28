package kr.or.bit;

public class Program {

	public static void main(String[] args) {
		ArrayList li = new ArrayList();
		System.out.println(li.get(2));
		System.out.println(li.add(3, 10));
		System.out.println(li.get(10));
		
		
		java.util.ArrayList li2 = new java.util.ArrayList();
		li2.add(0,1);
		System.out.println(li2.size());
		System.out.println(li2.get(0));
		
		
		//li2.add(2,100);
		/*
		private void rangeCheckForAdd(int index) {
	        if (index > size || index < 0)
	            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
	    }
		*/
		
		//System.out.println(li2.get(1));
		/*
		private void rangeCheck(int index) {
	        if (index >= size)
	            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
	    }
		*/
	}

}
