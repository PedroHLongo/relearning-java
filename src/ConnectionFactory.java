import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public static Connection getConnection() {
        try {
            String connectionUrl = "jdbc:mysql://localhost:3306/java_course?verifyServerCertificate=false&useSSL=true";
            String user = "root";
            String password = "xxx";

            return DriverManager
                    .getConnection(connectionUrl, user, password);
        } catch (SQLException exception) {
            throw new RuntimeException(exception.getCause());
        }
    }
}
