package homework14;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Task0_Sakilab {

    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "1234";

        int actor_id = 24;
        int film_id = 16;

        String SQLInsertQuery = "Insert into film_actor (actor_id, film_id)" + "Values (?, ?)";

        InsertNewFilm_Actor(url, username, password, SQLInsertQuery, actor_id, film_id);
    }

    public static void InsertNewFilm_Actor(String url, String username, String password, String SQLInsertQuery, int actor_id, int film_id) throws SQLException {

        try (Connection conn = DriverManager.getConnection(url, username, password);
                PreparedStatement statement = conn.prepareStatement(SQLInsertQuery);) {

            statement.setInt(1, actor_id);
            statement.setInt(2, film_id);

            statement.execute();

        }

    }

}
