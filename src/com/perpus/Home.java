package com.perpus;

import java.util.Scanner;

class Home {
    public static void menu() {
        Scanner input = new Scanner(System.in);
        System.out.println("----------PERPUSTAKAAN PTI-----------");        System.out.println("========== MENU ==========");
        System.out.println("1. Lihat list buku");
        System.out.println("2. Pindai kode buku");
        System.out.println("0. Keluar");
        System.out.print("Masukkan pilihan anda : ");
        int pilihan = input.nextInt();
        if (pilihan == 1){
            ListBuku.tampilList();
        } else if ( pilihan == 2){
            PindaiBuku.scanBuku();
        } else {
            System.exit(0);
        }
    }
}
