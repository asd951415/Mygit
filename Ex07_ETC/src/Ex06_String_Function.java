import java.util.StringTokenizer;

public class Ex06_String_Function {

	public static void main(String[] args) {
		String str = "hello";
		String concatstr = str.concat("  world");
		System.out.println(concatstr);
		
	  	boolean bo = str.contains("elle");
	  	System.out.println(bo);
	  	
	  	String str2 = "a b c d"; //[a][ ][b][ ][c][ ][d]
	  	System.out.println(str2.length());
	  	
	  	String filename = "hello java world"; //[h][e][l][l][0][ ][j]
	  	System.out.println(filename.indexOf("h"));
	  	System.out.println(filename.indexOf("java"));
	  	System.out.println(filename.indexOf("개폭망"));  //-1
	  	//신문 사설 검색 ......  폭망  .... 
        //원하는 문자열이 포함되어 있느냐 .... 0 보다 큰 값이 .... 1개는 포함 ...
	  	
	  	if(filename.indexOf("wo") != -1) {
	  		  System.out.println("wo  하나라도 가지고 있네요");
	  	}
	  	
	  	System.out.println(filename.lastIndexOf("a"));
	  	
	  	//length() , indexOf() , substring() , replace() , split()
	  	
	  	String result = "superman";
	  	System.out.println(result.substring(0));
	  	System.out.println(result.substring(1,2)); //자기자신 //u   endindex - 1
	  	System.out.println(result.substring(0,0)); // (0,-1)  안나와요
	  	System.out.println(result.substring(0,1)); //s
	  	System.out.println(result.substring(1,1));
	  	System.out.println(result.substring(2,3));
	  	//beginIndex the beginning index, inclusive.
	  	//endIndex the ending index, exclusive.
	  	//endindex - 1  ^^  java
	  	
	  	//Quiz
	  	String filename2="h.jpeg"; //또는   hong.png  또는   h.jpeg
	  	//여기서 파일명과 확장장 분리해서 출력하세요
	  	//1. 파일명 >> aaaa
	  	//2.확장자 >> zip
	  	//위에서 배운 함수만 가지고 문제를 푸세요
	  	//기준  .
	  	int position = filename2.indexOf(".");
	  	String file = filename2.substring(0, position);
	  	
		String extention2 = filename2.substring(position + 1, filename2.length());
	  	String extention  = filename2.substring(++position);
	  
	  	System.out.println(file);
	  	System.out.println(extention);
	  	System.out.println(extention2);
	  	
	  	
	  	//replace (치환함수)
	  	String str3 = "ABCDADDDDDA";
	  	String result3 = str3.replace("DDDDD", "오늘은 목요일");
	  	System.out.println(result3);
	  	
	  	result3 = str3.replace("A","a");
	  	System.out.println(result3);
	  	
	  	//ETC
	  	System.out.println(str3.charAt(0));
	  	System.out.println(str3.charAt(3));
	  	System.out.println(str3.endsWith("DDDA")); //true
	  	System.out.println(str3.endsWith("BDDDA")); //false
	  	System.out.println(str3.equalsIgnoreCase("abcdADDDDDA")); //대소문자 구별 없이 비교
	  	
	  	//Today Point (Split)
	  	//String str4 = "슈퍼맨,팬티,노랑색,우하하,우하하";
	  	//String[] namearray =  str4.split(",");
	  	
		String str4 = "슈퍼맨.팬티.노랑색.우하하.우하하";
	    String[] namearray =  str4.split("\\.");
	  	for(String s : namearray) {
	  		System.out.println(s);
	  	}
	  	/*
	  	    .  >> 정규표현식 문법 ....  >> 문자 그대로 \    >>   \\.
	  	  
	  		정규 표현식 표준(java, javascript , Oracle , c#) 공통적인 규칙
	  		어떠한 문자를 만들때 [규칙] 부여  >> 유효한 판단 근거 
	  		
	  		주민번호 : 숫자 6자리 - 숫자 7자리   {\d6}-{\d7} 규칙에 ...
	  		12345-1234567 >> false
	  		핸드폰
	  		차량번호
	  		우편번호
	  		도메인주소
	  		이메일 주소 등 검증 정규 표현식 개발자 .... 
	  		
	  		https://ko.wikipedia.org/wiki/%EC%A0%95%EA%B7%9C_%ED%91%9C%ED%98%84%EC%8B%9D
	  	    조별과제  ^^  (사이트 ...) 단  조건 해석   5개 
	  	    
	  	*/
	  	
	  	String filename3 = "bit.hwp";
	  	//split  사용해서 파일명과 확장자 출력
		String[] filearray = filename3.split("\\.");
		System.out.println(filearray.length);
		for(String s : filearray) {
			System.out.println(s);
		}
		
		 String str5 = "a/b,c-d.f";
		 StringTokenizer sto = new StringTokenizer(str5, "/,-.");
		 while(sto.hasMoreElements()) {
			 System.out.println(sto.nextToken());
		 }
		 
		 //넌센스
		 String str6 = "홍           길        동";
		 //저장 >> 공백제거 >> "홍길동"
		System.out.println(str6.replace(" ",""));
		
		String str7 = "        홍길동           ";
		 System.out.println(">" + str7 + "<");
		 //공백제거 "홍길동"
		 System.out.println(">" + str7.trim() + "<");
		 
		String str8 = "        홍       길        동           ";
		   //"홍길동"
		String result5 = str8.trim();
		String result6 = result5.replace(" ","");
	
		System.out.println(result6);  //무식한 인간 ...
		
		//***********여러개의 함수를 적용 ( method chain 기법)
	  System.out.println(	str8.trim().replace(" ","").substring(2));
	  
	//Quiz-1
	   int sum=0;
	   String[] numarr = {"1","2","3","4","5"};
	   //문제: 배열에 있는 문자값들의 합을 sum 변수에 담아서 출력 : 결과 15
	   for(String s : numarr) {
		   sum+=Integer.parseInt(s);
	   }
	   System.out.println("sum : " + sum);
	   
	   
	   
	 //Quiz-2
	   String jumin="123456-1234567";
	   //위 주민번호의 합을 구하세요_1
	   int sum2=0;
	   for(int i = 0 ; i < jumin.length() ; i++) {
		   String numstr =jumin.substring(i, i+1);
		   if(numstr.equals("-")) continue;
		   sum2+= Integer.parseInt(numstr);
	   } 
	   System.out.println("주민번호 합:" + sum2);
	   
	 //위 주민번호의 합을 구하세요_2
	 //String jumin="123456-1234567";
	   String[] numarr2 = jumin.replace("-","").split("");
	   int sum3=0;
	   for(String i : numarr2) {
		   sum3+= Integer.parseInt(i);
	   }
	   System.out.println("주민번호 합2:" + sum3);
	   
	 //위 주민번호의 합을 구하세요_3
	   String jumin4 = jumin.replace("-", "");
	   int sum4=0;
	   for(int i = 0 ; i < jumin4.length() ;i++) {
		   sum4+=Integer.parseInt(String.valueOf(jumin4.charAt(i)));
	   }
	   System.out.println("주민번호 합4:" + sum4);
	   
	   
	   

	}

}


















