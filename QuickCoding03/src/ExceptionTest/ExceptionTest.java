package ExceptionTest;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1, s2;
		Scanner sc = new Scanner(System.in);
		
		try{
			s1 = sc.next();
			s2 = sc.next();
			int i1 = Integer.valueOf(s1);
			int i2 = Integer.valueOf(s2);
			
			double result = i1/i2;
			
			System.out.println(result);
		}catch(NumberFormatException e){
			System.out.println("���ڸ� �Է��� �ּ���");
		}catch(ArithmeticException e){
			System.out.println("0���� �����̽��ϴ�");
		}

	}

}
