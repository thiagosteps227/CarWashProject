public class Detailer {
	private String name;
	private int phoneNumber;
	
	public Detailer() {
		
	}
	
	public Detailer(String name, int phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
