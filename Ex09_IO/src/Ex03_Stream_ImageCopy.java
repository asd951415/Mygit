import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex03_Stream_ImageCopy {
	public static void main(String[] args) {
		String orifile = "C:\\Temp\\1.jpg";
		String targetfile = "copy.jpg";
		//default  ��� : ������Ʈ ������ default
		//D:\bit\JAVA\Labs\Ex09_IO\copy.jpg
		
		FileInputStream fs = null;
		FileOutputStream fo = null;
		
		try {
				fs = new FileInputStream(orifile);
				fo = new FileOutputStream(targetfile,false);
				int data = 0 ;
				while((data = fs.read()) != -1) {
					fo.write(data); //copy.jpg ��  byte �� write
				}
				
		} catch (Exception e) {
				System.out.println(e.getMessage());
		}finally {
			  try {
				  	fs.close();
				  	fo.close();
			} catch (Exception e2) {
				
			}
		}

	}

}









