/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.conexionamysql;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author laura
 */
public class ConexionBd {
   
        private Connection conexion;
        public ConexionBd(){
            
            try {
                conexion=DriverManager.getConnection("jdbc:mysql://localhost/clase1","root","root");
                System.out.println("Conectado a la BD");
                
            } catch (Exception e) {
                System.out.println("ERROR DE CONEXION"+e);
                
            }
        }
            public Connection retornarConexion(){
            
            return conexion;
    }
    
}
