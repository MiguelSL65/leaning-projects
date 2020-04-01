package org.academiadecodigo.rhashtafaris.tomcat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class RhashtaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Rhashtafari rasta = new Rhashtafari();
        rasta.setName("Miguel");
        rasta.setAge(26);
        rasta.setNumberOfRockets(2);

        req.getSession().setAttribute("rhashtafari", rasta);
        getServletContext().getRequestDispatcher("/WEB-INF/view/index.jsp").forward(req, resp);

    }
}
