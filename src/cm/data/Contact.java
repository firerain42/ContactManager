package cm.data;

public class Contact implements Comparable<Contact> {

	private String name, address, phone, email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return this.name;
	}

	@Override
	public int compareTo(Contact o) {
		if (this.name == null || o.name == null) {
			throw new NullPointerException("'name' must not be null.");
		}
		return this.name.compareTo(o.name);
	}
	
}
