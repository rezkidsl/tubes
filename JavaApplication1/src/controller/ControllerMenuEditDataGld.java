/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;
import models.Aplikasi;
import view.MenuEditDataGld;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
/**
 *
 * @author JOKER
 */
public class ControllerMenuEditDataGld implements ActionListener {
    Aplikasi model;
    MenuEditDataGld menueditdatagld;
    int idlok;
    String id;

    public ControllerMenuEditDataGld(Aplikasi model,String id, int idlok) {
        this.model = model;
        this.id=id;
        this.idlok = idlok;
        menueditdatagld = new MenuEditDataGld();
        menueditdatagld.addListener(this);
        menueditdatagld.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
       
        if (source.equals(menueditdatagld.getButtonback())) {
            menueditdatagld.dispose();
            new ControllerMenuDetailLokasiGld(model,id,idlok);
        }
        if (source.equals(menueditdatagld.getButtonselesai())){
            String nama = menueditdatagld.getFieldnamabaru().getText();
            String lok = menueditdatagld.getFieldlokasibaru().getText();
            model.findgeladibyid(idlok).setKota(lok);
            model.findgeladibyid(idlok).setNama(nama);
            JOptionPane.showMessageDialog(null, "berhasil diubah");
            menueditdatagld.dispose();
            new ControllerMenuListLokasiGld(model,id);
            
           
        }
    }
    
}
