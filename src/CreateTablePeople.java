import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTablePeople {
    public static void main(String[] args) throws SQLException {
        final Connection connection = ConnectionFactory.getConnection();

        final String sql = "CREATE TABLE IF NOT EXISTS people (" +
                "code INT AUTO_INCREMENT PRIMARY KEY," +
                "name VARCHAR(80) NOT NULL" +
                ")";

        final Statement statement = connection.createStatement();
        statement.execute(sql);

        System.out.println("Success on creating table!");

        statement.close();
        connection.close();
    }
}
