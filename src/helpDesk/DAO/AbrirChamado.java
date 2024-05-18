package helpDesk.DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class AbrirChamado {
    
    public void abrirChamado(int fun_id, int pat_ID, String chamado_txt) throws SQLException{
        Connection conexao = new ConecBanco().getConnection();
        String sql = "insert into chamado (fun_id, pat_id, chamado_txt, chamado_dt_aber) values (?, ?, ?, CURRENT_TIMESTAMP);";
        PreparedStatement statment = conexao.prepareStatement(sql);
        statment.setInt(1, fun_id);
        statment.setInt(2, pat_ID);
        statment.setString(3, chamado_txt);
        statment.executeUpdate();
        statment.close();
    }
}