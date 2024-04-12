import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeletePeople {
    public static void main(String[] args) throws SQLException {
        final Connection connection = ConnectionFactory.getConnection();
        final Scanner sc = new Scanner(System.in);

        System.out.println("Id to delete: ");
        final int idToDelete = sc.nextInt();

        final String sql = "DELETE FROM people WHERE code = ?";

        final PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, idToDelete);

        preparedStatement.execute();

        if(preparedStatement.executeUpdate() > 1) {
            System.out.println("Success!");
        } else {
            System.out.println("Not ok.");
        }

        sc.close();
        preparedStatement.close();
        connection.close();
    }
}
