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
public class aplikasi {
    public int bykpembimbing=0;
    public int bykmhs=0;
    public int byklokasi;
    private pembimbing daftarPembimbing[] = new pembimbing[bykpembimbing];
    private mahasiswa daftarMahasiswa[] = new mahasiswa[bykmhs];
    private lokasi daftarLokasi[] = new lokasi[byklokasi];
    
    public void addPembimbing(pembimbing p){
        daftarPembimbing[bykpembimbing] = p;
        bykpembimbing++;
    }
    
    public void addMahasiswa(mahasiswa m){
        daftarMahasiswa[bykmhs] = m;
        bykmhs++;
    }
    
   public mahasiswa getMahasiswa(String nim){
        for(int y=0; y < daftarMahasiswa.length ;y++){
            if ( daftarMahasiswa[y].getId() == nim ){
                return daftarMahasiswa[y];
            }
        }
        return null;
   }
   public void deleteMahasiswa(String nim){
          for(int i=0; i < daftarMahasiswa.length; i++){
            if ( daftarMahasiswa[i].id == nim ){
                for (int j=i; j < daftarMahasiswa.length; j++){
                    daftarMahasiswa[j] = daftarMahasiswa[j+1];
                }
                bykmhs=bykmhs-1;
            }
        }
   }
   
   public void registarasi(){
       
   }
   public void loginmhs(){
       
   }
   public void loginadmin(){
       
   }
   public void lihatlokasi(){
       
   }
   public void inputgeladi(){
       
   }
   public void lihatgeladisaya(){
       
   }
   public void kelolapembimbing(){
       
   }
   public void addkelompok(){
       
   }
   public void editkelompok(){
       
   }
   public void logout(){
       
   }
   public void mainmenu(){
       
   }
}
