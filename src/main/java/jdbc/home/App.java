package jdbc.home;

import jdbc.home.dao.DatabaseUtil;
import jdbc.home.models.City;
import jdbc.home.service.ImpleService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {

   static Scanner sc=new Scanner(System.in);
    public static void main( String[] args ){

    List<City> cities=new ArrayList<>(Arrays.asList
                       (new City(1,"Bishkek",1000000,3231L,"Salam"),
                        new City(2,"Chicago",12000000, 3321L,"Hello"),
                        new City(3,"Ankara",14000000,781200L,"Merhaba"),
                        new City(4,"Kapura",22000000,7001L,"Namaste")));
        ImpleService imple=new ImpleService();
        System.out.println(imple.getResultCount());
        imple.addModels("Japan","Tokyo","Japan's $","Lim K.Y");
        imple.printAll();

        System.out.println("Введите id ");
        int id=sc.nextInt();
        imple.findCityById(cities,id);
    }
}
