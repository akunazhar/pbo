package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class pengawas {
    private String database_name = "muhammadazharm.-2210010161";
    private String username = "root";
    private String password = "";
    public Connection koneksiDB; 

    public pengawas() {
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

    public void Simpan_pengawas(String user_name, String password, String email, int no_tlp, String jenis_kelamin, int bagian) {
        if (koneksiDB != null) {
            try {
                String sql = "INSERT INTO pengawas (user_name,  password, email,  no_tlp,  jenis_kelamin, bagian" +
") VALUES (?, ?, ?, ?, ?,?)";
                PreparedStatement perintah = koneksiDB.prepareStatement(sql);
                perintah.setString(1, user_name);
                perintah.setString(2, password);
                perintah.setString(3, email);
                perintah.setInt(4, no_tlp);
                perintah.setString(5, jenis_kelamin);
                perintah.setInt(6, bagian);
                perintah.executeUpdate();
                System.out.println("Berhasil Disimpan");
            } catch (SQLException e) {
                System.out.println("Gagal menyimpan: " + e.getMessage());
            }
        } else {
            System.out.println("Koneksi ke database belum diinisialisasi.");
        }
    }

    public void Ubah_login(String user_name, String password, String email, String no_tlp, String jenis_kelamin, String bagian) {
        if (koneksiDB != null) {
            try {
                String sql = "UPDATE login SET user_name=?,SET email=?, SET no_tlp=?, SET jenis_kelamin=?,SET bagian=? WHERE password=?";
                PreparedStatement perintah = koneksiDB.prepareStatement(sql);
                perintah.setString(1, user_name);
                perintah.setString(2, password);
                perintah.setString(3, email);
                perintah.setString(4, no_tlp);
                perintah.setString(5, jenis_kelamin);
                perintah.setString(6, bagian);
                perintah.executeUpdate();
                System.out.println("Berhasil Diubah");
            } catch (SQLException e) {
                System.out.println("Gagal mengubah: " + e.getMessage());
            }
        } else {
            System.out.println("Koneksi ke database belum diinisialisasi.");
        }
    }

    public void Hapus_pengawas(String user_name) {
        if (koneksiDB != null) {
            try {
                String sql = "DELETE FROM pengawas WHERE user_name=?";
                PreparedStatement perintah = koneksiDB.prepareStatement(sql);
                perintah.setString(1, user_name);
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