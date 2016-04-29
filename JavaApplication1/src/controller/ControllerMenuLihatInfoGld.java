/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;
import models.Aplikasi;
import view.MenuLihatInfoGld;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import models.LokasiGladi;

/**
 *
 * @author JOKER
 */
public class ControllerMenuLihatInfoGld implements ActionListener {
    Aplikasi model;
    MenuLihatInfoGld MLinfogld;
    String nim;

    public ControllerMenuLihatInfoGld(Aplikasi model, String nim) {
        this.model = model;
        this.nim = nim;
        MLinfogld = new MenuLihatInfoGld();
        MLinfogld.addListener(this);
        MLinfogld.setVisible(true);
        MLinfogld.getListgeladi().setListData(model.listgeladisayamhs(nim));
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       Object source = e.getSource();
       
        if (source.equals(MLinfogld.getButtonback())) {
            MLinfogld.dispose();
            new ControllerMenuHalamanUtamaMhs(model,nim);
        }
        
    }
    
    
    
}
