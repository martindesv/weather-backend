package weather.weatherbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import weather.weatherbackend.entity.Place;

public interface PlaceRepository extends JpaRepository<Place, Long> {
}
