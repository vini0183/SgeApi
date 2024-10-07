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
            PreparedStatement stmt = conexao.prepareStatement("select dis.id_disciplina, dis.nome_disciplina, area.id as id_area, area.nome as nome_area, area.descricao as descricao_area from disciplina as dis inner join area on dis.fk_id_area = area.id");
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()) {
                
                Disciplina dis = new Disciplina();
                
                dis.setId_disciplina(rs.getInt("id_disciplina"));
                dis.setNome_disciplina(rs.getString("nome_disciplina"));
                
                Area area = new Area();
                
                area.setId(rs.getInt("id_area"));
                area.setNome(rs.getString("nome_area"));
                area.setDescricao(rs.getString("discricao_area"));
                
                dis.setArea(area);
                
                lista.add(dis);
            }
            
        }catch(SQLException e) {
            e.printStackTrace();
        }
        return lista;
        
    }
    
}
