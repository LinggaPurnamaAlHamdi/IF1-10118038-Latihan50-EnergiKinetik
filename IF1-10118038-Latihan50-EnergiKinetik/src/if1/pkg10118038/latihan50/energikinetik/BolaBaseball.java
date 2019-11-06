/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118038.latihan50.energikinetik;

/**
 *
 * @author Lingga
 * NAMA : Lingga Purnama Al Hamdi
 * KELAS : IF1
 * NIM : 10118038
 * Deskripsi Program : program ini berisi program yang akan menampilkan perhitungan
 *                     Energi Kinetik dan Usaha
 */
public class BolaBaseball {
    private double massa, kecepatan, ek;

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }
    
    public double hitungEnergi() {
        massa = massa/1000;
        return ek = 0.5 * massa * kecepatan * kecepatan;
    }
    
    public double hitungUsahaDiam() {
        return ek-0;
    }
}
