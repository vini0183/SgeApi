package conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
    
    public static final String url = "jdbc:mysql://localhost:3306/projeto_sge";
    public static final String user = "root";
    public static final String senha = "";
    
    public static Connection conectar() {
        Connection conexao = null;
        
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(url, user, senha);
            
        }catch(Exception e) {
            e.printStackTrace();
        }
        return conexao;
    }
}