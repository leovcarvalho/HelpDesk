package helpDesk.model;

public class atendente {
    
    private String atend_usuario;
    private String atend_senha;

    public atendente(String atend_usuario, String atend_senha) {
        this.atend_usuario = atend_usuario;
        this.atend_senha = atend_senha;
    }

    public String getAtend_usuario() {
        return atend_usuario;
    }

    public void setAtend_usuario(String atend_usuario) {
        this.atend_usuario = atend_usuario;
    }

    public String getAtend_senha() {
        return atend_senha;
    }

    public void setAtend_senha(String atend_senha) {
        this.atend_senha = atend_senha;
    }

    
    
    
    
}
