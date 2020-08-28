import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
		File  ó�� (Disk) : �� Byte  ����  read , write
		��� ��Ƽ� �ѹ� read , write (���� ���� ...���� �ѹ��� ...)
		���� : buffer
		1. I/O ���ɰ���
		2. Line  ���� (����) 
		
		BufferedInputStream ����  (�� Ŭ���� ����)
		�����ڸ� ���ؼ�  ����.....
*/

public class Ex04_Stream_Buffer {
	public static void main(String[] args) {
			FileOutputStream fos = null;
			BufferedOutputStream bos = null;
			
			try {
					fos = new FileOutputStream("data.txt"); //���� ������ �ڵ� ���� ����
					bos = new BufferedOutputStream(fos);
					
					for(int i = 0 ; i < 10 ; i++) {
						bos.write('A');  //10��
					}
					
					//JAVA Buffer ũ�� : 8kbyte : 8192byte
					//1. buffer �ȿ� ������ ä������ ������ ���� �۾� : ����������  flush
					//2. buffer ������ ���� ( flush() , close() )
					//3. bos.close() �ڿ����� >> close() >> ���������� flush() ȣ��
					 //bos.flush();
			} catch (Exception e) {
				    System.out.println(e.getMessage());
			}finally {
				   try {
					    bos.close();
					    fos.close();
				} catch (Exception e2) {
					
				}
			}

	}

}







