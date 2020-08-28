import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

import javax.print.attribute.standard.OutputDeviceAssigned;

/*
IO
Stream (Byte)
JAVA API
추상클래스
InputStream ,    OutPutStream
두개의 추상 클래스를 구현해서 사용해라 ....
(재정의)

대상
1. Memory : ByteArray ...   : ByteArray...
2.File          :File ...    : File ...    ^^!
*/
public class Ex01_Stream {
	public static void main(String[] args) {
		//byte(-128 ~ 127) 정수를 저장 타입
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null; //현재 메모리를 가지고 잊지 않다 (초기화)
		
		//데이터를 read , write 하는 대상 memory
		ByteArrayInputStream input = null;
		ByteArrayOutputStream outout = null;
		
		input = new ByteArrayInputStream(inSrc); //inSrc 부터 data >> read
	    outout = new ByteArrayOutputStream(); // write
	    
	    System.out.println("ourSrc before : " + Arrays.toString(outSrc));
	    
	    //공식같은 로직
	    int data = 0;
	    while((data = input.read()) != -1) {  //더 이상 read 할 Data  가 없으면  -1
	    	System.out.println("data : " + data);
	       //System.out.println("input.read() : " + input.read());
	    	//read() 함수는  내부적으로  next() >>
	    	outout.write(data); //빨대안에 데이터를 넣는 것  
	    	//write 대상이 data 가 아니고 ByteArrayOutputStream 자신의 통로  data  가지고 ,,,
	    }
	    
	    outSrc = outout.toByteArray(); //Byte[] 주소값을 return
		//while(input.read() != -1) { System.out.println("data : " + input.read());   }
	    
	    System.out.println("ourSrc after : " + Arrays.toString(outSrc));
	}

}









