package model.dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.bean.Disciplina;
import model.bean.Professor;
import model.bean.ProfessorDisciplina;

public class ProfessorDAO {
    
    public List<Professor> ler() {
        List<Professor> lerProfessor = new ArrayList();
        
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement("SELECT * FROM professor INNER JOIN professor_disciplina ON professor_disciplina.fk_id_professor = professor.id_professor inner join disciplina on professor_disciplina.fk_id_disciplina = disciplina.id_disciplina");
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()) {
                Professor prof = new Professor();
                Disciplina dis = new Disciplina();
                ProfessorDisciplina profdis = new ProfessorDisciplina();
                
                prof.setId_professor(rs.getInt("id_professor"));
                prof.setNome(rs.getString("nome"));
                prof.setSobrenome(rs.getString("sobrenome"));
                prof.setCpf(rs.getString("cpf"));
                prof.setSenha(rs.getString("senha"));
                prof.setImagens(rs.getString("imagens"));
                
                profdis.setFk_id_professor(rs.getInt("fk_id_professor"));
                profdis.setFk_id_disciplina(rs.getInt("fk_id_disciplina"));
                
                dis.setId_disciplina(rs.getInt("id_disciplina"));
                dis.setNome_disciplina(rs.getString("nome_disciplina"));
                dis.setFk_id_area(rs.getInt("fk_id_area"));
                
                lerProfessor.add(prof);
            }
            
            rs.close();
            stmt.close();
            conexao.close();
            
        }catch(Exception e) {
            e.printStackTrace();
        }
        return lerProfessor;
        
    }
    
}
