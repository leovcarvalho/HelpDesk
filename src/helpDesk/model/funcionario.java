package helpDesk.model;

public class funcionario {
    
    private int fun_id;
    private String fun_usuario;
    private String fun_email;
    private String fun_senha;
    private String fun_telefone;
    private String fun_ativo;

     public funcionario(){
         
     }
     
     public funcionario(String fun_usuario, String fun_senha){
        this.fun_usuario = fun_usuario; 
        this.fun_senha = fun_senha;
     }
    
    public funcionario(int fun_id, String fun_usuario, String fun_email, String fun_senha, String fun_telefone, String fun_ativo) {
        this.fun_id = fun_id;
        this.fun_usuario = fun_usuario;
        this.fun_email = fun_email;
        this.fun_senha = fun_senha;
        this.fun_telefone = fun_telefone;
        this.fun_ativo = fun_ativo;
    }

    public int getFun_id() {
        return fun_id;
    }

    public void setFun_id(int fun_id) {
        this.fun_id = fun_id;
    }

    public String getFun_usuario() {
        return fun_usuario;
    }

    public void setFun_usuario(String fun_usuario) {
        this.fun_usuario = fun_usuario;
    }

    public String getFun_email() {
        return fun_email;
    }

    public void setFun_email(String fun_email) {
        this.fun_email = fun_email;
    }

    public String getFun_senha() {
        return fun_senha;
    }

    public void setFun_senha(String fun_senha) {
        this.fun_senha = fun_senha;
    }

    public String getFun_telefone() {
        return fun_telefone;
    }

    public void setFun_telefone(String fun_telefone) {
        this.fun_telefone = fun_telefone;
    }

    public String getFun_ativo() {
        return fun_ativo;
    }

    public void setFun_ativo(String fun_ativo) {
        this.fun_ativo = fun_ativo;
    }
  
    
    
}
