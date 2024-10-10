package model.dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.bean.Alunos;

public class AlunosDAO {
    
    public List<Alunos> lerAlunos() {
        List<Alunos> listalunos = new ArrayList();
        
        try {
            
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            stmt = conexao.prepareStatement("select * from alunos");
            rs = stmt.executeQuery();
            
            while(rs.next()) {
                
                Alunos alunos = new Alunos();
                
                alunos.setId_alunos(rs.getInt("id_alunos"));
                alunos.setNome(rs.getString("nome"));
                alunos.setSobrenome(rs.getString("sobrenome"));
                alunos.setCpf(rs.getString("cpf"));
                alunos.setImagem(rs.getString("imagem"));
                
                listalunos.add(alunos);
                
            }
            
        }catch(Exception e) {
            e.printStackTrace();
        }
        
        return listalunos;
    }
    
}
