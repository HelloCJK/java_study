package Part3;

import java.util.Scanner;

public class Part3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		while(true){
			System.out.printf("입력(0:종료): ");
			int n = input.nextInt();
			if(n == 0)	break;
			
			for(int i = 0; i < n*2+3; i++)
				System.out.printf("*");
			System.out.printf("\n");
			
			for(int i = 0; i < n; i++){
				
				System.out.printf("*");
				if(i < n/2 + 1){
					for(int j = n-i; j > 0; j--)
						System.out.printf(" ");
					
					for(int j = 0; j < i+1; j++)
						System.out.printf("*");
					for(int j = 1; j < i+1; j++)
						System.out.printf("*");
		
					for(int j = n-i; j > 0; j--)
						System.out.printf(" ");
				}
				else{
					for(int j = 0; j < n; j++)
						System.out.printf(" ");
					System.out.printf("*");
					for(int j = 0; j < n; j++)
						System.out.printf(" ");
					
				}
				System.out.printf("*");
				System.out.printf("\n");
			}
	
			for(int i = 0; i < n*2+3; i++)
				System.out.printf("*");
			System.out.printf("\n");
		}
	}

}
