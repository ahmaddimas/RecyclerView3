package model;

import java.io.Serializable;

/**
 * Created by Ahmad Dimas Abid M on 03-Nov-16.
 */

public class Hotel implements Serializable {
    public String judul, deskripsi, detail, lokasi, foto;

    public Hotel(String judul, String deskripsi, String detail, String lokasi, String foto) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.detail = detail;
        this.lokasi = lokasi;
        this.foto = foto;
    }
}
