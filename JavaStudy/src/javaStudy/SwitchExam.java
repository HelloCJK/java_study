package javaStudy;

import java.util.Calendar;

public class SwitchExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    //month���� ���� ���� ��� �ֽ��ϴ�.
	    int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
	    String season = "";
	    //switch���� �̿��ؼ� season�� ��/����/����/�ܿ� �� �ϳ��� ���� �������� ����� ������.
			switch(month){
	      case 12:
	      case 1:
	      case 2:
	        season = "�ܿ�";
	        break;
	      case 3:
	      case 4:
	      case 5:
	        season = "��";
	        break;
	      case 6:
	      case 7:
	      case 8:
	        season = "����";
	        break;
	      case 9:
	      case 10:
	      case 11:
	        season = "����";
	        break;
	    }

	    //�� ������ switch���� �Ϸ��ؾ� �մϴ�.
	    System.out.println("������ "+ month +"���̰�, "+ season +"�Դϴ�.");

	}

}
