/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login.Dal;

import java.sql.*;
/**
 *
 * @author 06929475157
 */
public class ModuloConexao {
    // metodo para conecçao com o b
    public static Connection conector(){
        java.sql.Connection conexao = null;
        // a linha a baixo chama o conector
        String driver = "com.mysql.jdbc.Driver";
        // armazem inf ref bank
        String url = "jdbc:mysql://localhost:3306/sistemaos";
        String user = "root";
        String password = "";
        // conexao com bd
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
       
    }
    
    
    
    
    
}
