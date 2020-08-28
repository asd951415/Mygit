
public class Ex02_Exception {
	public static void main(String[] args) {
		
		int num = 100;
		int result = 0;
		System.out.println("main start");
		
		try {
				for(int i = 0 ; i < 10 ; i++) {
					
					result = num / (int)(Math.random() * 10); //0~9
					System.out.println("result : " + result + " i : " + i);
				}
		} catch (ArithmeticException e) {  //문제가 발생되면   .. 문제가 맞는 객체가 자동 생성되고 주소값 전달
			  System.out.println("문제가 발생 관리자에 메일 발송");
			  System.out.println("원인 : " + e.getMessage());
			  
			 // catch (Exception e) >> 가독성 >> (x)
			//컴파일러가 ..문제가 맞는 객체를   new  java.lang.ArithmeticException
			
			 //catch (ArithmeticException e)  좋은 코드 (가독성) 
			 //여러개의 catch >>  작은 것 먼저 > 큰 것 
		} catch (NullPointerException e) {
			//NullPointerException 은 내가 처리
			
		}catch (Exception e) {
			//[연산 예외]  [null  예외]를 제외한 나머지는 내가 처리	
		}
		
		
		
		System.out.println("main end");

	}

}
