package helpDesk.Controle;

import helpDesk.view.LoginFuncionarioView;
import java.sql.SQLException;
import java.sql.Connection;
import helpDesk.DAO.ConecBanco;
import helpDesk.DAO.funcionarioDAO;
import javax.swing.JOptionPane;
import helpDesk.model.funcionario;
import helpDesk.view.MenuFuncionarioView;

public class funcionarioController {
    
    private LoginFuncionarioView view;

    public funcionarioController(LoginFuncionarioView view) {
        this.view = view;
    }
      
    public void autenticar() throws SQLException {
        
        //Buscar um Uuario da view
        String usuario = view.getjTextFieldFuncNome().getText();
        String senha = view.getjPasswordFieldSenha().getText();
        
        funcionario funcionarioAutenticar = new funcionario(usuario, senha);
        //Verificar se existe no banco de dados
        Connection conexao = new ConecBanco().getConnection();
        funcionarioDAO funcionarioDao = new funcionarioDAO();
        
        boolean existe = funcionarioDao.existeNoBancoPorUsuarioESenha(funcionarioAutenticar);
        
        //Se existir direciona para menu
        if(existe){
            MenuFuncionarioView menuFuncionario = new MenuFuncionarioView();
            menuFuncionario.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(view, "Usuario ou Senha invalidos");
        }
 
    }

}
