/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;
import models.Aplikasi;
import view.MenuListLokasiGld;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author JOKER
 */
public class ControllerMenuListLokasiGld implements ActionListener {
    Aplikasi model;
    MenuListLokasiGld MLlokasigld;
    String id;

    public ControllerMenuListLokasiGld(Aplikasi model, String id) {
        this.model = model;
        this.id = id;
        MLlokasigld = new MenuListLokasiGld();
        MLlokasigld.addListener(this);
        MLlokasigld.setVisible(true);
        MLlokasigld.getListlokasi().setListData(model.getdaftarlokasi());
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
       
        if (source.equals(MLlokasigld.getButtonback())) {
            MLlokasigld.dispose();
            new ControllerMenuHalamanUtamaDosen(model,id);
        }
        if (source.equals(MLlokasigld.getButtonliat())) {
            int idlok = Integer.parseInt(MLlokasigld.getFieldid().getText());
            MLlokasigld.dispose();
            new ControllerMenuDetailLokasiGld(model,id,idlok);
        }
        
    }
    
    
}
