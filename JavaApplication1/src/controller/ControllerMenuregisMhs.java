/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;
import models.Aplikasi;
import view.MenuRegisMhs;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import models.Mahasiswa;

/**
 *
 * @author JOKER
 */
public class ControllerMenuregisMhs implements ActionListener {
    MenuRegisMhs menuregismhs;
    Aplikasi model;

    public ControllerMenuregisMhs(Aplikasi model) {
        this.model = model;
        menuregismhs = new MenuRegisMhs();
        menuregismhs.addListener(this);
        menuregismhs.setVisible(true);
        
    }
    
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        Mahasiswa p = null;
        
        if (source.equals(menuregismhs.getButtonkembali())) {
            menuregismhs.dispose();
            new ControllerMenuUtamaGladi(model);
        }
        if (source.equals(menuregismhs.getButtondaftar())){
            if (menuregismhs.getFieldregisnama().getText().equals("")){
                JOptionPane.showMessageDialog(null, "Maaf nama harus diisi");
            }
            else if (menuregismhs.getFieldregisid().getText().equals("")){
                JOptionPane.showMessageDialog(null, "Maaf id harus diisi");
            }
            else if (menuregismhs.getFieldregishp().getText().equals("")){
                JOptionPane.showMessageDialog(null, "Maaf no hp harus diisi");
            }
            else{
                String id = menuregismhs.getFieldregisid().getText();
                String nama = menuregismhs.getFieldregisnama().getText();
                String hp = menuregismhs.getFieldregishp().getText();
                p = new Mahasiswa(nama,id,hp);
                model.getListMahasiswa().add(p);
                JOptionPane.showMessageDialog(null, "mahasiswa Berhasil Ditambah");
            }
                
                
                
            }
    }
    
}
