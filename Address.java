package core.app;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Address implements Serializable {
	//Address -- city,state,country,phoneNo,type
	private String atype,city,country,phoneNo;
	public Address( String atype,String city, String country, String phoneNo) {
		super();
		this.atype = atype;
		this.city = city;
		this.country = country;
		this.phoneNo = phoneNo;
	}
	@Override
	public String toString() {
		return "Address [atype=" + atype + ", city=" + city + ", country=" + country + ", phoneNo=" + phoneNo + "]";
	}	
}
