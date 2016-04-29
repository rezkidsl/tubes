/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.awt.event.ActionListener;
import models.Aplikasi;
import view.MenuUtamaGeladi;
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
public class ControllerMenuUtamaGladi implements ActionListener {
    private MenuUtamaGeladi menuutama;
    private Aplikasi model;

    public ControllerMenuUtamaGladi(Aplikasi model) {
        this.model = model;
        menuutama = new MenuUtamaGeladi();
        menuutama.setVisible(true);
        menuutama.addListener(this);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(menuutama.getjButtonlogin())){
            menuutama.dispose();
            new ControllerMenuLogin(model);
            
        }
        if (source.equals(menuutama.getButtonmhs())){
            menuutama.dispose();
            new ControllerMenuregisMhs(model);
            
        }
        if (source.equals(menuutama.getButtonpem())){
            menuutama.dispose();
            new ControllerMenuTambahPem(model);
            
        }
        
    }
    
}
