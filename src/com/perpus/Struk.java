package com.perpus;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Struk {
    static void currentDate() {
        DateFormat formatTanggal = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date tanggal = new Date();
        System.out.println(formatTanggal.format(tanggal));
    }

    static void returnDate() {
        DateFormat formatTanggal = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 5);
        Date limaharilagi = cal.getTime();
        System.out.println(formatTanggal.format(limaharilagi));
    }

    static void cetakStruk() {
        System.out.println();
        System.out.println("----------PERPUSTAKAAN PTI-----------");
        System.out.print("Tanggal\t\t: ");
        currentDate();
        System.out.println("Nama\t\t: " + PindaiBuku.namaPeminjam.get(0));
        System.out.println("=====================================");

        for (int i = 0; i < PindaiBuku.bukuPinjam.size(); i++) {
            System.out.print(PindaiBuku.bukuPinjam.get(i) + "  ");
            System.out.println(ListBuku.listBuku.get((PindaiBuku.bukuPinjam.get(i)) - 1));
        }
        System.out.println("=====================================");
        System.out.print("Tanggal Kembali : ");
        returnDate();

    }

}
