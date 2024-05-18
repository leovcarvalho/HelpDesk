package helpDesk.Controle;

import helpDesk.view.LoginFuncionarioView;
import helpDesk.DAO.RealizarLogin;
import helpDesk.DAO.ConecBanco;
import java.sql.Connection;
import java.sql.SQLException;

public class LoginControle {
    
    private String nome;
    private String senha;

    public String getNome() {
        return nome;
    }

    public void setNome(String login) {
        this.nome = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    public void login (LoginFuncionarioView view) throws SQLException{
        
        Connection conexao = new ConecBanco().getConnection();
        RealizarLogin login = new RealizarLogin();
        boolean teste = login.realizarLogin(view.getjTextFieldFuncNome().getText(), view.getjPasswordFieldSenha().getText());
        if(teste){
           view.setVisible(false); 
        }
        this.nome = view.getjTextFieldFuncNome().getText();
        this.senha = view.getjPasswordFieldSenha().getText();
    }
}