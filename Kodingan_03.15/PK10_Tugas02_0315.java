package pk10_tugas02_03.pkg15;

import java.util.Scanner;

/**
 * Modifikasi gambar 3.9 dgn me-remove kode yg terduplikat
 * @author Bariq 07/07-2024
 */

public class PK10_Tugas02_0315 
{
    public static void main(String[] args)
    {
        Akun akun1 = new Akun("Bariq Nashir", 500000.00);
        Akun akun2 = new Akun("Ayu Lestari", 250000.00);

        // menampilkan saldo awal dari setiap objek
        System.out.printf("%s saldo: Rp %.2f%n", 
            akun1.getNama(), akun1.getSaldo());
        System.out.printf("%s saldo: Rp %.2f%n%n",
            akun2.getNama(), akun2.getSaldo());

        // membuat Scanner untuk mendapatkan input dari jendela perintah
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah setoran untuk akun1: "); // prompt
        double jumlahSetoran = input.nextDouble(); // memperoleh input pengguna
        System.out.printf("%nmenambahkan Rp %.2f ke saldo akun1%n%n",
            jumlahSetoran);
        akun1.setoran(jumlahSetoran); // menambah ke saldo akun1

        // menampilkan saldo
        System.out.printf("%s saldo: Rp %.2f%n",
            akun1.getNama(), akun1.getSaldo());
        System.out.printf("%s saldo: Rp %.2f%n%n", 
            akun2.getNama(), akun2.getSaldo());

        System.out.print("Masukkan jumlah setoran untuk akun2: "); // prompt
        jumlahSetoran = input.nextDouble(); // memperoleh input pengguna
        System.out.printf("%nmenambahkan Rp %.2f ke saldo akun2%n%n",
            jumlahSetoran);
        akun2.setoran(jumlahSetoran); // menambah ke saldo akun2

        // menampilkan saldo
        System.out.printf("%s saldo: Rp %.2f%n",
            akun1.getNama(), akun1.getSaldo());
        System.out.printf("%s saldo: Rp %.2f%n%n", 
            akun2.getNama(), akun2.getSaldo());

        System.out.print("Masukkan jumlah penarikan untuk akun1: "); // prompt
        double jumlahTarik = input.nextDouble(); // memperoleh input pengguna
        akun1.tarik(jumlahTarik); // menarik dari saldo akun1

        // menampilkan saldo
        System.out.printf("%s saldo: Rp %.2f%n",
            akun1.getNama(), akun1.getSaldo());
        System.out.printf("%s saldo: Rp %.2f%n%n", 
            akun2.getNama(), akun2.getSaldo());

        System.out.print("Masukkan jumlah penarikan untuk akun2: "); // prompt
        jumlahTarik = input.nextDouble(); // memperoleh input pengguna
        akun2.tarik(jumlahTarik); // menarik dari saldo akun2

        // menampilkan saldo
        System.out.printf("%s saldo: Rp %.2f%n",
            akun1.getNama(), akun1.getSaldo());
        System.out.printf("%s saldo: Rp %.2f%n%n", 
            akun2.getNama(), akun2.getSaldo());
    }
} // akhir kelas