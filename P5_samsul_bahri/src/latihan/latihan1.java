/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

import java.util.Scanner;

public class latihan1 {
    public static void main(String[] args) {
        Scanner simpan = new Scanner(System.in);
        int pilihan;
        String makanan;
        
        System.out.print("input pilihan :");
        pilihan = simpan.nextInt();
        if(pilihan == 1){
             makanan = "ayam goreng";
        }
        else if(pilihan == 2){
            makanan = "mie goreng";
        }else {
            makanan = "makanan tidak ada";
        }
        System.out.print(makanan);
    }
}
