package co.uptc.edu.cine.model;

public class Customer {
	private String name;
	private int ID;
	private String admin = "ADMIN";
	private String adminPassword = "admin123";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isAdmin(String name, String password) {
		return name.equals(admin) && adminPassword.equals(adminPassword);
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	@Override
	public String toString() {
		return "Cliente: " + getName() + "\nID: " + getID() + "\n";
	}

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setName("Juan Ramirez");
		customer.setID(123456789);
		System.out.println(customer);
	}
}
