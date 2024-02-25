/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package percabanganganjil1;

/**
 *
 * @author Irfan Habibi
 */
import java.util.Scanner;

public class Percabanganganjil1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan tiga karakter
        System.out.println("Masukkan tiga karakter (huruf kecil):");
        String input = scanner.nextLine();

        // Memeriksa apakah input memiliki panjang 3
        if (input.length() != 3) {
            System.out.println("Input harus terdiri dari tiga karakter");
            return;
        }

        // Mengambil karakter pertama, kedua, dan ketiga
        char huruf1 = input.charAt(0);
        char huruf2 = input.charAt(1);
        char huruf3 = input.charAt(2);

        // Memeriksa apakah ketiga karakter tersebut huruf kecil
        if (!(isHurufKecil(huruf1) && isHurufKecil(huruf2) && isHurufKecil(huruf3))) {
            System.out.println("Input tidak valid, Input harus berupa huruf kecil");
            return;
        }

        // Memeriksa apakah urutan konsonan-vokal-konsonan terpenuhi
        if (isKonsonan(huruf1) && isVokal(huruf2) && isKonsonan(huruf3)) {
            System.out.println("Urutan konsonan - vokal - konsonan terpenuhi");
        } else {
            System.out.println("Urutan konsonan - vokal - konsonan tidak terpenuhi");
        }
    }

    // Method untuk mengecek apakah suatu karakter merupakan huruf kecil
    private static boolean isHurufKecil(char huruf) {
        return huruf >= 'a' && huruf <= 'z';
    }

    // Method untuk mengecek apakah suatu karakter merupakan konsonan
    private static boolean isKonsonan(char huruf) {
        return "bcdfghjklmnpqrstvwxyz".indexOf(huruf) != -1;
    }

    // Method untuk mengecek apakah suatu karakter merupakan vokal
    private static boolean isVokal(char huruf) {
        return "aiueo".indexOf(huruf) != -1;
    }
}
