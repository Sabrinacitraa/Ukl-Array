/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ARRAY;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class uklArray3 {

    public static void main(String[] args) {
        // untuk menginputkan data jadi menggunakan Scanner input
        
        Scanner input = new Scanner(System.in);
        System.out.print("0.Sabrina \n1.Citra \n2.Rama \n3.Dhani \nMasukkan pilihan: ");
        int n = input.nextInt();

        //menjabarkan namanya menggunakan array dua dimensi
        
        String nama[][] = {
            {"Sabrina", "1122", "X RPL 1"},
            {"Citra", "3344", "X RPL 2"},
            {"Rama", "5566", "X RPL 3"},
            {"Dhani", "7788", "X RPL 4"}};
        System.out.println("\t Hasil Biodata");
        System.out.println("===============================");
        for (int i = n; i <= n; i++) {
            for (int j = 0; j < 3; j++) {

                if (j == 0) {
                    System.out.println("Nama : " + nama[i][0]);
                } else if (j == 1) {
                    System.out.println("Nisn : " + nama[i][1]);
                } else {
                    System.out.println("Kelas: " + nama[i][2]);
                }
            }
        }
        System.out.println("");
        
        //Untuk Perulangannya menggunakan do-while
        
        int angka = 0;
        do {
            System.out.println("Apakah anda ingin mengetahui data yang lain?");
            System.out.println("1.Iya \n2.Tidak ");
            System.out.print("Masukkan di sini: ");
            int pilihan = input.nextInt();
            
            
            if (pilihan == 1) {
                System.out.print("\nDAFTAR NAMA:  \n0.Sabrina \n1.Citra \n2.Rama \n3.Dhani \nMasukkan pilihan: ");
                int p = input.nextInt();

                String name[][] = {
                    {"Sabrina", "1122", "X RPL 1"},
                    {"Citra", "3344", "X RPL 2"},
                    {"Rama", "5566", "X RPL 3"},
                    {"Dhani", "7788", "X RPL 4"}};
                System.out.println("\t Hasil Biodata");
                System.out.println("===============================");
                for (int i = p; i <= p; i++) {
                    for (int j = 0; j < 3; j++) {

                        if (j == 0) {
                            System.out.println("Nama : " + name[i][0]);
                        } else if (j == 1) {
                            System.out.println("Nisn : " + name[i][1]);
                        } else {
                            System.out.println("Kelas: " + name[i][2]);
                        }
                    }
                }
            } else if (pilihan == 2) {
                System.out.println("Anda Memilih tidak,Anda Keluar dari program");
                System.exit(0);
            }
            angka++;

        } while (angka < 5);
    }
}
