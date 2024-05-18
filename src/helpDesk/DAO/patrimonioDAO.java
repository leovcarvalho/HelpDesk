package helpDesk.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import helpDesk.model.Patrimonio;


public class patrimonioDAO {
    
    public void create(Patrimonio p) throws SQLException{
        
        Connection conexao = new ConecBanco().getConnection();
        PreparedStatement stmt = null;
                            
        
        try {
            stmt = conexao.prepareStatement("INSERT INTO patrimonio(fun_id, pat_nome,pat_preco)VALUES(?,?,?)");
            stmt.setInt(1, p.getFun_id());
            stmt.setString(2, p.getPat_nome());
            stmt.setDouble(3, p.getPat_preco());
            
            stmt.executeUpdate();
           
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar: " + ex);
        }
    
    }
    
    public List<Patrimonio> read() throws SQLException{
        
        Connection conexao = new ConecBanco().getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Patrimonio> patrimonios = new ArrayList<>();
        
         try {
            stmt = conexao.prepareStatement("SELECT * FROM patrimonio");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Patrimonio pat = new Patrimonio();
                
                pat.setFun_id(rs.getInt("fun_id"));
                pat.setPat_id(rs.getInt("pat_id"));
                pat.setPat_nome(rs.getString("pat_nome"));
                pat.setPat_preco(rs.getDouble("pat_preco"));
                patrimonios.add(pat);         
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao exibir na tela: " + ex);
         }
        return  patrimonios;
    }
    
    public void update(Patrimonio p) throws SQLException{
        
        Connection conexao = new ConecBanco().getConnection();
        PreparedStatement stmt = null;
                            
        
        try {
            stmt = conexao.prepareStatement("UPDATE patrimonio SET pat_nome = ?,pat_preco = ? WHERE pat_id = ?");
            stmt.setString(1, p.getPat_nome());
            stmt.setDouble(2, p.getPat_preco());
            stmt.setInt(3, p.getPat_id());
            
            stmt.executeUpdate();
           
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        }
    
    }
    
    public void delete(Patrimonio p) throws SQLException{
        
        Connection conexao = new ConecBanco().getConnection();
        PreparedStatement stmt = null;
                            
        
        try {
            stmt = conexao.prepareStatement("DELETE FROM patrimonio WHERE pat_id = ?");
            stmt.setInt(1, p.getPat_id()); 
            
            stmt.executeUpdate();
           
            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        }
 
    }
}
