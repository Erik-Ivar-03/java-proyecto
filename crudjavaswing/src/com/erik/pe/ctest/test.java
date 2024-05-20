package com.erik.pe.ctest;
import com.erik.pe.cmodelo.Genero;
import com.erik.pe.cnegocio.GeneroBO;
import java.sql.SQLException;


public class test {
    GeneroBO generoBO = new GeneroBO();
    Genero genero = new Genero();
    
    public void insertar() throws SQLException{
        genero.setNombre("Erik");
        genero.setEstado("1");
        genero.setSigla("E");
        genero.setCodigo("E");
        
        generoBO.AgregarGenero(genero);
    }
    
    public void modificar()throws SQLException{
        genero.setIdGenero(22);
        genero.setNombre("Erik 1");
        genero.setEstado("0");
        genero.setSigla("e");
        genero.setCodigo("e");
        //genero.setIdGenero(22);
        
        generoBO.ModificarGenero(genero);
    }
    
    public void Eliminar () throws SQLException{
        generoBO.EliminarGenero(22);
    }
    
    public static void main(String[] args) throws SQLException {
        test t = new test();
       // t.insertar();
       // t.modificar();
       t.Eliminar();
    }
}
