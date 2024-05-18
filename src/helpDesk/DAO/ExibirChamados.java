package helpDesk.DAO;

import helpDesk.model.Chamado;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ExibirChamados {
    
    public List<Chamado> read() throws SQLException{

        Connection conexao = new ConecBanco().getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Chamado> patlist = new ArrayList<>();
         try {
            stmt = conexao.prepareStatement("select * from chamado;");
            rs = stmt.executeQuery();

            while(rs.next()){
                Chamado chamado = new Chamado();

                chamado.setPatId(rs.getInt("pat_id"));
                chamado.setFunId(rs.getInt("fun_id"));
                chamado.setTexto(rs.getString("chamado_txt"));
                chamado.setData(rs.getString("chamado_dt_aber"));
                patlist.add(chamado);

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao exibir na tela: " + ex);
        }
        return  patlist;
    }
    
}
