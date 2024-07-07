package pk10_tugas02_03.pkg17;

import java.time.LocalDate;
import java.time.Period;

/**
 * Rekam jejak kesehatan 03.17
 * @author Bariq 07/07-2024
 */

public class ProfilKesehatan {
    private String namaDepan;
    private String namaBelakang;
    private String jenisKelamin;
    private int bulanLahir;
    private int hariLahir;
    private int tahunLahir;
    private double tinggiCm;
    private double beratKg;

    // Konstruktor
    public ProfilKesehatan(String namaDepan, String namaBelakang, String jenisKelamin, int bulanLahir, int hariLahir, int tahunLahir, double tinggiCm, double beratKg) {
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
        this.jenisKelamin = jenisKelamin;
        this.bulanLahir = bulanLahir;
        this.hariLahir = hariLahir;
        this.tahunLahir = tahunLahir;
        this.tinggiCm = tinggiCm;
        this.beratKg = beratKg;
    }

    // Metode set dan get untuk namaDepan
    public void setNamaDepan(String namaDepan) {
        this.namaDepan = namaDepan;
    }

    public String getNamaDepan() {
        return namaDepan;
    }

    // Metode set dan get untuk namaBelakang
    public void setNamaBelakang(String namaBelakang) {
        this.namaBelakang = namaBelakang;
    }

    public String getNamaBelakang() {
        return namaBelakang;
    }

    // Metode set dan get untuk jenisKelamin
    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    // Metode set dan get untuk bulanLahir
    public void setBulanLahir(int bulanLahir) {
        this.bulanLahir = bulanLahir;
    }

    public int getBulanLahir() {
        return bulanLahir;
    }

    // Metode set dan get untuk hariLahir
    public void setHariLahir(int hariLahir) {
        this.hariLahir = hariLahir;
    }

    public int getHariLahir() {
        return hariLahir;
    }

    // Metode set dan get untuk tahunLahir
    public void setTahunLahir(int tahunLahir) {
        this.tahunLahir = tahunLahir;
    }

    public int getTahunLahir() {
        return tahunLahir;
    }

    // Metode set dan get untuk tinggiCm
    public void setTinggiCm(double tinggiCm) {
        this.tinggiCm = tinggiCm;
    }

    public double getTinggiCm() {
        return tinggiCm;
    }

    // Metode set dan get untuk beratKg
    public void setBeratKg(double beratKg) {
        this.beratKg = beratKg;
    }

    public double getBeratKg() {
        return beratKg;
    }

    // Metode untuk menghitung umur (dalam tahun)
    public int getUmur() {
        LocalDate tanggalLahir = LocalDate.of(tahunLahir, bulanLahir, hariLahir);
        LocalDate sekarang = LocalDate.now();
        return Period.between(tanggalLahir, sekarang).getYears();
    }

    // Metode untuk menghitung detak jantung maksimal
    public int getDetakJantungMaks() {
        return 220 - getUmur();
    }

    // Metode untuk menghitung rentang detak jantung target
    public String getRentangDetakJantungTarget() {
        int detakJantungMaks = getDetakJantungMaks();
        int batasBawah = (int) (detakJantungMaks * 0.50);
        int batasAtas = (int) (detakJantungMaks * 0.85);
        return String.format("%d - %d bpm", batasBawah, batasAtas);
    }

    // Metode untuk menghitung BMI
    public double getBMI() {
        return beratKg / ((tinggiCm / 100) * (tinggiCm / 100));
    }

    // Metode untuk menampilkan nilai-nilai BMI
    public static void tampilkanChartBMI() {
        System.out.println("NILAI BMI");
        System.out.println("Underweight: kurang dari 18.5");
        System.out.println("Normal:      antara 18.5 dan 24.9");
        System.out.println("Overweight:  antara 25 dan 29.9");
        System.out.println("Obese:       30 atau lebih");
    }
} //akhir kelas