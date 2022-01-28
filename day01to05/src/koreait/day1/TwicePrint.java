package koreait.day1;

public class TwicePrint {
	public static void main(String[] args) {
		System.out.println("트와이스");
		System.out.print("-------------------------\n");
		System.out.printf("%-10s %5s\n","사나", "1996.12.09");
		System.out.printf("%-10s %5s\n","지효", "1997.02.01");
		System.out.printf("%-10s %5s\n","미나", "1997.03.24");
		System.out.printf("%-10s %5s\n","다현", "1998.05.28");
		System.out.printf("%-10s %5s\n","채영", "1999.04.23");
		System.out.printf("%-10s %5s\n","쯔위", "1996.06.14");
		System.out.println("");
		System.out.println("사나\t1996.12.09");
		System.out.println("지효\t1996.12.09");
		System.out.println("미나\t1996.12.09");
		System.out.println("다현\t1996.12.09");
		System.out.println("채영\t1996.12.09");
		System.out.println("쯔위\t1996.12.09");
	
	}

	// \n, \t : 특정기능문자(이스케이프, 문자 \로 시작합니다.)
}
