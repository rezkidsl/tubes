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
public abstract class Orang {

    private String nama;
    private String noId;
    private String nohp;
    private String jabatan;
    
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNohp(String nohp) {
        this.nohp = nohp;
    }

    public Orang(String nama, String noId, String nohp, String jabatan) {
        this.nama = nama;
        this.noId = noId;
        this.nohp = nohp;
        this.jabatan = jabatan;
    }

    public String getNama() {
        return nama;
    }

    public String getNoId() {
        return noId;
    }

    public String getNohp() {
        return nohp;
    }

    public String getJabatan() {
        return jabatan;
    }

}

