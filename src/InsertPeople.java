import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertPeople {
    public static void main(String[] args) throws SQLException {
        final Scanner sc = new Scanner(System.in);

        System.out.println("Name: ");
        final String name = sc.nextLine();
        System.out.println(name);

        final Connection connection = ConnectionFactory.getConnection();

        final String sql = "INSERT INTO people (name) VALUES (?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, name);

        statement.execute();

        sc.close();
    }
}
