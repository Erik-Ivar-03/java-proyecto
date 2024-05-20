package conexionoracle1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
        
public class ConexionDB {
    private static ConexionDB instancia;
    //Constructor de la clase
    private Connection connection;
    
    
    private ConexionDB(){
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            //Credenciales
            String dbUrl = "jdbc:oracle:thin:USUARIO_JUGUETERIA/123456@localhost:1521:xe";
            connection = DriverManager.getConnection(dbUrl);
                    
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Error no se puede conectar a la BD");
            
        }
    }
    
    public static ConexionDB getInstance(){
        if (instancia == null){
            instancia = new ConexionDB();   
        }
        return instancia;
    }
    
    public Connection getConnection(){
        return connection;
    }
}
