import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateDatabase {
    public static void main(String[] args) throws Exception{
        final Connection connection = ConnectionFactory.getConnection();

        final Statement statement = connection.createStatement();
        statement.execute("CREATE DATABASE IF NOT EXISTS java_course");

        System.out.println("Success on creating database!");

        statement.close();
        connection.close();
    }
}
