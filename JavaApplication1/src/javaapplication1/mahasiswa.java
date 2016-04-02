/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

/**
 *
 * @author JOKER
 */
public class mahasiswa extends orang{
   public String kelasMhs;
   public String jurusanMhs;
   public long no_hpMhs;

    public mahasiswa(String kelasMhs, String jurusanMhs, long no_hpMhs, String nama, String id, String email, int jenis_user) {
        super(nama, id, email, jenis_user);
        this.kelasMhs = kelasMhs;
        this.jurusanMhs = jurusanMhs;
        this.no_hpMhs = no_hpMhs;
    }
      
    public void setKelasMhs(String kelasMhs) {
        this.kelasMhs = kelasMhs;
    }

    public void setJurusanMhs(String jurusanMhs) {
        this.jurusanMhs = jurusanMhs;
    }


    public void setNo_hpMhs(long no_hpMhs) {
        this.no_hpMhs = no_hpMhs;
    }

    public String getKelasMhs() {
        return kelasMhs;
    }

    public String getJurusanMhs() {
        return jurusanMhs;
    }


    public long getNo_hpMhs() {
        return no_hpMhs;
    }
   
   
    
}
