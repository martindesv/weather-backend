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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhenomenonNight() {
        return phenomenonNight;
    }

    public void setPhenomenonNight(String phenomenonNight) {
        this.phenomenonNight = phenomenonNight;
    }

    public String getPhenomenonDay() {
        return phenomenonDay;
    }

    public void setPhenomenonDay(String phenomenonDay) {
        this.phenomenonDay = phenomenonDay;
    }

    public Integer getTempmin() {
        return tempmin;
    }

    public void setTempmin(Integer tempmin) {
        this.tempmin = tempmin;
    }

    public Integer getTempmax() {
        return tempmax;
    }

    public void setTempmax(Integer tempmax) {
        this.tempmax = tempmax;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
