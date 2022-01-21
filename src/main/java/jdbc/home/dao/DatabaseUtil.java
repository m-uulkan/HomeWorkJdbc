package jdbc.home.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {
    private static final String url = "jdbc:postgresql://localhost:5432/postgres";
    private static final String user = "postgres";
    private static final String password = "12345";

    public static Connection connection() {
        Connection connection = null;
        try {
            connection= DriverManager.getConnection(url,user,password);
//            System.out.println("Connected to the PostgreSQL server\n" +
//                    "successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }

}
