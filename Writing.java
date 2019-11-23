package exp;
import java.io.*;
public class Writing {

	public static void main(String[] args) throws IOException {
		FileOutputStream fin=new FileOutputStream("E:\\new.txt");
		String s="asjfhkh asehfjahesfl ajsdfhkjlasf";
		byte b[]=s.getBytes();
		fin.write(b);
		
//		while((i=fin.read())!=-1)
//		{
//			System.out.print((char)i);
//			
//		}
		fin.close();

	}

}
