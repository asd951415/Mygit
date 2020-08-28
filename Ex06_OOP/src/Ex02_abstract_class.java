//게임 : unit(유닛)

//unit : 공통기능 (이동좌표 , 이동 , 멈춘다) : 추상화 , 일반화
//unit : 이동 방법은 다르다 (이동방법은 unit 마다 별도의 ..... 구현 .... 강제)
//abstract class 이름 { abstract 이동(); }

abstract class Unit{
	int x,y;
	void stop() {
		System.out.println("Unit stop");
	}
	
	//이동 (강제)
	abstract void move(int x , int y);  //추상자원
}
//Tank
class Tank extends Unit{

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Tank  이동 : " + this.x + " , " + this.y);
		
	}
	
	// Tank 특수화 , 구체화
	void changeMode() {
			System.out.println("탱크 변환 모드");
	}
	
}

class Marine extends Unit{
	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Marine  이동 : " + this.x + " , " + this.y);
	}
	
	// 특수화 , 구체화
	void stimpack() {
		System.out.println("스팀팩 기능 ");
	}
}

class DropShip extends Unit{

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Dropship  이동 : " + this.x + " , " + this.y);
	}
	// 특수화 , 구체화
	void load() {
		System.out.println("Unit Load ....");
	}
	
	void unload() {
		System.out.println("Unit Unload ....");
	}
}


public class Ex02_abstract_class {
	public static void main(String[] args) {
		Tank t = new Tank();
		t.move(500, 200);
		t.stop();
		t.changeMode();
		
		Marine m = new Marine();
		m.move(500, 200);
	    m.stop();
	    m.stimpack();
	    
	    //hint) 전자제품 매장 Product[] cart .....
	    
	    //1. 탱크 3대를 만들고 [같은 좌표 ] 로 이동 시키세요 (555,444)
	    Tank[] tanklist = {new Tank() , new Tank() , new Tank()};
	    for(Tank tank : tanklist) {
	    	tank.move(555, 444);
	    }
	    System.out.println("****************************************");
	    //2. 여러개의 Unit (Tank 1 , Marine 1 , Dropship 1 ) 같은 좌표로 이동 시키세요 (666,444)
	    //다형성 .....
	    Unit[] unitlist = {new Tank() , new Marine() , new DropShip()};
	    for(Unit unit : unitlist) {
	       unit.move(666, 444);
	    }

	}

}



