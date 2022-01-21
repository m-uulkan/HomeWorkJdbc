package jdbc.home.service;

import jdbc.home.models.City;

import java.util.List;

public interface ServiceCity {
    void findCityById(List<City> cities, int id);

}
