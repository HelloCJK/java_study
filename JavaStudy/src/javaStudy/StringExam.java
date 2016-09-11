package javaStudy;

public class StringExam {
	public static void main(String[]args){
		String str1 = new String("Hello world");
		String str2 = new String("Hello world");

		if(str1 == str2){
			System.out.println("str1과 str2는 같은 레퍼런스입니다.");
		}
		else{
			System.out.println("str1과 str2는 다른 레퍼런스입니다.");
		}
	}
}
