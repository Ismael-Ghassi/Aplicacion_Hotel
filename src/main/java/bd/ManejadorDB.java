/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bd;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ismael
 */
public class ManejadorDB {
    Connection conexion=null;
    private Statement sta;
    private Statement sta2;
    private ResultSet rs;
    private ResultSet rs2;
    
    public ManejadorDB(String baseDeDatos) throws SQLException{
        conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+baseDeDatos+"?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","root");
        sta=conexion.createStatement();
        sta2=conexion.createStatement();
        
    }
    
    
    public ResultSet consulta(String consulta) throws SQLException{
        rs = sta.executeQuery(consulta);      
        return rs;
    }
    
    public ResultSet consulta2(String consulta) throws SQLException{
        rs2 = sta2.executeQuery(consulta);      
        return rs2;
    }
    
    
    public void manipularTabla(String consulta) throws SQLException{
        sta.executeUpdate(consulta);
    }
    
    
    public void cerrarTodo() throws SQLException{
        sta.close();
        rs.close();
        conexion.close();
    }
    
    public void cerrar() throws SQLException{
        sta.close();
        conexion.close();
    }
    
}
