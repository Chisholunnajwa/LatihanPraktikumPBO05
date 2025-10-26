/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul05;

/**
 *
 * @author Chisholunnajwa
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class LatihanB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukkan satu baris teks: ");
        String teks = br.readLine();

        // Pisahkan kata berdasarkan spasi
        String[] kata = teks.trim().split("\\s+");
        int jumlahKata = (teks.trim().isEmpty()) ? 0 : kata.length;

        System.out.println("Jumlah kata: " + jumlahKata);
    }
}
