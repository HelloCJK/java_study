package part2;

import java.util.Scanner;

public class part2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PI = 3.14;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("�Է�: ");
		int a = input.nextInt();
		System.out.println("�Է�: ");
		int b = input.nextInt();
		
		int plus = a + b;
		int minus = a - b;
		int mult = a * b;
		double div = (double)a / b;
		int ������ = a % b;
		double roundOfa = PI * (double)a * a;
		
		System.out.println("plus: "+plus);
		System.out.println("minus: "+minus);
		System.out.println("mult: "+mult);
		System.out.println("div: "+div);
		System.out.println("������: "+������);
		System.out.println("roundOfa: "+roundOfa);
	}

}
