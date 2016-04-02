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
import java.util.*;
public class aplikasi {
    Scanner scan = new Scanner(System.in);
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
   public void menuadmin(){
       System.out.println("1. Login");
       System.out.println("2. Kembali");
       int pil = scan.nextInt();
       switch(pil){
           case 1:
           case 2:menudepan();
               break;
       }
   }
   public void menulogin(int i){
       
       if(i==1){
           System.out.println("no id  : ");
       }
           String id = scan.nextLine();
       if (i==1){
           if (id == null){
               menulogin(i);
           }
           else{
               if( this.getMahasiswa(id) != null){
               this.panelMahasiswa(this.getMahasiswa(id))
             }
           }
       }
       if(i==2){
           
       }
   }
   
   public void menudepan(){
       System.out.println("1. Menu Mahasiswa");
       System.out.println("2. Menu Admin");
       int pil = scan.nextInt();
       switch(pil){
           case 1:menumahasiswa();
                break;
           case 2:menuadmin();
               break;
       }
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
