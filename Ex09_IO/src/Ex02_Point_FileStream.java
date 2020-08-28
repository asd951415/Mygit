import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
read , write ��� File (��������) >> 1.txt   , data.txt 
FileInputStream
FileOutputStream

*/
public class Ex02_Point_FileStream {
	public static void main(String[] args) {
		FileInputStream fs = null;
		FileOutputStream fos = null;
		String path = "C:\\Temp\\a.txt";
		
		try {
					fs = new FileInputStream(path);
					fos = new FileOutputStream("C:\\Temp\\new.txt");
					//FileOutputStream
					//1. write  �ϴ� ���� �������� ������ >> ������ ���� 
					//FileOutputStream("C:\\Temp\\new.txt",false);
					//false >> overwrite
					
					//true >> append
					//new FileOutputStream("C:\\Temp\\new.txt" , true);
					
					int data = 0;
					while((data = fs.read()) != -1){
						//System.out.println("���� : " + data);
						//���ڰ� :    char c = (char)data;
						//System.out.println("���� : " + (char)data);
						fos.write(data); //data �� read  �ؼ� >> new.txt >> write
					}
					
		} catch (Exception e) {
					e.printStackTrace();
		}finally {
			  //����  , ������ 
			  //�ڿ����� .......
			 //������� �ڿ��� ����   >>������ �÷��Ͱ� �������� �ʾƿ� >> 
			 //close >> ��������� >> �Ҹ��� ȣ��
			  try {
				  		fs.close();
				  		fos.close();
			} catch (IOException e) {
						e.printStackTrace();
			}
		}
		

	}

}





