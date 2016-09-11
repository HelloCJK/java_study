package javaStudy;

public class ArrayExam2 {
	public int sum(int[] param) {
		int[] array = param;
		int sum = 0;
		// array는 길이를 알 수 없는 int형 배열입니다.
		// array에는 정수가 들어있다고 가정하고 이 아래에서 sum에 array의 모든 값을 더하세요.
		for(int i = 0; i < array.length; i++){
			sum += array[i];
		}
		// 아래는 결과 평가를 위한 코드입니다. 수정하지 마세요.
		return sum;
	}
	
	//아래는 실행을 위한 코드입니다. 수정하지 마세요.
	public static void main(String[] args) {
		int[]TestCase = new int[4];
		String str = "";
		int rightResult = 0;
		for(int i=0; i<4; i++){
			TestCase[i] = (int)(Math.random()*100);
			rightResult += TestCase[i];
			str+=(TestCase[i]+",");
		}
		str=str.substring(0,str.length()-1);

		ArrayExam2 exam = new ArrayExam2();
		int Answer = exam.sum(TestCase);
		
		if (Answer==rightResult) {
	  		System.out.println("정답입니다. [제출]을 누르세요.");
		}
		else{
			System.out.println( str+"를 더한 sum의 값이 틀립니다.");
		}
	}

}
