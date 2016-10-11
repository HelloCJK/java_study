package Searching;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Searching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Searching src = new Searching();
		Scanner scan = new Scanner(System.in);
		
		String str_data = src.readFile();
		String[] strArr_data = str_data.split(" ");
		
		System.out.printf("찾고 싶은 단어 입력: ");
		String input_data = scan.nextLine();
			
		src.LinearSearching(strArr_data, input_data);

	}
	public void LinearSearching(String[] data, String find_data){
		
		for(int i = 0; i < data.length; i++){
			if(data[i].contains(find_data)){
				System.out.println((i+1) + " : " + data[i]);
			}
		}
	}
	public String readFile(){
		String out = null;
		File m_file = new File("D:\\myProject\\Searching\\data_Searching.txt");
		try {
			FileReader m_reader = new FileReader(m_file);
			
			int c = 0;
			while(true){
				c = m_reader.read();
				if(c==-1)	break;
				if(out == null)	out = String.valueOf((char)c);
				else			out += String.valueOf((char)c);
			}
			m_reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return out;
	}

}
