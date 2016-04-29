/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.NoSuchElementException;
import javax.swing.JOptionPane;
import models.Aplikasi;
import models.Orang;
import view.MenuLoginGeladi;

/**
 *
 * @author JOKER
 */
public class ControllerMenuLogin implements ActionListener {
    private MenuLoginGeladi menulogin;
    private Aplikasi model;

    public ControllerMenuLogin(Aplikasi model) {
        this.model = model;
        menulogin = new MenuLoginGeladi();
        menulogin.setVisible(true);
        menulogin.addListener(this);
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        Orang user = null;
        String id = menulogin.getFieldid().getText();
         if (source.equals(menulogin.getButtonback())) {
            menulogin.dispose();
            new ControllerMenuUtamaGladi(model);
        }
         if (source.equals(menulogin.getButtonlogin())) {
             
            
            try {
            user = model.findOrangByNoId(id);
            
            
           
            } catch (NoSuchElementException n) {
            JOptionPane.showMessageDialog(null, "id tidak ditemukan");
            
        }
              if (user.getJabatan().equalsIgnoreCase("pembimbing")){
                menulogin.dispose();
                ControllerMenuHalamanUtamaDosen controllerMenuHalamanUtamaDosen = new ControllerMenuHalamanUtamaDosen(model,id);
            }
            else{
                menulogin.dispose();
                new ControllerMenuHalamanUtamaMhs(model, id);
            }
             
         }
           
        }
      
        
    }
    

