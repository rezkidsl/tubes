/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;
import models.Aplikasi;
import view.MenuTambahPem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import models.Pembimbing;

/**
 *
 * @author JOKER
 */
public class ControllerMenuTambahPem implements ActionListener {
    private Aplikasi model;
    private MenuTambahPem menutambahpem;

    public ControllerMenuTambahPem(Aplikasi model) {
        this.model = model;
        menutambahpem = new MenuTambahPem();
        menutambahpem.addListener(this);
        menutambahpem.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        
        if (source.equals(menutambahpem.getButtonkembali())) {
            menutambahpem.dispose();
            new ControllerMenuUtamaGladi(model);
        }
        if (source.equals(menutambahpem.getButtondaftar())){
            if (menutambahpem.getFieldregisnama().getText().equals("")){
                JOptionPane.showMessageDialog(null, "Maaf nama harus diisi");
            }
            else if (menutambahpem.getFieldregisid().getText().equals("")){
                JOptionPane.showMessageDialog(null, "Maaf id harus diisi");
            }
            else if (menutambahpem.getFieldregishp().getText().equals("")){
                JOptionPane.showMessageDialog(null, "Maaf no hp harus diisi");
            }
        
            else{
                String id = menutambahpem.getFieldregisid().getText();
                String nama = menutambahpem.getFieldregisnama().getText();
                String hp = menutambahpem.getFieldregishp().getText();
                Pembimbing p = new Pembimbing(nama,id,hp);
                model.getListPembimbing().add(p);
                JOptionPane.showMessageDialog(null, "Pembimbing Berhasil Ditambah");
                menutambahpem.dispose();
                new ControllerMenuUtamaGladi(model);
                
            }
                
        }       
        
    }
    
    
}
