package ge.tsu.groupchat.servlets;

import org.junit.jupiter.api.Test;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HomeServletTest {



    @Test
    void testTitle() {
        HomeServlet homeServlet = new HomeServlet();
        homeServlet.init();
        String title = homeServlet.getTitle();

        String expectedTitle = "Welcome To Group Chat";
        assertEquals(expectedTitle,title);


        Locale georgianLocale = new Locale("ka", "GE");
        Locale.setDefault(georgianLocale);

        homeServlet.init();
        title = homeServlet.getTitle();

        expectedTitle = "მოგესალმებით გრუპ ჩათში";
        assertEquals(expectedTitle,title);

        Locale russianLocale = new Locale("ru","RU");
        Locale.setDefault(russianLocale);

        homeServlet.init();
        title = homeServlet.getTitle();

        expectedTitle = "Добро пожаловать в групповой чат";
        assertEquals(expectedTitle,title);

    }
}