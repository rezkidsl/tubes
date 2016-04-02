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
public abstract class orang {
    public String nama;
    public String id;
    public String email;
    public int jenis_user;
    private String password;

    public orang(String nama, String id, String email, int jenis_user) {
        this.nama = nama;
        this.id = id;
        this.email = email;
        this.jenis_user = jenis_user;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setJenis_user(int jenis_user) {
        this.jenis_user = jenis_user;
    }


    public void setPassword(String password) {
        this.password = password;
    }

    public String getNama() {
        return nama;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public int getJenis_user() {
        return jenis_user;
    }


    public String getPassword() {
        return password;
    }
    
    
}
