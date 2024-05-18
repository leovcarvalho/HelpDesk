package helpDesk.model;

public class Dados {

    public Dados(String fun_nome, String fun_email, String fun_telefone, String fun_senha) {
        this.fun_nome = fun_nome;
        this.fun_senha = fun_senha;
    }
    
    public Dados() {
    }

    private String fun_nome;
    private String fun_senha;

    public String getFun_nome() {
        return this.fun_nome;
    }

    public void setFun_nome(String fun_nome) {
        this.fun_nome = fun_nome;
    }

    public String getFun_senha() {
        return fun_senha;
    }

    public void setFun_senha(String fun_senha) {
        this.fun_senha = fun_senha;
    }

}
