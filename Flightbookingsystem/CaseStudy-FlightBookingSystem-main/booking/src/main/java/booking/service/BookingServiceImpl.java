package booking.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import booking.model.booking;
import booking.repo.BookingRepo;
@Service
public class BookingServiceImpl implements BookingService{
	@Autowired
	private BookingRepo bookingrepo;

	@Override
	public booking newbooking(booking book) {
		booking e=bookingrepo.save(book);
		return e;
	}

	@Override
	public List<booking> getAll() {
		return bookingrepo.findAll();
	}

	@Override
	public Optional<booking> getbookingById(String id) {
		return bookingrepo.findById(id);
	}

	@Override
	public String deletebookingById(String id) {
		bookingrepo.deleteById(id);
		return "deleted id:"+id;
	}

	@Override
	public String updatebooking(booking book, String id) {
		bookingrepo.findById(id);
		bookingrepo.save(book);
		return "updated id:"+id;
	}
	

}
