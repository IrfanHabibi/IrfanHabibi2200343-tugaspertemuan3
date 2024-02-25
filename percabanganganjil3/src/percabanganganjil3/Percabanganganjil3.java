/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package percabanganganjil3;

/**
 *
 * @author Irfan Habibi
 */
import java.util.Scanner;

public class Percabanganganjil3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input jam masuk
        System.out.println("Masukkan jam masuk (format 1-12):");
        int jamMasuk = scanner.nextInt();

        // Meminta input jam keluar
        System.out.println("Masukkan jam keluar (format 1-12):");
        int jamKeluar = scanner.nextInt();

        // Menghitung lama bekerja
        int lamaBekerja;
        if (jamKeluar >= jamMasuk) {
            lamaBekerja = jamKeluar - jamMasuk;
        } else {
            lamaBekerja = (12 - jamMasuk) + jamKeluar; // Mengambil selisih antara jam masuk dan 12, lalu menambahkan jam keluar
        }

        // Output hasil
        System.out.println("Lama Bekerja " + lamaBekerja + " Jam");
    }
}
