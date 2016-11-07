package model;

import android.graphics.drawable.Drawable;

/**
 * Created by Ahmad Dimas Abid M on 03-Nov-16.
 */

public class Hotel {
    public String judul, deskripsi;
    public Drawable foto;

    public Hotel(String judul, String deskripsi, Drawable foto) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.foto = foto;
    }
}
