package controller;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.bean.Disciplina;
import model.bean.Professor;
import model.bean.ProfessorDisciplina;
import model.dao.ProfessorDAO;

@WebServlet(name = "HomeController", urlPatterns = {"/HomeController", "/professor"})
public class HomeController extends HttpServlet {
    
    Gson conversor = new Gson();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String url = request.getServletPath();
        
        if (url.equals("/professor")) {
            
            
            
            response.setContentType("application/JSON");
            response.setCharacterEncoding("UTF-8");
            
            Map<String, List<Professor>> res = new HashMap<String, List<Professor>>();
            Map<String, List<ProfessorDisciplina>> ress = new HashMap<String, List<ProfessorDisciplina>>();
            Map<String, List<Disciplina>> resss = new HashMap<String, List<Disciplina>>();
            
            List<Professor> ler = new ArrayList();
            ProfessorDAO dao = new ProfessorDAO();
            ler = dao.ler();
            
            res.put("Professor", ler);
            
            PrintWriter out =  response.getWriter();
            out.write(conversor.toJson(res));
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
