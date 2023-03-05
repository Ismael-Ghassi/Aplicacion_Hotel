/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bd;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ismael
 */
public class AccesoBD {
    ManejadorDB db;

    ResultSet rs;
    public AccesoBD(String bd) throws SQLException {
        this.db = new ManejadorDB(bd);
    }
    
    
    public void insertarReserva(String nombre,String dni,String conocimiento,String clase,int idHotel) throws SQLException{
        
        db.manipularTabla("INSERT INTO reservas (nombre, dni, encontrado, clase, id_hotel) VALUES ('"+nombre+"','"+dni+"','"+conocimiento+"','"+clase+"','"+idHotel+"')");
        db.cerrar();
        
        
    }
    
    
    
    
    public void borrarReserva(int id, String dni) throws SQLException{
        
        db.manipularTabla("DELETE FROM reservas WHERE id ='"+id+"' and dni='"+dni+"'");
        db.cerrar();
        
    }
    
    public void modificarReserva(int id, String nombre,String dni,String conocimiento,String clase) throws SQLException{
        
        db.manipularTabla("UPDATE reservas SET nombre = '"+nombre+"', dni = '"+dni+"', encontrado = '"+conocimiento+"', clase = '"+clase+"' "
                +"WHERE id = "+id);
        db.cerrar();
        
        
    }
}
