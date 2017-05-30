package homework14;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Task0_Sakilaa {

    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "1234";

        String first_name = "Petya";
        String last_name = "Stoyanova";

        String SQLInsertQuery = "Insert into actor (first_name, last_name)" + "Values (?, ?)";

        InsertNewActor(url, username, password, SQLInsertQuery, first_name, last_name);

    }

    private static void InsertNewActor(String url, String username, String password, String SQLInsertQuery, String first_name, String last_name) throws SQLException {
        try (Connection con = (Connection) DriverManager.getConnection(url, username, password);
                PreparedStatement statement = (PreparedStatement) con.prepareStatement(SQLInsertQuery);) {

            statement.setString(1, first_name);
            statement.setString(2, last_name);

            statement.execute();

        }

    }

}
