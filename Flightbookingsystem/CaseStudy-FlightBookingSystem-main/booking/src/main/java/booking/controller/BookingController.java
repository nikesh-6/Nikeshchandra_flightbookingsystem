package booking.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import booking.model.booking;
import booking.service.BookingServiceImpl;
@RestController

public class BookingController {
	@Autowired
	BookingServiceImpl bookingserviceimpl;

	@PostMapping("/addbooking")
	public String savebooking(@RequestBody booking book ) {
	     bookingserviceimpl.newbooking(book);
		return " added a booking" +book.getId();
		
	}
	@GetMapping("/findallbookings")
	public List<booking>getbookings(){
		return bookingserviceimpl.getAll();
		
		
	}
	@GetMapping("/findbooking/{id}")
	public Optional<booking> getbooking(@PathVariable String id ){
		return bookingserviceimpl.getbookingById(id);
	
	}
	@GetMapping("/delete/{id}")
	public String deletebooking(@PathVariable String id) {
		bookingserviceimpl.deletebookingById(id);
		return "booking delete with id:" + id;
		
		
	}
	@PutMapping("/update/{id}")
	public String updatebooking(@RequestBody booking book , @PathVariable String id) {
		bookingserviceimpl.updatebooking(book, id);
		return"updated booking:" +id;
	}
	
	


}



