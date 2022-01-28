package koreait.day2;

public class ShapeTest {

	public static void main(String[] args) {
		// 변수
		// 사각형
		int height = 19;
		int width = 23;
		int area = height * width;
		System.out.println("[[사각형 도형의 넓이 구하기]]" );
		System.out.println("사각형의 넓이 = " + area + "cm");
		
		//원 : 결과 출력할 때 소수점 이하 3자리로 출력하세요.
		double redius = 23; //int형 데이터가 double형으로 자동변환.
		double round = 0;
		double c_area = 0 ;
		
		System.out.println("둘레를 구했습니다. -> %.3f㎠ , c_area");
		
		System.out.println("[[원 도형의 넓이와 넓이 구하기]]" );
		round = 2 * 3.14 * redius;
		c_area = 3.14 * redius*redius;
		System.out.printf("원 둘레의 값은 : %.3f㎠ \n",round);
		System.out.printf("원 넓이의 값은: %.3f㎠ \n",c_area);

	}

}
