package com.perpus;

import java.util.ArrayList;
import java.util.Scanner;

public class PindaiBuku {
//    static int[] bukuPinjam = new int[1];

    static ArrayList<Integer> bukuPinjam = new ArrayList<>();
    PindaiBuku() {
    }

    static void scanBuku() {
        Scanner scan = new Scanner(System.in);
        int a=0;
        System.out.println("----------PERPUSTAKAAN PTI-----------");
        System.out.println("PINDAI BUKU YANG DIPINJAM");
        System.out.println("Cttn : maksimal 5 buku");
        while (a!=5){
        System.out.print("Masukkan Nomor Buku : ");
        bukuPinjam.add(scan.nextInt());  a++;
            System.out.println("Mau pinjam lagi?");
            System.out.println("1. Ya");
            System.out.println("2. Tidak");
        if (scan.nextInt()==1){
            break;
        }
        }
    }
//        int i = 0;
//        boolean loop;
//        while (i < 5) {
//            System.out.print("Masukkan Nomor Buku : ");
//            bukuPinjam[i] = scan.nextInt();
//            i++;
//        }

//        do {
//            System.out.print("Masukkan Nomor Buku : ");
//            bukuPinjam[i] = scan.nextInt();
//            i++;
//            loop = i < 5;
//        } while (loop);

//    public static void main(String[] args) {
//        String pinjam[]={"buku 1", "buku 2", "buku 3"};
//        String stok[]={"buku 1", "buku 2", "buku 3", "buku 4", "buku 5"};
//        System.out.println("yang dipinjam");
//        for (int a=0; a< pinjam.length; a++){
//            System.out.println(pinjam[a]);
//        }
//        System.out.println("stok buku");
//        for (int a=0; a< stok.length; a++){
//            System.out.println(stok[a]);}
//        System.out.println("setelah dipinjam");
//        for (int a=0; a< pinjam.length; a++) {
//            System.out.println(pinjam[a]);
//            if (pinjam[a]==stok[a]){
//                stok[a]= "buku ini sudah dipinjam";
//
//            }
//        }
//        for (int a=0; a< stok.length; a++){
//            System.out.println(stok[a]);}
//    }
}

