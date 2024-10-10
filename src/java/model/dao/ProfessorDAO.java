package model.dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.bean.Professor;

public class ProfessorDAO {
    
    public List<Professor> lerProfessores() {
        
        List<Professor> professores = new ArrayList();
        
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            stmt = conexao.prepareStatement("select * from professor");
            rs = stmt.executeQuery();
            
            while(rs.next()) {
                
                Professor professor = new Professor();
                
                professor.setId_professor(rs.getInt("id_professor"));
                professor.setNome(rs.getString("nome"));
                professor.setSobrenome(rs.getString("sobrenome"));
                professor.setCpf(rs.getString("cpf"));
                professor.setImagem(rs.getString("imagem"));
                
                professor.setDisciplina(new DisciplinaDAO().lerDisciplinaProfessor(rs.getInt("id_professor")));
                
                professores.add(professor);
                
            }
            
            rs.close();
            stmt.close();
            conexao.close();
            
        }catch(Exception e) {
            e.printStackTrace();
        }
        return professores;
    }
    
}
