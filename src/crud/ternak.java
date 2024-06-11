package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ternak {
    private String database_name = "muhammadazharm.-2210010161";
    private String username = "root";
    private String password = "";
    public Connection koneksiDB; 

    public ternak() {
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

    public void Simpan_ternak(String jenis, int berat, String nama_pemilik, String Alamat, String prestasi, String qr_code) {
        if (koneksiDB != null) {
            try {
                String sql = "INSERT INTO ternak (jenis, berat, nama_pemilik, Alamat, prestasi, qr_code" +
") VALUES (?, ?, ?, ?, ?,?)";
                PreparedStatement perintah = koneksiDB.prepareStatement(sql);
                perintah.setString(1, jenis);
                perintah.setInt(2, berat);
                perintah.setString(3, nama_pemilik);
                perintah.setString(4, Alamat);
                perintah.setString(5, prestasi);
                perintah.setString(6, qr_code);
                perintah.executeUpdate();
                System.out.println("Berhasil Disimpan");
            } catch (SQLException e) {
                System.out.println("Gagal menyimpan: " + e.getMessage());
            }
        } else {
            System.out.println("Koneksi ke database belum diinisialisasi.");
        }
    }

    public void Ubah_ternak(String jenis, int berat, String nama_pemilik, String alamat, String prestasi, String qr_code) {
        if (koneksiDB != null) {
            try {
                String sql = "UPDATE ternak SET berat=?, nama_pemilik=?, alamat=?, prestasi=?, qr_code=? WHERE jenis=?";
                PreparedStatement perintah = koneksiDB.prepareStatement(sql);
                perintah.setString(1, jenis);
                perintah.setInt(2, berat);
                perintah.setString(3, nama_pemilik);
                perintah.setString(4, alamat);
                perintah.setString(5, prestasi);
                perintah.setString(6, qr_code);
                perintah.executeUpdate();
                System.out.println("Berhasil Diubah");
            } catch (SQLException e) {
                System.out.println("Gagal mengubah: " + e.getMessage());
            }
        } else {
            System.out.println("Koneksi ke database belum diinisialisasi.");
        }
    }

    public void Hapus_ternak(String nama_pemilik) {
        if (koneksiDB != null) {
            try {
                String sql = "DELETE FROM ternak WHERE nama_pemilik=?";
                PreparedStatement perintah = koneksiDB.prepareStatement(sql);
                perintah.setString(1, nama_pemilik);
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