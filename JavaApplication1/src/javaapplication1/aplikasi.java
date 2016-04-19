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
    public int byklokasi=0;
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
    public lokasi carilokasi(String nama){
        for (int i=0; i < byklokasi; i++){
            if (daftarLokasi[i].namaLokasi == nama){
                return daftarLokasi[i];
            }
            else
                System.out.println("tidka ditemukan");
        }
        return null;
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
           case 1:menulogin(2);
           case 2:menudepan();
               break;
       }
   }
   public void menumahasiswa(){
       System.out.println("1. Login");
       System.out.println("2. Kembali");
       System.out.print("pilihan : ");
       int pil = scan.nextInt();
       switch(pil){
           case 1:menulogin(1);
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
          System.out.println("password : ");
          }
       String pass = scan.nextLine();
        
       if(i==2){
           if(pass == null){
               menulogin(i);
           }
           else{
               if(pass == "admin123"){
                  paneladmin();
               }
           }
       }
   }
       
       
   
   public void menudepan(){
       System.out.println("1. Menu Mahasiswa");
       System.out.println("2. Menu Admin");
       System.out.print("pilihan : ");
       int pil = scan.nextInt();
       switch(pil){
           case 1:menumahasiswa();
                break;
           case 2:menuadmin();
               break;
       }
   }
   public void paneladmin(){
       System.out.println("1. lihat lokasi");
       System.out.println("2. kelola kelompok");
       System.out.println("3. kelola pembimbing");
       System.out.println("4. logout");
       System.out.print("pilihan : ");
       int pil = scan.nextInt();
       switch(pil){
           case 1:lihatlokasi();
               break;
           case 2:kelolakelompok();
               break;
           case 3:kelolapembimbing();
               break;
           case 4:menudepan();
       }
   }
   public void lihatlokasi(){
       System.out.println("1. lihat lokasi");
       System.out.println("2. kembali");
       System.out.print("pilihan : ");
       int pil = scan.nextInt();
       switch(pil){
           case 1: for(int i=0; i < byklokasi; i++){
                        System.out.println(i+1+". "+daftarLokasi[i].getNamaLokasi());
                       
                    }
                    System.out.println("kembali ?(Y)");
                    String back = scan.nextLine();
                    if (back == "Y"){
                        lihatlokasi();
                    }
                   
                    break;
           case 2: paneladmin();
                    break;
       }
   }
   public void kelolakelompok(){
       System.out.println("1. lihat kelompok");
       System.out.println("2. tambah kelompok");
       System.out.println("3. kelola kelompok");
       System.out.println("4. kembali");
       System.out.print("pilihan : ");
       int pil = scan.nextInt();
       switch(pil){
           case 1: lihatkelompok();
               break;
           case 2: tambahkelompok();
               break;
           case 3: kelola();
               break;
       }
   }
   public void lihatkelompok(){
       System.out.println("masukan nama lokasi : ");
       String nama = scan.nextLine();
       for(int i=0; i < carilokasi(nama).Kelompok.length; i++){
           System.out.println("kelompok "+i+1+" : "+carilokasi(nama).Kelompok[i].namaKelompok);
            for(int j=0; j < carilokasi(nama).Kelompok[i].anggota.length;j++){
            System.out.println(carilokasi(nama).Kelompok[i].anggota[j].nama);
            }
       }
       System.out.println("kembali? (Y) ");
       String back = scan.nextLine();
       if(back == "Y"){
           kelolakelompok();
       }
   }
   public void tambahkelompok(){
       System.out.println("masukan nama lokasi : ");
       String nama = scan.nextLine();
       for (int i=0; i < byklokasi; i++){
            if (daftarLokasi[i].namaLokasi == nama){
                System.out.println("tambah kelompok di "+nama);
                System.out.println("masukan nama kelompok : ");
                daftarLokasi[i].createkelompok(nama);
                System.out.println("berhasil ditambahkan");
              
            }
       }
       System.out.println("kembali? (Y) ");
       String back = scan.nextLine();
       if(back == "Y"){
           kelolakelompok();
       }
   }
   public void kelola(){
       System.out.println("masukan nama lokasi : ");
       String nama = scan.nextLine();
       for (int i=0; i < byklokasi; i++){
            if (daftarLokasi[i].namaLokasi == nama){
               System.out.println("masukan nama kelompok : ");
               String namakel = scan.nextLine(); 
               for(int j=0; j < daftarLokasi[i].Kelompok.length; j++){
                   if(daftarLokasi[i].Kelompok[j].namaKelompok == namakel){
                       System.out.println("1. tambah anggota");
                       System.out.println("2. hapus anggota");
                       System.out.println("3. kembali");
                       System.out.print("pilihan : ");
                       int pil = scan.nextInt();
                       switch(pil){
                           case 1: System.out.println("tambah anggota");
                                   System.out.print(" masukan id mahasiswa : ");
                                   String id = scan.nextLine();
                                   for(int k = 0; k < daftarMahasiswa.length; k++){
                                       if(daftarMahasiswa[k].id == id){
                                           daftarLokasi[i].Kelompok[j].add_anggota(daftarMahasiswa[k]);
                                           System.out.println("berhasil ditambahkan");
                                       }
                                   }
                                    System.out.println("kembali? (Y) ");
                                    String back = scan.nextLine();
                                    if(back == "Y"){
                                        kelolakelompok();
                                    } 
                               break;
                           case 2: System.out.println("hapus anggota");
                                   System.out.print(" masukan id mahasiswa : ");
                                   String id2 = scan.nextLine();
                                   for(int k = 0; k < daftarMahasiswa.length; k++){
                                       if(daftarMahasiswa[k].id == id2){
                                           daftarLokasi[i].Kelompok[j].removeanggota(id2);
                                           System.out.println("berhasil dihapus");
                                       }
                                   }
                                    System.out.println("kembali? (Y) ");
                                    String back2 = scan.nextLine();
                                    if(back2 == "Y"){
                                       kelolakelompok();
                                    }
                                 break;
                           case 3: kelolakelompok();
                               break;
                       }
                   }
               }
              
            }
       }
       
   }
   
   
 
  
   public void kelolapembimbing(){
       System.out.println("kelola pembimbing");
       System.out.println("1. lihat pembimbing");
       System.out.println("2. masukan pembimbing ke kelompok");
       System.out.println("3. hapus pembimbing dari kelompok");
       System.out.println("4. kembali");
       System.out.print("pilihan : ");
       int pil = scan.nextInt();
       switch(pil){
           case 1: lihatpembimbing();
               break;
           case 2: addpembimbing();
               break;
           case 3: removepembimbing();
               break;
           case 4: paneladmin();
       } 
   }
   public void lihatpembimbing(){
       for(int i = 1; i < daftarPembimbing.length; i++){
           System.out.println(1+i+". "+daftarPembimbing[i].nama);
       }
   }
   
   public void lihatgeladisaya(){
       
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
