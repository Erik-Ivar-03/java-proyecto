package com.erik.pe.cnegocio;

import com.erik.pe.cdatosdao.TipoDocumentoDao;
import com.erik.pe.cmodelo.TipoDocumento;
import com.erik.pe.db.conexion;
import java.sql.Connection;
import java.util.ArrayList;

public class TipoDocumentoBO {
    
    TipoDocumentoDao tipoDocumentoDao = new TipoDocumentoDao();
    public ArrayList<TipoDocumento> listarTipoDocumento(){
        ArrayList<TipoDocumento> listaDocumento = new ArrayList<>();
         Connection connection = conexion.getConnection();
        try{
            listaDocumento = tipoDocumentoDao.listarTipoDocumento(connection);
            connection.close();
        } catch (Exception e){
            System.out.println("");
        }
        return listaDocumento;
        
    }

}
