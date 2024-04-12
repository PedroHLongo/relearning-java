import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdatePeople {
    public static void main(String[] args) throws Exception {
        final Connection connection = ConnectionFactory.getConnection();

        final Scanner sc = new Scanner(System.in);

        System.out.println("Id to search: ");
        final int id = sc.nextInt();
        sc.nextLine();
        System.out.println("New name: ");
        final String newName = sc.nextLine();

        final String selectSql = "SELECT * FROM people WHERE code = ?";

        final PreparedStatement selectPreparedStatement = connection.prepareStatement(selectSql);
        selectPreparedStatement.setInt(1, id);

        final ResultSet result = selectPreparedStatement.executeQuery();

        if (Boolean.FALSE.equals(result.next())) {
            throw new Exception("Id not found");
        }

        final Person person = new Person();
        while(result.next()) {
            final Integer resultCode = result.getInt("code");
            final String resultName = result.getString("name");

            person.setCode(resultCode);
            person.setName(resultName);
        }

        System.out.println(person);
        selectPreparedStatement.close();

        final String updateSql = "UPDATE people SET name = ? WHERE code = ?";

        final PreparedStatement updatePreparedStatement = connection.prepareStatement(updateSql);
        updatePreparedStatement.setString(1, newName);
        updatePreparedStatement.setInt(2, id);

        updatePreparedStatement.execute();

        sc.close();
        updatePreparedStatement.close();
        connection.close();
    }
}
