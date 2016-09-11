package javaStudy;

public class ArrayExam3 {
	public static void main(String[] args){
	    int [][] array = {{1},{1,2},{1,2,3},{1,2,3,4}};
	    
	    //2차원 배열 array를 출력합니다.
	    for(int i = 0 ; i < array.length ; i++){
	      System.out.print((i+1) + "번째 줄을 출력합니다>");
	      for(int j = 0; j< array[i].length ; j++){
	        //System.out.print는 줄을 바꾸지 않고 출력하는 코드입니다.
	        System.out.print(array[i][j]+" ");
	      }
	      System.out.println("");//줄바꿈을 해 주는 코드입니다.
	    }
	  }
}
