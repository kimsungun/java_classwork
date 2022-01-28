package koreait.day5;

import java.util.Scanner;

public class Day5Exam { // 오늘의 복습문제 구현합니다.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String password;
		int upper_cnt=0, lower_cnt=0, numeric_cnt=0, symbol_cnt=0;
		boolean isOk=false; // password 규칙에 맞는지 논리값 저장.
		String message="";  // password 규칙 불만족 조건 메시지를 저장합니다.
		
		//*연산에 사용되는 변수는 반드시 초기값을 저장합니다.
		
		System.out.println("[[사용자 패스워드 검사]]");
		System.out.print("사용할 패스워드를 입력하세요. -> ");
		
		password = sc.next();
		
		if(password.length()<8) {
			message = "1) 8글자 이상으로 합니다.";
		}
		//추가 요구사항 처리를 위한 변수 선언
		boolean isUseless=false;
		
		for(int i=0;i<password.length();i++) { //jungbo@#23 일때 length()메소드는 10을 반환
		//	System.out.println(password.charAt(i));
			char temp = password.charAt(i);
			
			if(temp >= 'A' && temp <= 'Z')
				upper_cnt++; //upper_cnt = upper_cnt+1; // 대문자 개수 증가
			else if(temp >= 'a' && temp <= 'z')
				lower_cnt++; //소문자 개수 증가
			else if(temp >= '0' && temp <= '9')
				numeric_cnt++; // 숫자 개수 증가
			else if(temp>=32 && temp<=47 
			|| temp>=58 && temp <=64 
			|| temp>=91 && temp<=96 
			|| temp>=123 && temp<=126) {if(temp=='>' || temp=='<' 
			|| temp=='(' || temp ==')' 
			|| temp==';' || temp=='%' 
			|| temp=='\\' )
				isUseless=false;
				symbol_cnt++; // 기호 개수 증가
			}
		}
		// 추가 요구사항) 사용할 수 없는 기호 >< () ; % \ 공백을 추가해보세요. nextLine()메소드로 변경합니다.
		System.out.println("대문자 개수 : " + upper_cnt);
		System.out.println("소문자 개수 : " + lower_cnt);
		System.out.println("숫자 개수 : " + numeric_cnt);
		System.out.println("기호 개수 : " + symbol_cnt);
		
		if(upper_cnt < 1) 
			message += "\n*) 영문대문자 1개 이상 포함해야 합니다."; //+문자열 연결
		
		if(lower_cnt < 1) 
				message += "\n*) 영문소문자 1개 이상 포함해야 합니다."; //+문자열 연결
		
		if(numeric_cnt < 1) 
				message += "\n*) 숫자 1개 이상 포함해야 합니다."; //+문자열 연결
		
		if(symbol_cnt < 1) 
				message += "\n*) 기호 1개 이상 포함해야 합니다."; //+문자열 연결
		
		if(isUseless)  //추가 요구사항 처리
		        message +="\n*)사용할 수 없는 기호 > < ( ) ; % \\ 공백이 있습니다.";
		        
		if(password.length()>=8 && upper_cnt >=1 && lower_cnt >=1 && numeric_cnt >=1  && symbol_cnt >=1 && isUseless)
				isOk=true;  //모든 조건을 만족하면 isOk는 true
	
		System.out.println(message);
		System.out.println("결과 :"+ (isOk? "사용할 수 있는 패스워드 입니다." : "패스워드 작성 규칙에 맞지 않습니다."));
                          //isOk참일때 : 앞에 문자열 출력, 거짓이면 : 뒤에 문자열 출력합니다.
		
		sc.close();
	}

	}