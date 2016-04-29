/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;
import java.awt.event.ActionListener;
import models.Aplikasi;
import view.MenuHalamanUtamaMhs;
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
public class ControllerMenuHalamanUtamaMhs implements ActionListener{
    Aplikasi model;
    String nim;
    MenuHalamanUtamaMhs MHUmhs;

    public ControllerMenuHalamanUtamaMhs(Aplikasi model, String id) {
        this.model = model;
        nim = id;
        MHUmhs = new MenuHalamanUtamaMhs();
        MHUmhs.addListener(this);
        MHUmhs.setVisible(true);
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(MHUmhs.getButtonkeluar())){
            MHUmhs.dispose();
            new ControllerMenuUtamaGladi(model);
            
        }
        if (source.equals(MHUmhs.getButtonliat())){
            MHUmhs.dispose();
            new ControllerMenuLihatInfoGld(model,nim);
            
        }
        if (source.equals(MHUmhs.getButtonpilih())){
            MHUmhs.dispose();
            new ControllerMenuPilihGeladi(model,nim);
            
        }
        
    }
    
}
