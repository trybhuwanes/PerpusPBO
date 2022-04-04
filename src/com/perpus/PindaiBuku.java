package com.perpus;

import java.util.ArrayList;
import java.util.Scanner;

public class PindaiBuku {
    static ArrayList<Integer> bukuPinjam = new ArrayList<>();
    static ArrayList<String> namaPeminjam = new ArrayList<>();

    static void scanBuku() {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        int a=0;
        System.out.println("----------PERPUSTAKAAN PTI-----------");
        System.out.println("=========== PINDAI BUKU ===========");
        System.out.println("Cttn : maksimal 5 buku");
        System.out.print("Nama : ");
        namaPeminjam.add(scan.nextLine());
        while (a!=5){
            System.out.print("Masukkan Nomor Buku : ");
            bukuPinjam.add(scan.nextInt());  a++;
            System.out.print("Mau pinjam lagi? (1) Ya (2) Tidak : ");
            if (scan.nextInt() != 1){
                break;
            }
        }
    }
}
