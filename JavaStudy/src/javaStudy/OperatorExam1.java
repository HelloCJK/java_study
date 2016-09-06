package javaStudy;

public class OperatorExam1 {
	public boolean[] calculate(int a, int b) {
		//���� a�� b�� int�� �����Դϴ�. ���� � ���� ������ �ִ����� ���� ���� ������ �𸨴ϴ�.
		//a�� b�� �־��� �ִٰ� �����ϰ� �Ʒ� ���ÿ� ���� ������ Ǯ�� ������.
	
		//a�� b���� ū �� ���� ���(true �Ǵ� false)�� c�� �����ϼ���.
		boolean c = (a>b) ? true : false;
		
		//a�� b�� ������ ���� ����� d�� �����ϼ���.
		boolean d = (a==b) ? true : false;
		
		//a�� b�� �ٸ��� ���� ����� e�� �����ϼ���.
		boolean e = (a!=b) ? true : false;
		
		//�� �Ʒ� �ڵ�� ��� �׽�Ʈ�� ���� �ڵ��Դϴ�.
		boolean ret[]={c,d,e};
		return ret;
	}

	public static void main(String[]args){
		int a = (int)(Math.random()*10);
		int b = (int)(Math.random()*10);
		new OperatorExam1().calculate(a,b);
	}
}
