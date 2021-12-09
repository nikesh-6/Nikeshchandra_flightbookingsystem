package booking.repo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import booking.model.booking;

@Repository
public interface BookingRepo extends MongoRepository <booking,String> {

}
