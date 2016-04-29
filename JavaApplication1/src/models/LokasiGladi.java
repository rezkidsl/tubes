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
import java.util.Collection;

public class LokasiGladi {
    private String kota;
    private int id;
    private int kuota;
    private String nama;

    public void setKota(String kota) {
        this.kota = kota;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getKuota() {
        return kuota;
    }

    public String getKota() {
        return kota;
    }

    public int getId() {
        return id;
    }

    public LokasiGladi(String kota, int id, int kuota, String nama) {
        this.kota = kota;
        this.id = id;
        this.kuota = kuota;
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setKuota(int kuota) {
        this.kuota = kuota;
    }
}

