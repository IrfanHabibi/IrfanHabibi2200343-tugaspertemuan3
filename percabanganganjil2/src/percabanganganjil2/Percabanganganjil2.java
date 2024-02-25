/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package percabanganganjil2;

/**
 *
 * @author Irfan Habibi
 */
import java.util.Scanner;

public class Percabanganganjil2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan panjang sisi
        System.out.println("Masukkan panjang sisi pertama:");
        double sisi1 = scanner.nextDouble();

        System.out.println("Masukkan panjang sisi kedua:");
        double sisi2 = scanner.nextDouble();

        System.out.println("Masukkan panjang sisi ketiga:");
        double sisi3 = scanner.nextDouble();

        // Memeriksa apakah semua sisi sama
        if (sisi1 == sisi2 && sisi2 == sisi3) {
            System.out.println("Termasuk Kubus");
        } else {
            System.out.println("Bukan Kubus");
        }
    }
}
