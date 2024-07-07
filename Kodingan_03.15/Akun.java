package pk10_tugas02_03.pkg15;

/**
 * Modifikasi gambar 3.9 dgn me-remove kode yg terduplikat
 * @author Bariq 07/07-2024
 */

public class Akun
{
    private String nama; // variabel instance
    private double saldo; // variabel instance

    // Konstruktor Akun yang menerima dua parameter
    public Akun(String nama, double saldo)
    {
        this.nama = nama; // menetapkan nama ke variabel instance nama

        // validasi bahwa saldo lebih besar dari 0.0; jika tidak,
        // variabel instance saldo tetap dengan nilai awal default 0.0
        if (saldo > 0.0) // jika saldo valid
            this.saldo = saldo; // menetapkan ke variabel instance saldo
    }

    // metode yang menambahkan (setoran) hanya jumlah yang valid ke saldo
    public void setoran(double jumlahSetoran)
    {
        if (jumlahSetoran > 0.0) // jika jumlah setoran valid
            saldo = saldo + jumlahSetoran; // menambahkannya ke saldo
    }

    // metode yang menarik (withdraw) hanya jumlah yang valid dari saldo
    public void tarik(double jumlahTarik)
    {
        if (jumlahTarik > saldo) // jika jumlah penarikan melebihi saldo
            System.out.println("Jumlah penarikan melebihi saldo akun.");
        else
            saldo = saldo - jumlahTarik; // mengurangi saldo
    }

    // metode yang mengembalikan saldo akun
    public double getSaldo()
    {
        return saldo; 
    }

    // metode yang menetapkan nama
    public void setNama(String nama)
    {
        this.nama = nama;
    }

    // metode yang mengembalikan nama
    public String getNama()
    {
        return nama; // mengembalikan nilai nama ke pemanggil
    }
} // akhir kelas