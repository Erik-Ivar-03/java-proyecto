package com.erik.pe.cdatosdao;

import java.sql.PreparedStatement;
import java.sql.Connection;

import com.erik.pe.cmodelo.Genero;
import javax.swing.JTable;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GeneroDao {
    private String mensaje = "";
        
    public String AgregarGenero (Connection connection, Genero genero){
        PreparedStatement ps = null;
        String query ="INSERT INTO  GENERO (nombre, estado, sigla, codigo)\n" +
                      "VALUES (?,?,?,?)";
        
        try{
            ps = connection.prepareStatement(query);
            ps.setString(1, genero.getNombre());
            ps.setString(2, genero.getEstado());
            ps.setString(3, genero.getSigla());
            ps.setString(4, genero.getCodigo());
            mensaje = "se inserto correctamente";
            ps.execute();
            ps.close();
        } catch (Exception e){
            mensaje = "No se guardo correctamente" +e.getMessage();
        }
        return mensaje;
    }
    
    public String ModificarGenero (Connection connection,Genero genero){
        PreparedStatement ps = null;
        String query ="UPDATE genero " + 
                "SET nombre = ?, estado=?, sigla=?, codigo=?  \n" +
                "WHERE ID_GENERO = ?";
        
        try{
            ps = connection.prepareStatement(query);
            ps.setString(1, genero.getNombre());
            ps.setString(2, genero.getEstado());
            ps.setString(3, genero.getSigla());
            ps.setString(4, genero.getCodigo());
            ps.setInt(5, genero.getIdGenero());
            mensaje = "Se Modifico correctamente";
      
            ps.execute();
            ps.close();
        } catch (Exception e){
            mensaje = "No se modificó correctamente" +e.getMessage();
        }
        return mensaje;
    }
    
    public String EliminarGenero (Connection connection,int id){
                PreparedStatement ps = null;
        String query ="DELETE FROM genero WHERE id_genero = ?";
        
        try{
            ps = connection.prepareStatement(query);
            ps.setInt(1, id);
            mensaje = "Se Modifico correctamente";
      
            ps.execute();
            ps.close();
        } catch (Exception e){
            mensaje = "No se modificó correctamente" +e.getMessage();
        }
        return mensaje;
    }
    
    public void ListarGenero(Connection connection, JTable jTable){
        Statement statement = null;
        ResultSet resultSet = null;
        DefaultTableModel model;
        
        String[] columnas = {"ID", "NOMBRE", "ESTADO", "SIGLA", "CODIGO"};
        model = new DefaultTableModel(null, columnas);
        
        String sql = "SELECT * FROM genero "+
                    "ORDER BY id_genero DESC";
        
        String[] datosGenero = new String[5];
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            
            while(resultSet.next()){
                datosGenero[0] = resultSet.getInt("id_genero")+"";
                datosGenero[1] = resultSet.getString("nombre");
                datosGenero[2] = resultSet.getString("estado");
                datosGenero[3] = resultSet.getString("sigla");
                datosGenero[4] = resultSet.getString("codigo");
                model.addRow(datosGenero);
                
            }
            jTable.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "no se pudo mostrar la tabla");
        }
        
    }
}
