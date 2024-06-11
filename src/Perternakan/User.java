/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perternakan;

/**
 *
 * @author Asus
 */
public class User extends Ternak {
    String nama_user, password, nama, email, no_tlp, jenis_kelamin;

    // Constructor
    public User() {}
    public User(String nama_user, String password, String nama, String email, String no_tlp, String jenis_kelamin) {
        this.nama_user = nama_user;
        this.password = password;
        this.nama = nama;
        this.email = email;
        this.no_tlp = no_tlp;
        this.jenis_kelamin = jenis_kelamin;
    }

    // Getters
    public String getNama_user() {
        return nama_user;
    }

    public String getPassword() {
        return password;
    }

    public String getNama() {
        return nama;
    }

    public String getEmail() {
        return email;
    }

    public String getNo_tlp() {
        return no_tlp;
    }

    public String getJenis_kelamin() {
        return jenis_kelamin;
    }

    // Setters
    public void setNama_user(String nama_user) {
        this.nama_user = nama_user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNo_tlp(String no_tlp) {
        this.no_tlp = no_tlp;
    }

    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }
}
