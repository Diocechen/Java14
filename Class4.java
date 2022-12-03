package myJava14;
import java.io.*;

public class Class4 {
	public static void main(String[] args) throws IOException{
		char data[]=new char[128];
		FileReader fr = new FileReader("C:\\OOPjava\\FileRW\\donkey.txt");
		int len = fr.read(data);
		int i = 0;
		while(i < len) {
			System.out.print(data[i]);
			i++;
		}
		System.out.print(len);
		fr.close();
	}
}
/*因為filereader.read()會記錄換行字元*/
