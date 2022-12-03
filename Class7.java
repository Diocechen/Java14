package myJava14;

import java.io.FileReader;
import java.io.IOException;

public class Class7 {
	public static void main(String[] args) throws IOException{
		char data[]=new char[128];
		FileReader fr = new FileReader("C:\\OOPjava\\FileRW\\donkey.txt");
		int len = fr.read(data,0,17);
		int i = 0;
		while(i < len) {
			System.out.print(data[i]);
			i++;
		}
		fr.close();
	}
}
