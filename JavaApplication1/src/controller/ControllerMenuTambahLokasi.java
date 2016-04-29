/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;
import models.Aplikasi;
import view.MenuTambahLokasi ;
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
public class ControllerMenuTambahLokasi implements ActionListener{
    Aplikasi model;
    MenuTambahLokasi menutambahlokasi;
    String id;

    public ControllerMenuTambahLokasi(Aplikasi model, String id) {
        this.model = model;
        this.id = id;
        menutambahlokasi = new MenuTambahLokasi();
        menutambahlokasi.addListener(this);
        menutambahlokasi.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
       
        if (source.equals(menutambahlokasi.getButtonkembali())) {
            menutambahlokasi.dispose();
            new ControllerMenuHalamanUtamaDosen(model,id);
        }
         
         if (source.equals(menutambahlokasi.getButtondaftar())){
             if (menutambahlokasi.getFieldnama().getText().equals("")){
                JOptionPane.showMessageDialog(null, "Maaf nama harus diisi");
            }
            else if (menutambahlokasi.getFieldkuota().getText().equals("")){
                JOptionPane.showMessageDialog(null, "Maaf kuota harus diisi");
            }
            else if (menutambahlokasi.getFieldlokasi().getText().equals("")){
                JOptionPane.showMessageDialog(null, "Maaf lokasi harus diisi");
            }
         
            else{
             String nama = menutambahlokasi.getFieldnama().getText();
             int kuota = Integer.parseInt(menutambahlokasi.getFieldkuota().getText());
             String lokasi = menutambahlokasi.getFieldlokasi().getText();
             model.addGeladi(nama, lokasi, kuota);
             JOptionPane.showMessageDialog(null, "Geladi berhasil ditambah");
             
             
         }
         }
    
    }
    
    
    
}
