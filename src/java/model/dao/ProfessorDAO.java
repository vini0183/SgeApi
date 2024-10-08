package model.dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import model.bean.Professor;

public class ProfessorDAO {
    
    public List<Professor> prof() {
        
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement("");
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()) {
                
            }
            
            rs.close();
            stmt.close();
            conexao.close();
            
        }catch(Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
