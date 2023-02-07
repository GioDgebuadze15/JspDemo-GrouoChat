package ge.tsu.groupchat.db;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DatabaseTest {

    @Test
    void testConnection() {
        assertEquals(Database.CONNECTION,Database.connection());
    }
}