package pk10_tugas02_03.pkg17;

import java.util.Scanner;

/**
 * Rekam jejak kesehatan 03.17
 * @author Bariq 07/07-2024
 */

public class PK10_Tugas02_0317 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta informasi pengguna
        System.out.print("Masukkan nama depan: ");
        String namaDepan = input.nextLine();

        System.out.print("Masukkan nama belakang: ");
        String namaBelakang = input.nextLine();

        System.out.print("Masukkan jenis kelamin: ");
        String jenisKelamin = input.nextLine();

        System.out.print("Masukkan bulan lahir (1-12): ");
        int bulanLahir = input.nextInt();

        System.out.print("Masukkan hari lahir (1-31): ");
        int hariLahir = input.nextInt();

        System.out.print("Masukkan tahun lahir: ");
        int tahunLahir = input.nextInt();

        System.out.print("Masukkan tinggi (dalam cm): ");
        double tinggiCm = input.nextDouble();

        System.out.print("Masukkan berat (dalam kg): ");
        double beratKg = input.nextDouble();

        // Membuat objek ProfilKesehatan
        ProfilKesehatan profil = new ProfilKesehatan(namaDepan, namaBelakang, jenisKelamin, bulanLahir, hariLahir, tahunLahir, tinggiCm, beratKg);

        // Menampilkan informasi dan hasil perhitungan
        System.out.printf("%nInformasi Profil Kesehatan:%n");
        System.out.printf("Nama: %s %s%n", profil.getNamaDepan(), profil.getNamaBelakang());
        System.out.printf("Jenis Kelamin: %s%n", profil.getJenisKelamin());
        System.out.printf("Tanggal Lahir: %d/%d/%d%n", profil.getBulanLahir(), profil.getHariLahir(), profil.getTahunLahir());
        System.out.printf("Tinggi: %.2f cm%n", profil.getTinggiCm());
        System.out.printf("Berat: %.2f kg%n", profil.getBeratKg());
        System.out.printf("Umur: %d tahun%n", profil.getUmur());
        System.out.printf("Detak Jantung Maksimal: %d bpm%n", profil.getDetakJantungMaks());
        System.out.printf("Rentang Detak Jantung Target: %s%n", profil.getRentangDetakJantungTarget());
        System.out.printf("BMI: %.2f%n", profil.getBMI());

        // Menampilkan chart BMI
        ProfilKesehatan.tampilkanChartBMI();
    }
} //akhir kelas