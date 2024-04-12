import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public static Connection getConnection() {
        try {
            final String connectionUrl = "jdbc:mysql://localhost:3306/java_course?verifyServerCertificate=false&useSSL=true";
            final String user = "root";
            final String password = "xxx";

            return DriverManager
                    .getConnection(connectionUrl, user, password);
        } catch (SQLException exception) {
            throw new RuntimeException(exception.getCause());
        }
    }
}
