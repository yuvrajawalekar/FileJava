package core.app;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;

@SuppressWarnings("serial")
public class Customer implements Serializable {
	// data members -- email(unique),password , reg amount,regDate(Date), type (enum
	// : SILVER/GOLD/PLATINUM)
	// address(home address , office address,....)
	private String email, password;
	private double regAmount;
	private Date regDate;
	private type type;
	// private transient Address adr;
	private HashMap<String, Address> addHM;

	// private Address addr;
	public Customer(String email, String password, double regAmount, Date regDate, core.app.type type) {
		super();
		this.email = email;
		this.password = password;
		this.regAmount = regAmount;
		this.regDate = regDate;
		this.type = type;
		this.addHM = new HashMap<>();
	}

	@Override
	public String toString() {
		return "Customer [email=" + email + ", password=" + password + ", regAmount=" + regAmount + ", regDate="
				+ regDate + ", type=" + type + " has Add=" + addHM + "]";
	}

	public void linkAddress(String atype, String city, String country, String phoneNo) {
		// System.out.println("in linkAdd");
		addHM.putIfAbsent(atype, new Address(atype, city, country, phoneNo));
	}

	public void updateAddress(String atype, String city, String country, String phoneNo) {
		addHM.put(atype, new Address(atype, city, country, phoneNo));
	}

	public String getPassword() {
		return password;
	}

	public String getType() {
		return type.toString();
	}

	public String getEmail() {
		return email;
	}

	public Date getRegDate() {
		return this.regDate;
	}

	public double getRegAmt() {
		return this.regAmount;
	}

	public HashMap<String, Address> getAddress() {
		return addHM;
	}

}
