package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class User {
    private String database_name = "muhammadazharm.-2210010161";
    private String username = "root";
    private String password = "";
    public Connection koneksiDB; 

    public User() {
        try {
            String lokasi = "jdbc:mysql://localhost:3306/" + database_name;
            Class.forName("com.mysql.cj.jdbc.Driver");
            koneksiDB = DriverManager.getConnection(lokasi, username, password);
            System.out.println("Database Terkoneksi");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver tidak ditemukan: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Koneksi gagal: " + e.getMessage());
        }
    }

    public void Simpan_User(String name_user, String password, String nama, String email, int no_tlp, String jenis_kelamin) {
        if (koneksiDB != null) {
            try {
                String sql = "INSERT INTO User (name_user, password, nama, email, no_tlp, jenis_kelamin" +
") VALUES (?, ?, ?, ?, ?,?)";
                PreparedStatement perintah = koneksiDB.prepareStatement(sql);
               perintah.setString(1, name_user);
                perintah.setString(2, password);
                perintah.setString(3, nama);
                perintah.setString(4, email);
                perintah.setInt(5, no_tlp);
                perintah.setString(6, jenis_kelamin);
                perintah.executeUpdate();
                System.out.println("Berhasil Disimpan");
            } catch (SQLException e) {
                System.out.println("Gagal menyimpan: " + e.getMessage());
            }
        } else {
            System.out.println("Koneksi ke database belum diinisialisasi.");
        }
    }
public void Ubah_User(String name_user, String password, String nama, String email, int no_tlp, String jenis_kelamin) {
    if (koneksiDB != null) {
        try {
            String sql = "UPDATE User SET password=?, nama=?, email=?, no_tlp=?, jenis_kelamin=? WHERE name_user=?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setString(1, password);
            perintah.setString(2, nama);
            perintah.setString(3, email);
            perintah.setInt(4, no_tlp);
            perintah.setString(5, jenis_kelamin);
            perintah.setString(6, name_user);
            perintah.executeUpdate();
            System.out.println("Berhasil Diubah");
        } catch (SQLException e) {
            System.out.println("Gagal mengubah: " + e.getMessage());
        }
    } else {
        System.out.println("Koneksi ke database belum diinisialisasi.");
    }
}


    public void Hapus_User(String name_user) {
        if (koneksiDB != null) {
            try {
                String sql = "DELETE FROM User WHERE name_user=?";
                PreparedStatement perintah = koneksiDB.prepareStatement(sql);
                perintah.setString(1, name_user);
                perintah.executeUpdate();
                System.out.println("Berhasil Dihapus");
            } catch (SQLException e) {
                System.out.println("Gagal menghapus: " + e.getMessage());
            }
        } else {
            System.out.println("Koneksi ke database belum diinisialisasi.");
        }
    }
}