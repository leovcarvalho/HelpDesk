package helpDesk.Controle;

import java.sql.Connection;
import helpDesk.DAO.ConecBanco;
import helpDesk.DAO.atendenteDAO;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import helpDesk.model.atendente;
import helpDesk.view.LoginAtendenteView;
import helpDesk.view.MenuAtendenteView;

public class atendenteController {
    
    private LoginAtendenteView view;

    public atendenteController(LoginAtendenteView view) {
        this.view = view;
    }
      
    public void autenticar() throws SQLException {
        
        //Buscar um Uuario da view
        String usuario = view.getjTextFieldLogin().getText();
        String senha = view.getjPasswordFieldSenha().getText();
        
        atendente atendenteAutenticar = new atendente(usuario, senha);
        //Verificar se existe no banco de dados
        Connection conexao = new ConecBanco().getConnection();
        atendenteDAO atendenteDao = new atendenteDAO(conexao);
        
        boolean existe = atendenteDao.existeNoBancoPorUsuarioESenha(atendenteAutenticar);
        
        //Se existir direciona para menu
        if(existe){
            MenuAtendenteView menuAtendente = new MenuAtendenteView();
            menuAtendente.setVisible(true);
            view.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(view, "Usuario ou Senha invalidos");
        }
    }
}
