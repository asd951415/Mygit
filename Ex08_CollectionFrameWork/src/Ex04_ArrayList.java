import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

class Empdata{
	private String name;
	private int[] numbers;
	private ArrayList elist;
	
	Empdata(){
		this.name = "아무개";
		//사용자 정의 타입 , Array , ArrayList >> 초기화 >> 메모리는 갖는 것  >> new
		this.numbers = new int[10];
		elist = new ArrayList();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getNumbers() {
		return numbers;
	}

	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}

	public ArrayList getElist() {
		return elist;
	}

	public void setElist(ArrayList elist) {
		this.elist = elist;
	}

}

public class Ex04_ArrayList {
	public static void main(String[] args) {

		
		 Empdata empdata = new Empdata();
		
		 System.out.println(empdata.toString());
		 System.out.println(empdata.getElist().toString());
		 
		 ArrayList li = new ArrayList();
		 li.add(100);
		 li.add(200);
		 
		 empdata.setElist(li);
		 System.out.println(empdata.getElist().toString());
		 
		 
		 
		 ArrayList<String>  marvel = new ArrayList<>();
		 marvel.add("Iron man");
		 marvel.add("Hulk");
		 marvel.add("Captain america");
		 System.out.println("marvel: " + marvel.toString());

		 ArrayList<String>  movies = new ArrayList<>();
		 movies.add("Untouchable");
		 movies.add("Spiderman");
		 movies.add("Captain america");
		 movies.add("Hulk");
		 System.out.println("movies: " + movies.toString());

		 movies.removeAll(marvel);
		 System.out.println("movies - removeAll(marvel): " + movies.toString());

	   
		 
		 ArrayList<Integer> aListNumbers = new ArrayList<Integer>(20);
		 System.out.println(aListNumbers.size());
		 System.out.println(aListNumbers.add(10));
		 System.out.println(aListNumbers.size());	
	


	}

}








