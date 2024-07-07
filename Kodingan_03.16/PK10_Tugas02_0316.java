package pk10_tugas02_03.pkg16;

import java.util.Scanner;

/**
 * kalkulator detak jantung 03.16
 * @author Bariq 07/07-2024
 */

public class PK10_Tugas02_0316 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        // Meminta informasi pengguna
        System.out.print("Masukkan nama depan: ");
        String namaDepan = input.nextLine();

        System.out.print("Masukkan nama belakang: ");
        String namaBelakang = input.nextLine();

        System.out.print("Masukkan bulan lahir (1-12): ");
        int bulanLahir = input.nextInt();

        System.out.print("Masukkan hari lahir (1-31): ");
        int hariLahir = input.nextInt();

        System.out.print("Masukkan tahun lahir: ");
        int tahunLahir = input.nextInt();

        // Membuat objek DetakJantung
        DetakJantung detakJantung = new DetakJantung(namaDepan, namaBelakang, bulanLahir, hariLahir, tahunLahir);

        // Menampilkan informasi dan hasil perhitungan
        System.out.printf("%nInformasi Detak Jantung:%n");
        System.out.printf("Nama: %s %s%n", detakJantung.getNamaDepan(), detakJantung.getNamaBelakang());
        System.out.printf("Tanggal Lahir: %d/%d/%d%n", detakJantung.getBulanLahir(), detakJantung.getHariLahir(), detakJantung.getTahunLahir());
        System.out.printf("Umur: %d tahun%n", detakJantung.getUmur());
        System.out.printf("Detak Jantung Maksimal: %d bpm%n", detakJantung.getDetakJantungMaks());
        System.out.printf("Rentang Detak Jantung Target: %s%n", detakJantung.getRentangDetakJantungTarget());
    }
} //akhir kelas