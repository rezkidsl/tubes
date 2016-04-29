/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;
import models.Aplikasi;
import view.MenuPilihGeladi ;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import models.LokasiGladi;

import models.Aplikasi;

/**
 *
 * @author JOKER
 */
class ControllerMenuPilihGeladi implements ActionListener {
    Aplikasi model;
    String nim;
    MenuPilihGeladi menupilihgeladi;
    
    public ControllerMenuPilihGeladi(Aplikasi model,String nim) {
        this.model = model;
        this.nim = nim;
        menupilihgeladi = new MenuPilihGeladi();
        menupilihgeladi.addListener(this);
        menupilihgeladi.setVisible(true);
        menupilihgeladi.getListlokasi().setListData(model.getdaftarlokasi2());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
       
        if (source.equals(menupilihgeladi.getButtonback())) {
            menupilihgeladi.dispose();
            new ControllerMenuHalamanUtamaMhs(model,nim);
        }
        if (source.equals(menupilihgeladi.getButtoninp())) {
            if (model.findMahasiswaByNoId(nim).getLokasi() < 1){
                int id = Integer.parseInt(menupilihgeladi.getFieldnoid().getText());
                model.addGeladiToMahasiswa(nim, id);
                model.addKelompokToMahasiswa(nim, id);
                JOptionPane.showMessageDialog(null, "berhasil ditambahkan");
                menupilihgeladi.dispose();
                new ControllerMenuHalamanUtamaMhs(model, nim);
            }
            else{
               JOptionPane.showMessageDialog(null, "gagal ditambahkan. anda sudah memiliki lokasi geladi"); 
            }
        }
        
         
    }
    
}
