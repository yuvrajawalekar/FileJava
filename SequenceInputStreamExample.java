package exp;

import java.io.*;

public class SequenceInputStreamExample {
	public static void main(String args[]) throws Exception {
		FileInputStream input1 = new FileInputStream("E:\\iopract.txt");
		FileInputStream input2 = new FileInputStream("E:\\practice.txt");
		SequenceInputStream inst = new SequenceInputStream(input2, input1);
		int j;
		while ((j = inst.read()) != -1) {
			System.out.print((char) j);
		}
		inst.close();
		input1.close();
		input2.close();
	}
}