package latihan;

import java.util.Scanner;

public class latihan2 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        // Input jumlah hadir dan total pertemuan
        System.out.print("Masukkan jumlah hadir: ");
        int hadir = input.nextInt();

        System.out.print("Masukkan total pertemuan: ");
        int totalPertemuan = input.nextInt();

        // Hitung persentase kehadiran
        double persenKehadiran = ((double) hadir / totalPertemuan) * 100;

        // Input nilai rata-rata
        System.out.print("Masukkan nilai rata-rata: ");
        int rataRata = input.nextInt();

        String nilai; // variabel untuk menyimpan hasil nilai

        if (persenKehadiran >= 80) {
            if (rataRata >= 50) {
                nilai = "A";
            } else {
                nilai = "B";
            }
        } else if (persenKehadiran >= 70) {
            if (rataRata >= 50) {
                nilai = "B";
            } else {
                nilai = "C";
            }
        } else { // persenKehadiran < 70
            if (rataRata >= 50) {
                nilai = "C";
            } else if (rataRata >= 40) {
                nilai = "D";
            } else {
                nilai = "E";
            }
        }

        // Output hasil
        System.out.println("Persentase Kehadiran: " + persenKehadiran + "%");
        System.out.println("Nilai akhir Anda adalah: " + nilai);

        input.close();
    }

    
}
