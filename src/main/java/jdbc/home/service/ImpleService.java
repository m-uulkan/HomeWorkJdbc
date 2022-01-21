package jdbc.home.service;

import jdbc.home.dao.DatabaseUtil;
import jdbc.home.models.City;

import java.sql.*;
import java.util.List;

public class ImpleService implements Service,ServiceCity{
    private static final String SQL = "select count(*)from city";
    DatabaseUtil databaseUtil;
    @Override
    public int getResultCount() {
        int count=0;
     try( Connection conn=databaseUtil.connection();
         Statement statement=conn.createStatement();
         ResultSet resultSet=statement.executeQuery(SQL)){
         resultSet.next();
         count=resultSet.getInt(1);
     }catch(SQLException e){
         System.out.println(e.getMessage());
     }return count;

    }

    @Override
    public void addModels(String name, String capital, String currency, String president) {
        String SQL="insert into country(name,capital,currency_code,president)values(?,?,?,?)";
        try(Connection conn=DatabaseUtil.connection();
            PreparedStatement prst=conn.prepareStatement(SQL))
        {
            prst.setString(1,name);
            prst.setString(2,capital);
            prst.setString(3,currency);
            prst.setString(4,president);
            prst.executeUpdate();
            System.out.println(name+" добавлен в базу");
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void printAll() {
        String SQL="select * from city";
        try(Connection conn=DatabaseUtil.connection();
        Statement statement=conn.createStatement();
        ResultSet result= statement.executeQuery(SQL))
        {while(result.next()){
            System.out.println(result.getInt("id")+" "+result.getString("name_city")+" "
                    +result.getInt("quantity_people")+" "+result.getInt("zip_code")+
                    " "+result.getString("language"));
        }

        }catch(SQLException e){
            System.out.println(e.getMessage());
        }

    }

    @Override
    public void findCityById(List<City> cities, int id) {
        for(City c:cities){
            if(c.getId()==id){
                System.out.println(c);
            }
        }

    }
}
