package javaStudy;

public class OperatorExam {
	
	public int[] calculate() {
		int a = 7; 
		int b = 3;

		//c�� a�� b�� �� 
		int c = a+b;
		//d�� a�� b�� ��
		int d = a-b;
		//e�� a�� b�� ��
		int e = a*b;
		//f�� a�� b�� ���� ������ 
		int f = a%b;
		
		//�� �Ʒ� �ڵ�� ��� �׽�Ʈ�� ���� �ڵ��Դϴ�.
		int ret[]={c,d,e,f};
		return ret;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new OperatorExam().calculate();
	}

}
