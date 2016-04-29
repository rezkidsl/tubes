/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package models;

/**
 *
 * @author JOKER
 */
import java.util.ArrayList;
import java.util.Collection;

public class Kelompok {
    private int idKelompok;
    private int idLokasiGladi;

    public Kelompok(int idLokasiGladi, int id) {
        this.idLokasiGladi = idLokasiGladi;
        this.idKelompok = id;
    }

    public int getIdKelompok() {
        return idKelompok;
    }

    public int getIdLokasiGladi() {
        return idLokasiGladi;
    }

    public void setIdKelompok(int idKelompok) {
        this.idKelompok = idKelompok;
    }

    public void setIdLokasiGladi(int idLokasiGladi) {
        this.idLokasiGladi = idLokasiGladi;
    }
    
}

