package pk10_tugas02_03.pkg16;

import java.time.LocalDate;
import java.time.Period;

/**
 * kalkulator detak jantung 03.16
 * @author Bariq 07/07-2024
 */

public class DetakJantung 
{
    private String namaDepan;
    private String namaBelakang;
    private int bulanLahir;
    private int hariLahir;
    private int tahunLahir;

    // Konstruktor
    public DetakJantung(String namaDepan, String namaBelakang, int bulanLahir, int hariLahir, int tahunLahir) 
    {
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
        this.bulanLahir = bulanLahir;
        this.hariLahir = hariLahir;
        this.tahunLahir = tahunLahir;
    }

    // Metode set dan get untuk namaDepan
    public void setNamaDepan(String namaDepan) 
    {
        this.namaDepan = namaDepan;
    }

    public String getNamaDepan() 
    {
        return namaDepan;
    }

    // Metode set dan get untuk namaBelakang
    public void setNamaBelakang(String namaBelakang) 
    {
        this.namaBelakang = namaBelakang;
    }

    public String getNamaBelakang() 
    {
        return namaBelakang;
    }

    // Metode set dan get untuk bulanLahir
    public void setBulanLahir(int bulanLahir) 
    {
        this.bulanLahir = bulanLahir;
    }

    public int getBulanLahir() 
    {
        return bulanLahir;
    }

    // Metode set dan get untuk hariLahir
    public void setHariLahir(int hariLahir) 
    {
        this.hariLahir = hariLahir;
    }

    public int getHariLahir() 
    {
        return hariLahir;
    }

    // Metode set dan get untuk tahunLahir
    public void setTahunLahir(int tahunLahir) 
    {
        this.tahunLahir = tahunLahir;
    }

    public int getTahunLahir() 
    {
        return tahunLahir;
    }

    // Metode untuk menghitung umur (dalam tahun)
    public int getUmur() 
    {
        LocalDate tanggalLahir = LocalDate.of(tahunLahir, bulanLahir, hariLahir);
        LocalDate sekarang = LocalDate.now();
        return Period.between(tanggalLahir, sekarang).getYears();
    }

    // Metode untuk menghitung detak jantung maksimal
    public int getDetakJantungMaks() 
    {
        return 220 - getUmur();
    }

    // Metode untuk menghitung rentang detak jantung target
    public String getRentangDetakJantungTarget() 
    {
        int detakJantungMaks = getDetakJantungMaks();
        int batasBawah = (int) (detakJantungMaks * 0.50);
        int batasAtas = (int) (detakJantungMaks * 0.85);
        return String.format("%d - %d bpm", batasBawah, batasAtas);
    }
} //akhir kelas