package com.example.application.data.entity;

import javax.persistence.Entity;

@Entity
public class Produk extends AbstractEntity{
    private  String namaProduk;
    private String namaKategori;
    private  byte[] Thumbnails;
    private  String Harga;
    private  String Terjual;
    private  String diBuat;
    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public String getNamaKategori() {
        return namaKategori;
    }

    public void setNamaKategori(String namaKategori) {
        this.namaKategori = namaKategori;
    }

    public byte[] getThumbnails() {
        return Thumbnails;
    }

    public void setThumbnails(byte[] thumbnails) {
        Thumbnails = thumbnails;
    }

    public String getHarga() {
        return Harga;
    }

    public void setHarga(String harga) {
        Harga = harga;
    }

    public String getTerjual() {
        return Terjual;
    }

    public void setTerjual(String terjual) {
        Terjual = terjual;
    }

    public String getDiBuat() {
        return diBuat;
    }

    public void setDiBuat(String diBuat) {
        this.diBuat = diBuat;
    }


}
