package ge.tsu.groupchat.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

@WebServlet(name = "homeServlet", value = {"", "/home"})
public class HomeServlet extends HttpServlet {
    private String title;

    public String getTitle() {
        return title;
    }

    private static final Logger LOGGER = Logger.getLogger(HomeServlet.class.getName());


    public void init() {
        title = ResourceBundle.getBundle("language").getString("program.header");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setAttribute("title",title);

        try {
            request.getRequestDispatcher("WEB-INF/pages/index.jsp").include(request,response);
        } catch (ServletException e) {
            LOGGER.log(Level.FINEST,null,e);
        }
    }

    public void destroy() {
    }
}