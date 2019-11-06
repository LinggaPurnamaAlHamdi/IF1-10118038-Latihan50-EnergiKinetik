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
public class IF110118038Latihan50EnergiKinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BolaBaseball baseball = new BolaBaseball();
        baseball.setMassa(145);
        baseball.setKecepatan(25);
        System.out.printf("Massa = %1.1f g\n", baseball.getMassa());
        System.out.printf("Kecepatan = %1.1f m/s\n", baseball.getKecepatan());
        System.out.printf("a.) Energi Kinetik = %1.1f J\n", baseball.hitungEnergi());
        System.out.printf("b.) Usaha = %1.1f J\n", baseball.hitungUsahaDiam());
    }
    
}
