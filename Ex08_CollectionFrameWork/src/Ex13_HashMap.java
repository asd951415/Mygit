import java.util.HashMap;
import java.util.Scanner;

public class Ex13_HashMap {
	public static void main(String[] args) {
		//�ϻ��Ȱ
		//������ȣ , �����ȣ , ȸ������ (id, pwd) ����
		HashMap loginmap = new HashMap();
		loginmap.put("kim", "kim1004");
		loginmap.put("scott", "tiger");
		loginmap.put("lee", "kim1004");
		
		//�츮 �ý��� ȸ�������� ȸ��  ID, PWD ����
		//�α���
		//id(0) , pwd(0) >> ȸ�� (�氡)
		//id(0) , pwd(x) >> ��й�ȣ �Է� >>
		
		//id(x) , pwd(0) >> ..
		//id(x) , pwd(x) >> ..
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("id, pwd  �Է��� �ּ���");
			
			System.out.println("ID");
			String id = sc.nextLine().trim().toLowerCase();
			
			System.out.println("PWD");
			String pwd = sc.nextLine().trim();
			//id(0) , pwd(0) >> ȸ�� (�氡)
			//id(0) , pwd(x) >> ��й�ȣ �Է� >>
			
			//id(x) , pwd(0) >> ..
			//id(x) , pwd(x) >> ..
			if( !loginmap.containsKey(id)) {
				  //id(x)
				  System.out.println("id ���� �ʽ��ϴ� ... ���Է� �ϼ���");
			}else {
				  //id(0)
				   if(loginmap.get(id).equals(pwd)) {
					     System.out.println("ȸ���� �氡�氡 ^^");
					      break;
				   }else {
					     System.out.println("��й�ȣ Ȯ���ϼ���");
				   }
			}
			
		}
		
		
		
	}

}









