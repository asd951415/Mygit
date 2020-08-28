/*
실무 (개발환경)
1개의 클래스 ... 거의 ... (x)

설계도 1개 ..... 업무가 복잡 ..... 여러개 
쇼핑몰 >> 주문관리 , 회원관리 , 배송 , 상품 ,  >> 각각의 업무 >> 설계도 제작

*** 기준 *** 
여러개의 설계도의 관계 맺어주는 것

1. 상속 (is ~ a : 상속)  은  ~ 이다 (부모를 뒤에)
2. 포함 (has ~a :  포함) 은  ~을 가지고 있다

예)
원은 도형이다 
원     도형 
>>원   extends 도형 

원    점 관계
원은 점이다 ( x )
원은 점을 가지고 있다 (0)
has ~ a
>>class 원 { 한점 }

경찰   권총 
경찰은 권총이다 (x)
경찰은 권총을 가지고 있다 (0)
class 경찰  { 권총 .. }

예) 원  ,  삼각형   ,사각형 만드는 설계도

원은 도형이다
삼각형은 도형이다
사각형은 도형이다

도형 :  추상화 , 일반화 (그리다 , 색상 ) >> 공통자원
원 : 구체화 , 특수화  (반지름 , 한점 >> 본인만이 가지는 특징

점 : 좌표값  >> (x, y)
원은 점을 가지고 있다
삼각형은 점을 가지고 있다
사각형은 점을 가지고 있다 

class Shape {  그리다 , 색상  }   >>  상속관계 (부모)
class Point { 좌표값 } >> 포함 (부품)

구체화 ,특수화 :   circle , triangle 


*/

//  추상화 , 일반화 , 공통
class Shape {
	 String color="gold"; //공통속성
	 void draw() {
		 System.out.println("도형을 그리다");
	 }
}

//공통 (점)
class Point{
	int x;
	int y;
	
	Point(){
		//this.x = 1;
		//this.y = 1;
		this(1,1);
	}
	
	Point(int x , int y){
		this.x = x;
		this.y = y;
	}
	
}

//원을 만드세요 ( 원의 정의 : 원은 한점과 반지름을 가지고 있다)
//1. 원은 도형이다 (is ~ a) : 도형(shape)
//2. 원은 점을 가지고 있다 (has ~ a) : 점(Point) >> member  field 
//3. 원은 반지름을 가지고 있다 ( 특수성) : r
//원의 반지름은  초기값 10을 가진다
//점의 좌표는 초기값 (10,15) 가진다
//기본(초기값) 설정하지 않으면 반지름과 점을 값을 입력받을 수 있다  (원이 만들어 질때)

class Circle  extends Shape{  //상속
	Point point; //포함
	int r; //특수성
	
	Circle() {
		 //this.r = 10;
		 //this.point = new Point(10,15);
		this(10,new Point(10,15));
	}
	Circle(int r , Point point){
		 this.r = r;
		 this.point = point;
	}
	/*
	@Override
	void draw() {
		System.out.println("원을 그리다");
	}
	*/
}
//////////////////////////////////////////////////////
//원 만드는 것을 이해 하셨다면 아래 문제를 .......
//문제 2)
//삼각형 클래스를 만드세요
//정의) 삼각형은 3개의 점과 색과  그리고 그리다라는 기능을 가지고 있다
//Shape, point 제공 받아요
//hint) (x,y)  (x,y)  (x,y) 3개의 좌표값 
//default 로 그릴 수 있고 , 3개의 좌표값을 받아서 그릴 수 있다

//80점
//why : 같은 타입의 변수가 나열되고 있다 
//int x, y, z
//int[] .....
class Triangle extends Shape {
	Point x; //int x, int y
	Point y;
	Point z;
	
	Triangle() {
		//x = new Point(10, 20);
		//y = new Point(30, 40);
		//z = new Point(50, 60);
		
		this(new Point(10, 20),new Point(30, 40),new Point(50, 60));
	}
	Triangle(Point x , Point y , Point z){
		this.x = x; //주소값
		this.y = y;
		this.z = z;
	}
	//구체화 , 특수화
	//추가적인 기능
	void trianglePoint() {
		System.out.printf("x : (%d,%d)\t",x.x,x.y);
		System.out.printf("y : (%d,%d)\t",y.x,y.y);
		System.out.printf("z : (%d,%d)\t",z.x,z.y);
		System.out.println();
	}
}

//////////////////////////////////////////////////////
//100점
class Triangle2 extends Shape{
	Point[] pointarray;
	
	Triangle2() {
		/*
		pointarray = new Point[3];
		pointarray[0] =  new Point(10, 20);
		pointarray[1] =  new Point(30, 40);
		pointarray[2] =  new Point(50, 60);
	    */
		//컴파일러가  ....
		//pointarray = {new Point(10, 20) , new Point(10, 20), new Point(10, 20)}
	
		this(new Point[] {new Point(10, 20) , new Point(30, 40), new Point(50, 60)});
	
	}
	Triangle2(Point[] pointarray){
			this.pointarray = pointarray;
	}
	
	void trianglePoint() {
		for(Point point : this.pointarray) {
			 System.out.printf("point :  (%d , %d)\t\n" , point.x , point.y);
			 
		}
	}
	
}



//////////////////////////////////////////////////////
public class Ex02_Inherit_Composition {
	public static void main(String[] args) {
		Circle circle = new Circle();
		System.out.println("반지름 : " + circle.r);
		System.out.println("부모 : " + circle.color);
		System.out.println("좌표 : " + circle.point.x); //^^
		System.out.println("좌표 : " + circle.point.y);
		circle.draw(); //부모

		System.out.println("******************************");
		//Point p = new Point(10,20);
		Circle circle2 = new Circle(20, new Point(10,20));
		System.out.println("반지름 : " + circle2.r);
		System.out.println("부모 : " + circle2.color);
		System.out.println("좌표 : " + circle2.point.x); //^^
		System.out.println("좌표 : " + circle2.point.y);
		circle2.draw(); //부모
		
		System.out.println("******************************");
		
		Triangle triangle = new Triangle();
		triangle.trianglePoint();
		triangle.draw();
		
		System.out.println("******************************");
	
		Triangle triangle2 = new Triangle(new Point(1,2), new Point(3,4), new Point(5,6));
		triangle2.trianglePoint();
		triangle2.draw();
		
		System.out.println("******************************");
		Triangle2 tri2 = new Triangle2();
		tri2.trianglePoint();
		tri2.draw();
		
		System.out.println("******************************");
		
		Point[] pointarr = {new Point(11, 21) , new Point(31, 41), new Point(51, 61)};
		Triangle2 tri3 = new Triangle2(pointarr);
		tri3.trianglePoint();
		tri3.draw();
		
	}

}







