/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;
import models.Aplikasi;
import view.MenuKurangKuotaGld;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import models.LokasiGladi;

/**
 *
 * @author JOKER
 */
public class ControllerMenuKurangKuotaGld implements ActionListener{
    Aplikasi model;
    MenuKurangKuotaGld MKkuotagld;
    String id;
    int idlok;

    public ControllerMenuKurangKuotaGld(Aplikasi model, String id, int idlok) {
        this.model = model;
        this.id = id;
        this.idlok = idlok;
        MKkuotagld = new MenuKurangKuotaGld();
        MKkuotagld.addListener(this);
        MKkuotagld.setVisible(true);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
       
        if (source.equals(MKkuotagld.getButtonback())) {
            MKkuotagld.dispose();
            new ControllerMenuEditDataGld(model,id,idlok);
        }
        if (source.equals(MKkuotagld.getButtonkurang())) {
            int kuota = Integer.parseInt(MKkuotagld.getFieldjum().getText());
            int byk = model.findMahasiswaByGladiId(idlok).size();
            int sum = model.findgeladibyid(idlok).getKuota() - kuota;
            if (sum < byk){
                JOptionPane.showMessageDialog(null, "kuota baru tidak boleh kurang dari banyak peserta");
            }else{
                model.findgeladibyid(idlok).setKuota(sum);
                JOptionPane.showMessageDialog(null, "berhasil dikurang");
            
        }
    }
    
    }}
