/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

import java.util.Scanner;

/**
 *
 * @author samsu
 */
public class tugas1_pt5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input jenis kendaraan
        System.out.print("Masukkan jenis kendaraan (mobil/motor): ");
        String jenis = input.nextLine().toLowerCase();

        // Input lama parkir (jam)
        System.out.print("Masukkan lama parkir (jam): ");
        int jam = input.nextInt();

        int biaya = 0;

        // Logika if-else
        if (jenis.equals("mobil")) {
            if (jam <= 2) {
                biaya = 5000;
            } else if (jam <= 5) {
                biaya = 10000;
            } else {
                biaya = 15000;
            }
        } else if (jenis.equals("motor")) {
            if (jam <= 2) {
                biaya = 3000;
            } else if (jam <= 5) {
                biaya = 6000;
            } else {
                biaya = 10000;
            }
        } else {
            System.out.println("Jenis kendaraan tidak valid!");
            input.close();
            return;
        }

        // Output hasil
        System.out.println("Biaya parkir untuk " + jenis + " selama " + jam + " jam adalah Rp " + biaya);

        input.close();
    }

}
