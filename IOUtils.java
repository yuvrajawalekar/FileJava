package utils;

import java.io.*;
import java.util.HashMap;
import core.app.Customer;

public class IOUtils {
	public static HashMap<String,Customer> populateFromFile(){
		HashMap<String,Customer> temp=new HashMap<>();
		//Read From File
		try (ObjectInputStream Oin=new ObjectInputStream(new FileInputStream("custInfo.ser")))
		{
			temp=(HashMap<String, Customer>)Oin.readObject();
		} catch (FileNotFoundException e) {
            
        }catch (Exception e) {
			e.printStackTrace();
		}
		
		return temp;
	}
	public static boolean saveToFile(HashMap<String,Customer> temp){
		//Save to File
		try (ObjectOutputStream Oout=new ObjectOutputStream(new FileOutputStream("custInfo.ser")))
		{
			Oout.writeObject(temp);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return true;
	}
}
