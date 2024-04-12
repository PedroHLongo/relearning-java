import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionTest {
    public static void main(String[] args) throws Exception{
        String connectionUrl = "jdbc:mysql://localhost:3306?verifyServerCertificate=false&useSSL=true";
        String user = "root";
        String password = "xxx";

        Connection connection = DriverManager
                .getConnection(connectionUrl, user, password);

        System.out.println("Connection success!");
        connection.close();
    }
}
