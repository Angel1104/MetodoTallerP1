/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.sql.*;
/**
 *
 * @author Grupo 5
 */
public class ProveedorConecciones {
    public static Connection getConexion(){
         Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/controlHorario", "root", "");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }catch(Exception e1){
            System.out.println("Error: " + e1.getMessage());
        }
    return  con;
    }
    
}
