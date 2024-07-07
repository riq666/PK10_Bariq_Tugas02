package pk10_tugas02_03.pkg12;

/**
 * UjiFaktur 03.12
 * @author Bariq 07/07-2024
 */

public class PK10_Tugas02_0312 
{
    public static void main(String[] args) 
    {
        // Membuat instance dari Faktur
        Faktur faktur = new Faktur("1234", "Palu", 10, 150000);

        // Menampilkan nilai awal
        System.out.printf("Nomor Bagian: %s\n", faktur.getNomorBagian());
        System.out.printf("Deskripsi Bagian: %s\n", faktur.getDeskripsiBagian());
        System.out.printf("Kuantitas: %d\n", faktur.getKuantitas());
        System.out.printf("Harga per Item: %.2f\n", faktur.getHargaPerItem());
        System.out.printf("Jumlah Faktur: %.2f\n\n", faktur.getJumlahFaktur());

        // Memperbarui nilai
        faktur.setNomorBagian("5678");
        faktur.setDeskripsiBagian("Obeng");
        faktur.setKuantitas(5);
        faktur.setHargaPerItem(75000);

        // Menampilkan nilai yang diperbarui
        System.out.printf("Nomor Bagian Diperbarui: %s\n", faktur.getNomorBagian());
        System.out.printf("Deskripsi Bagian Diperbarui: %s\n", faktur.getDeskripsiBagian());
        System.out.printf("Kuantitas Diperbarui: %d\n", faktur.getKuantitas());
        System.out.printf("Harga per Item Diperbarui: %.2f\n", faktur.getHargaPerItem());
        System.out.printf("Jumlah Faktur Diperbarui: %.2f\n", faktur.getJumlahFaktur());

        // Uji dengan nilai negatif
        faktur.setKuantitas(-5);
        faktur.setHargaPerItem(-10000);

        // Menampilkan nilai setelah menetapkan nilai negatif
        System.out.printf("\nSetelah menetapkan nilai negatif:\n");
        System.out.printf("Kuantitas: %d\n", faktur.getKuantitas());
        System.out.printf("Harga per Item: %.2f\n", faktur.getHargaPerItem());
        System.out.printf("Jumlah Faktur: %.2f\n", faktur.getJumlahFaktur());
    }
} //akhir kelas