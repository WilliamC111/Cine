package co.uptc.edu.cine.model;

public class Customer {

	private String name;
	private int ID;
	private int numberTickets;

	public boolean buyTicket() {
		return false;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getNumberTickets() {
		return numberTickets;
	}

	public void setNumberTickets(int numberTickets) {
		this.numberTickets = numberTickets;
	}

}
