package rc.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import rc.domain.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Long> {
}
