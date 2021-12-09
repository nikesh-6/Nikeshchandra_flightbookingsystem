package booking.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="details")
public class booking {
	private String id;
	private String name;
	private String email;
	private String contact;
	private String flightnumber;
	private String origin;
	private String destination;
	private String date;
	private String ticketprice;
	public booking(String id, String name, String email, String contact, String flightnumber, String origin,
			String destination, String date, String ticketprice) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.flightnumber = flightnumber;
		this.origin = origin;
		this.destination = destination;
		this.date = date;
		this.ticketprice = ticketprice;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getFlightnumber() {
		return flightnumber;
	}
	public void setFlightnumber(String flightnumber) {
		this.flightnumber = flightnumber;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTicketprice() {
		return ticketprice;
	}
	public void setTicketprice(String ticketprice) {
		this.ticketprice = ticketprice;
	}
	@Override
	public String toString() {
		return "booking [id=" + id + ", name=" + name + ", email=" + email + ", contact=" + contact + ", flightnumber="
				+ flightnumber + ", origin=" + origin + ", destination=" + destination + ", date=" + date
				+ ", ticketprice=" + ticketprice + "]";
	}
	
	
	
	

}
