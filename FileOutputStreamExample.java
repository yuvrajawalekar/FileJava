package exp;

//import java.io.FileOutputStream;
//
//public class FileOutputStreamExample {
//	public static void main(String args[]) {
//		try {
//			FileOutputStream fout = new FileOutputStream("D:\\testout.txt");
//			fout.write(65);
//			fout.close();
//			System.out.println("success...");
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//	}
//}

import java.io.FileOutputStream;  
public class FileOutputStreamExample {  
    public static void main(String args[]){    
           try{    
             FileOutputStream fout=new FileOutputStream("E:\\iopract.txt");    
             String s="Welcome to javaTpoint.";    
             byte b[]=s.getBytes();//converting string into byte array
             System.out.println(b);
             System.out.println(new String(b));
             fout.write(b);    
             fout.close();    
             System.out.println("success...");    
            }catch(Exception e){System.out.println(e);}    
      }    
}  