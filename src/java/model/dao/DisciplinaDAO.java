package model.dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.bean.Area;
import model.bean.Disciplina;
import model.bean.Professor;
import model.bean.ProfessorDisciplina;

public class DisciplinaDAO {
    
    public List<Disciplina> ler() {
        List<Disciplina> lista = new ArrayList();
        
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement("SELECT dis.id_disciplina, dis.nome_disciplina, area.id_area, area.nome AS nome_area, area.descricao AS descricao_area FROM disciplina AS dis INNER JOIN area ON dis.fk_id_area = area.id_area");
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()) {
                
                Disciplina dis = new Disciplina();
                
                dis.setId_disciplina(rs.getInt("id_disciplina"));
                dis.setNome_disciplina(rs.getString("nome_disciplina"));
                
                Area area = new Area();
                
                area.setId_area(rs.getInt("id_area"));
                area.setNome(rs.getString("nome_area"));
                area.setDescricao(rs.getString("descricao_area"));
                
                dis.setArea(area);
                
                lista.add(dis);
            }
            
        }catch(SQLException e) {
            e.printStackTrace();
        }
        return lista;
        
    }
    
}
