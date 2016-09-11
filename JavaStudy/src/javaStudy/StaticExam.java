package javaStudy;

public class StaticExam {
	public static void main(String []args){
		Car taxi = new Car();
		Car suv = new Car();

		taxi.wheelCount = 10;
		suv.wheelCount = 4;

		System.out.println("taxiÀÇ ¹ÙÄû¼ö:"+ taxi.wheelCount);
		System.out.println("suvÀÇ ¹ÙÄû¼ö:"+ suv.wheelCount);
	}
}
