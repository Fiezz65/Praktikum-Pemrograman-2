package Modul4.soal2;

import java.util.Scanner;

public class HewanPeliharaan {
    private String name;
    private String breed;

    public HewanPeliharaan() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nama Hewan Peliharaan: ");
        this.name = sc.nextLine();

        System.out.print("Ras: ");
        this.breed = sc.nextLine();

        sc.close();
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public void display() {
        System.out.println("\nDetail Hewan Peliharaan:");
        System.out.println("Nama hewan peliharaanku adalah: " + getName());
        System.out.println("Dengan ras: " + getBreed());
    }
}