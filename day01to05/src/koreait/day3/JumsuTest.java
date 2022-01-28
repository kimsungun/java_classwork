package koreait.day3;

import java.util.Scanner;

public class JumsuTest {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("---------------------------------");
	System.out.println("[[성적 집계 : 평균과 총점 구하기]]");
	System.out.println("성적 입력하세요");
	int korean;
	System.out.println("국어 ->");
	korean = sc.nextInt();
	System.out.println( korean + "점 입니다.");

	int english;
	System.out.println("영어 ->");
	english = sc.nextInt();
	System.out.println( english + "점 입니다.");
	
	int science;
	System.out.println("과학 ->");
	science = sc.nextInt();
	System.out.println( science + "점 입니다.");
	System.out.println("");
	System.out.println(">>처리되었습니다.");
	
	int sum = korean+english+science;
	System.out.printf("총점 : " + sum + " \n" ,sum);
	
	double sum2 = (korean+english+science)/3;
	System.out.printf("평균 : " + "%.2f\n" ,sum2);

	System.out.println("---------------------------------");
	
	sc.close();
	
	}

}
