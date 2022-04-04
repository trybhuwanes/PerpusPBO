package com.perpus;

import java.util.ArrayList;

public class ListBuku {
    static ArrayList<String> listBuku = new ArrayList<>();

    public static void tampilList() {
        System.out.println("----------PERPUSTAKAAN PTI-----------");
        listBuku.add(" The Pragmatic Programmer: Your Journey to Mastery");
        listBuku.add(" Structure and Interpretation of Computer Programs");
        listBuku.add(" Code Complete: A Practical Handbook of Software Construction");
        listBuku.add(" Clean Code: A Handbook of Agile Software Craftsmanship");
        listBuku.add(" Introduction to Algorithms");
        listBuku.add(" Peopleware: Productive Projects and Teams");
        listBuku.add(" Rapid Development: Taming Wild Software Schedules");
        listBuku.add(" HTML and CSS: Design and Build Websites");

        for (int i = 0; i < listBuku.size(); i++) {
            System.out.println((i + 1)+ listBuku.get(i));
        }
    }

}
