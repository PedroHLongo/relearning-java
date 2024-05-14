import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SelectPeople {
    public static void main(String[] args) throws SQLException {
        final Connection connection = ConnectionFactory.getConnection();

        final String sql = "SELECT * FROM people";

        final Statement statement = connection.createStatement();
        ResultSet result =  statement.executeQuery(sql);
        final List<Person> people = new ArrayList<>();

        while(result.next()) {
            final Integer code = result.getInt("code");
            final String name = result.getString("name");
            people.add(new Person(code, name));
        }

        people.forEach(System.out::println);

        statement.close();
        connection.close();
    }
}
