package com.erik.pe.cnegocio;

import com.erik.pe.cmodelo.Genero;
import com.erik.pe.db.conexion;
import com.erik.pe.cdatosdao.GeneroDao;


import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JTable;
 

public class GeneroBO {
    private String mensaje = "";
    private Genero genero = new Genero();
    private GeneroDao generoDao = new GeneroDao();
    
    public String AgregarGenero (Genero genero) throws SQLException{
        Connection connection = conexion.getConnection();
        try{
            mensaje = generoDao.AgregarGenero(connection, genero);
        } catch (Exception e){
           connection.rollback();
        } finally{
            connection.close();
        }
        System.out.println(mensaje);       
        return mensaje;
    }
    
    public String ModificarGenero (Genero genero) throws SQLException{
       Connection connection = conexion.getConnection();
        try{
            mensaje = generoDao.ModificarGenero(connection, genero);
            connection.commit();
        } catch (Exception e){
           connection.rollback();
        } finally{
            connection.close();
        }
        System.out.println(mensaje);       
        return mensaje;
    }
    
    public String EliminarGenero (int id) throws SQLException{
      Connection connection = conexion.getConnection();
        try{
            mensaje = generoDao.EliminarGenero(connection, id);
            connection.commit();
        } catch (Exception e){
           connection.rollback();
        } finally{
            connection.close();
        }
        System.out.println(mensaje);       
        return mensaje;
    }
    
    public void ListarGenero(JTable table){
        Connection connection = conexion.getConnection();
        try{
            generoDao.ListarGenero(connection, table);
            connection.close();
        } catch (SQLException e){
            System.out.println("Error al listar genero"+ e.getMessage());
        } finally{
        }
        System.out.println(mensaje);       
        
    }
}
