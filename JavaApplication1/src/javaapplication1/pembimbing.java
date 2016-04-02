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
public class pembimbing extends orang {

    public pembimbing(long no_hpDosen, String ruangDosen, String nama, String id, String email, int jenis_user) {
        super(nama, id, email, jenis_user);
        this.no_hpDosen = no_hpDosen;
        this.ruangDosen = ruangDosen;
    }
    
    public long no_hpDosen;
    public String ruangDosen;

    public void setNo_hpDosen(long no_hpDosen) {
        this.no_hpDosen = no_hpDosen;
    }

    public void setRuangDosen(String ruangDosen) {
        this.ruangDosen = ruangDosen;
    }
    
    
    
}
