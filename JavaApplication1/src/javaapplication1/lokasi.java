/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author KARINA
 */
public class lokasi {
    public String namaLokasi;
    public int kuotaMax;
    public int kuotaTersedia;
    public pembimbing Pembimbing [] = new pembimbing[4];
    public kelompok Kelompok [] = new kelompok[10];

    public void setPembimbing(pembimbing[] Pembimbing) {
        this.Pembimbing = Pembimbing;
    }

    public void setNamaLokasi(String namaLokasi) {
        this.namaLokasi = namaLokasi;
    }

    public void setKuotaMax(int kuotaMax) {
        this.kuotaMax = kuotaMax;
    }

    public String getNamaLokasi() {
        return namaLokasi;
    }

    public int getKuotaMax() {
        return kuotaMax;
    }

    public void createkelompok(String nama){
        int i=0;
        Kelompok[i].namaKelompok = nama;
        i++;
    }
    public kelompok getKelompokbyIdx(int n){
        return Kelompok[n];
    }
    public void removekelompok(String name){
        for(int i=0; i < Kelompok.length; i++){
            if(Kelompok[i].namaKelompok == name){
                for(int j=i; j < Kelompok.length; j++){
                    Kelompok[j] = Kelompok[j+1];
                }
            }
        }
    }
  
    
}



























