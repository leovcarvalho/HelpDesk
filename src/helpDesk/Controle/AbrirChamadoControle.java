package helpDesk.Controle;

import helpDesk.view.AberturaChamadoView;
import helpDesk.DAO.AbrirChamado;
import helpDesk.DAO.ConecBanco;
import java.sql.Connection;
import java.sql.SQLException;

public class AbrirChamadoControle {
    
    public void novochamado (AberturaChamadoView view) throws SQLException{
        
        Connection conexao = new ConecBanco().getConnection();
        AbrirChamado abrir = new AbrirChamado();
        abrir.abrirChamado(1, Integer.parseInt(view.getjTextFieldCodPatrimônio().getText()), view.getjTextAreaTextChamado().getText());
    }
}
