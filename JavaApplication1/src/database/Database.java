package database;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import models.Kelompok;
import models.LokasiGladi;
import models.Mahasiswa;
import models.Pembimbing;

public class Database { 
    public void saveFileMhs(ArrayList<Mahasiswa> fileMhs){
        try{
            FileOutputStream fos = new FileOutputStream("FileMahasiswa.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(fileMhs);
            oos.flush();
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
    
    public ArrayList<Mahasiswa> loadFileMhs(){
        ArrayList<Mahasiswa> temp=null;
        try{
        FileInputStream fis = new FileInputStream("fileMahasiswa.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        temp = (ArrayList<Mahasiswa>) ois.readObject();
        } catch (IOException  ioe){
            System.out.println("Error IO Exception");
        } catch (ClassNotFoundException cnfe){
            System.out.println("Error class not found");
        }
        return temp;
    }
    
    public void saveFilePembimbing(ArrayList<Pembimbing> filePembimbing){
        try{
            FileOutputStream fos = new FileOutputStream("filepembimbing.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(filePembimbing);
            oos.flush();
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
    
    public ArrayList<Pembimbing> loadFilePembimbing(){
        ArrayList<Pembimbing> temp=null;
        try{
        FileInputStream fis = new FileInputStream("filepembimbing.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        temp = (ArrayList<Pembimbing>) ois.readObject();
        } catch (IOException  ioe){
            System.out.println("Error IO Exception");
        } catch (ClassNotFoundException cnfe){
            System.out.println("Error class not found");
        }
        return temp;
    }
    
    public void saveFileLokasiGladi(ArrayList<LokasiGladi> fileLokasiGladi){
        try{
            FileOutputStream fos = new FileOutputStream("filelokasigladi.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(fileLokasiGladi);
            oos.flush();
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
    
    public ArrayList<LokasiGladi> loadFileLokasiGladi(){
        ArrayList<LokasiGladi> temp=null;
        try{
        FileInputStream fis = new FileInputStream("filelokasigladi.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        temp = (ArrayList<LokasiGladi>) ois.readObject();
        } catch (IOException  ioe){
            System.out.println("Error IO Exception");
        } catch (ClassNotFoundException cnfe){
            System.out.println("Error class not found");
        }
        return temp;
    }
    
    public void saveFileKelompok(ArrayList<Kelompok> fileKelompok){
        try{
            FileOutputStream fos = new FileOutputStream("filekelompok.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(fileKelompok);
            oos.flush();
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
    
    public ArrayList<Kelompok> loadFileRuangan(){
        ArrayList<Kelompok> temp=null;
        try{
        FileInputStream fis = new FileInputStream("filekelompok.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        temp = (ArrayList<Kelompok>) ois.readObject();
        } catch (IOException  ioe){
            System.out.println("Error IO Exception");
        } catch (ClassNotFoundException cnfe){
            System.out.println("Error class not found");
        }
        return temp;
    }
}
