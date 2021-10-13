package main.java;

import main.model.NirModel;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/nir")
public class NirServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/nirGet.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {



        NirModel nir = new NirModel(req.getParameter("nir"));

        ArrayList<String> errors = nir.validate();

        if (!errors.isEmpty()){



        }

        req.setAttribute("nir", nir);

        req.getRequestDispatcher("/nirPost.jsp").forward(req, resp);
    }
}
