import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateDatabase {
    public static void main(String[] args) throws Exception{
        String connectionUrl = "jdbc:mysql://localhost:3306?verifyServerCertificate=false&useSSL=true";
        String user = "root";
        String password = "xxx";

        Connection connection = DriverManager
                .getConnection(connectionUrl, user, password);

        Statement statement = connection.createStatement();
        statement.execute("CREATE DATABASE IF NOT EXISTS java_course");

        System.out.println("Database creation success!");
        connection.close();
    }
}
