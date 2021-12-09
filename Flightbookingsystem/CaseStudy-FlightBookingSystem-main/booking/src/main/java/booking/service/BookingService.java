package booking.service;

import java.util.List;
import java.util.Optional;

import booking.model.booking;


public interface BookingService {
	public booking newbooking( booking book);
	public List<booking> getAll();
	public Optional<booking> getbookingById( String id);
	public String deletebookingById( String id);
	public String updatebooking( booking book,  String id);

}
