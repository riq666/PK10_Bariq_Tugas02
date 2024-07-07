package pk10_tugas02_03.pkg12;

/**
 * UjiFaktur 03.12
 * @author Bariq 07/07-2024
 */

public class Faktur 
{
    private String nomorBagian;
    private String deskripsiBagian;
    private int kuantitas;
    private double hargaPerItem;

    // Konstruktor untuk menginisialisasi empat variabel instance
    public Faktur(String nomorBagian, String deskripsiBagian, int kuantitas, double hargaPerItem) 
    {
        this.nomorBagian = nomorBagian;
        this.deskripsiBagian = deskripsiBagian;
        setKuantitas(kuantitas);
        setHargaPerItem(hargaPerItem);
    }

    // Metode set dan get untuk nomorBagian
    public void setNomorBagian(String nomorBagian) 
    {
        this.nomorBagian = nomorBagian;
    }

    public String getNomorBagian() 
    {
        return nomorBagian;
    }

    // Metode set dan get untuk deskripsiBagian
    public void setDeskripsiBagian(String deskripsiBagian) 
    {
        this.deskripsiBagian = deskripsiBagian;
    }

    public String getDeskripsiBagian() 
    {
        return deskripsiBagian;
    }

    // Metode set dan get untuk kuantitas
    public void setKuantitas(int kuantitas) 
    {
        if (kuantitas > 0) 
        {
            this.kuantitas = kuantitas;
        }
        else 
        {
            this.kuantitas = 0;
        }
    }

    public int getKuantitas() 
    {
        return kuantitas;
    }

    // Metode set dan get untuk hargaPerItem
    public void setHargaPerItem(double hargaPerItem) 
    {
        if (hargaPerItem > 0) 
        {
            this.hargaPerItem = hargaPerItem;
        }
        else 
        {
            this.hargaPerItem = 0.0;
        }
    }

    public double getHargaPerItem() 
    {
        return hargaPerItem;
    }

    // Metode untuk menghitung jumlah faktur
    public double getJumlahFaktur() 
    {
        return kuantitas * hargaPerItem;
    }
} //akhir kelas