package jdbc.home.service;

public interface Service {
     int getResultCount();
     void addModels(String name,String capital,String currency,String president);
     void printAll();
}
