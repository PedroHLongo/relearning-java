import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateDatabase {
    public static void main(String[] args) throws Exception{
        final String connectionUrl = "jdbc:mysql://localhost:3306?verifyServerCertificate=false&useSSL=true";
        final String user = "root";
        final String password = "xxx";

        final Connection connection = DriverManager
                .getConnection(connectionUrl, user, password);

        final Statement statement = connection.createStatement();
        statement.execute("CREATE DATABASE IF NOT EXISTS java_course");

        System.out.println("Success on creating database!");
        connection.close();
    }
}
