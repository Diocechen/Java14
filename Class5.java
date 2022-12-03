package myJava14;
import java.io.FileReader;
import java.io.IOException;

public class Class5 {
	public static void main(String[] args) throws IOException{
		char data[]=new char[128];
		FileReader fr = new FileReader("C:\\OOPjava\\FileRW\\donkey.txt");
		fr.skip(9);
		int len = fr.read(data);
		int i = 0;
		while(i < len) {
			System.out.print(data[i]);
			i++;
		}
		fr.close();
	}
}
