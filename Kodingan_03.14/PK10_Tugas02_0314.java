package pk10_tugas02_03.pkg14;

/**
 * UjiTanggal 03.14
 * @author Bariq 07/07-2024
 */

// Format tanggal MM/dd/yyyy

public class PK10_Tugas02_0314 
{
    public static void main(String[] args) 
    {
        // Membuat objek Tanggal
        Tanggal tanggal1 = new Tanggal(7, 1, 2024);
        Tanggal tanggal2 = new Tanggal(12, 25, 2024);

        // Menampilkan tanggal
        System.out.print("Tanggal 1: ");
        tanggal1.tampilkanTanggal();

        System.out.print("Tanggal 2: ");
        tanggal2.tampilkanTanggal();

        // Memperbarui tanggal
        tanggal1.setBulan(8);
        tanggal1.setHari(15);
        tanggal1.setTahun(2025);

        // Menampilkan tanggal yang diperbarui
        System.out.print("Tanggal 1 diperbarui: ");
        tanggal1.tampilkanTanggal();
    }
} //akhir kelas