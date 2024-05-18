package helpDesk.DAO;

import helpDesk.model.Patrimonio;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ExibirPatrimonios {
    
    public List<Patrimonio> read() throws SQLException{

        Connection conexao = new ConecBanco().getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Patrimonio> patlist = new ArrayList<>();
        
         try {
            stmt = conexao.prepareStatement("select pat_id, pat_nome, pat_preco from patrimonio C inner join funcionario A on (c.fun_id = a.fun_id) where fun_online = true;");
            rs = stmt.executeQuery();

            while(rs.next()){
                Patrimonio pat = new Patrimonio();

                pat.setPat_id(rs.getInt("pat_id"));
                pat.setPat_nome(rs.getString("pat_nome"));
                pat.setPat_preco(rs.getInt("pat_preco"));
                patlist.add(pat);

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao exibir na tela: " + ex);
        }
        return  patlist;
    }
    
}
