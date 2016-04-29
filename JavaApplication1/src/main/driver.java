package main;

import controller.ControllerMenuUtamaGladi;
import java.io.Serializable;
import models.Aplikasi;
import java.io.*;

public class driver implements Serializable {
    public static void main(String[] args) {
        Aplikasi aplikasi = new Aplikasi();
        new ControllerMenuUtamaGladi(aplikasi);
        
    }
}
