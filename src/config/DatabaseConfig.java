package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConfig {

    private static DatabaseConfig instance;

    private Connection connection;

    private static String URL = "jdbc:postgresql://prying-falcon-14534.7tt.aws-us-east-1.cockroachlabs.cloud:26257/flashfideliza";

    private static String USER = "flashfideliza";

    private static String PASSWORD = "a6F9XmKNivWnESoDCbBERA";

    private DatabaseConfig() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            this.connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static DatabaseConfig getInstance() throws SQLException {
        if (instance == null) {
            instance = new DatabaseConfig();
        } else if (instance.getConnection().isClosed()) {
            instance = new DatabaseConfig();
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }

}
