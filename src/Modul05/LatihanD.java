/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul05;

/**
 *
 * @author Chisholunnajwa
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.ioimport.*;

public class LatihanD {
    public static void main(String[] args) {
        try {
            FileInputStream in = new FileInputStream("gambar.jpg");
            FileOutputStream out = new FileOutputStream("salinan_gambar.jpg");

            int data;
            while ((data = in.read()) != -1) {
                out.write(data);
            }

            in.close();
            out.close();

            System.out.println("File berhasil disalin!");
        } catch (IOException e) {
            System.out.println("Kesalahan: " + e.getMessage());
        }
    }
}

