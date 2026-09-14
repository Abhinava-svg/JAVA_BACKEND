import java.sql.Connection;
import java.sql.DriverManager;

public class App {

    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/student1";
        String username = System.getenv("DB_USERNAME");
        String password = System.getenv("DB_PASSWORD");

        Connection con =
                DriverManager.getConnection(url, username, password);

        System.out.println("Database connected!");

        con.close();
    }
}