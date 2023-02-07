package ge.tsu.groupchat.servlets;

import ge.tsu.groupchat.thread.MyRunnable;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequestWrapper;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.logging.Logger;

@WebServlet(name = "RegistrationServlet", value = "/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
    private String title;

    private static final Logger LOGGER = Logger.getLogger(RegistrationServlet.class.getName());

    public void init() {
        title = "Welcome, ";
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nickName = request.getParameter("nickName");

        request = new HttpServletRequestWrapper(request) {
            @Override
            public String getMethod() {
                return "GET";
            }
        };

        if (nickName == null || nickName.isBlank()) {
            request.setAttribute("errorMessage", "You must enter a nickname!");
            request.getRequestDispatcher("/").forward(request, response);
            return;
        }

        InsertIntoDatabase(nickName);

        title += nickName + "!";
        request.setAttribute("title", title);

        request.getRequestDispatcher("WEB-INF/pages/group-chat.jsp").include(request, response);
        init();
    }

    private static void InsertIntoDatabase(String nickName){
        MyRunnable myRunnable = new MyRunnable();
        Thread th1 = new Thread(myRunnable);
        myRunnable.setNickName(nickName);


        th1.start();
    }
}
