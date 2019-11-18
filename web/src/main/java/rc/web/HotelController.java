package rc.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import rc.domain.Hotel;
import rc.persistence.HotelRepository;

import java.util.List;

@RestController
public class HotelController {

    private final HotelRepository hotelRepository;

    public HotelController(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @GetMapping("/hotels")
    public List<Hotel> getHotels() {
        return this.hotelRepository.findAll();
    }
}
