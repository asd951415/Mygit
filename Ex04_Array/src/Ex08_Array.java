
public class Ex08_Array {

	public static void main(String[] args) {
		//다차원 배열 (2차원)
		//[행][열]
		//교실의 좌석(영화) , 지도 좌표값 , 오목 , 
		//영화관 예약 (조회 , 취소 )
		
		int[][] score = new int[3][2];
		
		System.out.println(score[0][0]);
		
		score[0][0] =100;
		score[0][1] =200;
		
		score[1][0] =300;
		score[1][1] =400;
		
		score[2][0] =500;
		score[2][1] =600;
		
		//행의수 , 열의수
		//for ..... 2개
		
		//행의 개수 : 배열이름.length  >> score.length
		//열의 개수 :  배열이름[i].length  >>score[i].length
		//그림 이차원 그림
		// score[0].length   >>열의 개수
		
		 for(int i = 0 ; i < score.length ; i++) {
			 for(int j = 0 ; j < score[i].length ; j++) {
				 System.out.printf("score[%d][%d]=%d\t",i,j,score[i][j]);
			 }
			 System.out.println();
		 }
		
		 int[][] score3 = new int[][] {
			 {11,12}, 
			 {13,14},
			 {15,16}
		 };
		 
		 //모닝 퀴즈 커피 (3분)
		 //개선된  for문을 사용해서 배열값 출력  (score3)
		 for(int[] row : score3) {
			 for(int col : row) {
				 System.out.println("값 : " + col);
			 }
		 }
		  
		 

	}

}









