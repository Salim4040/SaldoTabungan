/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si.pkg23176040.latihan19.saldotabungan;

/**
 *
 * @author BISMILLAH
 * NAMA     : Salim Reza
 * KELAS    : Sistem Informasi
 * NIM      : 23176040
 * Deskripsi Program : Program ini berisi untuk menghitung dan menampilkan saldo tabungan 
 * setiap bulan selama 6 bulan dengan bunga 15% per bulan,dimulai dari saldo awal Rp 2.500.000
 */
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
public class SI23176040Latihan19SaldoTabungan {
    public static void main(String[] args) {
        double saldo = 2500000; // saldo awal
        double bunga = 0.15; // bunga 5% per bulan

        // Konfigurasi DecimalFormat untuk format Rupiah dengan titik sebagai pemisah ribuan
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setGroupingSeparator('.'); // Gunakan titik sebagai pemisah ribuan
        DecimalFormat formatter = new DecimalFormat("Rp #,##0", symbols);

        // Loop per bulan dan tampilkan saldo
        for (int bulan = 1; bulan <= 6; bulan++) {
            saldo += saldo * bunga; // hitung saldo dengan bunga
            System.out.println("Saldo di bulan ke-" + bulan + " " + formatter.format(saldo));
        }
    }
}
