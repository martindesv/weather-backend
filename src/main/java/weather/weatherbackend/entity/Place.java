package weather.weatherbackend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Place {

    @Id
    private Long id;

    private String name;

    private String phenomenonNight;

    private String phenomenonDay;

    private Integer tempmin;

    private Integer tempmax;

    private LocalDate date;

}
