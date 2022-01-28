package koreait.day5;

import java.util.Scanner;

public class MathExam {
      //작성자 : 김성언. (2022/01/04)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int math;
		int num1;
		int num2;
		System.out.println("------------------------------------");
		System.out.println("[[수학 공부 도우미]]");
		System.out.println("1. 덧셈  2. 뺄셈  3. 곱셈  4. 종료");
		System.out.print(" 연산을 선택하세요. -> ");
		math = sc.nextInt();
		
		if(math==1) {
			System.out.print("✏ 값 1을 입력하세요. -> ");
			num1 = sc.nextInt();
			System.out.print("✏ 값 2을 입력하세요. -> ");
			num2 = sc.nextInt();
			int sum = num1 + num2;
			System.out.printf("정답 : "+ sum +"입니다.");
        }else if(math==2) {
        	System.out.print("✏ 값 1을 입력하세요. -> ");
			num1 = sc.nextInt();
			System.out.print("✏ 값 2을 입력하세요. -> ");
			num2 = sc.nextInt();
			int minus= num1 - num2;
			System.out.printf("정답 : "+ minus +"입니다.");
        }else if(math==3) {
        	System.out.print("✏ 값 1을 입력하세요. -> ");
			num1 = sc.nextInt();
			System.out.print("✏ 값 2을 입력하세요. -> ");
			num2 = sc.nextInt();
			int multi= num1*num2;
			System.out.printf("정답 : "+ multi +"입니다.");
        }else if(math==4) 
   		 System.out.println("프로그램을 종료합니다.Bye");
   		System.out.println("\n------------------------------------");
   		
	
	}

}
