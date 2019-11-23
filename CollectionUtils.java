package utils;

import static cust_execs.Validation.checkDate;
import static cust_execs.Validation.checkType;

import java.util.ArrayList;
import java.util.HashMap;

import core.app.Customer;

public class CollectionUtils {
	public static HashMap<String,Customer> populate(){
		HashMap<String,Customer> temp=new HashMap<>();
		ArrayList<Customer> al=new ArrayList<>();
		al.add(new Customer("abc1@gmail.com","pass123",10000,checkDate("20/11/2012"),checkType("Platinum")));
		al.add(new Customer("abc2@gmail.com","pass123",13000,checkDate("12/11/2012"),checkType("Platinum")));
		al.add(new Customer("abc3@gmail.com","pass123",15000,checkDate("09/11/2012"),checkType("Gold")));
		al.add(new Customer("abc4@gmail.com","pass123",14000,checkDate("11/11/2012"),checkType("Silver")));
		al.add(new Customer("abc5@gmail.com","pass123",12000,checkDate("23/11/2012"),checkType("Gold")));
		for(Customer c:al)
			temp.putIfAbsent(c.getEmail(),c);
		return temp;
	}
	
	public static HashMap<String, Customer> printType(String type, HashMap<String, Customer> custHM) {
		ArrayList<Customer> list = new ArrayList<Customer>(custHM.values());
		HashMap<String, Customer> temp=new HashMap<>();
		for(Customer c:list)
			if(c.getType().equalsIgnoreCase(type))
				temp.putIfAbsent(c.getEmail(),c);
		return temp;
	}
}
