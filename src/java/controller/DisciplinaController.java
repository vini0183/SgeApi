package controller;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.bean.Disciplina;
import model.dao.DisciplinaDAO;

@WebServlet(name = "DisciplinaController", urlPatterns = {"/DisciplinaController", "/disciplinas", "/disciplina"})
public class DisciplinaController extends HttpServlet {

    Gson conversor = new Gson();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String url = request.getServletPath();

        if (url.equals("/disciplinas")) {

            response.setContentType("application/JSON");
            response.setCharacterEncoding("UTF-8");

            Map<String, List<Disciplina>> res = new HashMap<String, List<Disciplina>>();

            res.put("disciplinas", new DisciplinaDAO().ler());

            PrintWriter out = response.getWriter();
            out.write(conversor.toJson(res));
            out.flush();

        } else if (url.equals("/disciplina")) {

            response.setContentType("application/JSON");
            response.setCharacterEncoding("UTF-8");
            int id = Integer.parseInt(request.getParameter("id_disciplina"));
            
            PrintWriter out = response.getWriter();
            out.write(conversor.toJson(new DisciplinaDAO().disciplinaEspecifica(id)));
            out.flush();
            
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
