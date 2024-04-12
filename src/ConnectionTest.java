import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionTest {
    public static void main(String[] args) throws Exception{
        final Connection connection = ConnectionFactory.getConnection();

        System.out.println("Connection success!");
        connection.close();
    }
}
