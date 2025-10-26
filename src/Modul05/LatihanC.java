/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul05;

/**
 *
 * @author Chisholunnajwa
 */
import java.io.*;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class LatihanC {
    public static void main(String[] args) {
        Map<String, Integer> frekuensi = new HashMap<>();

        Path inputPath = Paths.get("input.txt");
        Path outputPath = Paths.get("count.txt");

        try (BufferedReader br = Files.newBufferedReader(inputPath, StandardCharsets.UTF_8)) {
            String baris;
            while ((baris = br.readLine()) != null) {
                baris = baris.toLowerCase().replaceAll("[^a-z0-9\\s]", "");
                String[] kata = baris.split("\\s+");

                for (String k : kata) {
                    if (!k.isEmpty()) {
                        frekuensi.put(k, frekuensi.getOrDefault(k, 0) + 1);
                    }
                }
            }

            try (BufferedWriter bw = Files.newBufferedWriter(outputPath, StandardCharsets.UTF_8)) {
                for (Map.Entry<String, Integer> entri : frekuensi.entrySet()) {
                    bw.write(entri.getKey() + ":" + entri.getValue());
                    bw.newLine();
                }
            }

            System.out.println("Hasil telah disimpan di count.txt");

        } catch (IOException e) {
            System.out.println("Gagal membaca file: " + e.getMessage());
        }
    }
}
