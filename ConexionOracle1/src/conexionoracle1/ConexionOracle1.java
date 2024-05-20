package conexionoracle1;


import java.sql.*;


public class ConexionOracle1 {

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        
        
        try {
            connection = ConexionDB.getInstance().getConnection();
            if(connection != null){
                System.out.println("Conexion Exitosa....");
                
                
                statement = connection.createStatement();
                
                String query = "SELECT * FROM GENERO";
                resultSet = statement.executeQuery(query);
                
                //procesar los datos
                while(resultSet.next()){
                    System.out.println("Generos: ");
                    int idgenero = resultSet.getInt("ID_GENERO");
                    String nombreg = resultSet.getString("NOMBRE");
                    String fechaCreacion = resultSet.getString("FECHA_CREACION");
                    
                    System.out.println("ID: "+ idgenero + "");
                    System.out.println("Nombre del genero: " +nombreg + "");
                    System.out.println("Fecha creacion: " +fechaCreacion + "");
                    System.out.println("\n");
                }
                String query1 = "SELECT * FROM TURNO";
                resultSet = statement.executeQuery(query1);
                while(resultSet.next()){
                    System.out.println("Turnos: ");
                    int idturno = resultSet.getInt("ID_TURNO");
                    String IniHora = resultSet.getString("INICIO_HORARIO");
                    String FinHora  = resultSet.getString("FIN_HORARIO");
                    
                    System.out.println("ID: "+ idturno + "");
                    System.out.println("Inicio de horario: " +IniHora + "");
                    System.out.println("Fin horario: " +FinHora + "");
                    System.out.println("\n");
                }
                String query2 = "SELECT * FROM MET_PAGO";
                resultSet = statement.executeQuery(query2);
                while(resultSet.next()){
                    
                    int idPAGO = resultSet.getInt("ID_MET_PAGO");
                    String Nom_pago = resultSet.getString("NOM_PAGO");
                    String Tipo_pago  = resultSet.getString("TIPO_PAGO");
                    
                    System.out.println("ID: "+ idPAGO+ "");
                    System.out.println("Nombre del pago: " +Nom_pago + "");
                    System.out.println("Tipo de paSystem.out.println(\"Metodo de pago: \");go: " +Tipo_pago + "");
                    System.out.println("\n");
                }
                
                String query_3 = "SELECT * FROM PERSONA P\n" +
                "INNER JOIN GENERO G ON P.ID_GENERO = G.ID_GENERO";
                resultSet = statement.executeQuery(query_3);
                
                while (resultSet.next()) {
                    System.out.println("Persona: ");

                    int idPersona = resultSet.getInt("ID_PERSONA");
                    String nombre = resultSet.getString("NOMBRE");
                    String paterno = resultSet.getString("PATERNO");
                    String materno = resultSet.getString("MATERNO");
                    String fechaNaci = resultSet.getString("FECHA_NACI");
                    String direccion = resultSet.getString("DIRECCION");
                    String correo = resultSet.getString("CORREO");
                    String celular = resultSet.getString("CELULAR");
                    String idgenero = resultSet.getString("ID_GENERO");
                    
                    
                    System.out.println("LISTA DE PERSONA");
                    System.out.print("\n ID: " + idPersona + " ");
                    System.out.print("NOMBRE DE PERSONA: " + nombre + " ");
                    System.out.print("APELLIDO PATERNO: " + paterno + " ");
                    System.out.print("APELLIDO MATERNO: " + materno + " ");
                    System.out.print("FECHA DE NACIMIENTO: " + fechaNaci + " ");
                    System.out.print("DIRECCION: " + direccion + " ");
                    System.out.print("CORREO: " + correo + " ");
                    System.out.println("CELULAR: " + celular + " ");
                    System.out.println("GENERO: " + idgenero + " ");
                    System.out.println("\n");
                }
            }
        }catch (Exception ex){
            //System.out.println("Error SQL: " + 
              ex.printStackTrace();
            //+ ex.printStackTrace());
        }finally{
            try {
                     
                if (resultSet != null){
                    resultSet.close();
                 }
                if (statement != null){
                    statement.close();
                }
            }catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    } 
} 
