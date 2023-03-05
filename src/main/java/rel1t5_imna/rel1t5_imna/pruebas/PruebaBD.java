/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rel1t5_imna.rel1t5_imna.pruebas;

import bd.ManejadorDB;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class PruebaBD {
    
    public int prueba_1(String nombre) throws SQLException{
        ManejadorDB bd = new ManejadorDB("hotel_interfaces");
        ResultSet rs = bd.consulta("SELECT id FROM hoteles WHERE nombre = '"+nombre+"'");
        int num=0;
        while(rs.next()){
            num++;
        }
        return num;
        
    }
    
}
