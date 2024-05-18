package helpDesk.DAO;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import helpDesk.model.funcionario;


public class funcionarioDAO {
    
   private Connection connection;

    public boolean existeNoBancoPorUsuarioESenha(funcionario funcionario) throws SQLException {
        String sql = "select * from funcionario where fun_usuario = ? and fun_senha = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, funcionario.getFun_usuario());
        statement.setString(2, funcionario.getFun_senha());
        statement.execute();
        ResultSet resultSet = statement.getResultSet(); 
                
        return resultSet.next();
    }
        
    public void create(funcionario f) throws SQLException{
        
        Connection conexao = new ConecBanco().getConnection();
        PreparedStatement stmt = null;
                            
        
        try {
            stmt = conexao.prepareStatement("INSERT INTO funcionario(fun_usuario,fun_email,fun_telefone,fun_senha)VALUES(?,?,?,?)");
            stmt.setString(1, f.getFun_usuario());
            stmt.setString(2, f.getFun_email());
            stmt.setString(3, f.getFun_telefone());
            stmt.setString(4, f.getFun_senha());
            
            stmt.executeUpdate();
           
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar: " + ex);
        }
 
    }
    
        
    public List<funcionario> read() throws SQLException{
        
        Connection conexao = new ConecBanco().getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<funcionario> funcionarios = new ArrayList<>();
        
         try {
            stmt = conexao.prepareStatement("SELECT * FROM funcionario");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                funcionario func = new funcionario();
                
                func.setFun_id(rs.getInt("fun_id"));
                func.setFun_usuario(rs.getString("fun_usuario"));
                func.setFun_email(rs.getString("fun_email"));
                func.setFun_telefone(rs.getString("fun_telefone"));
                func.setFun_senha(rs.getString("fun_senha"));
                funcionarios.add(func);
                
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao exibir na tela: " + ex);
                
         }
        return  funcionarios;
    }
    
    public void update(funcionario f) throws SQLException{
        
        Connection conexao = new ConecBanco().getConnection();
        PreparedStatement stmt = null;
                            
        
        try {
            stmt = conexao.prepareStatement("UPDATE funcionario SET fun_usuario = ?,fun_email = ?,fun_telefone = ?, fun_senha = ? WHERE fun_id = ?");
            stmt.setString(1, f.getFun_usuario());
            stmt.setString(2, f.getFun_email());
            stmt.setString(3, f.getFun_telefone());
            stmt.setString(4, f.getFun_senha());
            stmt.setInt(5, f.getFun_id());
            
            stmt.executeUpdate();
           
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        }
 
    }
    
    public void delete(funcionario f) throws SQLException{
        
        Connection conexao = new ConecBanco().getConnection();
        PreparedStatement stmt = null;
                            
        
        try {
            stmt = conexao.prepareStatement("DELETE FROM funcionario WHERE fun_id = ?");
            stmt.setInt(1, f.getFun_id()); 
            
            stmt.executeUpdate();
           
            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        }
 
    }
    
}
