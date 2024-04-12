import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SelectPeopleWithLike {
    public static void main(String[] args) throws SQLException {
        final Connection connection = ConnectionFactory.getConnection();

        final Scanner sc = new Scanner(System.in);
        final String name = sc.nextLine();

        final String sql = "SELECT * FROM people WHERE name like ?";

        final PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, "%" + name + "%");

        final List<Person> people = new ArrayList<>();

        final ResultSet result = preparedStatement.executeQuery();

        while(result.next()) {
            final Integer resultCode = result.getInt("code");
            final String resultName = result.getString("name");
            people.add(new Person(resultCode, resultName));
        }

        people.forEach(System.out::println);

        preparedStatement.close();
        connection.close();
    }
}
