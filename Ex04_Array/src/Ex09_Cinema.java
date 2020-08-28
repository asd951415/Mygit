
public class Ex09_Cinema {

	public static void main(String[] args) {
		String[][] seat = new String[3][5];
		
		
		for(int i = 0 ; i < seat.length ; i++) {
			for(int j = 0 ; j < seat[i].length ; j++) {
				seat[i][j] = "___"; //좌석
			}
		}
		//예매
		seat[2][1] = "홍길동";
		seat[0][0] = "김유신";
		
		//좌석정보 보여주기
		for(int i = 0 ; i < seat.length ; i++) {
			for(int j = 0 ; j < seat[i].length ; j++) {
				System.out.printf("[%s]", seat[i][j].equals("___") ? "좌석" : "예매");
			}
			System.out.println();
		}
		
		int row, col;   //사용자 행,열
		row=1;
		col=0;
		if(seat[row][col].equals("___")) {
			System.out.println("예약 가능 좌석입니다");
		}else {
			 System.out.println("이미 예약 되었습니다");
		}
		
		//좌석 초기화
		for(int i = 0 ; i < seat.length ; i++) {
			for(int j = 0 ; j < seat[i].length ; j++) {
				seat[i][j] = "___";
			}
		}
	}
  
	
	//위에는 요구사항  설계도 
	//class Cinema{ 속성 , 기능   }
	
	
}








