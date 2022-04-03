package com;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Struk {
    Struk() {

    }

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

    public static void main(String[] args) {
        System.out.println("----------PERPUSTAKAAN PTI-----------");
        System.out.print("Tanggal\t\t: ");
        currentDate();
        System.out.println("Nama\t\t: ");
        System.out.println("=====================================");
        System.out.println("0000000\t Buku 1");
        System.out.println("0000001\t Buku 2");
        System.out.println("0000002\t Buku 3");
        System.out.println("=====================================");
        System.out.print("Tanggal Kembali : ");
        returnDate();

    }

}
