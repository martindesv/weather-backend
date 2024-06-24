package weather.weatherbackend.controller;

import org.springframework.web.bind.annotation.*;
import weather.weatherbackend.entity.Place;
import weather.weatherbackend.repository.PlaceRepository;
import java.util.List;

@RestController
@RequestMapping("/api/weather")
public class WeatherController {

    private final PlaceRepository placeRepository;

    public WeatherController(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
    }

    @GetMapping("/place")
    public List<Place> getAllPlaces() {
        return placeRepository.findAll();
    }
}
