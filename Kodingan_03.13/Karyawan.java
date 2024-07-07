package pk10_tugas02_03.pkg13;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * UjiKaryawan 03.13
 * @author Bariq 07/07-2024
 */

public class Karyawan 
{
    private String namaDepan;
    private String namaBelakang;
    private double gajiBulanan;

    // Konstruktor untuk menginisialisasi tiga variabel instance
    public Karyawan(String namaDepan, String namaBelakang, double gajiBulanan) 
    {
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
        setGajiBulanan(gajiBulanan);
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

    // Metode set dan get untuk gajiBulanan
    public void setGajiBulanan(double gajiBulanan) 
    {
        if (gajiBulanan > 0) 
        {
            this.gajiBulanan = gajiBulanan;
        }
    }

    public double getGajiBulanan() 
    {
        return gajiBulanan;
    }

    // Metode untuk mendapatkan gaji tahunan
    public double getGajiTahunan() 
    {
        return gajiBulanan * 12;
    }

    // Metode untuk memberikan kenaikan gaji 10%
    public void berikanKenaikanGaji() 
    {
        gajiBulanan *= 1.10;
    }

    // Metode untuk mendapatkan gaji bulanan dalam format mata uang Indonesia
    public String getGajiBulananFormatted() 
    {
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        return formatRupiah.format(gajiBulanan);
    }

    // Metode untuk mendapatkan gaji tahunan dalam format mata uang Indonesia
    public String getGajiTahunanFormatted() 
    {
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        return formatRupiah.format(getGajiTahunan());
    }
}