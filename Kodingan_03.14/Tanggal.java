package pk10_tugas02_03.pkg14;

/**
 * UjiTanggal 03.14
 * @author Bariq 07/07-2024
 */

// Format tanggal MM/dd/yyyy

public class Tanggal 
{
    private int bulan;
    private int hari;
    private int tahun;

    // Konstruktor untuk menginisialisasi tiga variabel instance
    public Tanggal(int bulan, int hari, int tahun) 
    {
        this.bulan = bulan;
        this.hari = hari;
        this.tahun = tahun;
    }

    // Metode set dan get untuk bulan
    public void setBulan(int bulan) 
    {
        this.bulan = bulan;
    }

    public int getBulan() 
    {
        return bulan;
    }

    // Metode set dan get untuk hari
    public void setHari(int hari) 
    {
        this.hari = hari;
    }

    public int getHari() 
    {
        return hari;
    }

    // Metode set dan get untuk tahun
    public void setTahun(int tahun) 
    {
        this.tahun = tahun;
    }

    public int getTahun() 
    {
        return tahun;
    }

    // Metode untuk menampilkan tanggal dengan format bulan/hari/tahun
    public void tampilkanTanggal() 
    {
        System.out.printf("%d/%d/%d\n", bulan, hari, tahun);
    }
} //akhir kelas