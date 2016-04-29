/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;
import models.Aplikasi;
import view.MenuTambahKuotaGld;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
/**
 *
 * @author JOKER
 */
public class ControllerMenuTambahKuotaGld implements ActionListener {
    Aplikasi model;
    MenuTambahKuotaGld MTkuotagld;
    String id;
    int idlok;

    public ControllerMenuTambahKuotaGld(Aplikasi model, String id, int idlok) {
        this.model = model;
        this.id = id;
        this.idlok = idlok;
        MTkuotagld = new MenuTambahKuotaGld();
        MTkuotagld.addListener(this);
        MTkuotagld.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
       
        if (source.equals(MTkuotagld.getButtonback())) {
            MTkuotagld.dispose();
            new ControllerMenuEditDataGld(model,id,idlok);
        }
       
        if (source.equals(MTkuotagld.getButtonadd())) {
            int kuota = Integer.parseInt(MTkuotagld.getFieldjumlah().getText());
            model.addKuotaGladi(idlok, kuota);
            JOptionPane.showMessageDialog(null, "berhasil ditambah");

        }
    }
    
}
