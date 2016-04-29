/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;
import models.Aplikasi;
import view.MenuLihatPeserta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import models.Aplikasi;

/**
 *
 * @author JOKER
 */
class ControllerMenuLihatpeserta implements ActionListener {
    Aplikasi model;
    MenuLihatPeserta MDlokasigld;
    String id;
    int idlok;

    public ControllerMenuLihatpeserta(Aplikasi model, String id, int idlok) {
        this.model = model;
        this.id = id;
        this.idlok = idlok;
        MDlokasigld = new MenuLihatPeserta();
        MDlokasigld.addListener(this);
        MDlokasigld.setVisible(true);
        MDlokasigld.getListpeserta().setListData(model.listpesertamhs(idlok));
        MDlokasigld.getListpembina().setListData(model.listpesertapem(idlok));
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
       
        if (source.equals(MDlokasigld.getButtonback())) {
            MDlokasigld.dispose();
            new ControllerMenuDetailLokasiGld(model,id,idlok);
        }
    }
    
    
    
}
