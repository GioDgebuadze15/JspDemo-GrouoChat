package ge.tsu.groupchat.thread;

import ge.tsu.groupchat.db.Database;

import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyRunnable implements Runnable {

    private String nickName;
    private static final Logger LOGGER = Logger.getLogger(MyRunnable.class.getName());

    public MyRunnable() {
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public void run() {
        var _con = Database.connection();
        try (PreparedStatement createStatement = _con.prepareStatement("CREATE TABLE IF NOT EXISTS NICKANMES(ID INT PRIMARY KEY AUTO_INCREMENT NOT NULL, NickName VARCHAR(255) NOT NULL);");) {
            DatabaseMetaData dbm = (DatabaseMetaData) createStatement.getMetaData();
            if (dbm != null) {
                ResultSet rs = dbm.getTables(null, null, "NICKNAMES", null);
                if (rs.next()) {
                    try (PreparedStatement prepareStatement = _con.prepareStatement("INSERT INTO NICKANMES(NickName) VALUES(?));")) {
                        prepareStatement.setString(1, nickName);
                    } catch (SQLException ex) {
                        LOGGER.log(Level.FINEST,null,ex);
                    }
                }
            }
        } catch (SQLException ex) {
            LOGGER.log(Level.FINEST,null,ex);
        }
    }
}
