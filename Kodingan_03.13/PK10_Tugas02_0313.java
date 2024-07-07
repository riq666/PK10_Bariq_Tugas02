package pk10_tugas02_03.pkg13;

/**
 * UjiKaryawan 03.13
 * @author Bariq 07/07-2024
 */

public class PK10_Tugas02_0313 
{
    public static void main(String[] args) 
    {
        // Membuat dua objek Karyawan
        Karyawan karyawan1 = new Karyawan("Bariq", "Nashir", 15000000);
        Karyawan karyawan2 = new Karyawan("Ali", "Ahmad", 10000000);

        // Menampilkan gaji tahunan masing-masing karyawan
        System.out.printf("Gaji Tahunan %s %s: %s\n", karyawan1.getNamaDepan(), karyawan1.getNamaBelakang(), karyawan1.getGajiTahunanFormatted());
        System.out.printf("Gaji Tahunan %s %s: %s\n\n", karyawan2.getNamaDepan(), karyawan2.getNamaBelakang(), karyawan2.getGajiTahunanFormatted());

        // Memberikan kenaikan gaji 10% kepada masing-masing karyawan
        karyawan1.berikanKenaikanGaji();
        karyawan2.berikanKenaikanGaji();

        // Menampilkan gaji tahunan masing-masing karyawan setelah kenaikan gaji
        System.out.printf("Setelah kenaikan gaji 10%%:\n");
        System.out.printf("Gaji Tahunan %s %s: %s\n", karyawan1.getNamaDepan(), karyawan1.getNamaBelakang(), karyawan1.getGajiTahunanFormatted());
        System.out.printf("Gaji Tahunan %s %s: %s\n", karyawan2.getNamaDepan(), karyawan2.getNamaBelakang(), karyawan2.getGajiTahunanFormatted());
    }
}