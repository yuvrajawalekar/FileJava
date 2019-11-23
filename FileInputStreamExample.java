package exp;

import java.io.FileInputStream;
//Read Single Character
//public class FileInputStreamExample {
//	public static void main(String args[]) {
//		try {
//			FileInputStream fin = new FileInputStream("D:\\testout.txt");
//			int i = fin.read();
//			System.out.print((char) i);
//
//			fin.close();
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//	}
//}

//Java FileInputStream example 2: read all characters  
public class FileInputStreamExample {
	public static void main(String args[]) {
		try {
			FileInputStream fin = new FileInputStream("D:\\testout.txt");
			int i = 0;
			while ((i = fin.read()) != -1) {
				System.out.print((char) i);
			}
			fin.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}