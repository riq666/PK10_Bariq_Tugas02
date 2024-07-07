package pk10_tugas02_03.pkg11;

import java.util.Scanner;

/**
 * Gbr. 3.9: TesAkun.java
 * Memasukkan dan mengeluarkan angka floating-point dengan objek Akun
 * @author Bariq 06/07-2024
 */

public class TesAkun
{
    public static void main(String[] args)
    {
        Akun akun1 = new Akun("Jane Green", 50.00);
        Akun akun2 = new Akun("John Blue", -7.53);

        // menampilkan saldo awal dari setiap objek
        System.out.printf("%s saldo: $%.2f%n", 
            akun1.getNama(), akun1.getSaldo());
        System.out.printf("%s saldo: $%.2f%n%n",
            akun2.getNama(), akun2.getSaldo());

        // membuat Scanner untuk mendapatkan input dari jendela perintah
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah setoran untuk akun1: "); // prompt
        double jumlahSetoran = input.nextDouble(); // memperoleh input pengguna
        System.out.printf("%nmenambahkan %.2f ke saldo akun1%n%n",
            jumlahSetoran);
        akun1.setoran(jumlahSetoran); // menambah ke saldo akun1

        // menampilkan saldo
        System.out.printf("%s saldo: $%.2f%n",
            akun1.getNama(), akun1.getSaldo());
        System.out.printf("%s saldo: $%.2f%n%n", 
            akun2.getNama(), akun2.getSaldo());

        System.out.print("Masukkan jumlah setoran untuk akun2: "); // prompt
        jumlahSetoran = input.nextDouble(); // memperoleh input pengguna
        System.out.printf("%nmenambahkan %.2f ke saldo akun2%n%n",
            jumlahSetoran);
        akun2.setoran(jumlahSetoran); // menambah ke saldo akun2

        // menampilkan saldo
        System.out.printf("%s saldo: $%.2f%n",
            akun1.getNama(), akun1.getSaldo());
        System.out.printf("%s saldo: $%.2f%n%n", 
            akun2.getNama(), akun2.getSaldo());

        System.out.print("Masukkan jumlah penarikan untuk akun1: "); // prompt
        double jumlahTarik = input.nextDouble(); // memperoleh input pengguna
        akun1.tarik(jumlahTarik); // menarik dari saldo akun1

        // menampilkan saldo
        System.out.printf("%s saldo: $%.2f%n",
            akun1.getNama(), akun1.getSaldo());
        System.out.printf("%s saldo: $%.2f%n%n", 
            akun2.getNama(), akun2.getSaldo());

        System.out.print("Masukkan jumlah penarikan untuk akun2: "); // prompt
        jumlahTarik = input.nextDouble(); // memperoleh input pengguna
        akun2.tarik(jumlahTarik); // menarik dari saldo akun2

        // menampilkan saldo
        System.out.printf("%s saldo: $%.2f%n",
            akun1.getNama(), akun1.getSaldo());
        System.out.printf("%s saldo: $%.2f%n%n", 
            akun2.getNama(), akun2.getSaldo());
    } 
} // akhir kelas