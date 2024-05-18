package helpDesk.DAO;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import helpDesk.model.atendente;



public class atendenteDAO {
    
    private final Connection connection;
    
    public atendenteDAO(Connection connection){
        this.connection = connection;
    }

    public boolean existeNoBancoPorUsuarioESenha(atendente atendente) throws SQLException {
        String sql = "select * from atendente where atend_usuario = ? and atend_senha = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, atendente.getAtend_usuario());
        statement.setString(2, atendente.getAtend_senha());
        statement.execute();
        ResultSet resultSet = statement.getResultSet(); 
                
        return resultSet.next();
    }
}
