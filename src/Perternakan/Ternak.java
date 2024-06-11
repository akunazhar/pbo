/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perternakan;

/**
 *
 * @author Asus
 */
public class Ternak {
    String jenis, berat,pemilik, prestasi ;
    int namaJenis, beratTernak,namaPemilik, PrestasiTernak;

    public Ternak() {}

    public void namaJenis(String nama) {
        this.jenis = nama;
    }

    public int namaJenis() {
        this.namaJenis = 0;
        if (this.jenis.equals("1")) {
            this.namaJenis = 1; 
        } else if (this.jenis.equals("2")) {
            this.namaJenis = 2; 
        } else {
            this.namaJenis = 3; 
        }
        return this.namaJenis;
    }

    public void beratTernak(String ternak) {
        this.berat = ternak;
    }

    public int beratTernak() {
        this.beratTernak = 0;
        if (this.berat.equals("1")) {
            this.beratTernak= 400;
        } else if (this.berat.equals("2")) {
            this.beratTernak = 450;
        } else {
            this.beratTernak = 500;
        }
        return this.beratTernak;
    }

    public void namapemilik(String pemilik) {
        this.pemilik = pemilik;
    }

    public int namaPemilik() {
        this.namaPemilik = 0;
        if (this.pemilik.equals("1")) {
            this.namaPemilik = 1;
        } else if (this.pemilik.equals("2")) {
            this.namaPemilik = 2;
        } else {
            this.namaPemilik = 3;
        }
        return this.namaPemilik;
    }
    
    
    public void PrestasiTernak(String prestasi) {
        this.prestasi = prestasi;
    }

    public int PrestasiTernak() {
        this.PrestasiTernak = 0;
        if (this.prestasi.equals("1")) {
            this.PrestasiTernak = 1;
        } else if (this.prestasi.equals("2")) {
            this.PrestasiTernak = 2;
        } else {
            this.PrestasiTernak = 3;
        }
        return this.PrestasiTernak;
    }
    public String getNamajenisString() {
        switch (this.namaJenis) {
            case 1:
                return "SAPI";
            case 2:
                return "KAMBING";
            case 3:
                return "DOMBA";
            default:
                return "Unknown";
        }
    }
    public String getnamaPemilikString() {
        switch (this.namaPemilik) {
            case 1:
                return "AZHAR";
            case 2:
                return "HUDA";
            case 3:
                return "RIFKY";
            default:
                return "Unknown";
        }
    }
    public String getPrestasiTernakString() {
        switch (this.PrestasiTernak) {
            case 1:
                return "PRODUKTIFVITAS TINGGI";
            case 2:
                return "KUALITAS DAGING";
            case 3:
                return "EPISIENSI PANGAN";
            default:
                return "Unknown";
        }
    }

//    public static void main(String[] args) {
//        Ternak Ternak = new Ternak();
//        Ternak.beratTernak("1");
//        Ternak.namaJenis("1");
//        Ternak.namaJenis(); // Pastikan ini dipanggil untuk mengatur namaBarang
//        Ternak.namapemilik("1");
//        Ternak.namaPemilik();
//        Ternak.PrestasiTernak("1");
//        Ternak.PrestasiTernak();
//
//        System.out.println("Nama Jenis: " + Ternak.getNamajenisString());
//        System.out.println("Nama pemilik: " + Ternak.getnamaPemilikString());
//        System.out.println("Prestasi Ternak: " + Ternak.getPrestasiTernakString());
    }


