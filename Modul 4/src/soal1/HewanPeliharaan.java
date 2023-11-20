package soal1;

import java.util.Scanner;

public class HewanPeliharaan {

    private String nama;
    private String ras;

    public HewanPeliharaan() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama Hewan Peliharaan: ");
        String n = scanner.nextLine();
        this.nama = n;

        System.out.print("Ras: ");
        String r = scanner.nextLine();
        this.ras = r;
    }

    public void display() {
        System.out.println("\nDetail Hewan Peliharaan:");
        System.out.println("Nama hewan peliharaanku adalah : " + nama);
        System.out.println("Dengan ras : " + ras);
    }
}
