package com.mycompany.bangunruang;

import com.mycompany.bangunruang.Balok;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner iU = new Scanner(System.in);

        int pilihan;

        System.out.println(" ======================================== ");
        System.out.println("|      MAU MENGHITUNG APA HARI INI ?     |");
        System.out.println(" ======================================== ");
        System.out.println("| 1. Luas Permukaan Bola                 |");
        System.out.println("| 2. Volume Bola                         |");
        System.out.println("| 3. Luas Permukaan Limas Segitiga       |");
        System.out.println("| 4. Volume Limas Segitiga               |");
        System.out.println("| 5. Luas Permukaan Tabung               |");
        System.out.println("| 6. Volume Tabung                       |");
        System.out.println("| 7. Luas Permukaan Balok                |");
        System.out.println("| 8. Volume Balok                        |");
        System.out.println(" ========================================");
        System.out.print(" Jadi Mau Pilih No Berapa ?  : ");
        pilihan = iU.nextInt();

        switch (pilihan) {
            case 1:
                Bola bola = new Bola();
                bola.luasPermukaan();
                break;

            case 2:
                Bola bola2 = new Bola();
                bola2.volume();
                break;

            case 3:
                LimasSegitiga limas = new LimasSegitiga();
                limas.luasPermukaan();
                break;

            case 4:
                LimasSegitiga limas2 = new LimasSegitiga();
                limas2.volume();
                break;

            case 5:
                Tabung tabung = new Tabung();
                tabung.luasPermukaan();
                break;

            case 6:
                Tabung tabung2 = new Tabung();
                tabung2.volume();

            case 7:
                Balok balok = new Balok();
                balok.luasPermukaan();

            case 8:
                Balok balok2 = new Balok();
                balok2.volume();

            default:
                System.out.println("\nMASUKKAN INPUT YANG BENAR YAA !!!!\n");
        }
    }
}