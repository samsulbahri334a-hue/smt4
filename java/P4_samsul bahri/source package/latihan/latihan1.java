import java.util.Scanner;

public class latihan1 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        float realisasi, kehadiran, tugas, uts, uas, total;
        float b_kehadiran, b_tugas, b_uts, b_uas;

        // perintah
        System.out.print("Masukan realisasi: ");
        realisasi = input.nextFloat();

        System.out.print("Masukan kehadiran: ");
        kehadiran = input.nextFloat();

        System.out.print("Masukan tugas: ");
        tugas = input.nextFloat();

        System.out.print("Masukan UTS: ");
        uts = input.nextFloat();

        System.out.print("Masukan UAS: ");
        uas = input.nextFloat();

        // Proses
        b_kehadiran = (kehadiran / realisasi) * 10;
        b_tugas = tugas * 20 / 100;
        b_uts = uts * 30 / 100;
        b_uas = uas * 40 / 100;
        total = b_kehadiran + b_tugas + b_uts + b_uas;

        // Output
        System.out.println("\n=== Hasil Perhitungan ===");
        System.out.println("Realisasi : " + realisasi);
        System.out.println("Kehadiran : " + kehadiran + " (Bobot: " + b_kehadiran + ")");
        System.out.println("Tugas     : " + tugas + " (Bobot: " + b_tugas + ")");
        System.out.println("UTS       : " + uts + " (Bobot: " + b_uts + ")");
        System.out.println("UAS       : " + uas + " (Bobot: " + b_uas + ")");
        System.out.println("Total Nilai: " + total);

    }
}