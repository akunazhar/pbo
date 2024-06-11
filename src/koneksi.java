/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Asus
 */
public class koneksi {
    private String database_name = "2210010161_muhammadazharm_penjualan";
    private String username = "root";
    private String password = "";
    public Connection koneksiDB;
    
    public koneksi(){
    
        try {
            String lokasi = "jdbc;mysql;//localhost/" + database_name;
            Class.forName("com.mysql.jdbc.Driver");
            koneksiDB = DriverManager.getConnection(lokasi, username, password);
            
            System.out.println("Database Terkoneksi");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }   
}
