/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erik.pe.cdatosdao;

import com.erik.pe.cmodelo.TipoDocumento;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;


/**
 *
 * @author HP SUPPORT
 */
public class TipoDocumentoDao {

    public ArrayList<TipoDocumento> listarTipoDocumento (Connection connection){
        ArrayList<TipoDocumento> listaDocumento = new ArrayList<>();
        Statement statement = null;
        ResultSet resultSet = null;
         
        String sql = "SELECT * FROM tipo_documento ";//+
                    //"ORDER BY id_tipodocumento DESC";
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                int idTipoDocumento = resultSet.getInt("id_tipodocumento");
                String nombre = resultSet.getString("nombre");
                TipoDocumento tipoDocumento = new TipoDocumento();
                tipoDocumento.setIdTipoDocumento(idTipoDocumento);
                tipoDocumento.setNombre(nombre);
                listaDocumento.add(tipoDocumento);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "no se pudo listar tipo documento"+e.getMessage());
        }
        return listaDocumento;
    }
}

