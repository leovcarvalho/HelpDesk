package helpDesk.Principal;

import helpDesk.view.LoginFuncionarioView;

public class PaginaInicial {

    private String nome;
    private String senha;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public static void main(String args[]) {
        
        LoginFuncionarioView tela = new LoginFuncionarioView();
        
        tela.setVisible(true);
        
    }
    
}
