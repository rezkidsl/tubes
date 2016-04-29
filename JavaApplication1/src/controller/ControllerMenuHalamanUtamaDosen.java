/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;
import java.awt.event.ActionListener;
import models.Aplikasi;
import view.MenuHalamanUtamaDosen;
import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author JOKER
 */
public class ControllerMenuHalamanUtamaDosen implements ActionListener {
    Aplikasi model;
    MenuHalamanUtamaDosen MHUdosen;
    String id;

    public ControllerMenuHalamanUtamaDosen(Aplikasi model,String id) {
        this.model = model;
        this.id = id;
        MHUdosen = new MenuHalamanUtamaDosen();
        MHUdosen.addListener(this);
        MHUdosen.setVisible(true);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(MHUdosen.getButtonkeluar())){
            MHUdosen.dispose();
            new ControllerMenuUtamaGladi(model);
            
        }
        if (source.equals(MHUdosen.getButtonadd())){
            MHUdosen.dispose();
            new ControllerMenuTambahLokasi(model,id);
            
        }
        if (source.equals(MHUdosen.getButtonlokasi())){
            MHUdosen.dispose();
            new ControllerMenuListLokasiGld(model,id);
            
        }
        

    }
    
}
