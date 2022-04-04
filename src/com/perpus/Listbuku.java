package com.perpus;

public class Listbuku {
    public static void main(String[] args) {
        String[] buku = new String[10];
        System.out.println("======= PERPUSTAKAAN PTI =======");
        buku[0] = "01. The Pragmatic Programmer: Your Journey to Mastery";
        buku[1] = "02. Structure and Interpretation of Computer Programs";
        buku[2] = "03. Code Complete: A Practical Handbook of Software Construction";
        buku[3] = "04. Clean Code: A Handbook of Agile Software Craftsmanship";
        buku[4] = "05. Introduction to Algorithms";
        buku[5] = "06. Peopleware: Productive Projects and Teams";
        buku[6] = "07. Rapid Development: Taming Wild Software Schedules";
        buku[7] = "08. The Self-Taught Programmer: The Definitive Guide to Programming Professionally";
        buku[8] = "09. HTML and CSS: Design and Build Websites";
        buku[9] = "10. Learning Web Design: A Beginner’s Guide to HTML, CSS, JavaScript, and Web Graphics";
        System.out.println("---------------------");
        for (int i = 0; i < 10; i++) {
            System.out.println(buku[i]);
        }
    }
}
