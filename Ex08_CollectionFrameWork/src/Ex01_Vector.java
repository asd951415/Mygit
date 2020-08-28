import java.util.Vector;

/*
Collection Framework 
[다수의 데이터를 ] 다루는 [표준화된 인터페이스]를 [구현하고 있는 클래스 집합]

Collection 인터페이스  -> List 상속   -> ArrayList (구현 : 약속을 ....)
                                   -> Set 상속    -> HashSet , TreeSet (구현 : ....)
Map 인터페이스 (key ,value) -> HashMap (구현)      

1. List (줄을 서시오)                             
:순서(번호표) , 중복(허용) >> 내부적으로 데이터(자료 , 객체)들을 >> [배열]관리  >> [홍길동][홍길동][홍길동]

1.1 Vector (구버전)       ->  동기화 보장 (멀티 스레드) -> Lock 장치 (보호) -> 성능 조금 -> 한강 화장실 
1.2 ArrayList (신버전) ->  동기화 보장(멀티 스레드)  -> Lock  장치(x) 필요에 따라서 -> 성능 우선 -> 한강 비빕밥 축제

기존 여러개의 같은 타입의 데이터관리 : Array 정적(고정) 
-방의 개수가 한번 정해지면 (방의 크기는 변경 불가)
int[] arr = new int[5];
arr[0] = 100;
..또는 
10개의 방이 필요  ..[줄이거나 늘릴수 없다]
int[] arr = {10,20,30};

Array 
1. 배열의 크기가 고정 : Car[] cars = {new Car() , new Car()}; //방2개 
2. 접근 방법 (index 첨자) 방번호 접근 :  cars[0] ,,,,   : 0 ,,,,, n 방까지 :  마지막 방의 번호는(index) : length -1 같다
3. 초기 설정 불가

반기 ..... Collection 
List  구현
(Vector , ArrayList)
1. 배열의 크기를 동적으로 확장  :: 축소 ... 늘리는 것도 ::  >> 사실은 [배열의 재할당] 이용
2. 순서를 유지 (내부적으로 배열 : index), 중복값 허용
3. 데이터 저장 공간 : Array .....
*/
public class Ex01_Vector {
	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println("초기 default  용량 : " + v.capacity());  //10개방 
		System.out.println("size : " + v.size());
		
		v.add("AA");
		v.add("AA");
		v.add("AA");
		v.add(100);
		  System.out.println("size : " + v.size());
		 System.out.println(v.toString()); //[AA, AA, AA, 100]  .. Vector toString() 재정의
		 //Array >> length
		 //Collection >> size
		 for(int i = 0 ; i < v.size() ; i++) {
			 System.out.println(v.get(i)); //get(index) 값을  return     정적 arr[index]
		 }
		 
		 //개선된  for
		 for(Object obj : v) {
			 System.out.println(obj);
		 }
		 
		 //제너릭 >> 타입을 강제 >> 추수 별도 학습
		 Vector<String> v2 = new Vector<String>();  //String  담을 수 있는 그릇
		 v2.add("hello");
		 v2.add("world");
		 v2.add("king");
		 for(String str : v2) {
			 System.out.println(str);
		 }
		 //////////////////////////////////////////////
		 
		 
		 Vector v3 = new Vector();
		 System.out.println(v3.capacity()); // 10개
		 v3.add("A");
		 v3.add("A");
		 v3.add("A");
		 v3.add("A");
		 v3.add("A");
		 v3.add("A");
		 v3.add("A");
		 v3.add("A");
		 v3.add("A");
		 v3.add("A");  // 
		 v3.add("A"); //11번쨰 //방을 늘린다 
		
		 System.out.println(v3.capacity()); // 10개
		 System.out.println(v3.size());
		 
	}

}







