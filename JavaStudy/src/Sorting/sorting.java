package Sorting;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sorting srt = new sorting();
		String str_data = srt.readFile();	
		String[] word = str_data.split(" ");
		word = srt.getSort(word);
		srt.writeFile(word);
		for(int i = 0; i < word.length; i++)
			System.out.println(word[i]);
	}
	public String[] getSort(String[] input){
		
		for (int i = input.length-2; i >= 0; i--){
		      for (int j = 0; j <= i; j++) {
		       if (input[j].compareTo(input[j+1]) > 0) {
		           String tmp = input[j];
		           input[j] = input[j+1];
		           input[j+1] = tmp;
		          }
		      } 
		}
		
		return input;
	}

	public String readFile(){
		String out = null;
		File m_file = new File("D:\\myProject\\Sorting\\data_Sorting.txt");
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
	public void writeFile(String[] str){
		File m_file = new File("D:\\myProject\\Sorting\\data_out_Sorting.txt");
		try {
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(m_file));
			//BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			for(int i = 0; i < str.length; i++){
				bufferedWriter.write(str[i]);
				bufferedWriter.newLine();
			}
			bufferedWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
