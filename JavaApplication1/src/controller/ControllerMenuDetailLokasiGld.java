/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;
import models.Aplikasi;
import view.MenuDetailLokasiGld;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author JOKER
 */
public class ControllerMenuDetailLokasiGld implements ActionListener {
    Aplikasi model;
    MenuDetailLokasiGld MDlokasigld;
    String id;
    int idlok;

    public ControllerMenuDetailLokasiGld(Aplikasi model, String id, int idlok) {
        this.model = model;
        this.id = id;
        this.idlok = idlok;
        MDlokasigld = new MenuDetailLokasiGld();
        MDlokasigld.addListener(this);
        MDlokasigld.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
       
        if (source.equals(MDlokasigld.getButtonback())) {
            MDlokasigld.dispose();
            new ControllerMenuHalamanUtamaDosen(model,id);
        }
        if (source.equals(MDlokasigld.getButtonliat())) {
            MDlokasigld.dispose();
            new ControllerMenuLihatpeserta(model,id,idlok);
        }
        if (source.equals(MDlokasigld.getButtonaddkuota())) {
            MDlokasigld.dispose();
            new ControllerMenuTambahKuotaGld(model,id, idlok);
        }
        if (source.equals(MDlokasigld.getButtonedit())) {
            MDlokasigld.dispose();
            new ControllerMenuEditDataGld(model,id,idlok);
        }
        if (source.equals(MDlokasigld.getButtonkurkuota())) {
            MDlokasigld.dispose();
            new ControllerMenuKurangKuotaGld(model,id,idlok);
        }
        if (source.equals(MDlokasigld.getButtonremovelokasi())) {
            model.hapusgeladi(idlok);
            JOptionPane.showMessageDialog(null, "berhasil dihapus");
            MDlokasigld.dispose();
            new ControllerMenuListLokasiGld(model,id);
        }
        if (source.equals(MDlokasigld.getButtonadd())) {
            model.addGeladiToPembimbing(id, idlok);
            JOptionPane.showMessageDialog(null, "berhasil ditambahkan");
        }
        
    }
    
}
