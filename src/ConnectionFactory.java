import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {
    public static Connection getConnection() {
        try {
            final Properties properties = getProperties();
            final String connectionUrl = properties.getProperty("database.url");
            final String user = properties.getProperty("database.user");
            final String password = properties.getProperty("database.password");

            return DriverManager
                    .getConnection(connectionUrl, user, password);
        } catch (SQLException | IOException exception) {
            throw new RuntimeException(exception.getCause());
        }
    }

    private static Properties getProperties() throws IOException {
        final Properties properties = new Properties();
        final String path = "/application.properties";

        properties.load(ConnectionFactory.class.getResourceAsStream(path));

        return properties;
    }
}
