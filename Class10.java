package myJava14;

import java.io.*;
import java.io.IOException;
import java.util.Arrays;

public class Class10 {
	public static void main(String[] args) throws IOException{
		FileWriter fw = new FileWriter("C:\\OOPjava\\FileRW\\rand.txt");
	    BufferedWriter bfw = new BufferedWriter(fw);
	    
	    for(int i=1;i<=1000;i++)
	    {
	    	bfw.write(Integer.toString((int)(Math.random()*100000)));
	    	bfw.newLine();
	    }
	    bfw.flush();
	    fw.close();
	    
	    FileReader fr = new FileReader("C:\\OOPjava\\FileRW\\rand.txt");
	    BufferedReader bfr = new BufferedReader(fr);
	    String s;
	    int count = 0,biggest = 0,smallest = 100000;
	    while((s = bfr.readLine()) != null) {
	    	int rea = Integer.parseInt(s);
	    	count += rea;
	    	if(rea > biggest) {
	    		biggest = rea;
	    	}
	    	if(rea < smallest) {
	    		smallest = rea;
	    	}
	    }
	    System.out.println("平均值"+count/1000+" 最大值"+biggest+" 最小值"+smallest);
	    bfr.close();
	    fr.close();
	    
	    FileReader fr2 = new FileReader("C:\\OOPjava\\FileRW\\rand.txt");
	    BufferedReader bfr2 = new BufferedReader(fr2);
	    int arr[] = new int[1000];
	    String s1;
	    int i = 0;
	    while((s1 = bfr2.readLine()) != null) {
	    	arr[i] = Integer.parseInt(s1);
	    	i++;
	    }
	    Arrays.sort(arr);
	    String st = Arrays.toString(arr);
	    String stt[] = st.replace("[", "").replace("]", "").split(", ");
	    FileWriter fw2 = new FileWriter("C:\\OOPjava\\FileRW\\rand2.txt");
	    BufferedWriter bfw2 = new BufferedWriter(fw2);
	    i = 0;
	    while(i < 1000 && (s1 = stt[i]) != null) {
	    	bfw2.write(s1);
	    	bfw2.newLine();
	    	i++;
	    }
	    bfw2.flush();
	    fw2.close();
	}
}
