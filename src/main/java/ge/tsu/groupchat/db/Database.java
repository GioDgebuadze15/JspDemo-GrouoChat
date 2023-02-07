package ge.tsu.groupchat.db;

import org.h2.jdbcx.JdbcDataSource;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database {

    private static final Logger LOGGER = Logger.getLogger(Database.class.getName());
    public static Connection CONNECTION;
    static {
        Properties props = new Properties();
        try (var inputStream = Database.class.getResourceAsStream("/db.properties")) {
            props.load(inputStream);
            JdbcDataSource dataSource = new JdbcDataSource();
            dataSource.setURL(props.getProperty("db.url"));
            dataSource.setUser(props.getProperty("db.user"));
            dataSource.setPassword(props.getProperty("db.password"));
            CONNECTION = dataSource.getConnection();
        } catch (IOException | SQLException e) {
            LOGGER.log(Level.FINEST,null,e);
        }
    }

    private Database() {
    }

    public static Connection connection() {
        return CONNECTION;
    }
}
