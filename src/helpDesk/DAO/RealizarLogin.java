package helpDesk.DAO;

import helpDesk.view.MenuFuncionarioView;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import org.postgresql.core.BaseConnection;

public class RealizarLogin {
    
    public boolean realizarLogin(String fun_usuario, String fun_senha) throws SQLException{
        boolean teste = false;
        Connection conexao = new ConecBanco().getConnection();
        String sql = "Select fun_usuario, fun_senha from funcionario where fun_usuario = ? and fun_senha = ?;";
        PreparedStatement statment = conexao.prepareStatement(sql);
        statment.setString(1, fun_usuario);
        statment.setString(2, fun_senha);
        ResultSet rs = statment.executeQuery();
        if(rs.next()){
            MenuFuncionarioView telaDeMenu = new MenuFuncionarioView();
            telaDeMenu.setVisible(true);
            teste = true;
        }else{
            JOptionPane.showMessageDialog(null, "Usuário ou senha incorreto(s). Tente Novamente!");
        }
        return teste;
    }
    
    public void negar() throws SQLException{
        Connection conexão = new ConecBanco().getConnection();
        String sql = "update funcionario set fun_online = false;";
        PreparedStatement statment = conexão.prepareStatement(sql);
        ResultSet rs = statment.executeQuery();
    }
    
    public void ativar (String fun_usuario, String fun_senha) throws SQLException{
        Connection conexão = new ConecBanco().getConnection();
        String sql = "update funcionario set fun_online = true where fun_usuario = ? and fun_senha = ?;";
        PreparedStatement statment = conexão.prepareStatement(sql);
        statment.setString(1, fun_usuario);
        statment.setString(2, fun_senha);
        ResultSet rs = statment.executeQuery();
    }
    
}
