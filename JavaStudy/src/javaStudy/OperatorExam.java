package javaStudy;

public class OperatorExam {
	
	public int[] calculate() {
		int a = 7; 
		int b = 3;

		//c는 a와 b의 합 
		int c = a+b;
		//d는 a와 b의 차
		int d = a-b;
		//e는 a와 b의 곱
		int e = a*b;
		//f는 a를 b로 나눈 나머지 
		int f = a%b;
		
		//이 아래 코드는 결과 테스트를 위한 코드입니다.
		int ret[]={c,d,e,f};
		return ret;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new OperatorExam().calculate();
	}

}
